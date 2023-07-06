package org.example.SeminarTwo.SeminarWork.TaskSix;

public class Human {
    private Machine machine;


    public void drive(Machine cars) {
        machine = cars;
        cars.run();
    }
    public void stop(){
        if(machine != null){
            machine.stop();
            machine=null;
        }
        else System.out.println("И так стоим, не начем ехать");
    }

}
