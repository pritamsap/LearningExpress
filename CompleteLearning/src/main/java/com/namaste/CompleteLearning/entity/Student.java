package com.namaste.CompleteLearning.entity;

import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;



@Entity
@Table (name="student")



public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="email_op_out")
	private Boolean email_op_out;
	@Column(name="phone")
	private String phone;
	@Column(name="comments")
	private String comments;
	@CreationTimestamp
	private Date created_at;
	@UpdateTimestamp
	private Date updated_at;
	
	
	
	
	
	


}
