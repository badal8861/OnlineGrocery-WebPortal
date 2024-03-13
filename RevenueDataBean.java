package com.onlinegrocery.entity;


import java.util.Date;

public class RevenueDataBean {
	
	private Date fromDate;
	private Date toDate;
	private double TotalRevenue;
	public RevenueDataBean(Date fromDate, Date toDate, double totalRevenue) {
		super();
		this.fromDate = fromDate;
		this.toDate = toDate;
		TotalRevenue = totalRevenue;
	}
	
	public RevenueDataBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public double getTotalRevenue() {
		return TotalRevenue;
	}
	public void setTotalRevenue(double totalRevenue) {
		TotalRevenue = totalRevenue;
	}
	@Override
	public String toString() {
		return "TotalRevenue fromDate=" + fromDate + ", toDate=" + toDate + ", is " + TotalRevenue + "]";
	}
	
}
