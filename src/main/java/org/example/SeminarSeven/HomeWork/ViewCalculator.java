package org.example.SeminarSeven.HomeWork;

import java.util.Scanner;

public class ViewCalculator {
    private ICalculableFactory calculableFactory;
    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }


    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действительную часть первого числа");
        double real1 = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого числа:");
        double imaginary1 = scanner.nextDouble();
        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);
        System.out.println("Введите действительную часть второго числа");
        double real2 = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго числа:");
        double imaginary2 = scanner.nextDouble();
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);
        Calculable calculator = calculableFactory.create();
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Умножение");
        System.out.println("3. Деление");
        int choice = scanner.nextInt();
        ComplexNumber result = null;
        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                break;
            case 2:
                result = calculator.multiply(num1, num2);
                break;
            case 3:
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Некорректный выбор операции");
                break;
        }
        if (result != null) {
            System.out.println("Результат: " + result);
        }
    }
}
