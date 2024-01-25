package day18.view;

import day18.controller.MemberController;

import java.util.Scanner;

public class BoardView {
    // 싱글톤
    private BoardView(){};
    private static BoardView boardView = new BoardView();
    public static BoardView getInstance(){
        return boardView;
    }

    Scanner scanner = MainView.getInstance().scanner;

    // 0. 로그인 성공시 출력되는 화면
    public void run(){
        while (true){
            System.out.println("============ 게시판 ============");
            System.out.println("1.글쓰기 | 2.글보기 | 3.로그아웃");
            System.out.print("선택 > ");
            int ch = scanner.nextInt();

            if(ch==1){

            }else if(ch==2){

            }else if(ch==3){
                System.out.println("<안내> 로그아웃 성공");
                MemberController.getInstance().logout();
                return;
            }
        }
    }
}
