package day03;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // if 조건문
        // 1.
        System.out.print("정수 입력 : ");
        int point = scanner.nextInt();
        if(point >= 80){
            System.out.println("입력받은 값은 80 이상입니다");
        }

        // 2.
        if (point >= 90){
            System.out.println("합격");
        }else{
            System.out.println("불합격");
        }

        // 3.
        if(point >= 90){
            System.out.println("A등급");
        }else if(point >= 80){
            System.out.println("B등급");
        }else if(point >= 70){
            System.out.println("C등급");
        }else{
            System.out.println("탈락");
        }
                //vs
        if(point >= 90){
            System.out.println("A등급");
        }
        if(point >= 80){
            System.out.println("B등급");
        }
        if(point >= 70){
            System.out.println("C등급");
        }

        // 4.
        char sex = 'M';
        if(sex == 'M' || sex == 'm'){
            if(point >= 90){
                System.out.println("남자 우수상");
            }
        }else{
            if(point >= 90){
                System.out.println("여자 우수상");
            }
        }

        // 예시) 스위치 변수 활용 [step3 16번 문제]
        String id = scanner.next();
        String pw = scanner.next();

        boolean sw = false;

        if(id.equals("admin") && pw.equals("1234")){
            sw = true;
        }

        if(sw){
            System.out.println("로그인성공");
        }else {
            System.out.println("로그인실패");
        }
    }
}
/*
    if 문 [조건문]
        - 경우의수(조건)에 따른 실행 흐름 제어

        - 조건 : 비교연산자(boolean)
            - if(true) , if(false)
            - boolean 변수 = true;   if(변수)
            - if(3 > 5) , if(3 > 1 && 3 < 10)
            - int 변수 = 10; if(변수 - 10 > 5)

        - 삼항연산자 : 간단한 조건식 사용 vs 조건문if : 일반적으로 사용

        - 형태
            1. if
               if(조건){선언문; 실행문;}
            2. if else
               if(조건){참(true) 선언문; 실행문;}
               else{거짓(false) 선언문; 실행문;}
            3. else if
               if(조건1){참1(true) 선언문; 실행문;}
               else if(조건2){참2(true) 선언문; 실행문;}
               else if(조건3){참4(true) 선언문; 실행문;}
               else{거짓(false) 선언문; 실행문;}
            4. 중첩
                if(조건1){
                    if(조건1 t -> 조건2){ }
                    else{ }
                }else{
                    if(조건1 f -> 조건2){ }
                    else{ }
                }
*/