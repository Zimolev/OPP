package org.example.SeminarTwo.SeminarWork.TaskFive;

public class HomeCat extends Cat{
    protected static int count;


    public HomeCat(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, type, maxRunDistance, maxSwimDistance);
        count++;
    }
}
