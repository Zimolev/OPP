package org.example.SeminarTwo.SeminarWork.TaskFive;

public class Cat extends Animals{
        protected static int count;


    public Cat(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, "Кот", maxRunDistance, maxSwimDistance);
        count++;
    }
}
