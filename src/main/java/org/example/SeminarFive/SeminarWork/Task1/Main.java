package org.example.SeminarFive.SeminarWork.Task1;

import org.example.SeminarFive.SeminarWork.Task1.Flyable;

public class Main {
    public static void main(String[] args) {


        Flyable flyable = new Flyable() {
            @Override
            public void fiv() {
                System.out.println("Летим куда то ");
            }
        };
        flyable.fiv();
    }
}
