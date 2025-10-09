package com.designweave.patterns.creational.abstractFactory.factory;

import com.designweave.patterns.creational.abstractFactory.drink.Drink;
import com.designweave.patterns.creational.abstractFactory.drink.JapaneseDrink;
import com.designweave.patterns.creational.abstractFactory.mainecourse.JapaneseMainCourse;
import com.designweave.patterns.creational.abstractFactory.mainecourse.MainCourse;

public class JapaneseTraditionalCuisineFactory extends TraditionalCuisineFactory{
    @Override
    public MainCourse createMainCourse() {
        return new JapaneseMainCourse();
    }

    @Override
    public Drink createDrink() {
        return new JapaneseDrink();
    }
}
