package org.example.SeminarTwo.SeminarWork.TaskSix;

public class Car implements Machine{
    @Override
    public void run() {
        System.out.println("Авто поехало");
    }
    @Override
    public void stop() {
        System.out.println("Авто остановилось");
    }
}
