package org.alenapech.calculator;

public class Calculator implements Calculable{

    private double a;

    public Calculator(double a) {
        this.a = a;
    }

    @Override
    public Calculable sum(double b) {
        a += b;
        return this;
    }

    @Override
    public Calculable mult(double b) {
        a *= b;
        return this;
    }

    @Override
    public Calculable div(double b) {
        a /= b;
        return this;
    }

    @Override
    public double getResult() {
        return a;
    }
}
