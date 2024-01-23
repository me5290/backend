package day16;

public interface RemoteControl {
    // 인터페이스 : 인스턴스필드와 정적필드를 가질수 없다
    // 상수 필드 : public static final
    int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0; // [public static final] 생략 가능

    // 추상 메소드
        // 1. 선언부만 작성하고 구현부는 하지 않는다
        // 2. 추상클래스의 추상메소드는 abstract 명시하지만 , 인터페이스의 추상메소드는 abstract 생략가능
        // Tv와 오디오의 공통적인 메소드 추출 = 전원버튼

    // 구현 클래스 : 추상메소드를 구현할 클래스
        // - 구현클래스가 필요한 이유
        // 1. 추상클래스와 인터페이스는 스스로 객체를 생성할수 없다
    public void turnOn();
    public abstract void turnOff(); // [public abstract] 생략 가능
    void setVolume(int volume);
}
