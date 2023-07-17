package org.example.SeminarFive.SeminarWork.Task1;

public class Outer {

    public Outer() {
    }

    class Inner{
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }
        public void innerMethod(){
            System.out.println("Внешний класс из внутреннего " + outerValue);
            System.out.println("Внутренный класс из внутреннего " + innerValue);
            outerMethod();
        }
    }
    int outerValue;

    public void outerMethod(){
        System.out.println("Внешний класс из внешнего " + outerValue);
        //System.out.println("Внутренный класс из внешнего " + innerValue);
    }

    public static void main(String[] args) {
        Inner inner = new Outer().new Inner(10);
        inner.innerMethod();
    }
}
