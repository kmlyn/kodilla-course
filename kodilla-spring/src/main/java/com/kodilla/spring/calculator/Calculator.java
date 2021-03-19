package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        double r = a + b;
        display.displayValue(r);
        return r;
    }

    public double sub(double a, double b) {
        double r = a - b;
        display.displayValue(r);
        return r;
    }

    public double mul(double a, double b) {
        double r = a * b;
        display.displayValue(r);
        return r;
    }

    public double div(double a, double b) {
        double r = a / b;
        display.displayValue(r);
        return r;
    }
}
