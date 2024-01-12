package day09;

public class Step1 {
    public static void main(String[] args) {
        // 231P
            // js 코드를 읽어주는 역할 : html(js) <-- 브라우저(프로그램[스레드])
            // java 코드를 읽어주는 역할 : main함수() <-- main스레드
            // !!!! : 필드/메소드를 사용하기 위해서는 꼭 객체가 필요하다
            // Calculator.powerOn();
        // 1. 객체 생성(생성자)
        // new Calculator();
        Calculator myCalc = new Calculator();

        // 2. 객체내 멤버(필드/메소드) 호출
        myCalc.powerOn();
            // vs
        new Calculator().powerOn();

        // 3. 메소드 호출 하고 매개변수 전달
            // - 매개변수 타입과 개수에 맞게 제공
        myCalc.plus(5,6);
        // myCalc.plus("오","육"); // 타입이 불일치
            // - 리턴값이 있는 경우에는 변수에 저장
        int result = myCalc.plus(5,6);
        System.out.println("result = " + result);

        // 4.
        int x = 10;
        int y = 4;
        double result2 = myCalc.divide(x,y);
        System.out.println("result2 = " + result2);

        // 5.
        myCalc.powerOff();
    }
}
