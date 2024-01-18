package day13;

public class Phone {
    // 1. (접근제한자) (정적/인스턴스) (final) 필드
    public String model;
    public String color;

    // 2. (접근제한자) 생성자
    public Phone(String model){

    }

    // 3. (접근제한자) (정적/인스턴스) 메소드
        // 1. 매개변수:x , 반환값:x
    public void bell(){
        System.out.println("벨이 울립니다");
    }

        // 2. 매개변수:String , 반환값:x
    public void sendVoice(String message){
        System.out.println("자기 : " + message);
    }

        // 3. 매개변수:String , 반환값:x
    public void receiveVoice(String message){
        System.out.println("상대방 : " + message);
    }

        // 4. 매개변수:x , 반환값:x
    public void hangUp(){
        System.out.println("전화를 끊습니다");
    }
}
