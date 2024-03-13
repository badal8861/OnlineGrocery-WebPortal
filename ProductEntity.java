package com.onlinegrocery.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	private String productDescription;
	//Approved = 1 , pendingApproval = 2 , declined =3
	private int productApproval = 2;
	private double productPricePerUnit;
	private int sellerId;
	//{Vegetables = 1 , Fruits = 2 , Cereals = 3 ,OtherGroceryEssentials = 4}
	private int productTypeCode;
	private int unitsAdded;

	public ProductEntity(int productId, String productName, String productDescription, int productApproval,
			double productPricePerUnit, int sellerId, int productTypeCode, int unitsAdded) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productApproval = 2;
		this.productPricePerUnit = productPricePerUnit;
		this.sellerId = sellerId;
		this.productTypeCode = productTypeCode;
		this.unitsAdded = unitsAdded;
		
	}

	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getProductApproval() {
		return productApproval;
	}

	public void setProductApproval(int productApproval) {
		this.productApproval = productApproval;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public int getProductTypeCode() {
		return productTypeCode;
	}

	public void setProductTypeCode(int productTypeCode) {
		this.productTypeCode = productTypeCode;
	}


	public double getProductPricePerUnit() {
		return productPricePerUnit;
	}

	public void setProductPricePerUnit(double productPricePerUnit) {
		this.productPricePerUnit = productPricePerUnit;
	}

	public int getUnitsAdded() {
		return unitsAdded;
	}

	public void setUnitsAdded(int unitsAdded) {
		this.unitsAdded = unitsAdded;
	}

	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productApproval=" + productApproval + ", productPricePerUnit="
				+ productPricePerUnit + ", sellerId=" + sellerId + ", productTypeCode=" + productTypeCode + ", unitsAdded=" + unitsAdded + "]";
	}
	
	

}
