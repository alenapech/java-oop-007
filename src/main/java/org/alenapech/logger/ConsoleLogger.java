package org.alenapech.logger;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
