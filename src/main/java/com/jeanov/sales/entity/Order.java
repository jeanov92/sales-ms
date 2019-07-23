package com.jeanov.sales.entity;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sale_order")
public class Order {

	@Id
	private String orderId;

	private String clientId;

	@Column(name = "sale_date")
	private Date date;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private List<ProductDetail> productsDetails;

	public Order() {
		this.orderId = UUID.randomUUID().toString();
		this.date = new Date();
	}

	public Order(String clientId) {
		super();
		this.clientId = clientId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<ProductDetail> getProductsDetails() {
		return productsDetails;
	}

	public void setProductsDetails(List<ProductDetail> productsDetails) {
		this.productsDetails = productsDetails;
	}

}
