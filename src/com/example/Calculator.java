package com.example;

import java.util.*;

public class Calculator {
    public double calculate(int num1, int num2, String operator) {
        double result = 0.0;
        while (true) {
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                    }
                    break;
                default:
                    System.out.println("잘못된 연산입니다.");
            }return result;
        }
    }
}