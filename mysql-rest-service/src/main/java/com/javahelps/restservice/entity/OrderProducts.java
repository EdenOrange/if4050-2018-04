package com.javahelps.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderProducts {

    @Id
    private int id;
    private int orderCheckoutId;
    private int productId;
    private int productQuantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderCheckoutId() {
        return orderCheckoutId;
    }

    public void setOrderCheckoutId(int orderCheckoutId) {
        this.orderCheckoutId = orderCheckoutId;
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
        return "OrderProducts{" + "id='" + id + '\'' + ", orderCheckoutId='" + orderCheckoutId + '\'' + ", productId='" + productId + '\'' + ", productQuantity='" + productQuantity + '\'' + '}';
    }
}