package com.fola.spring.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	public Product(Long productID, String productName, String productCode, Double stockLevel, Double reOrderLevel,
			BigDecimal costPrice, BigDecimal sellingPrice, Date expiryDate) {
		this.productID = productID;
		this.productName = productName;
		this.productCode = productCode;
		this.stockLevel = stockLevel;
		this.reOrderLevel = reOrderLevel;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
		this.expiryDate = expiryDate;
	}

	public Long getProductID() {
		return productID;
	}

	public void setProductID(Long productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Double getStockLevel() {
		return stockLevel;
	}

	public void setStockLevel(Double stockLevel) {
		this.stockLevel = stockLevel;
	}

	public Double getReOrderLevel() {
		return reOrderLevel;
	}

	public void setReOrderLevel(Double reOrderLevel) {
		this.reOrderLevel = reOrderLevel;
	}

	public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	public BigDecimal getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(BigDecimal sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	Product() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long productID;
	private String productName;
	private String productCode;
	private Double stockLevel;
	private Double reOrderLevel;
	private BigDecimal costPrice;
	private BigDecimal sellingPrice;
	private Date expiryDate;

}
