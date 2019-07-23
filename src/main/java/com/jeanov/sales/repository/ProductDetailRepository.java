package com.jeanov.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanov.sales.entity.ProductDetail;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, String>{

}
