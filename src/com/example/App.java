package com.example;

import java.util.*;  // 라이브러리 (필요한 연산이 모여져 있는 공간을 가져오기 위해 임포트)

public class App { // 모든이름을 수정할 경우 단축키 F2를 눌러서  수정가능
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        String input = "";  // while에서 반복할지 멈출지 정해주기 위한 조건에 넣기위해 문자열 input을 선언

        while (!input.equals("exit")) { // !=로 같지 않다를 표현하였더니 인텔리제이에서 수정해줌
            System.out.print("첫 번째 값을 입력하세요: ");
            num1 = Integer.parseInt(sc.next());  // 처음엔 nextInt를 넣었는데 제대로 작동하지 않아 형변환하여 nextLine으로 수정

            System.out.print("연산기호를 입력하세요: ");
            String p = sc.next();

            System.out.print("두 번째 값을 입력하세요: ");
            num2 = Integer.parseInt(sc.next());

            calculator.calculate(num1, num2, p);  // 런타임 후 작성되는 값으로 실행하기 위해 지정한 변수명을 넣어 스캐너를 통해 읽음
            System.out.println(calculator.getResult());  // 결과값 도출

            System.out.print("계산을 종료하시려면 exit를 입렵하세요: ");  // 결과값 도출 후 exit외에 다른 문자열을 넣으면 다시 while문 반복
            input = sc.next();
        }
        System.out.println("종료합니다.");
    }
}