package org.example.SeminarTwo.HomeWork;

public class Wall implements Barrier {

    private int wallLength;

    public Wall(int wallLength) {
        this.wallLength = wallLength;
    }
    @Override
    public boolean moving(Personality personality) {
        System.out.println("Стена высотой... " + this.wallLength);
        personality.jumping();
        if (this.wallLength <= personality.jumpingHeight()) {
            System.out.println(personality.names() + " преодолел препядствие");
            return true;
        }
        else {
            System.out.println(personality.names() + " не преодолел препядствие");
            return false;
        }
    }
}
