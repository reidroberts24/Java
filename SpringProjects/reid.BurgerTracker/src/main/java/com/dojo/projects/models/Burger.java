package com.dojo.projects.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "burgers")
public class Burger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="Burger name is required.")
	@Size(min=1, max=50, message="Burger name should be between 1 and 50 characters.")
	private String burgerName;
	
	@NotNull(message="Restaurant name is required.")
	@Size(min=1, max=100, message="Restaurant name should be between 1 and 100 characters.")
	private String restaurantName;
	
	@NotNull(message="Rating is required.")
	@Min(value=1, message="Rating should be at least 1.")
	@Max(value=5, message="Rating should be at most 5.")
	private Integer rating;
	
	@Size(max=500, message="Notes should not exceed 500 characters.")
	private String notes;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
	@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBurgerName() {
		return burgerName;
	}
	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	
}