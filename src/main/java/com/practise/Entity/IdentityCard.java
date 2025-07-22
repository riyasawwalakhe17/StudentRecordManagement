package com.practise.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "idcard_details")
public class IdentityCard {

	@Id
	private int id;
	
	private String cardNumber;
	
	private String issueDate;
	
	private String expiryDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "IdentityCard [id=" + id + ", cardNumber=" + cardNumber + ", issueDate=" + issueDate + ", expiryDate="
				+ expiryDate + "]";
	}
	
	
	
}
