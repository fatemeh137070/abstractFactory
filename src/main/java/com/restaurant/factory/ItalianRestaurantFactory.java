package com.restaurant.factory;

import com.restaurant.product.Food;
import com.restaurant.product.Drink;
import com.restaurant.product.Pizza;
import com.restaurant.product.Wine;

public class ItalianRestaurantFactory extends AbstractFactory {

    @Override
    public Food createFood() {
        return new Pizza();
    }

    @Override
    public Drink createDrink() {
        return new Wine();
    }
}