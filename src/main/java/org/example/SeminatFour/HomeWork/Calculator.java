package org.example.SeminatFour.HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param numbers массив чисел
     * @return сумма всех элементов
     * @apiNote сложение всех элементов массива
     */
    public Double sum(List<? extends Number> numbers) {
        Double result = 0.0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return result;
    }

    public Double mult(List<? extends Number> numbers) {
        Double result = 1.0;
        for (Number number : numbers) {
            result *= number.doubleValue();
        }
        return result;
    }

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
