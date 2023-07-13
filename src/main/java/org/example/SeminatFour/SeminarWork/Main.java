package org.example.SeminatFour.SeminarWork;

public class Main {
    public static void main(String[] args) {

        BoxWithNumber <Integer> withNumber = new BoxWithNumber(1, 2, 3, 4);
        BoxWithNumber <Double> withNumber2 = new BoxWithNumber(1, 3, 8, 4);
        BoxWithNumber <Double> withNumber3 = new BoxWithNumber(4, 3, 2, 1);

        System.out.println("withNumber.average() = " + withNumber.average());
        System.out.println("withNumber.compareAverage(withNumber3) = " + withNumber.compareAverage(withNumber3));

        /*SimpleBox box1 = new SimpleBox(10);
        SimpleBox box2 = new SimpleBox(20);
        int sum = (Integer) box2.getObject() + (Integer) box1.getObject();
        System.out.println("sum = " + sum);
        box1.setObject("10");
        Integer sum2 = 0;
        if (box1.getObject() instanceof Integer && box2.getObject() instanceof Integer){
            sum2 = ((Integer) box1.getObject()) + ((Integer) box2.getObject());
        }
        System.out.println("sum2 = " + sum2);

        GenBox<Integer> genBox1 = new GenBox<>(10);
        GenBox<Integer> genBox2 = new GenBox<>(20);
        int sum3 = genBox2.getObj() + genBox1.getObj();
        System.out.println("sum3 = " + sum3);
    */
    }
}
