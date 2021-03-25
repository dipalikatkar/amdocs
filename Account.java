package com.demo.bean;

public class Account {
	private int num;
	private double balance;
	private String name;
	
	public Account() {
		super();
	}
	public Account(int num, double balance, String name) {
		super();
		this.num = num;
		this.balance = balance;
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean equals(Object o2) {
		if(this.num==((Account)o2).num) {
			return true;
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		return "Account [num=" + num + ", balance=" + balance + ", name=" + name + "]";
	}
	public void withdraw(double amt) {
		this.balance=this.balance-amt;
		
	}
	

}
