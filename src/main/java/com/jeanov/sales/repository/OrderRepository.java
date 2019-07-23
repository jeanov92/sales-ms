package com.jeanov.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanov.sales.entity.Order;

public interface OrderRepository extends JpaRepository<Order, String>{

}
