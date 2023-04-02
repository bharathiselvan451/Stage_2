package com.Cognizant.dao;

public class User {
	
	private String email;
	private String name;
	private String password;
	private int expense;
	private int budget;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", password=" + password + ", expense=" + expense
				+ ", budget=" + budget + "]";
	}
	public User(String email, String name, String password, int expense, int budget) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.expense = expense;
		this.budget = budget;
	}
	public User() {
		
	}
	
	
	
	

}
