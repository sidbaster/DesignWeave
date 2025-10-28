package com.designweave.patterns.creational.adapter;

public class Referal {

    Skierowanie skierowanie = new Skierowanie();

    public String saveReferal() {
        return skierowanie.pobierzSkierowanie();
    }

    public String addReferal () {
        return skierowanie.dodajSkierowanie();
    }

    public String printReferal () {
        return skierowanie.drukujskierowanie();
    }
}
