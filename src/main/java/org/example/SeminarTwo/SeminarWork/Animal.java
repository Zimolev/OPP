package org.example.SeminarTwo.SeminarWork;

public abstract class Animal {

    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void animalInfo();

    public void voice() {
        System.out.println("Звук!");
    }

    public void jump() {
        System.out.println(" Прыжок ! ");
    }
}
