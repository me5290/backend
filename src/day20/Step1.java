package day20;

public class Step1 {
    public static void main(String[] args) {
        // 1. 인터페이스 변수 선언
        RemoteControl rc;

        // 2. 구현객체 생성
        rc = new Audio();

        // 3. 구현객체의 참조/주소 값을 인터페이스 변수에 대입
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

        // 4. 인터페이스의 정적 메소드 호출
        RemoteControl.changeBattery();

        rc.turnOff();
    }
}
