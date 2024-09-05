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

        // 정수 a 와 b를 가져와 c의 사칙연산을 하도록
        System.out.println(a + c + b); // 실행시 사칙연산을 포함한 문자열은 작성되는데 동작을 시켜야 함

        int result = 0; // 구하려는 resuly 값을 초기화하여 에러를 방지

        switch (c) {   //switch를 이용하여 내가 넣으려는 연산기호의 기능을 설정, 조건문
            // switch, case를 이용하여 c에 들어간 연산기호를 찾을 수 있도록 설정
            case "+" :
                result = a + b; // case 문을 통해 +를 찾았을 때 계산기의 +기능이 작동하도록 기능을 설정 a + b라는 연산을 result에 담아준다.
                break;  // 제일 가까운 자기의 부모를 멈춤, (여기선 switch를 멈춤)
            case "-" :
                result = a - b;  // case 문을 통해 -를 찾았을 때 계산기의 -기능이 작동하도록 기능을 설정
                break;
            case "*" :
                result = a * b;  // case 문을 통해 *를 찾았을 때 계산기의 *기능이 작동하도록 기능을 설정
                break;
            case "/" :
                if (b != 0) {  // if문을 넣어서 b가 0이 아닐 때 result 값을 실행 할 수 있도록 함 true 일때 if문 실행
                    result = a / b;
                } else {  // if문이 false일 때 else문을 실행하여 "0으로 나눌 수 없습니다"를 출력, if에서 주어진 조건이 아닐 때 else로 간다.
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:  // 예외처리!! switch에 입력된 값을 case에서 찾지 못한 경우 default로 내려와 "잘못된 연산입니다"를 출력
                System.out.println("잘못된 연산입니다");
                return;  // 여기서 멈추고 값을 주어라, break와 비슷한 결과, return은 값을 돌려주는 결과
        }
        System.out.println(result);
    }
}
