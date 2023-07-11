package org.example.SeminarThree;

public enum Fruits {
    ORANGE(1), APPLE(5), PEACH(3);

    public int getNumber() {
        return number;
    }

    private int number;

    Fruits(int number) {
        this.number = number;
    }
}
