package com.dojo.projects.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="dojos")
public class Dojo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id; //can't use Long datatype when my schema uses INT. I can use BIGINT(20) with Longs but for INT I have to use Integer in Java
	
	@NotBlank(message="Name cannot be empty")
    @Size(min=2, max=255, message="Name should be between 2 and 255 characters")
	private String name;
	
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	@OneToMany(mappedBy="dojo", fetch = FetchType.LAZY)
	private List<Ninja> ninjas;
	
	public Dojo() {}
	
	public Dojo(String name, Date createdAt, Date updatedAt, List<Ninja> ninjas) {
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.ninjas = ninjas;
	}
	
	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate(){
		// using new Date() was giving me an error saying 'The constructor Date() is undefined'
	    this.updatedAt = new Date();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<Ninja> getNinjas() {
		return ninjas;
	}

	public void setNinjas(List<Ninja> ninjas) {
		this.ninjas = ninjas;
	}

}
