package com.dmdev.cs.lesson13;

public class TernaryOperator {

    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 90;
        int max = value1 > value2 ? value1 : value2; // тернарный оператор заменяет 5 нижних строк
//        if (value1 > value2) {
//            max = value1;
//        } else {
//            max = value2;
//        }
        System.out.println("max value is: " + max);
    }
}
