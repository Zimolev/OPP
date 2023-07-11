package org.example.SeminarThree.Game;

import java.util.ArrayList;
import java.util.List;


public class NumberGame extends AbstractGame {
    private int userChoice;

    public NumberGame(int userChoice) {
        this.userChoice = userChoice;
    }

    @Override
    List<String> generateCharList() {
        switch (userChoice) {
            case 1:
                List<String> result2 = new ArrayList<>();
                for (int i = 0; i <= 9; i++) {
                    result2.add(String.valueOf(i));
                }
                return result2;
            case 2:
                List<String> result = new ArrayList<>();
                char ch = 1105;
                result.add(String.valueOf(ch));
                for (int i = 1072; i <= 1103; i++) {
                    ch = (char) i;
                    result.add(String.valueOf(ch));
                }
                return result;
            case 3:
                List<String> result3 = new ArrayList<>();
                for (int i = 97; i <= 123; i++) {
                    ch = (char) i;
                    result3.add(String.valueOf(ch));
                }
                return result3;
            case 4:
                System.out.println("В разаботке...");
                break;
        }
        return null;
    }

    }

