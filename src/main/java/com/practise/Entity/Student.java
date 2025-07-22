package com.practise.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {

	@Id
	private int id;
	
	private String name;
	
	private String email;
	
	private String course;
	
	private int marks;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "identity_card_id")
	private IdentityCard identitycard;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

	public IdentityCard getIdentitycard() {
		return identitycard;
	}

	public void setIdentitycard(IdentityCard identitycard) {
		this.identitycard = identitycard;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", course=" + course + ", marks=" + marks
				+ ", identitycard=" + identitycard + "]";
	}

	
	
	
}
