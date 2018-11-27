package com.javahelps.restservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RestResource;

import com.javahelps.restservice.entity.OrderProducts;

@RestResource(exported = false)
public interface OrderProductsRepository extends JpaRepository<OrderProducts, Integer> {
	
	@Query("SELECT o FROM OrderProducts o WHERE o.orderCheckoutId = ?1")
	List<OrderProducts> findByOrderCheckoutId(int orderCheckoutId);
}