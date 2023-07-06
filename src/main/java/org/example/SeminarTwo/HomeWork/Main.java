package org.example.SeminarTwo.HomeWork;

public class Main {
    public static void main(String[] args) {
        Personality[] person = {
                new Human("Oleg",100,1),
                new Robot("Verder", 1000, 20),
                new Cat("Murka",25, 3)
        };

        Barrier[] barriers = {
                new Wall(2),
                new Treadmill(50),
                new Wall(5),
                new Treadmill(20)
        };
        runJump(person, barriers);
    }

    static void runJump(Personality[] persons, Barrier[] barriers){
        for (Personality person : persons) {
            for (Barrier barrier : barriers)
                if (!barrier.moving(person)) {
                    break;
                }
        }

    }


}
