package org.alenapech.decorator;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }
}
