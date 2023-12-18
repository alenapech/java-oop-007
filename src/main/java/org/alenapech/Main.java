package org.alenapech;

import org.alenapech.calculator.Calculable;
import org.alenapech.calculator.LoggedCalculator;
import org.alenapech.calculator.factory.CalculableFactory;
import org.alenapech.calculator.factory.CalculatorFactory;
import org.alenapech.logger.factory.ConsoleLoggerFactory;
import org.alenapech.logger.factory.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        CalculableFactory calculatorFactory = new CalculatorFactory();
        LoggerFactory loggerFactory = new ConsoleLoggerFactory();
        Calculable calculable = new LoggedCalculator(calculatorFactory.create(10), loggerFactory.create());
        System.out.println(calculable.sum(90).getResult());
        System.out.println(calculable.div(10).getResult());
        System.out.println(calculable.mult(50).getResult());
    }
}