package day12.view;

import day12.controller.MemberController;
import day12.model.MemberDAO;
import day12.model.MemberDTO;

import java.util.Scanner;

// VIEW : 화면구현(입출력)
public class MemberView {
    // 싱글톤
    private MemberView(){}
    private static MemberView memberView = new MemberView();
    public static MemberView getInstance(){return memberView;}

    // 1. 회원가입 메소드
    public void signup(){
        System.out.println("MemberView.signup");
        // MainView.getInstance() : 싱글톤(미리 만들어진 단 하나의 객체) 호출
        Scanner scanner = MainView.getInstance().scanner;
        // 1. 입력받는다
        System.out.println("아이디 : ");
        String id = scanner.next();
        System.out.println("비밀번호 : ");
        String pw = scanner.next();
        System.out.println("이름 : ");
        String name = scanner.next();
        System.out.println("전화번호 : ");
        String phone = scanner.next();

        // 2. 객체화
        MemberDTO memberDTO = new MemberDTO(0 , id , pw , name , phone);

        // 3. 객체를 컨트롤에게 전달(매개변수/회원가입 필요한 정보/객체)후 처리 결과(리턴/회원가입 처리 결과/boolean)를 받기
        boolean result = MemberController.getInstance().signup(memberDTO);

        // 4. 결과에 따른 출력문 만들기
        if(result){
            System.out.println("[안내] 회원가입 성공");
        }else{
            System.out.println("[안내] 회원가입 실패");
        }
        return;
    }

    // 2. 로그인 메소드(로그인 : 데이터 비교하는 작업)
    public void login(){
        System.out.println("[1]MemberView.login");

        Scanner scanner = MainView.getInstance().scanner;

        // 1. 입력받기
        System.out.print("아이디 : ");
        String id = scanner.next();
        System.out.print("비밀번호 : ");
        String pw = scanner.next();

        // 2. 객체 vs 2개 문자열
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(id);
        memberDTO.setPw(pw);

        // 3. 컨트롤에게 전달(로그인에 필요한 정보)하고 결과(boolean)받기
        boolean result = MemberController.getInstance().login(memberDTO);
        System.out.println("[5]MemberView.login");

        // 4. 결과에 따른 출력문 만들기
        if(result){
            System.out.println("[안내] 로그인 성공");
        }else{
            System.out.println("[안내] 로그인 실패");
        }
        return;
    }

    // 3. 아이디찾기 메소드

    public void idSearch(){
        System.out.println("[1]MemberView.idSearch");
        Scanner scanner = MainView.getInstance().scanner;

        // 1. 입력받기
        System.out.print("이름 : ");
        String name = scanner.next();
        System.out.print("전화번호 : ");
        String phone = scanner.next();

        // 2. 객체
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setName(name);
        memberDTO.setPhone(phone);

        // 3. 컨트롤에게 전달(아이디찾기에 필요한 정보)하고 결과(boolean)받기
        boolean result = MemberController.getInstance().idSearch(memberDTO);
        System.out.println("[5]MemberView.idSearch");

        // 4. 결과에 따른 출력문 만들기
        if(result){
            System.out.println("아이디는 " + MemberDAO.idSearch);
        }else {
            System.out.println("아이디 찾기 실패");
        }
    }

    // 4. 비밀번호찾기 메소드
    public void pwSearch(){
        Scanner scanner = MainView.getInstance().scanner;

        // 1. 입력받기
        System.out.print("아이디 : ");
        String id = scanner.next();
        System.out.print("전화번호 : ");
        String phone = scanner.next();

        // 2. 객체
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(id);
        memberDTO.setPhone(phone);

        // 3. 컨트롤에게 전달(비밀번호찾기에 필요한 정보)하고 결과(String)받기
        String result = MemberController.getInstance().pwSearch(memberDTO);
    }
}
