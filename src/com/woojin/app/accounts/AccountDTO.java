package com.woojin.app.accounts;

import java.sql.Date;

public class AccountDTO {
	private String accountnum;
	private String username;
	private int productnum;
	private int accountbalance;
	private Date accountdate;
	
	
	public String getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(String accountnum) {
		this.accountnum = accountnum;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getProductnum() {
		return productnum;
	}
	public void setProductnum(int productnum) {
		this.productnum = productnum;
	}
	public int getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(int accountbalance) {
		this.accountbalance = accountbalance;
	}
	public Date getAccountdate() {
		return accountdate;
	}
	public void setAccountdate(Date accountdate) {
		this.accountdate = accountdate;
	}
	
	
}
