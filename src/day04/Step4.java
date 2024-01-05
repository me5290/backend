package day04;

import java.util.Scanner;

// 139P 확인문제 7
public class Step4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = 0;

        while(true){
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택 : ");

            int ch = scanner.nextInt();

            if(ch==1){
                System.out.print("예금할 금액 : ");
                int inmoney = scanner.nextInt();
                money += inmoney;
                System.out.println("예금액 : " + inmoney);
                System.out.println("잔고 : " + money);
            }else if(ch==2){
                System.out.print("출금할 금액 : ");
                int outmoney = scanner.nextInt();
                money -= outmoney;
                System.out.println("출금액 : " + outmoney);
                System.out.println("잔고 : " + money);
            }else if(ch==3){
                System.out.println("잔고 : " + money);
            }else if(ch==4){
                System.out.println("프로그램 종료");
            }

        }

    }
}
