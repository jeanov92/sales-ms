package com.jeanov.sales.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class ProductDetailTO {

	@NotNull
	private String productId;

	@NotNull
	@Min(1)
	private int units;

//	private String description;

	public String getProductId() {
		return productId;
	}

	public int getUnits() {
		return units;
	}

//	public String getDescription() {
//		return description;
//	}

}
