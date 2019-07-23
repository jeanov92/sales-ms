package com.jeanov.sales.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jeanov.sales.entity.Order;
import com.jeanov.sales.entity.ProductDetail;
import com.jeanov.sales.model.OrderTO;
import com.jeanov.sales.model.ProductDetailTO;
import com.jeanov.sales.repository.OrderRepository;
import com.jeanov.sales.repository.ProductDetailRepository;

@Component
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ProductDetailRepository productDetailRepository;

	public Order saveOrder(OrderTO orderTO) {
		Order order = new Order(orderTO.getClientId());
		List<ProductDetail> products = convertToProductsDetails(orderTO.getProductsDetails(), order);
		order.setProductsDetails(products);
		return this.orderRepository.save(order);
	}

	private List<ProductDetail> convertToProductsDetails(List<ProductDetailTO> productsTO, Order order) {
		List<ProductDetail> products = new ArrayList<>();
		productsTO.forEach(productTo -> {
			ProductDetail product = new ProductDetail(productTo.getProductId(), productTo.getUnits(), order);
			products.add(product);
		});
		return products;
	}
}
