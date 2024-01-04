package day03;

public class Step1 {
    public static void main(String[] args) {
        int x = 10;
        int y = -3;

        //1. 산술연산자 (결과 : 값)
        System.out.println("x + y =" + (x + y));
        System.out.println("x - y =" + (x - y));
        System.out.println("x * y =" + (x * y));
        System.out.println("x / y =" + (x / y));
        System.out.println("x % y =" + (x % y));

        //2. 비교연산자 (결과 : boolean)
        System.out.println("x == y =" + (x == y));
        System.out.println("x != y =" + (x != y));
        System.out.println("x > y =" + (x > y));
        System.out.println("x >= y =" + (x >= y));
        System.out.println("x < y =" + (x < y));
        System.out.println("x <= y =" + (x <= y));

        //3. 논리연산자
        System.out.println("10 < x < 20 =" + (x > 10 && x < 20));
        System.out.println("10 == y 또는 == 20 =" + (y == 10 || y == 20));
        System.out.println("x >= 30 의 반대 =" + !(x >= 30));

        //4. 증감연산자
        System.out.println("x++ =" + (x++));
        System.out.println("x =" + (x));
        System.out.println("++x =" + (++x));

        System.out.println("x-- =" + (x--));
        System.out.println("x =" + (x));
        System.out.println("--x =" + (--x));

        //5. (복합)대입연산자
        x = 30;
        x += 10;

        //6. 삼항연산자
            // 조건 ? 참 : 거짓
            // 조건1 ? 참1 : 조건2 ? 참2 : 거짓
            // 조건1 ? 참1 : 조건2 ? 참2 : 조건3 ? 참3 : 거짓
        String 결과 = x >= 90 ? "합격" : "불합격";
        System.out.println("결과 = " + 결과);

        String 결과2 = x >= 90 ? "A등급" : x >= 80 ? "B등급" : "탈락";
        System.out.println("결과2 = " + 결과2);

        //7. 연결연산자
        // 변수 + "문자열" , "문자열" + "문자열"

    }
}
