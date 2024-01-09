package day06;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 문자열로 받은 금액의 천단위 쉼표 넣어주는 코드
        System.out.println("입력(숫자형식으로 입력받기) : ");
        String money = scanner.nextLine();
            // 입력받은 문자열타입의 금액을 천단위 쉼표로 변환
        String result = "";
        /*
        String shim = money.substring(0 , money.length()-3);
        result = money.substring(money.length()-3);

        result = shim + "," + result;

        System.out.println("result = " + result);
        */
        for(int i = 0; i < money.length(); i++){
            //System.out.print(i);
            System.out.println(i +":"+money.charAt(i)+" ");

            if(i > 0 && (money.length()-i) % 3 ==0){
                result += ",";
            }

            result += money.charAt(i);
        }
        System.out.println("result = " + result);
    }
}
