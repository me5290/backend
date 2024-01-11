package day08;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Phone객체 100개를 저장할수 있는 Phone배열 선언
            // 등록전 : null X 100
        Phone[] phoneBook = new Phone[100];

        while (true){
            System.out.println("===========전화번호부=============");
            System.out.printf("%2s %5s %11s\n" , "순번" , "이름" , "전화번호" );

            for(int i = 0 ; i < phoneBook.length; i++){
                if(phoneBook[i] != null){
                    System.out.printf("%2d %6s %15s\n" , i+1 , phoneBook[i].name , phoneBook[i].number );
                }else{
                    break;
                }
            }

            System.out.print("1.등록 2삭제 선택> ");
            int ch = scanner.nextInt();

            if(ch == 1){
                // 1. 입력받기
                System.out.print("이름 : ");
                String name = scanner.next();
                System.out.print("전화번호 : ");
                String number = scanner.next();

                // 2. 객체 생성 [생성자 선택]
                        // 필드/메소드는 객체가 없으면 사용 불가능[클래스는 설계도]
                    // 1. 기본생성자 사용
                //Phone newPhone = new Phone();
                //newPhone.name = name;
                //newPhone.number = number;
                    // 2. 정의생성자 사용
                        // 객체 생성할때 필드에 값을 넣을지 말지
                Phone newPhone = new Phone(name , number);

                // 3. phoneBook배열 내 빈 공간을 찾아서 해당 인덱스에 객체 넣기
                for(int i = 0; i < phoneBook.length; i++){
                    if(phoneBook[i] == null){
                        phoneBook[i] = newPhone;
                        break; // !!! : 빈 공간을 찾아서 대입은 1번만 , 대입했으면 반복종료
                    }
                }

            }else if(ch == 2){
                System.out.print("삭제할 순번 : ");
                int dNo = scanner.nextInt();

                phoneBook[dNo-1] = null;

                for(int i = dNo-1; i < phoneBook.length-1; i++){
                    phoneBook[i] = phoneBook[i+1];
                }
            }
        }
    }
}
/*
    메모리 구성
*/