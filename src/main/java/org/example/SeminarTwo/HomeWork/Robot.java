package org.example.SeminarTwo.HomeWork;

public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void jump(){
        System.out.println("робот по имени" + name + " прыгает");
    }
    public void run(){
        System.out.println("робот по имени" + name + " бегает");
    }

    public String getName() {
        return name;
    }
}
