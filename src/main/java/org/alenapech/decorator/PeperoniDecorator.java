package org.alenapech.decorator;

public class PeperoniDecorator extends PizzaDecorator {
    public PeperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", peperoni";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 25;
    }
}
