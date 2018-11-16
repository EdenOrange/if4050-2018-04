package com.javahelps.restservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RestResource;

import com.javahelps.restservice.entity.WishlistProducts;

@RestResource(exported = false)
public interface WishlistProductsRepository extends JpaRepository<WishlistProducts, Integer> {
	
	@Query("SELECT w FROM WishlistProducts w WHERE w.wishlistId = ?1")
	List<WishlistProducts> findByWishlistId(int wishlistId);
}