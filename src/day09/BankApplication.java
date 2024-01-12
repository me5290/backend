package day09;

public class BankApplication {
    // 1. 필드
    String 계좌번호;
    String 계좌주;
    int 잔액;

    // 2. 생성자
    BankApplication(String 계좌번호 , String 계좌주 , int 잔액){
        this.계좌번호 = 계좌번호;
        this.계좌주 = 계좌주;
        this.잔액 = 잔액;
    }

    // 3. 메소드
    void makeBank(){
        System.out.println("결과 : 계좌가 생성되었습니다.");
    }
}
