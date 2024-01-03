package day02;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        // 70P 콘솔에서 키보드로부터 입력 받고 변수에 저장

            // [준비물]

            // 1. Scanner 클래스 : 입력에 관련된 메소드/속성 제공 하는 설계도

            // 2. Scanner 클래스 이용한 객체 생성
                // Scanner scanner = new Scanner(System.in);
                // 클래스명 변수명 = new 클래스명(매개변수);
                    // System.in : 시스템 입력 = 키보드
                    // System.out : 시스템 출력 = 모니터(콘솔)

            // 3. 객체/변수 이용한 입력값 호출 메소드
                // 객체/변수명.nextLine() : 엔터 키가 입력되면 지금까지 입력된 모든 내용을 읽는다.

        // [1] 객체 생성
        // new Scanner(System.in);
        // [2] 객체 생성 했으면 담아야 변수(타입 : 객체의 타입)에 한다
        Scanner scanner = new Scanner(System.in);
        // [3] 객체를 통한 메소드 호출
        // scanner.nextLine();
        // [4] 메소드 호출의 결과[return] 저장한다
        String str = scanner.nextLine();
        System.out.println("str = " + str); // soutv 가장 가까운 변수 자동 출력

        // Scanner가 제공하는 메소드

        // 1. 입력받은 문자열(String) 반환 , 띄어쓰기 포함 불가
        String str1 = scanner.next();
        System.out.println("str1 = " + str1);

        scanner.nextLine(); // 의미없는 nextLine() 추가하기

        // 2. 입력받은 문자열(String) 반환 , 띄어쓰기 포함 [주의할점 : 앞에 next() 있을경우 하나로 취급]
        String str2 = scanner.nextLine();
        System.out.println("str2 = " + str2);

        // 3. 입력받은 논리(Boolean) 반환
        boolean bool = scanner.nextBoolean();
        System.out.println("bool = " + bool);

        // 4. 입력받은 바이트(byte) 반환
        byte b = scanner.nextByte();
        System.out.println("b = " + b);

        // 5. 입력받은 쇼트(short) 반환
        short s = scanner.nextShort();
        System.out.println("s = " + s);

        // 6. 입력받은 인트(int) 반환
        int i = scanner.nextInt();
        System.out.println("i = " + i);

        // 7. 입력받은 롱(long) 반환
        long l = scanner.nextLong();
        System.out.println("l = " + l);

        // 8. 입력받은 플롯(float) 반환
        float f = scanner.nextFloat();
        System.out.println("f = " + f);

        // 9. 입력받은 더블(double) 반환
        double d = scanner.nextDouble();
        System.out.println("d = " + d);

        // 10. 입력받은 문자(char) 반환 없음 --> "문자열".charAt(추출인덱스) : 문자열에서 문자 1개 추출 함수
        char ch = scanner.next().charAt(0);
        System.out.println("ch = " + ch);

        // 73P 확인문제

            /*
                1. 4
                2. 2,3,6,7
                3. 정수타입 - (byte,short,char,int,long) , 실수타입 - (float,double) , 논리타입 - (boolean)
                4. 타입 - (int,double) , 변수이름 - (age,price) , 리터럴 - (10,3.14)
                5. 3
                6. 4
                7. 3
                8. 3
                9. 1
                10. 2
                11. System.out.println("v3 =" + v3);
                    System.out.println("v2 =" + v2);
            */
    }
}
