package com.designweave.patterns.creational.abstractFactory.factory;

import com.designweave.patterns.creational.abstractFactory.drink.Drink;
import com.designweave.patterns.creational.abstractFactory.drink.UkrainianDrink;
import com.designweave.patterns.creational.abstractFactory.mainecourse.MainCourse;
import com.designweave.patterns.creational.abstractFactory.mainecourse.UkrainianMainCourse;

public class TraditionalUkraineCuisineFactory extends TraditionalCuisineFactory{
    @Override
    public MainCourse createMainCourse() {
        return new UkrainianMainCourse();
    }

    @Override
    public Drink createDrink() {
        return new UkrainianDrink();
    }
}
