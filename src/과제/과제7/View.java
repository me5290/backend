package 과제.과제7;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n\n--------- 회원 시스템 ---------");
            System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
            int ch = scanner.nextInt();

            if( ch == 1 ) {
                System.out.print("아이디 : ");
                String id = scanner.next();
                System.out.print("비밀번호 : ");
                String pw = scanner.next();
                System.out.print("이름 : ");
                String name = scanner.next();
                System.out.print("전화번호 : ");
                String phone = scanner.next();
                System.out.print("나이 : ");
                int age = scanner.nextInt();

                MemberDto memberArray = new MemberDto(id , pw , name , phone , age);

                boolean result = Controller.signup(memberArray);

                if (result){
                    System.out.println("회원가입 성공");
                }else{
                    System.out.println("회원가입 실패");
                }
            }
            else if( ch == 2 ) {
                System.out.print("아이디 : ");
                String id = scanner.next();
                System.out.print("비밀번호 : ");
                String pw = scanner.next();

                MemberDto memberArray = new MemberDto();
                memberArray.setId(id);
                memberArray.setPw(pw);

                boolean result = Controller.login(memberArray);

                if (result){
                    System.out.println("로그인 성공");
                }else{
                    System.out.println("로그인 실패");
                }
            }
            else if( ch == 3 ) {
                System.out.print("이름 : ");
                String name = scanner.next();
                System.out.print("비밀번호 : ");
                String pw = scanner.next();

                MemberDto memberArray = new MemberDto();
                memberArray.setId(name);
                memberArray.setPw(pw);

                boolean result = Controller.idSearch(memberArray);

                if (result){
                    System.out.println("아이디는 " + memberArray.getId() + " 입니다.");
                }else {
                    System.out.println("아이디가 존재하지 않습니다.");
                }
            }
            else if( ch == 4 ) {
                System.out.print("아이디 : ");
                String id = scanner.next();
                System.out.print("전화번호 : ");
                String phone = scanner.next();

                MemberDto memberArray = new MemberDto();
                memberArray.setId(id);
                memberArray.setPw(phone);

                boolean result = Controller.pwSearch(memberArray);

                if (result){
                    System.out.println("비밀번호는 " + memberArray.getPw() + " 입니다.");
                }else {
                    System.out.println("비밀번호가 존재하지 않습니다.");
                }
            }

        }
    }
}
