package org.alenapech.decorator;

public class PizzaDough implements Pizza{
    @Override
    public String getDescription() {
        return "Dough";
    }

    @Override
    public double getCost() {
        return 150;
    }
}
