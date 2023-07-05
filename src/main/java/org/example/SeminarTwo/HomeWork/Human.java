package org.example.SeminarTwo.HomeWork;

public class Human implements Entity {
    private final String name;
    private final Integer runDistance;
    private final Integer jumpHeight;

    public Human(String name, Integer runDistance, Integer jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

        public Integer runningDistance() {
            return this.runDistance;
        }

        @Override
        public Integer jumpingHeight() {
            return this.jumpHeight;
        }

        @Override
        public String names() {
            return this.name;
        }

        @Override
        public void move() {
            System.out.println("Человек " + name + " умеет бегать " + runDistance);
        }

        @Override
        public void jumping() {
            System.out.println("Человек " + this.name + " умеет прыгать " + this.jumpHeight);
        }

    /*private String name;

    public Human(String name) {
        this.name = name;
    }

    public void jump(){
        System.out.println("человек по имени" + name + " прыгает");
    }
    public void run(){
        System.out.println("человек по имени" + name + " бегает");
    }

    public String getName() {
        return name;
    }*/
}
