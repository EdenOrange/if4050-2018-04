package com.javahelps.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wishlist {

    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
	
	@Override
    public String toString() {
        return "Wishlist{" + "id='" + id + '\'' + '}';
    }
}