package team과제.team과제1;

import java.util.Scanner;

public class Team1 {
    public static boolean isNumeric(String input) {
        try {
            Double.parseDouble(input);
        }
        catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double 합계 = 0;              // 합계 값 저장

        while (true){               // 반복 시작
            if(합계 != 0){            // 합계에 값이 0이 아닐때
                System.out.printf("%.0f\n",합계);     // 입력하는 피연산자1 대신에 합계 출력

                String 연산자 = scanner.nextLine();
                String 피연산자2 = scanner.nextLine();

                if(!isNumeric(피연산자2)){              // 피연산자2가 숫자가 아닐때 출력 후 continue
                    System.out.println("숫자가 아닙니다 다시 입력해주세요");
                    continue;
                }

                double 피1 = 합계;                     // 피1에 합계를 대입
                double 피2 = Double.parseDouble(피연산자2);

                if(연산자.equals("+")){
                    합계 = 피1 + 피2;
                }else if(연산자.equals("-")){
                    합계 = 피1 - 피2;
                }else if(연산자.equals("*")){
                    합계 = 피1 * 피2;
                }else if(연산자.equals("/")){
                    합계 = 피1 / 피2;
                }else{                              // 연산자가 아닌 다른것을 입력했을때
                    System.out.println("연산자가 아닙니다 다시 입력해주세요");
                    continue;
                }
                System.out.printf("%.0f %s %.0f = %.0f\n",피1,연산자,피2,합계);
            }else{
                String 피연산자1 = scanner.nextLine();
                String 연산자 = scanner.nextLine();
                String 피연산자2 = scanner.nextLine();

                if(!isNumeric(피연산자1)){                          // 피연산자1이 숫자가 아닐때 출력 후 continue
                    System.out.println("숫자가 아닙니다 다시 입력해주세요");
                    continue;
                }
                if(!isNumeric(피연산자2)){                          // 피연산자2가 숫자가 아닐때 출력 후 continue
                    System.out.println("숫자가 아닙니다 다시 입력해주세요");
                    continue;
                }

                double 피1 = Double.parseDouble(피연산자1);
                double 피2 = Double.parseDouble(피연산자2);

                if(연산자.equals("+")){
                    합계 = 피1 + 피2;
                }else if(연산자.equals("-")){
                    합계 = 피1 - 피2;
                }else if(연산자.equals("*")){
                    합계 = 피1 * 피2;
                }else if(연산자.equals("/")){
                    합계 = 피1 / 피2;
                }else{
                    System.out.println("연산자가 아닙니다 다시 입력해주세요");
                    continue;
                }
                System.out.printf("%.0f %s %.0f = %.0f\n",피1,연산자,피2,합계);
            }
        }
    }
}
/*
    4. 계산기
   [ 요구사항 필수 조건 - 그외 적절하게 판단하여 구현 ]
      1. 배열 사용금지 ( 변수만 사용합니다. 아래 변수는 필수로 사용하되 새로운 변수 선언 가능 합니다. )
         String 피연산자1 = "";   String 피연산자2 = "";   String 연산자 = ""

      2. 프로그램은 무한루프를 이용합니다.단 *- printf 이용하여 계산 결과를 반복적으로 출력합니다.

      3. 입력 : 피연산자 , 연산자 , 피연산자 순으로 입력을 받습니다.

      4. 출력 : 입력받은 2개의 피연산자를 연산자에 맞게 계산처리 합니다.

      5. 계산 : 산술연산자만 구현합니다.
*/