package day04;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true; // 무한루프의 상태를 저장하고 있는 변수 [on/off]
        int speed = 0; // 현재 속도를 저장하고 있는 변수 [1입력하면 1증가 , 2입력하면 1감소]

        while(run){
            // 무한출력
            System.out.println("--------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("--------------------------");
            System.out.print("선택 : ");

            // 무한입력
            String strNum = scanner.nextLine();     // 엔터를 입력 할때까지 '대기' 상태로 둠

            // 입력값에 따른 경우의수 판단
            if(strNum.equals("1")){
                speed++;
                System.out.println("현재 속도 = " + speed);
            }else if(strNum.equals("2")){
                speed--;
                System.out.println("현재 속도 = " + speed);
            }else if(strNum.equals("3")){
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}

/*
    무한루프 = 무한반복
        - 주의할점 : 무한루프 종료하는 조건은 필수
        1. while(true){}
        2. boolean run = true;
           while(run){}
*/
