package com.example;

import java.util.*;

public class Calculator {
    private double calculate;

    private double calculate(int num1, int num2, String operator) {
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
                    return 0;
            }
            return result;
        }
    }

    public double getCalculate(int n1, int n2, String p) {
        return calculate;  // 강의보면서 작성했는데 인텔리제이에서 오류 부분 수정해줌
        // 작동원리 다시 파악 필요, App클래스의 getCalculate도 마찬가지
    }
}