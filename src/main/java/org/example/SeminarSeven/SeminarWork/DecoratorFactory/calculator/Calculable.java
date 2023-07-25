package org.example.SeminarSeven.SeminarWork.DecoratorFactory.calculator;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    int getResult();
}
