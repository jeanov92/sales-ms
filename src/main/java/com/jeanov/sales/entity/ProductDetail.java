package com.jeanov.sales.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_detail")
public class ProductDetail {

	@Id
	@Column(name = "product_id")
	private String productId;

	private int units;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orderId", nullable = false)
	private Order order;
	

	public ProductDetail() {
		super();
	}

	public ProductDetail(String productId, int units, Order order) {
		this.productId = productId;
		this.units = units;
		this.order = order;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}
}
