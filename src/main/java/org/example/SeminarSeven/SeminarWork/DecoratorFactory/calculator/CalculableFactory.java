package org.example.SeminarSeven.SeminarWork.DecoratorFactory.calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
