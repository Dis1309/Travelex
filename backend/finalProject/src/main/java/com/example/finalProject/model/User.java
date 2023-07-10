package com.example.finalProject.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.*;

@Entity
@Table(name = "user_new")
@Data
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
    
    @Column(nullable = false)
	private int user_id;
	
	private String name;
	
	private String email;
	
	private String password;

	public int getId() {
		return user_id;
	}

	public void setId(int id) {
		this.user_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	
	
}
