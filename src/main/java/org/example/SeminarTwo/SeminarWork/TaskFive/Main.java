package org.example.SeminarTwo.SeminarWork.TaskFive;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = {
                new HomeCat("Пус", "Котик", 20, 5),
                new Dog("Женева", "Пес", 52, 20),
                new Tiger("Тигр", "Тигр", 200, 50),
                new Cat("Просто кот", "Кот", 200, 0)
            };
        for (Animals animal : animals) {
            animal.run(150);
            animal.swim(10);
        }
    }
}
