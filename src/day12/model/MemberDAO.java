package day12.model;

import java.util.ArrayList;
//import org.apache.commons.lang3.RandomStringUtils;

// DAO : 데이터베이스 접근객체
public class MemberDAO {
    // 싱글톤
    private MemberDAO(){}
    private static MemberDAO memberDAO = new MemberDAO();
    public static MemberDAO getInstance(){return memberDAO;}

    // DB 대신에 배열
        // 배열 사용시 불편한점 : 고정길이
        // 고정길이 배열을 가변길이 배열로 구현 -> 제공하는 라이브러리/컬렉션(수집) 프레임워크
        // 컬렉션 프레임워크 : ArrayList 가변길이 배열을 지원하는 클래스
        // ArrayList<여러개 저장할 객체의 타입> 변수명 = new ArrayList<>();
        // 제공하는 함수
            // 저장 : .add(저장할 객체)
            // 개수 : .size()
            // 호출 : .get(인덱스)
            // 삭제 : .remove(인덱스)
    ArrayList<MemberDTO> memberDTOS = new ArrayList<>();
    // MemberDTO[] memberDTOs = new MemberDTO[100];

    // 1. 회원가입 메소드
    public boolean signup(MemberDTO memberDTO){
        System.out.println("MemberDAO.signup");

        // 회원가입 시 아이디 중복검사
        for(int i = 0; i < memberDTOS.size(); i++){
            if(memberDTOS.get(i).getId().equals(memberDTO.getId())){
                System.out.println("중복된 아이디 입니다.");
            }
            return false;
        }
        memberDTOS.add(memberDTO);

        return true;    // 회원가입 성공
    }

    // 2. 로그인 메소드
    public boolean login(MemberDTO memberDTO){
        System.out.println("[3]MemberDAO.login");

        // 로그인 처리 : 전체 회원중에 입력받은 동일한 값이 있는지 확인
        for(int i = 0; i < memberDTOS.size(); i++){
            // i는 0부터 리스트내 요소의 수 까지 1씩 증가
            if(memberDTOS.get(i).getId().equals(memberDTO.getId())){
                // 리스트 내 i번째 객체의 아이디와 입력받은 아이디(매개변수) 같으면
                if(memberDTOS.get(i).getPw().equals(memberDTO.getPw())){
                    // 리스트 내 i번째 객체의 비밀번호와 입력받은 비밀번호(매개변수) 같으면
                    return true;    // 로그인 성공
                }
            }
        }

        return false;   // 로그인 실패
    }

    // 3. 아이디찾기 메소드
    public static String idSearch = null;
    public boolean idSearch(MemberDTO memberDTO){
        System.out.println("[3]MemberDAO.idSearch");
        for(int i = 0; i < memberDTOS.size(); i++){
            if(memberDTOS.get(i).getName().equals(memberDTO.getName())){
                if(memberDTOS.get(i).getPhone().equals(memberDTO.getPhone())){
                    idSearch = memberDTOS.get(i).getId();
                    return true;    // 아이디찾기 성공
                }
            }
        }

        return false;   // 아이디찾기 실패
    }

    // 4. 비밀번호찾기 메소드
    public  String pwSearch(MemberDTO memberDTO){
        for(int i = 0; i < memberDTOS.size(); i++){
            if(memberDTOS.get(i).getId().equals(memberDTO.getId())){
                if(memberDTOS.get(i).getPhone().equals(memberDTO.getPhone())){
                    //String randomPw = RandomStringUtils.randomAlphanumeric(6);
                    //return randomPw;    // 아이디찾기 성공
                }
            }
            return "false";
        }
        return null;
    }
}
//for(int i = 0; i < memberDTOs.length; i++){
//    if(memberDTOs[i] == null){
//        memberDTOs[i] = memberDTO;
//        return true;    // 회원가입 성공
//    }
//}