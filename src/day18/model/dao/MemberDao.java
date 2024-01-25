package day18.model.dao;

import day18.model.dto.MemberDto;
import day18.view.MemberView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao extends Dao{
    // 싱글톤
    private MemberDao(){}
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){
        return memberDao;
    }

    // 1. 회원가입
    public int signUp(MemberDto memberDto){
        try {
            // 1. SQL 작성 [변수가 들어갈 자리에는 ? 대체한다]
            String sql = "insert into member(mid , mpw , mphone) values(? , ? , ?);";
            // 2. SQL 기재
            ps = con.prepareStatement(sql);
            // ? 매개변수 대입
            ps.setString(1,memberDto.getMid()); // 기재된 SQL내 첫번째 ?에 값 대입
            ps.setString(2,memberDto.getMpw()); // 기재된 SQL내 두번째 ?에 값 대입
            ps.setString(3,memberDto.getMphone()); // 기재된 SQL내 세번째 ?에 값 대입
            // 3. SQL 실행
            int count = ps.executeUpdate(); // .executeUpdate() 기재된 sql실행하고 insert된 레코드 개수 반환
            if(count == 1){ // 만약에 insert 처리된 레코드가 1개이면 회원가입 성공
                return 0;
            }
            // 4. SQL 결과
        }catch (Exception e){
            System.out.println(e);
        }
        // 5. 함수종료
        return 1;   // 실패
    }

    // 2. 아이디 검사용(아이디 중복검사)
    public boolean idCheck(String mid){
        try{
            // 1. SQL 작성한다
            String sql = "select mid from member where mid = ?;";
            // 2. SQL 기재한다
            ps = con.prepareStatement(sql);
            ps.setString(1,mid);    // sql 문법내 첫번째 ?에 mid 변수 값 대입
            // 3. SQL 실행한다
            rs = ps.executeQuery(); // 질의/검색 (select) 결과를 rs인터페이스에 대입한다
            // 4. SQL 결과처리
            if(rs.next()){
                return true; // 중복 있음
            }
        }catch (Exception e){
            System.out.println(e);
        }
        // 5. 함수종료
        return false; // 중복 없음
    }

    // 3. 로그인
    public boolean login(MemberDto memberDto){
        try{
            // 1. SQL 작성한다
            String sql = "select * from member where mid = ? and mpw = ?;";
            // 2. SQL 기재한다
            ps = con.prepareStatement(sql);
            ps.setString(1,memberDto.getMid());
            ps.setString(2,memberDto.getMpw());
            // 3. SQL 실행한다
            rs = ps.executeQuery();
            // 4. SQL 결과처리
            if(rs.next()){
                return true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        // 5. 함수종료
        return false; // 중복 없음
    }

    // 4. 아이디를 이용한 회원번호 찾기
    public int findMno(String mid){
        try{
            // 1. SQL 작성한다
            String sql = "select mno from member where mid = ?;";
            // 2. SQL 기재한다
            ps = con.prepareStatement(sql);
            ps.setString(1,mid);
            // 3. SQL 실행한다
            rs = ps.executeQuery();
            // 4. SQL 결과처리
            if(rs.next()){
                return rs.getInt("mno");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        // 5. 함수종료
        return 0;
    }
}
