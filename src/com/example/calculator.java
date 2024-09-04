package com.example;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Scanner str = new Scanner(System.in);
        String c = str.nextLine();

        System.out.println("첫 번째 숫자를 입력하세요:" + a);
        System.out.println("두 번째 숫자를 입력하세요:" + b);
        System.out.println("사칙연산 기호를 입력하세요:" + c);


    }
}
