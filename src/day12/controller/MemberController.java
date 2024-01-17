package day12.controller;

import day12.model.MemberDAO;
import day12.model.MemberDTO;

// CONTROLLER : View 와 DAO 중계역할
public class MemberController {
    // 싱글톤
    private MemberController(){}
    private static MemberController memberController = new MemberController();
    public static MemberController getInstance(){return memberController;}

    // 1. 회원가입 메소드
    public boolean signup(MemberDTO memberDTO){
        System.out.println("MemberController.signup");
        // 1. 유효성검사 처리
        // 2. view에게 받은 객체를 DAO에게 전달 후 처리 결과를 받기
        boolean result = MemberDAO.getInstance().signup(memberDTO);
        return result;
    }

    // 로그인 했다는 증거 - 로그아웃을 하기전까지 [회원번호 또는 아이디]
    String loginSession = null;     // null이면 비로그인 null 대신에 아이디가 있으면 로그인 된 상태

    // 2. 로그인 메소드
    public boolean login(MemberDTO memberDTO){
        System.out.println("[2]MemberController.login");

        boolean result = MemberDAO.getInstance().login(memberDTO);
        System.out.println("[4]MemberController.login");

        // 만약에 로그인 성공시 로그인상태 변경
        if(result){
            // 로그인상태 필드에 로그인 성공한 아이디를 대입한다
            loginSession = memberDTO.getId();
        }

        return result;
    }

    // 3. 아이디찾기 메소드
    public boolean idSearch(MemberDTO memberDTO){
        System.out.println("[2]MemberController.idSearch");
        boolean result = MemberDAO.getInstance().idSearch(memberDTO);
        System.out.println("[4]MemberController.idSearch");

        return result;
    }

    // 4. 비밀번호찾기 메소드
    public  String pwSearch(MemberDTO memberDTO){
        String result = MemberDAO.getInstance().pwSearch(memberDTO);

        return result;
    }
}
