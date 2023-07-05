package org.example.SeminarTwo.SeminarWork.TaskFive;

public class Dog extends Animals {

    private static int count;


    public Dog() {
        }

    public Dog(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, "Собака", maxRunDistance, maxSwimDistance);
    }
}
