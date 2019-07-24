package com.jeanov.sales.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jeanov.sales.entity.Order;
import com.jeanov.sales.model.OrderTO;
import com.jeanov.sales.service.OrderService;

@RestController
public class SalesController {

	@Autowired
	OrderService orderService;

	@PostMapping(path = "/order")
	public ResponseEntity<Order> recieveOrder(@Valid @RequestBody OrderTO order) {
		return new ResponseEntity<Order>(this.orderService.saveOrder(order), HttpStatus.OK);
	}

	@GetMapping(path = "/orders")
	public ResponseEntity<List<Order>> getOrders() {
		return new ResponseEntity<List<Order>>(this.orderService.getOrders(), HttpStatus.OK);
	}

}
