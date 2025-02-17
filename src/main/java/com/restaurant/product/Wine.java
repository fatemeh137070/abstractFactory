package com.restaurant.product;

public class Wine implements Drink {

    @Override
    public void serve() {
        System.out.println("Serving Italian Wine!");
    }
}
