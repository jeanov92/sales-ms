package com.jeanov.sales.model;

import java.util.Date;
import java.util.List;

import org.springframework.lang.NonNull;

public class OrderTO {

	private String orderId;

	@NonNull
	private String clientId;

	private Date date;

	private List<ProductDetailTO> productsDetails;

	public String getOrderId() {
		return orderId;
	}

	public String getClientId() {
		return clientId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<ProductDetailTO> getProductsDetails() {
		return productsDetails;
	}

}
