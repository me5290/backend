package day05;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] 내용배열 = new String[3];
        String[] 작성자배열 = new String[3];
        int[] 비밀번호배열 = new int[3];

        // 1. 무한루프
        while (true){
            // 2. 출력
            System.out.println("============ 방문록 ============");

            for(int i = 0; i < 내용배열.length; i++){
                if(내용배열[i] != null){
                    System.out.printf("%2d \t %-5s \t %-20s\n" , i+1 , 작성자배열[i] , 내용배열[i]);
                }
            }

            System.out.println("1.방문록 작성 2. 방문록 삭제 3. 종료");
            // 3. 입력
            System.out.print("선택> ");
            int ch = scanner.nextInt();

            // 4. 입력에 따른 경우의수 판단
            if(ch == 1){
                // 6-1. 방문록을 작성할 위치[인덱스] 입력 받는다
                System.out.print("방문록 작성 위치 : 1 , 2 , 3 : ");
                int no = scanner.nextInt();

                // 6-2. 입력 : 내용 , 작성자 , 비밀번호
                scanner.nextLine();
                System.out.print("내용 : ");
                String content = scanner.nextLine();
                System.out.print("작성자 : ");
                String writer = scanner.next();
                System.out.print("비밀번호 : ");
                int password = scanner.nextInt();

                no-=1;

                // 6-3. 배열에 각각 대입
                내용배열[no] = content;
                작성자배열[no] = writer;
                비밀번호배열[no] = password;
            }else if(ch == 2){
                System.out.println("방문록 삭제위치 : 1 , 2 , 3 : ");
                int no = scanner.nextInt();

                System.out.print("방문록 비밀번호 : ");
                int password = scanner.nextInt();

                if(no < 1 || no > 내용배열.length){
                    System.out.println("[경고] 알수없는 위치 입니다.");
                }
                else if(비밀번호배열[no-1] == password){
                    내용배열[no-1] = null;
                    작성자배열[no-1] = null;
                    비밀번호배열[no-1] = 0;
                }else{
                    System.out.println("[경고] 패스워드가 다릅니다.");
                }
            }else if(ch == 3){
                break;
            }else{
                System.out.println("[경고]알수없는 입력입니다.");
            }
        }
    }
}
