package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class Application {
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @RequestMapping("/")
    public String index(Model model) {
        //Test Case 1
		/*
		 * String name = "Grace Hopper"; String itemName = "Copper wire"; double price =
		 * 5.25; String description =
		 * "Metal strips, also an illustration of nanoseconds."; String vendor =
		 * "Little Things Corner Store";
		 */
       
        //Test Case 2
		
		  String name = "Albert Einstein"; 
		  String itemName = "Relativity Book"; 
		  double price = 15.99; 
		  String description = "A detailed study of the theory of relativity."; 
		  String vendor = "Physics Books Store";
		 

        //Test Case 3
		/*
		 * String name =
		 * "Nikola Tesla with a very long name just for the sake of testing the limits."
		 * ; String itemName =
		 * "Alternating Current Generator with a lengthy name just for testing."; double
		 * price = 9999.99; String description =
		 * "A complex piece of machinery with a very long description to test if there's any cutoff in the representation on the front end."
		 * ; String vendor =
		 * "Historical Inventions Emporium with an unnecessarily long name";
		 */
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
        return "index.jsp";
    }
	
}
