package org.example.SeminarSeven.HomeWork;

    public class LogCalculator implements Calculable {

        private Calculable decorated;
        private Logable logable;

        public LogCalculator(Calculable decorated, Logable logable) {
            this.decorated = decorated;
            this.logable = logable;
        }

        @Override
        public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
            logable.log("вызвался метод суммы между комплексным числом: " + num1 + " и комплексным числом: " + num2);
            return decorated.add(num1, num2);
        }

        @Override
        public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
            logable.log("вызвался метод умножения между комплексным числом: " + num1 + " и комплексным числом: " + num2);
            return decorated.multiply(num1, num2);
        }

        @Override
        public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
            logable.log("вызвался метод деления между комплексным числом: " + num1 + " и комплексным числом: " + num2);
            return decorated.divide(num1, num2);
        }
}
