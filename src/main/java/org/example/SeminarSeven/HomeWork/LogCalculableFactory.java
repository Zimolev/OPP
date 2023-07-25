package org.example.SeminarSeven.HomeWork;

public class LogCalculableFactory implements ICalculableFactory {

    private Logable logger;

    public LogCalculableFactory(Logable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create() {
        return new LogCalculator(new Calculator(),logger);
    }
}
