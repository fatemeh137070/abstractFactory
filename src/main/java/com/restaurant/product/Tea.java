package com.restaurant.product;

public class Tea implements Drink {

    @Override
    public void serve() {
        System.out.println("Serving Chinese Tea!");
    }
}