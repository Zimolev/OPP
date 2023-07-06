package org.example.SeminarTwo.SeminarWork.TaskSix;

public class Skate implements Machine{

    @Override
    public void run() {
        System.out.println("Скейт поехал");
    }
    @Override
    public void stop() {
        System.out.println("Скейт остановился");
    }
}
