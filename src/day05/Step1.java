package day05;

import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        // 3-1 입력객체생성
        Scanner scanner = new Scanner(System.in);

        // 4-1 초기변수
        String[] 내용 = new String[3];
        String[] 작성자 = new String[3];
        int[] 비밀번호 = new int[3];

        String 내용1 = "";
        String 작성자1 = "";
        int 비밀번호1 = 0;

        String 내용2 = "";
        String 작성자2 = "";
        int 비밀번호2 = 0;

        String 내용3 = "";
        String 작성자3 = "";
        int 비밀번호3 = 0;

        while (true){   // 2. 무한루프
            // 1. 출력
            System.out.println("============ 방문록 ============");

            // 6. 현재 변수 현황 출력
            System.out.printf("%2d \t %-5s \t %-20s\n" , 1 , 작성자1 , 내용1);
            System.out.printf("%2d \t %-5s \t %-20s\n" , 2 , 작성자2 , 내용2);
            System.out.printf("%2d \t %-5s \t %-20s\n" , 3 , 작성자3 , 내용3);

            System.out.println("1.방문록 작성 2. 방문록 삭제 3. 종료");

            // 3-2 입력객체 이용한 키보드로부터 입력값 호출하고 변수에 저장
            System.out.println("선택 : ");
            int ch = scanner.nextInt();

            // 5-1 사용자가 입력한 경우의 수에 따른 기능 처리
            if(ch == 1){
                System.out.println("방문록 작성위치 : 1 , 2 , 3 : ");

                int no = scanner.nextInt();

                scanner.nextLine();
                System.out.print("내용 : ");
                String content = scanner.nextLine();
                System.out.print("작성자 : ");
                String writer = scanner.nextLine();
                System.out.print("비밀번호 : ");
                int password = scanner.nextInt();

                if(no == 1){
                    내용1 = content;
                    작성자1 = writer;
                    비밀번호1 = password;
                }else if(no == 2){
                    내용2 = content;
                    작성자2 = writer;
                    비밀번호2 = password;
                }else if(no == 3){
                    내용3 = content;
                    작성자3 = writer;
                    비밀번호3 = password;
                }else{
                    System.out.println("[경고]알수없는 위치 입니다.");
                }
            }else if(ch == 2){
                System.out.println("방문록 삭제위치 : 1 , 2 , 3 : ");

                int no = scanner.nextInt();

                System.out.print("방문록 비밀번호 : ");
                int password = scanner.nextInt();

                // 초기화 : 위치와 비밀번호 일치에 따른 각 변수를 처음값으로 대입
                if(no == 1 && password == 비밀번호1){
                    내용1 = "";
                    작성자1 = "";
                    비밀번호1 = 0;
                }else if(no == 2 && password == 비밀번호2){
                    내용2 = "";
                    작성자2 = "";
                    비밀번호2 = 0;
                }else if(no == 3 && password == 비밀번호3){
                    내용3 = "";
                    작성자3 = "";
                    비밀번호3 = 0;
                }else if(no >= 1 && no <=3){
                    System.out.println("[경고]패스워드가 다릅니다.");
                }else{
                    System.out.println("[경고]알수없는 위치 입니다.");
                }
            }else if(ch == 3){
                break;
            }else{
                System.out.println("[경고]알수없는 입력입니다.");
            }
        }
    }
}
/*
    비회원제 방문록 프로그램
        1. 방문록 작성 / 삭제 / 종료 / 출력(현황) 기능 구현
            1. 초기메뉴가 반복적으로 실행되어야 한다
                - 특정 조건에 따라 종료
            2. 초기메뉴에 대해 선택(입력) 받는다 scanner.nextInt();

        2. 방문록에는 '내용' , '작성자' , '비밀번호' 를 최대 3명만 작성
            - 내용(문자열) , 작성자(문자열) , 비밀번호(정수)
            - 선언해야 할 변수 개수 : 9개

        3. 기능 구현
            [] 현재 방문록 현황 출력
                1. 초기메뉴에서 9개 변수를 형식에 맞춰 모두 출력
            [1번 선택시] 방문록 작성
                1. (1~3)몇번째 방문록에 작성할건지 선택받기
                2. 내용 , 작성자 , 비밀번호(숫자 4자리) 입력받기
                3. 선택한 방문록 자리에 입력받은 각 데이터 대입
            [2번 선택시] 방문록 삭제
            [3번 선택시] 종료
                1.break 2.return 3.boolean
*/