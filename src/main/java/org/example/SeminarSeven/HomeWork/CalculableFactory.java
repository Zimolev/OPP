package org.example.SeminarSeven.HomeWork;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create() {
        return new Calculator();
    }
}
