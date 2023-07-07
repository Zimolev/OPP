package org.example.SeminarTwo.HomeWork;
public class Robot implements Personality {

    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name, int runDistance, int jumpHeight) {
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
        System.out.println("Robot " + this.name + " умеет бегать " + this.runDistance);
    }

    @Override
    public void jumping() {
        System.out.println("Robot " + this.name + " умеет прыгать " + this.jumpHeight);
    }
}