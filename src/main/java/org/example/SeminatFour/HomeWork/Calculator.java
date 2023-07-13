package org.example.SeminatFour.HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param numbers массив чисел
     * @return сумма всех элементов
     * @apiNote возвращающий сумму элементов коллекции
     */
    public Double sum(List<? extends Number> numbers) {
        Double result = 0.0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return result;
    }
    /**
     * @param numbers массив чисел
     * @return призведение всех элементов
     * @apiNote возвращающий призведение всех элементов массива
     */
    public Double mult(List<? extends Number> numbers) {
        Double result = 1.0;
        for (Number number : numbers) {
            result *= number.doubleValue();
        }
        return result;
    }
    /**
     * @param numbers массив чисел
     * @return деление певрвого элемента на все последующие
     * @apiNote деление элементов массива
     */
    public Double div(List<? extends Number> numbers) throws ArithmeticException {
        Double result = numbers.get(0).doubleValue();
        for (int i = 1; i < numbers.size(); i++) {

            if (numbers.get(i).doubleValue() != 0) result /= numbers.get(i).doubleValue();
            else {
                System.out.println("На ноль делить нельзя");
                break;
            }
        }
        return result;
    }
    /**
     * @param numbers массив чисел
     * @return массив бинаррных чисел
     * @apiNote перевод массива в бинарный
     */
    public List<String> binary(List<? extends Number> numbers) {
        List<String> binaryNum = new ArrayList<>();
        for (Number number : numbers) {
            if (number instanceof Integer) {
                String binary = Integer.toBinaryString((((int) number)));
                binaryNum.add(binary);
            } else if (number instanceof Double) {
                int temp = (number.intValue());
                String binary = Integer.toBinaryString(temp);
                binaryNum.add(binary);
            }
        }
        return binaryNum;
    }
}
