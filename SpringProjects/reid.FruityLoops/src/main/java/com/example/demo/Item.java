package com.example.demo;

public class Item {
    // MEMBER VARIABLES
    private String name;
    private double price;
    // CONSTRUCTOR
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // As always, don't forget to generate Getters and Setters!
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setPrice(double price) {
    	this.price = price;
    }
    
    public double getPrice() {
    	return price;
    }
    
}
