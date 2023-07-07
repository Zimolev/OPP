package org.example.SeminarTwo.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Personality> person = new ArrayList();
        person.add(new Human("Oleg",100,1));
        person.add(new Robot("Verder", 1000, 20));
        person.add(new Cat("Murka",25, 3));


        List<Barrier> barriers =  new ArrayList<>();

        barriers.add(new Treadmill(50));
        barriers.add(new Wall(5));
        barriers.add(new Treadmill(20));
        barriers.add(new Wall(2));
        runJump(person, barriers);
    }

    /**
     * @apiNote Пробегаем Personality по Barrier
     *  @param persons List<Personality>
     *  @param barriers List<Barrier
     */
    static void runJump(List<Personality> persons, List<Barrier>  barriers){
        for (Personality person : persons) {
            for (Barrier barrier : barriers)
                if (!barrier.moving(person)) {
                    break;
                }
        }
    }
}
