package com.capstone.child.insurance.system.entity;

public class TransactionDetail {
	
	private String tId;
	private Double amount;
	

	public TransactionDetail() {

	}


	public TransactionDetail(String tId, Double amount) {
		super();
		this.tId = tId;
		this.amount = amount;
	}


	public String gettId() {
		return tId;
	}


	public void settId(String tId) {
		this.tId = tId;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	

}
