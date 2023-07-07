package org.example.SeminarTwo.HomeWork;

public class Treadmill implements Barrier {

    private int treadLength;

    public Treadmill(int treadLength) {
        this.treadLength = treadLength;
    }

    @Override
    public boolean moving(Personality personality) {
        System.out.println("Беговая дорожка длиной " + this.treadLength);
        personality.move();
        if (personality.runningDistance()>=this.treadLength){
            System.out.println(personality.names() + " преодолел препядствие");
            return true;
        }
        else {
            System.out.println(personality.names() + " не преодолел препядствие");
            return false;
        }
    }
}
