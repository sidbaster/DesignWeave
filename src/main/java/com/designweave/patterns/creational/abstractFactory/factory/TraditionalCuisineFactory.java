package com.designweave.patterns.creational.abstractFactory.factory;

import com.designweave.patterns.creational.abstractFactory.drink.Drink;
import com.designweave.patterns.creational.abstractFactory.mainecourse.MainCourse;

public abstract class TraditionalCuisineFactory {
    public abstract MainCourse createMainCourse();
    public abstract Drink createDrink();
}
