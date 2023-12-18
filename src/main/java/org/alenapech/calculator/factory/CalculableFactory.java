package org.alenapech.calculator.factory;

import org.alenapech.calculator.Calculable;

public interface CalculableFactory {

    Calculable create(double a);

}
