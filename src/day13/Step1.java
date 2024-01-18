package day13;

public class Step1 {
    public static void main(String[] args) {
        // 286P
            // 1. smartPhone객체(+phone)
        SmartPhone myPhone = new SmartPhone("갤럭시" , "은색");

            // 2. smartPhone객체내 필드 호출(+phone 필드 호출)
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);

            // 3. smartPhone객체내 필드 호출
        System.out.println("와이파이 상태 : " + myPhone.wifi);

            // 4.
        myPhone.bell(); // smartPhone객체내 메소드 호출(+phone 메소드 호출)
        myPhone.sendVoice("여보세요"); // smartPhone객체내 메소드 호출(+phone 메소드 호출)
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요"); // smartPhone객체내 메소드 호출(+phone 메소드 호출)
        myPhone.sendVoice("아~ 네 반갑습니다"); // smartPhone객체내 메소드 호출(+phone 메소드 호출)
        myPhone.hangUp(); // smartPhone객체내 메소드 호출(+phone 메소드 호출)

            // 5.
        myPhone.setWifi(true); // smartPhone객체내 메소드 호출
        myPhone.internet(); // smartPhone객체내 메소드 호출
    }
}
