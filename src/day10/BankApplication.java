package day10;

import java.util.Scanner;

public class BankApplication {
    static Scanner scanner = new Scanner(System.in);
    // 1. 필드
    static Account[] accounts = new Account[100];
    // 2. 생성자

    // 3. 메소드
        // 2. 계좌 생성
    static void 계좌생성(){
        // 1. 입력받기
        System.out.println("-----------");
        System.out.println("계좌생성");
        System.out.println("-----------");

        System.out.print("계좌번호: ");
        String 계좌번호 = scanner.next();
        System.out.print("계좌주: ");
        String 계좌주 = scanner.next();
        System.out.print("초기입금액: ");
        int 초기입금액 = scanner.nextInt();

        // 2. 빈생성자 사용했을때
        Account account = new Account(계좌번호 , 계좌주 , 초기입금액);

        // 3. 객체를 배열에 넣는다
            // 정적메소드에서는 인스턴스필드를 호출할 수 없다.
                // 1. 인스턴스 필드를 static으로 한다
                // 2. 객체생성한다 [x]
        for(int i = 0; i < accounts.length; i++){
            if(accounts[i] == null){
                accounts[i] = account;
                break;
            }
        }
    }

        // 3. 계좌 목록
    static void 계좌목록(){
        System.out.println("-----------");
        System.out.println("계좌목록");
        System.out.println("-----------");

        // 배열 내 반복문을 이용한 모든 계좌객체를 호출
        for(int i = 0; i < accounts.length; i++){
            Account account = accounts[i];
            if(account != null){
                System.out.printf("%s %8s %8d\n", account.계좌번호 , account.계좌주 , account.입금액);
            }else {
                break;
            }
        }
    }

        // 4. 예금
    static void 예금(){
        System.out.println("-----------");
        System.out.println("예금");
        System.out.println("-----------");

        // 입력받은 계좌번호가 계좌목록에 존재하면 입력한 예금액을 찾은 계좌객체에서 예금에 더한다
        // 1. 입력받는다
        System.out.print("계좌번호: ");
        String 계좌번호 = scanner.next();
        System.out.print("예금액: ");
        int 예금액 = scanner.nextInt();
        // 2. 계좌목록/배열 에서 입력한 계좌 찾는다
        for(int i = 0; i < accounts.length; i++){
            if(accounts[i].계좌번호.equals(계좌번호) && accounts[i].계좌번호 != null){
                // 혹시나 해당 i번째 배열에 null이라면 .equals 사용불가
                accounts[i].입금액 += 예금액;
                System.out.println("결과 : 입금이 성공되었습니다.");
                break;
            }else{
                System.out.println("계좌번호가 일치하지 않거나 없습니다.");
                break;
            }
        }
    }

        // 5. 출금
    static void 출금(){
        System.out.println("-----------");
        System.out.println("출금");
        System.out.println("-----------");

        // 입력받은 계좌번호가 계좌목록에 존재하면 입력한 예금액을 찾은 계좌객체에서 예금에 뺀다
        // 1. 입력받는다
        System.out.print("계좌번호: ");
        String 계좌번호 = scanner.next();
        System.out.print("출금액: ");
        int 출금액 = scanner.nextInt();
        // 2. 계좌목록/배열 에서 입력한 계좌 찾는다
        for(int i = 0; i < accounts.length; i++){
            if(accounts[i].계좌번호.equals(계좌번호) && accounts[i].계좌번호 != null){
                // 혹시나 해당 i번째 배열에 null이라면 .equals 사용불가
                accounts[i].입금액 -= 출금액;
                System.out.println("결과 : 출금이 성공되었습니다.");
                break;
            }else{
                System.out.println("계좌번호가 일치하지 않거나 없습니다.");
                break;
            }
        }
    }

        // 1. 실행 시작점
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("-------------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
            System.out.println("-------------------------------------");

            System.out.print("선택> ");
            int ch = scanner.nextInt();
            scanner.nextLine();

            if(ch == 1){
                계좌생성();
            }else if(ch == 2){
                계좌목록();
            }else if(ch == 3){
                예금();
            }else if(ch == 4){
                출금();
            }else if(ch == 5){
                break;
            }
        }
    }
}
