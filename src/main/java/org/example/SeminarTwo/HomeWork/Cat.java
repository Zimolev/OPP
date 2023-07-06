package org.example.SeminarTwo.HomeWork;

public class Cat implements Personality {
    private final String name;
    private final int runDistance;
    private final int jumpHeight;

    public Cat(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public int runningDistance() {
        return this.runDistance;
    }

    @Override
    public int jumpingHeight() {
        return this.jumpHeight;
    }

    @Override
    public String names() {
        return this.name;
    }

    @Override
    public void move() {
        System.out.println("Cat " + this.name + " умеет бегать " + this.runDistance);
    }

    @Override
    public void jumping() {
        System.out.println("Cat " + this.name + " умеет прыгать " + this.jumpHeight);
    }
}
