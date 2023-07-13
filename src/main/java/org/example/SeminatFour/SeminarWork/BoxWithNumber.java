package org.example.SeminatFour.SeminarWork;

import lombok.Data;

@Data

public class BoxWithNumber<E extends Number> {
    private E[] num;

    public BoxWithNumber(E... num) {
        this.num = num;
    }

    public double average() {
        double sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i].doubleValue();
        }

        return sum / num.length;
    }

    public boolean compareAverage(BoxWithNumber<? extends Number> withNumber2) {
        return (average() == withNumber2.average());

    }
}
