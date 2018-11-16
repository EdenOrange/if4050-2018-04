package com.javahelps.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CartProducts {

    @Id
    private int id;
    private int cartId;
    private int productId;
    private int productQuantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	@Override
    public String toString() {
        return "Cart{" + "id='" + id + '\'' + ", cartId='" + cartId + '\'' + ", productId='" + productId + '\'' + ", productQuantity='" + productQuantity + '\'' + '}';
    }
}