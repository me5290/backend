package day04;

import java.util.Random;

public class Step1 {
    public static void main(String[] args) {
        // 110P
            // 제어문 : 1. 조건문 , 2. 반복문
            // 흐름제어 : 조건문({}이후 정상흐름)
            //          반복문({}이후 제어문으로 되돌아감) - 루핑
        // if문
            // if(조건식){실행문; 실행문}
            // if(조건식)실행문;

        // 111P
        int score = 93;

        if(score >= 90){
            System.out.println("점수가 90점 이상입니다");
            System.out.println("등급은 A등급 입니다");
        }
        if(score < 90)
            System.out.println("점수가 90점 미만입니다");
            System.out.println("등급은 B등급 입니다");

        // 113P
        if(score >= 90){
            System.out.println("점수가 90점 이상입니다");
            System.out.println("등급은 A등급 입니다");
        }else{
            System.out.println("점수가 90점 미만입니다");
            System.out.println("등급은 B등급 입니다");
        }

        // 114P
        if(score >= 90){
            System.out.println("점수가 100~90점 입니다");
            System.out.println("등급은 A등급 입니다");
        }else if(score >= 80){
            System.out.println("점수가 80~89점 입니다");
            System.out.println("등급은 B등급 입니다");
        }else if(score >= 70) {
            System.out.println("점수가 70~79점 입니다");
            System.out.println("등급은 C등급 입니다");
        }else {
            System.out.println("점수가 70점 미만입니다");
            System.out.println("등급은 D등급 입니다");
        }

        // 115P 난수 만들기 : Math.random() , Random 클래스
            // 1. Math.random() : 난수 함수
        System.out.println("0이상 ~1미만 난수/랜덤 생성 : " + Math.random());
            // 2. Random() : 난수 객체
        System.out.println(new Random());
        System.out.println(new Random().nextInt());
            // 주사위 난수 : 1~6 사이의 난수 생성
        //int num = Math.random();    // 0~1
        //int num = Math.random()*6;  // 0~1 * 6 => 0~6
        //int num = Math.random()*6+1;  // 0~1 * 6 + 1 => 1~7
        int num = (int)(Math.random()*6+1);
            // 2.
        Random random = new Random();
            // 클래스명 변수명 = new 클래스명(); // 클래스에 해당하는 객체 생성 (객체 만드는 이유 : 라이브러리(미리 만들))
        int num2 = random.nextInt(6)+1;    // int 허용범위내 난수 생성

        if(num2 == 1){
            System.out.println("주사위 1입니다");
        }else if(num2 == 2){
            System.out.println("주사위 2입니다");
        }else if(num2 == 3){
            System.out.println("주사위 3입니다");
        }else if(num2 == 4){
            System.out.println("주사위 4입니다");
        }else if(num2 == 5){
            System.out.println("주사위 5입니다");
        }else{
            System.out.println("주사위 6입니다");
        }
    }
}
