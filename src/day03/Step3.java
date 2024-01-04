package day03;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        // 문제1 : 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.print("정수를 입력해주세요 :");
        int 정수1 = scanner.nextInt();
        String 출력1 = "";
        출력1 = (정수1%7) == 0? "O" : "X";
        System.out.println("입력받은 정수는 7의 배수가" + 출력1);

        // 문제2 : 하나의 정수형으로  입력받아 홀수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.print("정수를 입력해주세요 : ");
        int 정수2 = scanner.nextInt();
        System.out.println( 정수2%2 != 0 ? "O" : "X");

        // 문제3 : 하나의 정수형으로  입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.print("정수를 입력해주세요 : ");
        int 정수3 = scanner.nextInt();
        System.out.println( 정수3%7 == 0 && 정수3%2 == 0 ? "O" : "X");

        // 문제4 : 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.print("정수를 입력해주세요 : ");
        int 정수4 = scanner.nextInt();
        System.out.println( 정수4%11 == 0 || 정수4%2 == 0 ? "O" : "X");

        // 문제5 : 두개의 정수형으로 입력받아 더 큰수 출력 하시오.
        System.out.print("정수 : ");
        int 정수5 = scanner.nextInt();
        System.out.print("정수 : ");
        int 정수6 = scanner.nextInt();
        System.out.println( 정수5 > 정수6 ? 정수5 : 정수6);

        // 문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
        //       계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
        System.out.print("반지름 : ");
        int 반지름 = scanner.nextInt();
        System.out.printf("원넓이 : %.2f" , 반지름 * 반지름 * 3.14);

        // 문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
        //       예) 54.5   84.3 실수 2개입력시 결과는   64.285714%
        System.out.print("실수 : ");
        double 실수1 = scanner.nextDouble();
        System.out.print("실수 : ");
        double 실수2 = scanner.nextDouble();
        System.out.printf("결과 : %.1f" , 실수1 / 실수2 * 100 );

        // 문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
        //       계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
        System.out.print("윗변 : ");
        double 윗변 = scanner.nextDouble();
        System.out.print("밑변 : ");
        double 밑변 = scanner.nextDouble();
        System.out.print("높이 : ");
        double 높이 = scanner.nextDouble();
        System.out.printf("결과 : %.1f" , (윗변 + 밑변) * 높이 / 2 );

        // 문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
        //       계산식) 표준체중 계산식 = > (키 - 100) * 0.9
        System.out.print("키 : ");
        int 키 = scanner.nextInt();
        System.out.println("표준 체중 = " + (int)((키 - 100) * 0.9));

        // 문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
        //       계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
        System.out.print("키 : ");
        double 키 = scanner.nextDouble();
        System.out.print("몸무게 : ");
        double 몸무게 = scanner.nextDouble();
        System.out.printf("BMI : %.2f" , 몸무게 / ((키 / 100) * (키 / 100)) );

        // 문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
        //       계산식) 1 inch -> 2.54cm
        System.out.print("inch : ");
        int inch = scanner.nextInt();
        System.out.printf("cm : %.2f" , inch * 2.54 );

        // 문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
        //       계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %
        System.out.print("중간고사 : ");
        double 중간고사 = scanner.nextDouble();
        System.out.print("기말고사 : ");
        double 기말고사 = scanner.nextDouble();
        System.out.print("수행평가 : ");
        double 수행평가 = scanner.nextDouble();
        System.out.printf("중간고사 : %.2f\n기말고사 : %.2f\n수행평가 : %.2f" , 중간고사 * 0.3 , 기말고사 * 0.3 , 수행평가 * 0.4);

        // 문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
        //       int x = 10;
        //       int y = x-- + 5 + --x;
        //       printf(" x의 값 : %d , y의값 :  %d ", x, y)
        x = 8 , y = 23

        // 문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
        System.out.print("나이 : ");
        int 나이 = scanner.nextInt();
        System.out.println(나이 >= 40 ? "중년" : 나이 >= 20 ? "성인" : 나이 >= 10 ? "학생" : "아이");

        // 문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력
        System.out.print("국어 : ");
        int 국어 = scanner.nextInt();
        System.out.print("영어 : ");
        int 영어 = scanner.nextInt();
        System.out.print("수학 : ");
        int 수학 = scanner.nextInt();
        int 총합 = 국어 + 영어 + 수학;
        System.out.println("총합 = " + 총합);
        double 평균 = (double) 총합 / 3;
        System.out.printf("총합 = %.2f" , 평균);

        // 문제16 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력
        System.out.print("아이디 : ");
        String id = scanner.next();
        System.out.print("비밀번호 : ");
        String pw = scanner.next();
        String a = "admin";
        String b = "1234";
        System.out.println(id.equals(a) && pw.equals(b) ? "로그인성공" : "로그인실패");

        // 문제17 : 3개의 정수형으로 입력받아 가장 큰수 출력
        System.out.print("정수 : ");
        int a = scanner.nextInt();
        System.out.print("정수 : ");
        int b = scanner.nextInt();
        System.out.print("정수 : ");
        int c = scanner.nextInt();
        System.out.println(a >= b && a >= c ? a : b >= a && b >= c ? b : c);
        */
    }
}