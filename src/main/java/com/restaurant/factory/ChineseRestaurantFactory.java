package com.restaurant.factory;

import com.restaurant.product.Food;
import com.restaurant.product.Drink;
import com.restaurant.product.Noodle;
import com.restaurant.product.Tea;


public class ChineseRestaurantFactory extends AbstractFactory {

    @Override
    public Food createFood() {
        return new Noodle();
    }

    @Override
    public Drink createDrink() {
        return new Tea();
    }
}

