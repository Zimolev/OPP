package org.example.SeminarTwo.HomeWork;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void jump(){
        System.out.println("кот по имени" + name + " прыгает");
    }
    public void run(){
        System.out.println("кот по имени" + name + " бегает");
    }

    public String getName() {
        return name;
    }
}
