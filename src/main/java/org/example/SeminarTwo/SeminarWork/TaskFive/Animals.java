package org.example.SeminarTwo.SeminarWork.TaskFive;

public class Animals {
    protected String name;
    protected String type;
    protected static int count;
    private int maxRunDistance;
    private int maxSwimDistance;

    public Animals(String name,String type, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.type = type;
        this.name = name;
        if (type.equals("Кот")){
            if (maxRunDistance>200) this.maxRunDistance = 200;
            else this.maxRunDistance = maxRunDistance;
            this.maxSwimDistance =0;
        }else {
            if (maxRunDistance>500 ) this.maxRunDistance = 500;
            else this.maxRunDistance = maxRunDistance;
            if (maxSwimDistance>10) this.maxSwimDistance = 10;
            else this.maxSwimDistance = maxSwimDistance;
        }

    }
    public Animals(){
    }
    public void run(int distance){
        if (distance <= maxRunDistance){
            System.out.println(type + " - " + name + " пробежало дистанцию"+ distance);
        }
        else System.out.println(type + " - " + name + "  не смогло пробежать дистанцию"+ distance);
    }
    public void swim(int distance){
        if (distance <= maxSwimDistance){
            System.out.println(type + " - " + name + " проплыло дистанцию"+ distance);
        }
        else System.out.println(type + " - " + name + "  не смогло проплыть дистанцию"+ distance);
    }

}
