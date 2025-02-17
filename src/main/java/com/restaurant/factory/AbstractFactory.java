package com.restaurant.factory;

import com.restaurant.product.Food;
import com.restaurant.product.Drink;

public abstract class AbstractFactory {
    public abstract Food createFood();
    public abstract Drink createDrink();
}