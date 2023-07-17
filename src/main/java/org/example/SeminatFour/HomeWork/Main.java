package org.example.SeminatFour.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<Long> longList = new ArrayList<>();
        for (int i = 10; i > -1; i--) {
            doubleList.add((double) i);
            integerList.add(i);
            longList.add(((long) i));

        }
        System.out.println("calc.sum(doubleList) = " + calc.sum(doubleList));
        System.out.println("calc.sum(integerList) = " + calc.sum(integerList));
        System.out.println("calc.div(integerList) = " + calc.div(integerList));
        System.out.println("calc.mult(integerList) = " + calc.mult(integerList));
        System.out.println("calc.binary(integerList) = " + calc.binary(longList));
        System.out.println("calc.binary(doubleList) = " + calc.binary(doubleList));

    }
}
