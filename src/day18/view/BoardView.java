package day18.view;

import day18.controller.BoardController;
import day18.controller.MemberController;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;
import day18.model.dto.MemberDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    // 싱글톤
    private BoardView(){};
    private static BoardView boardView = new BoardView();
    public static BoardView getInstance(){
        return boardView;
    }

    Scanner scanner = MainView.getInstance().scanner;

    int cateNo;

    // 0. 로그인 성공시 출력되는 화면
    public void run(){
        while (true){
            System.out.println("============ 게시판 ============");
            System.out.println("1.글쓰기 | 2.글보기 | 3.로그아웃");
            System.out.print("선택 > ");
            int ch = scanner.nextInt();

            if(ch==1){
                categorySearch();
            }else if(ch==2){

            }else if(ch==3){
                System.out.println("<안내> 로그아웃 성공");
                MemberController.getInstance().logout();
                return;
            }
        }
    }

    // 카테고리 조회
    public void categorySearch(){
        ArrayList<CategoryDto> categoryDtoArrayList = BoardController.getInstance().categorySearch();

        System.out.println("============ 카테고리 ============");
        for(int i = 0; i < categoryDtoArrayList.size(); i++){
            System.out.print(categoryDtoArrayList.get(i).getCateno() + " " + categoryDtoArrayList.get(i).getCatetitle() + " " );
        }
        System.out.println();
        System.out.print("선택 > ");

        cateNo = scanner.nextInt();

        if(cateNo == 1){
            write();
        }else if(cateNo == 2){
            write();
        }else if(cateNo == 3){
            write();
        }
    }

    // 글쓰기
    public void write(){
        System.out.println("============ 글쓰기 ============");
        scanner.nextLine();
        System.out.print("제목 : ");
        String btitle = scanner.nextLine();
        System.out.print("내용 : ");
        String bcontent = scanner.nextLine();

        BoardDto boardDto = new BoardDto(btitle , bcontent);
        boardDto.setCateno(cateNo);

        int result = BoardController.getInstance().write(boardDto);

        if(result == 0){
            System.out.println("<안내> 글쓰기 성공");
        }else if(result == 1){
            System.out.println("<안내> 글쓰기 실패 다시 작성해주세요.");
        }
    }

    public void viewPost(){
        System.out.println("============ 게시판 ============");
    }
}
