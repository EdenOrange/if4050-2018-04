package com.javahelps.restservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RestResource;

import com.javahelps.restservice.entity.CartProducts;

@RestResource(exported = false)
public interface CartProductsRepository extends JpaRepository<CartProducts, Integer> {
	
	@Query("SELECT c FROM CartProducts c WHERE c.cartId = ?1")
	List<CartProducts> findByCartId(int cartId);
}