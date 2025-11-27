package com.example.book_my_ticket.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class User {
	private long id;
	private String name;
	private String email;
	private long mobile;
	private String password;
	private String role;
	

}
