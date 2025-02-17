package com.restaurant;

import com.restaurant.factory.AbstractFactory;
import com.restaurant.factory.ItalianRestaurantFactory;
import com.restaurant.factory.ChineseRestaurantFactory;
import com.restaurant.product.Food;
import com.restaurant.product.Drink;

public class Main {
    public static void main(String[] args) {


        AbstractFactory italianFactory = new ItalianRestaurantFactory();
        Food italianFood = italianFactory.createFood();
        Drink italianDrink = italianFactory.createDrink();

        System.out.println("Italian Restaurant Menu:");
        italianFood.prepare();
        italianDrink.serve();

        System.out.println("\n--------------------------\n");

        AbstractFactory chineseFactory = new ChineseRestaurantFactory();
        Food chineseFood = chineseFactory.createFood();
        Drink chineseDrink = chineseFactory.createDrink();

        System.out.println("Chinese Restaurant Menu:");
        chineseFood.prepare();
        chineseDrink.serve();
    }
}