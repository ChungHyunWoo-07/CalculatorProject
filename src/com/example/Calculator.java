package com.example;

import java.util.*;

public class Calculator { // 모든이름을 수정할 경우 단축키 F2를 눌러서  수정가능
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 무한 루프 시작
        String input;
        int a = sc.nextInt();
        int b = sc.nextInt();
        Scanner str = new Scanner(System.in);
        String c = str.nextLine();
        int result = 0;
//조건문 while이 true라면 {}를 실행 -> while문은 조건이 걸리는 반복문 ()안에 조건문을 넣어서  true면 무한 반복 조건식이 true면 계속 반복 false가 되면 스탑
        while (true) {
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
            System.out.print("계산을 계속하시겠습니까? (계속하려면 아무 키나 입력, 종료하려면 exit 입력): ");
            input = sc.nextLine();  // 변수명sc에 들어갈 입력어
            // exit 입력 시 종료
            if (input.equalsIgnoreCase("exit")) {  // if문에 들어가는 말이 exit라면 종료
                System.out.println("계산기를 종료합니다.");
                break;  // exit라면 if문을 종료 시키고 while 문도 종료

            }
        }  // ※반복문은 구글링해서 만들었지만 반복만 될 뿐 반복문이 계산되지 않음... 어제 적은 switch문이랑 어떻게 합쳐야 하는지 모르겠음※

// 미션: 계산을 계속하시겠습니까?를 제일 먼저 나올 수 있도록 수정

    }
}
