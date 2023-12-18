package org.alenapech.calculator;

public interface Calculable {

    Calculable sum(double b);

    Calculable mult(double b);

    Calculable div(double b);

    double getResult();

}
