package com.restaurant.product;

public class Pizza implements Food {

    @Override
    public void prepare() {
        System.out.println("Preparing Italian Pizza!");
    }
}
