package com.transaction.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transaction {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Long amount;
	public Transaction(Long id, String name, Long amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	public Transaction() {
		super();
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
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}
	

}
