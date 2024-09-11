package com.example;

import java.util.*;

public class Calculator {
    private final ArrayList<Double> result = new ArrayList<>(); // 배열객체를 더블 타입의 result에 담는다
    public void remove(){ // 첫 번째 값 삭제
        result.remove(0);
    }
    private int num1;  // num1 캡슐화
    private int num2;  // num2 캡슐화
    private String operation;  // String p 캡슐화
    private double sum;  // sum 캡슐화

    public double getResult() {  //외부의 데이터를 읽기 위해 gettet 세팅
        int lastindex = result.size() -1;
        if(lastindex < 0){
            return Double.parseDouble("이상문자 출력");
        }else{
            return result.get(lastindex);  // 마지막 값이 저장될 수 있도록
        }
    }

    public  void setCalculate(int num1, int num2, String operation) {  // 외부에서 접근해서 값을 바꾸기 위해 setter 세팅
        this.operation = operation;
        this.num1 = num1;
        this.num2 = num2;
        calculate(num1, num2, operation);
    }

    public ArrayList<Double> record(){  // 결과값을 저장하기 위한 record세팅
        return result;
    }

    public void  calculate(int num1, int num2, String operation){
        switch (operation) {
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