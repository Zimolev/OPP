package org.example.SeminarTwo.HomeWork;

public class Human implements Personality {
        private String name;
        private int runDistance;
        private int jumpHeight;

        public Human(String name, int runDistance, int jumpHeight) {
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
            System.out.println("Human " + this.name + " умеет бегать " + this.runDistance);
        }

        @Override
        public void jumping() {
            System.out.println("Human " + this.name + " умеет прыгать " + this.jumpHeight);
        }
}
