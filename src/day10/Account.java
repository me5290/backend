package day10;

public class Account {
    // 1. 필드 : 정적 vs 인스턴스 -> static은 하나만 생성, 인스턴스는 객체마다 생성
    String 계좌번호;
    String 계좌주;
    int 입금액;

    // 2. 생성자
    Account (String 계좌번호 , String 계좌주 , int 입금액){
        this.계좌번호 = 계좌번호;
        this.계좌주 = 계좌주;
        this.입금액 = 입금액;
    }

    // 3. 메소드
}
