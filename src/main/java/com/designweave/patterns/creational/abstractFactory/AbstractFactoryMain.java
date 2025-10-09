package com.designweave.patterns.creational.abstractFactory;

import com.designweave.patterns.creational.abstractFactory.drink.Drink;
import com.designweave.patterns.creational.abstractFactory.factory.JapaneseTraditionalCuisineFactory;
import com.designweave.patterns.creational.abstractFactory.factory.TraditionalCuisineFactory;
import com.designweave.patterns.creational.abstractFactory.mainecourse.MainCourse;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        TraditionalCuisineFactory cuisineFactory = new JapaneseTraditionalCuisineFactory();

        Drink drink = cuisineFactory.createDrink();
        MainCourse mainCourse = cuisineFactory.createMainCourse();

        drink.pour();
        mainCourse.serve();
    }
}
