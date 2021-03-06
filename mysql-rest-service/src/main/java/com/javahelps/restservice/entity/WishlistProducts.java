package com.javahelps.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WishlistProducts {

    @Id
    private int id;
    private int wishlistId;
    private int productId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getWishlistId() {
        return wishlistId;
    }

    public void setWishlistId(int wishlistId) {
        this.wishlistId = wishlistId;
    }
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	@Override
    public String toString() {
        return "WishlistProducts{" + "id='" + id + '\'' + ", wishlistId='" + wishlistId + '\'' + ", productId='" + productId + '\'' + '}';
    }
}