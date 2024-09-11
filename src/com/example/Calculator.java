package com.example;

import java.util.*;

public class Calculator {
    private final ArrayList<Double> result = new ArrayList<>();
    private int num1;
    private int num2;
    private String p;
    private double sum;

    public double getResult() {
        int lastindex = result.size() -1;
        if(lastindex < 0){
            return Double.parseDouble("이상문자 출력");
        }else{
            return result.get(lastindex);
        }
    }

    public  void setCalculate(int num1, int num2, String p) {
        this.p = p;
        this.num1 = num1;
        this.num2 = num2;
        calculate(num1, num2, p);
    }

    public ArrayList<Double> record(){
        return result;
    }

    public void  calculate(int num1, int num2, String p){
        switch (p) {
            case "+":
                sum = num1 + num2;
                result.add(sum);
                break;
            case "-":
                sum = num1 - num2;
                result.add(sum);
                break;
            case "*":
                sum = num1 * num2;
                result.add(sum);
                break;
            case "/":
                if (num2 != 0) {
                    sum = num1 / num2;
                    result.add(sum);
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("잘못된 연산입니다.");
                break;
        }
    }
}