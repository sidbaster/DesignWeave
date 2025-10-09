package com.designweave.patterns.creational.abstractFactory.mainecourse;

public class JapaneseMainCourse implements MainCourse {

    @Override
    public void serve() {
        System.out.println("serve sushi");
    }
}
