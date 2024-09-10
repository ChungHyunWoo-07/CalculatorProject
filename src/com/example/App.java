package com.example;

import java.util.*;  // 라이브러리 (필요한 연산이 모여져 있는 공간을 가져오기 위해 임포트)

public class App { // 모든이름을 수정할 경우 단축키 F2를 눌러서  수정가능
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "";  // while에서 반복할지 멈출지 정해주기 위한 조건에 넣기위해 문자열 input을 선언

        while(!input.equals("exit")) { // !=로 같지 않다를 표현하였더니 인텔리제이에서 수정해줌
            System.out.print("첫 번째 값을 입력하세요: ");
            int n1 = Integer.parseInt(sc.nextLine());  // 처음엔 nextInt를 넣었는데 제대로 작동하지 않아 형변환하여 nextLine으로 수정

            System.out.print("연산기호를 입력하세요: ");
            String p = sc.nextLine();

            System.out.print("두 번째 값을 입력하세요: ");
            int n2 = Integer.parseInt(sc.nextLine());

            Calculator calculator = new Calculator();  //Calculator클래스를 가져오기 위해 인스턴스화 하여 calculator(변수명)에 대입
            double result1 = 0;  // 계산하기 전에 result1의 값을 0으로 초기화
            result1 = calculator.getCalculate(n1, n2, p);  // 런타임 후 작성되는 값으로 실행하기 위해 지정한 변수명을 넣어 스캐너를 통해 읽음
            System.out.println("결과: " + result1);  // 결과값 도출

            System.out.print("계산을 종료하시려면 exit를 입렵하세요: ");  // 결과값 도출 후 exit외에 다른 문자열을 넣으면 다시 while문 반복
            input = sc.nextLine();
        }
        System.out.println("종료합니다.");
    }





    public void level1(){
        Scanner sc = new Scanner(System.in);
        String input;
        int result = 0;
        System.out.print("첫 번째값을 입력하세요: ");
        int a = Integer.parseInt(sc.nextLine()); // 형변환
        System.out.print("연산기호를 입력하세요:");
        String c = sc.nextLine();
        System.out.print("두 번째값을 입력하세요:");
        int b = Integer.parseInt(sc.nextLine());
        //조건문 while이 true라면 {}를 실행 -> while문은 조건이 걸리는 반복문 ()안에 조건문을 넣어서  true면 무한 반복 조건식이 true면 계속 반복 false가 되면 스탑
        while (true) {
            switch (c) {   //switch를 이용하여 내가 넣으려는 연산기호의 기능을 설정, 조건문
                // switch, case를 이용하여 c에 들어간 연산기호를 찾을 수 있도록 설정
                case "+":
                    result = a + b; // case 문을 통해 +를 찾았을 때 계산기의 +기능이 작동하도록 기능을 설정 a + b라는 연산을 result에 담아준다.
                    break;  // 제일 가까운 자기의 부모를 멈춤, (여기선 switch를 멈춤)
                case "-":
                    result = a - b;  // case 문을 통해 -를 찾았을 때 계산기의 -기능이 작동하도록 기능을 설정
                    break;
                case "*":
                    result = a * b;  // case 문을 통해 *를 찾았을 때 계산기의 *기능이 작동하도록 기능을 설정
                    break;
                case "/":
                    if (b != 0) {  // if문을 넣어서 b가 0이 아닐 때 result 값을 실행 할 수 있도록 함 true 일때 if문 실행
                        result = a / b;
                    } else {  // if문이 false일 때 else문을 실행하여 "0으로 나눌 수 없습니다"를 출력, if에서 주어진 조건이 아닐 때 else로 간다.
                        System.out.println("0으로 나눌 수 없습니다.");
                    }
                    break;
                default:  // 예외처리!! switch에 입력된 값을 case에서 찾지 못한 경우 default로 내려와 "잘못된 연산입니다"를 출력
                    System.out.println("잘못된 연산입니다");
            }
            System.out.println("결과: " + result);
            System.out.print("계산을 계속하시겠습니까? (계속하려면 아무 키나 입력, 종료하려면 exit 입력): ");
            input = sc.nextLine();  // 변수명sc에 들어갈 입력어, exit 입력 시 종료
            if (input.equalsIgnoreCase("exit")) {  // if문에 들어가는 말이 exit라면 종료
                System.out.println("계산기를 종료합니다.");
                break;  // exit라면 if문을 종료 시키고 while 문도 종료
            }
        }  // ※반복문은 구글링해서 만들었지만 반복만 될 뿐 반복문이 계산되지 않음... 어제 적은 switch문이랑 어떻게 합쳐야 하는지 모르겠음※
    }
}