package org.example.SeminarTwo.SeminarWork.TaskSix;

public class Byke implements Machine{
    @Override
    public void run() {
        System.out.println("Велик поехал");
    }
    @Override
    public void stop() {
        System.out.println("Велик остановился");
    }
}
