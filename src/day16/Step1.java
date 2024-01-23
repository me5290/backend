package day16;

public class Step1 {
    public static void main(String[] args) {
        // 1. 인터페이스 변수 선언
        RemoteControl rc;
        // 2. 인터페이스 변수에 객체참조 값 대입
            // 타입이 다른데 가능한 이유 : extends , implements
        rc = new Television();
        // 3. 인터페이스의 메소드 호출하면 구현객체의 메소드가 호출된다
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // 다형성(교체)
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(8);
        rc.turnOff();

        // 인터페이스의 상수필드 호출
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);
    }
}
