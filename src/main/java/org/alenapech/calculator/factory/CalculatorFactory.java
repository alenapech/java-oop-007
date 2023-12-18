package org.alenapech.calculator.factory;

import org.alenapech.calculator.Calculable;
import org.alenapech.calculator.Calculator;

public class CalculatorFactory implements CalculableFactory {
    @Override
    public Calculable create(double a) {
        return new Calculator(a);
    }
}
