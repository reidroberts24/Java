package com.dojo.projects.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="ninjas")
public class Ninja {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //can't use Long datatype when my schema uses INT. I can use BIGINT(20) with Longs but for INT I have to use Integer in Java
	@NotBlank(message="First name cannot be empty")
    @Size(min=2, max=255, message="First name should be between 2 and 255 characters")
    private String firstName;

    @NotBlank(message="Last name cannot be empty")
    @Size(min=2, max=255, message="Last name should be between 2 and 255 characters")
    private String lastName;

    @NotNull(message="Age cannot be null")
    @Min(value=1, message="Age must be at least 1")
    private Integer age;
    
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    @NotNull(message="Dojo cannot be null")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dojo_id")
    private Dojo dojo;
    
    public Ninja() {}
    
    public Ninja(Long id, String firstName, String lastName, int age, Date createdAt, Date updatedAt, Dojo dojo) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.dojo = dojo;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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

	public Dojo getDojo() {
		return dojo;
	}

	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
	}


}
