package org.example.SeminarThree;

public class Main {
    public static void main(String[] args) {
        Month month = Month.APR;
        Fruits fruit = Fruits.APPLE;

        switch (fruit){
            case APPLE -> System.out.println("Яблоко " + fruit.getNumber());
            case PEACH -> System.out.println("Персик " + fruit.getNumber());
            case ORANGE -> System.out.println("Апельсин " + fruit.getNumber());
            default -> System.out.println("Нет таких фруктов");
        }

    }
}
