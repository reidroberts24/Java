package com.dojo.projects.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.dojo.projects.models.LoginUser;
import com.dojo.projects.models.User;
import com.dojo.projects.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    
    // TO-DO: Write register and login methods!
	public User register(User newUser, BindingResult result) {
		
		Optional<User> existingUser = userRepo.findByEmail(newUser.getEmail());
		// Reject if email is taken (present in database)
		if(existingUser.isPresent()) {
			result.rejectValue("email", "Matches", "That email is already taken!");
		}
		// Reject if password doesn't match confirmation
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
		    result.rejectValue("confirm", "Matches", "Passwords must match!");
		}
        // Return null if result has errors
	    if(result.hasErrors()) {
	    	return null;
	    }
        // Hash and set password, save user to database
	    String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
	    newUser.setPassword(hashed);
	    return userRepo.save(newUser);
    }

		
	public User login(LoginUser newLoginObject, BindingResult result) {
    // TO-DO - Reject values:
		// Find user in the DB by email
		Optional<User> existingUser = userRepo.findByEmail(newLoginObject.getEmail());
		// Reject if NOT present
		if (!existingUser.isPresent()) {
			result.rejectValue("email", "Matches", "User not found!");
			return null;
		}
		
		User user = existingUser.get();
		
		// Reject if BCrypt password match fails
		if (!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
			result.rejectValue("password", "Matches", "Incorrect password!");
		}
		// Return null if result has errors
		if (result.hasErrors()) {
			return null;
		}
		// Otherwise, return the user object
		return user;
	}
	
    public User findById(Long id) {
    	Optional<User> potentialUser = userRepo.findById(id);
    	if(potentialUser.isPresent()) {
    		return potentialUser.get();
    	}
    	return null;
    }
}