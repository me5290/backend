package day13;

public class SmartPhone extends Phone{
    // 1. 필드
    public boolean wifi;

    // 2. 생성자 : 객체 생성시 초기화 담당 (+ 무조건 1번 실행)

    public SmartPhone(String model , String color) {
        // - 생성자 첫줄에 부모 생성자 호출한다(생략가능 컴파일시 자동 추가)
        super(model);

        this.model = model;
        this.color = color;
    }

    // 3. 메소드
        // 1. 매개변수:boolean , 반환값:x
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다");
    }

        // 2. 매개변수:x , 반환값:x
    public void internet(){
        System.out.println("인터넷에 연결합니다");
    }
}
