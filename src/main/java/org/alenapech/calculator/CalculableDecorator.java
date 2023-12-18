package org.alenapech.calculator;

public abstract class CalculableDecorator implements Calculable{

    protected Calculable calculable;

    public CalculableDecorator(Calculable calculable) {
        this.calculable = calculable;
    }
}
