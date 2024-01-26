package day18.model.dao;

import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;
import day18.model.dto.MemberDto;
import day18.view.BoardView;

import java.util.ArrayList;

public class BoardDao extends Dao{
    private BoardDao(){}
    private static BoardDao boardDao = new BoardDao();
    public static BoardDao getInstance(){
        return boardDao;
    }

    // 카테고리 조회
    public ArrayList<CategoryDto> categorySearch(){
        ArrayList<CategoryDto> categoryDtos = new ArrayList<>();
        try {
            // 1.sql 작성한다.
            String sql = "select * from category order by cateno ASC";

            // 2. sql 기재한다.
            ps = con.prepareStatement(sql);
            // 3. sql 실행
            rs = ps.executeQuery();

            // 4. sql 결과처리
            while (rs.next()){

                CategoryDto categoryDto1 = new CategoryDto();
                categoryDto1.setCateno( rs.getInt("cateno") );
                categoryDto1.setCatetitle( rs.getString("catetitle") );

                categoryDtos.add(categoryDto1);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return categoryDtos;
    }

    // 1. 글쓰기
    public int write(BoardDto boardDto){
        System.out.println(boardDto.toString());
        try {
            // 1. SQL 작성 [변수가 들어갈 자리에는 ? 대체한다]
            String sql = "insert into board(btitle , bcontent , mno , cateno) values(? , ? , ? , ?);";
            // 2. SQL 기재
            ps = con.prepareStatement(sql);
            // ? 매개변수 대입
            ps.setString(1,boardDto.getBtitle()); // 기재된 SQL내 첫번째 ?에 값 대입
            ps.setString(2,boardDto.getBcontent()); // 기재된 SQL내 두번째 ?에 값 대입
            ps.setInt(3,boardDto.getMno()); // 기재된 SQL내 세번째 ?에 값 대입
            ps.setInt(4,boardDto.getCateno()); // 기재된 SQL내 네번째 ?에 값 대입
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

}
