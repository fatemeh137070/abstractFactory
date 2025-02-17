package com.restaurant.product;

public class Noodle implements Food {

    @Override
    public void prepare() {
        System.out.println("Preparing Chinese Noodle!");
    }
}