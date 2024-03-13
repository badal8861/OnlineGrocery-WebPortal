package com.onlinegrocery.entity;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class OrderEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int orderid;
	private int custid;
	private int productId;
	private int quantity;
	private Date paymentdate;
	private double amount;
	//1 - orderPendingPayment , 2- cancelled , 3 - paymentCompleted
	private int orderStatus = 1;
	
	public OrderEntity(int orderid, int custid, int productId, int quantity, Date paymentdate, double amount) {
		super();
		this.orderid = orderid;
		this.custid = custid;
		this.productId = productId;
		this.quantity = quantity;
		this.paymentdate = paymentdate;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "OrderEntity [orderid=" + orderid + ", custid=" + custid + ", productId=" + productId + ", quantity="
				+ quantity + ", paymentdate=" + paymentdate + ", amount=" + amount + ", orderStatus=" + orderStatus
				+ "]";
	}
	
	public int getOrderid() {
		return orderid;
	}
	
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	
	public int getCustid() {
		return custid;
	}
	
	public void setCustid(int custid) {
		this.custid = custid;
	}
	
	public Date getPaymentdate() {
		return paymentdate;
	}
	
	public void setPaymentdate(Date paymentdate) {
		this.paymentdate = paymentdate;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	
}
