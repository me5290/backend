package day18.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainView {
    // 싱글톤
    private MainView(){}
    private static MainView mainView = new MainView();
    public static MainView getInstance(){
        return mainView;
    }

    Scanner scanner = new Scanner(System.in);

    public void run(){
        while (true){
            System.out.println("============ 메인페이지 ============");
            System.out.println("1.회원가입 | 2.로그인");
            try {   // 만약에 try{}안에서 예외가 발생하면 catch 이동
                System.out.print("선택 > ");
                int ch = scanner.nextInt();

                if(ch==1){
                    MemberView.getInstance().signUp();
                }else if(ch==2){
                    MemberView.getInstance().login();
                }else {
                    System.out.println("<안내> 알 수 없는 기능 번호 입니다.");
                }
            }catch (InputMismatchException e){
                System.out.println("<안내> 입력 할 수 없는 형식 입니다." + e);
                // 입력 객체내 입력받은 필드/바이트 초기화
                scanner = new Scanner(System.in);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
