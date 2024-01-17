package day12.view;

import java.util.Scanner;

// VIEW : 화면구현(입출력)
public class MainView {
    /*
        싱글톤 : 프로그램내 하나의 객체를 사용 패턴

        1. 생성자 private
        2. 필드에 본인 객체를 생성한다 private static
        3. 객체를 외부로부터 전달하기 위한 함수 getInstance()
    */
    private MainView(){}
    private static MainView mainView = new MainView();
    public static MainView getInstance(){return mainView;}

    // 1. 필드
    Scanner scanner = new Scanner(System.in);
    // 2. 생성자

    // 3. 메소드
    public void run(){
        while (true){
            System.out.println("===== 메인페이지 =====");
            System.out.println("1.회원가입 2.로그인 3.아이디찾기 4. 비밀번호찾기");
            System.out.print("선택> ");
            int ch = scanner.nextInt();

            if(ch == 1){    // 회원가입 페이지 이동
                MemberView.getInstance().signup();
            }else if(ch == 2){  // 로그인 페이지 이동
                MemberView.getInstance().login();
            }else if(ch == 3){
                MemberView.getInstance().idSearch();
            }else if(ch == 4){

            }
        }
    }
}
