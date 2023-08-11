package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    private int pin;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer id, String role) {
    	this.employeeID = id;
    	this.role = role;
    	this.setId(id);
        this.securityIncidents = new ArrayList<>();  // Initialization

    }
    // TO DO: Implement HIPAACompliantUser!
    @Override
    public boolean assignPin(int pin) {
    	String pinStr = Integer.toString(pin);
    	if (pinStr.length() < 6) {
    		return false;
    	}
    	this.pin = pin;
    	return true;
    }
    
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
		if (!this.getId().equals(confirmedAuthID)) {
			authIncident();
			return false;
		}
		return true;
    }
    // TO DO: Implement HIPAACompliantAdmin!
    public ArrayList<String> reportSecurityIncidents() {
    	return this.securityIncidents;
    }
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
}
