package com.designweave.patterns.creational.builder;

import java.util.Objects;

public class Pizza {
    private final boolean dough;
    private final boolean cheese;
    private final boolean bacon;
    private final boolean pineapple;
    private final boolean mushroom;
    private final boolean seafood;

    private Pizza(Builder builder) {
        this.dough = builder.dough;
        this.cheese = builder.cheese;
        this.bacon = builder.bacon;
        this.pineapple = builder.pineapple;
        this.mushroom = builder.mushroom;
        this.seafood = builder.seafood;
    }

    public static class Builder {
        private final boolean dough;
        private boolean cheese;
        private boolean bacon;
        private boolean pineapple;
        private boolean mushroom;
        private boolean seafood;

        public Builder(boolean dough) {
            this.dough = dough;
        }

        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder bacon(boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public Builder pineapple(boolean pineapple) {
            this.pineapple = pineapple;
            return this;
        }

        public Builder mushroom(boolean mushroom) {
            this.mushroom = mushroom;
            return this;
        }

        public Builder seafood(boolean seafood) {
            this.seafood = seafood;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isMushroom() {
        return mushroom;
    }

    public boolean isPineapple() {
        return pineapple;
    }

    public boolean isSeafood() {
        return seafood;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return dough == pizza.dough && cheese == pizza.cheese && bacon == pizza.bacon &&
                pineapple == pizza.pineapple && mushroom == pizza.mushroom && seafood == pizza.seafood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dough, cheese, bacon, pineapple, mushroom, seafood);
    }
}
