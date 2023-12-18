package org.alenapech.calculator;

import org.alenapech.logger.Logger;

public class LoggedCalculator extends CalculableDecorator{

    private Logger logger;

    public LoggedCalculator(Calculable calculable, Logger logger) {
        super(calculable);
        this.logger = logger;
    }

    @Override
    public Calculable sum(double b) {
        String preliminaryLog = String.format("%f + %f", calculable.getResult(), b);
        calculable.sum(b);
        logger.log(preliminaryLog + String.format(" = %f", calculable.getResult()));
        return calculable;
    }

    @Override
    public Calculable mult(double b) {
        String preliminaryLog = String.format("%f * %f", calculable.getResult(), b);
        calculable.mult(b);
        logger.log(preliminaryLog + String.format(" = %f", calculable.getResult()));
        return calculable;
    }

    @Override
    public Calculable div(double b) {
        String preliminaryLog = String.format("%f / %f", calculable.getResult(), b);
        calculable.div(b);
        logger.log(preliminaryLog + String.format(" = %f", calculable.getResult()));
        return calculable;
    }

    @Override
    public double getResult() {
        return calculable.getResult();
    }
}
