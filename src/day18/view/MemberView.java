package day18.view;

import day18.controller.MemberController;
import day18.model.dto.MemberDto;
import team과제.team과제4.Main;

import java.util.Scanner;

public class MemberView {
    // 싱글톤
    private MemberView(){};
    private static MemberView memberView = new MemberView();
    public static MemberView getInstance(){
        return memberView;
    }

    Scanner scanner = MainView.getInstance().scanner;

    // 1. 회원가입
    public void signUp(){
        // 1. 입력받기
        System.out.print("아이디 : ");
        String id = scanner.next();
        System.out.print("비밀번호 : ");
        String pw = scanner.next();
        System.out.print("전화번호 : ");
        String phone = scanner.next();

        // 2. 객체화
        MemberDto memberDto = new MemberDto(id,pw,phone);

        // 3. 컨트롤러에게 전달
        int result = MemberController.getInstance().signUp(memberDto);

        // 4. 결과에 따른 출력
        if(result == 0){
            System.out.println("<안내> 회원가입 성공");
        }else if(result == 1){
            System.out.println("<안내> 시스템 내부 오류 관리자에게 문의");
        }else if(result == 2) {
            System.out.println("<안내> 사용중인 아이디 입니다");
        }
    }

    // 2. 로그인
    public void login(){
        // 1. 입력
        System.out.print("아이디 : ");
        String id = scanner.next();
        System.out.print("비밀번호 : ");
        String pw = scanner.next();
        // 2. 객체화
        MemberDto memberDto = new MemberDto();
        memberDto.setMid(id);
        memberDto.setMpw(pw);
        // 3. 전달 후 결과
        boolean result = MemberController.getInstance().login(memberDto);
        // 4. 결과 출력
        if(result){
            System.out.println("<안내> 로그인 성공");
            BoardView.getInstance().run();
        }else{
            System.out.println("<안내> 로그인 실패");
        }
    }
}
