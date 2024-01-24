package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Step3 {
    /*
        0. Class.forName("JDBC드라이버 클래스경로");
            - 해당클래스 찾아서 JDBC드라이버 객체 (DriverManager) 자동 등록 한다

        1. [클래스] DriverManager
            - 연동 성공하면 Connection 구현체(객체)를 반환한다
            - 연동함수 : DriverManager.getConnection(jdbc:mysql://ip주소:port번호/db명,계정,비밀번호)
                - ip번호 = localhost = 현재pc
                - port번호 = mysql 3306 사용 권장

        2. [인터페이스] Connection
            - Statement , prepareStatement 구현 객체를 반환한다
            - connection.prepareStatement(sql)

        3. [인터페이스] prepareStatement
            - DDL , DML 문을 실행 할때 사용한다
            - 실행
                1. insert , update , delete => .executeUpdate();
                2. select => .executeQuery();

        4. [인터페이스] ResultSet
            - DB에서 가져온 데이터를 읽을때 사용한다
            1. 다음 레코드 이동 : .next()      : 다음레코드 이동 후 존재하면 true / 없으면 false 반환
            2. 현재 레코드에서 필드 값 호출 : .get타입(호출할 필드순서번호/필드명);
                                         .getString() : 문자타입 호출 , .getInt() : 정수타입 호출
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Connection connection = null;

        try {
            // DB연동
            // 1. JDBC 드라이버 로딩한다
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. DB서버와 연동 후 연동객체를 반환 받는다
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test5","root","1234");
            // 3. DB연동시 필요한 메소드중에 Class.forName , getConnection 일반예외 발생
                // - try{ }catch(예외클래스명 매개변수){ }
            System.out.println("<연동성공>");
        }catch (Exception e){
            System.out.println(e);
        }

        while (true){
            System.out.println("고객명단 : 1.삽입 2.출력 3.수정 4.삭제");
            System.out.print("선택 > ");
            try {
                int ch = sc.nextInt();

                if(ch==1){
                    // 1. 입력받기
                    System.out.print("저장할 고객명 : ");
                    String name = sc.next();

                    // 2. DB에 저장
                    // connection.prepareStatement("insert into members values('유재석')").executeUpdate();
                    String sql = "insert into members values('"+name+"')";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();
                }else if(ch==2){
                    // 모든 필드를 표시하는 모든 레코드 출력 , 입력받기X
                    String sql = "select * from members";
                    ResultSet resultSet = connection.prepareStatement(sql).executeQuery();
                    System.out.println(resultSet);  // select 결과물 가지고 있는 인터페이스
                    // .next() : select 결과 테이블에서 다음 레코드로 이동 후 존재여부 true/false 반환 함수
                    while (resultSet.next()){ // 하나씩 next()로 레코드를 이동하면서 반복처리, 만약에 다음레코드가 존재하면 실행 존재하지 않으면 while 종료
                        System.out.println(resultSet.getString("name"));
                            // .get타입(호출 필드 순서번호 or 필드명)
                    }
                }else if(ch==3){
                    // 1. 입력받기
                    System.out.print("수정할 고객명 : ");
                    String oldName = sc.next();
                    System.out.print("새로운 고객명 : ");
                    String newName = sc.next();

                    // 2. DB에 수정처리
                    // connection.prepareStatement("update members set name = '신동엽' where name = '강호동'").executeUpdate();
                    String sql = "update members set name = '"+newName+"' where name = '"+oldName+"'";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();
                }else if(ch==4){
                    // 1. 입력받기
                    System.out.print("삭제할 고객명 : ");
                    String delName = sc.next();

                    // 2. DB에 삭제처리
                    String sql = "delete from members where name = '"+delName+"'";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();
                }
            }catch (InputMismatchException e){
                System.out.println("<시스템 오류> 정상적인 입력값이 아닙니다.");
                sc = new Scanner(System.in);
            }catch (SQLException e){
                System.out.println("<시스템 오류> SQL에서 오류가 발생하였습니다.");
            }
        }
    }
}
