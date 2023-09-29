package com.dojo.projects.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="books")
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Title cannot be empty")
	private String title;
	
	@NotBlank(message="Author's name cannot be empty")
	@Size(min=2, max=255, message="Author's name must be between 2 and 255 characters")
	private String authorName;
	
	@NotBlank(message="Must give some thoughts on the book!")
	private String thoughts;

	@NotNull(message="User cannot be null")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
	private User user;
	
	@Column(updatable=false)
    @Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@Column(updatable=false)
    @Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	public Book() {} 
	
	public Book(String title, String authorName, User user) {
		this.title = title;
		this.authorName = authorName;
		this.user = user;		
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
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
	
	public String getThoughts() {
		return thoughts;
	}
	
	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}
}
