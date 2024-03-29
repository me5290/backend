package 과제.과제6;
import day12.view.MainView;

import java.util.Scanner;

import static day12.model.MemberDAO.idSearch;

public class MemberSys { // class s
	static Scanner scanner = new Scanner(System.in);
	static Member[] 객체배열 = new Member[100];
	public static void signup(){
		System.out.print("아이디 : ");
		String id = scanner.next();
		System.out.print("비밀번호 : ");
		String pw = scanner.next();
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.print("전화번호 : ");
		String phone = scanner.next();
		System.out.print("나이 : ");
		int age = scanner.nextInt();

		Member memberArray = new Member();
		memberArray.setId(id);
		memberArray.setPw(pw);
		memberArray.setName(name);
		memberArray.setPhone(phone);
		memberArray.setAge(age);

		for(int i = 0; i < 객체배열.length; i++){
			if(객체배열[i] == null){
				객체배열[i] = memberArray;
				System.out.println("회원가입 성공");
				break;
			}
		}
	}

	public static void login(){
		System.out.print("아이디 : ");
		String id = scanner.next();
		System.out.print("비밀번호 : ");
		String pw = scanner.next();

		Member memberArray = new Member();
		memberArray.setId(id);
		memberArray.setPw(pw);

		for(int i = 0; i < 객체배열.length; i++){
			if(객체배열[i] != null){
				if(객체배열[i].getId().equals(id) && 객체배열[i].getPw().equals(pw)){
					System.out.println("로그인 성공");
				}else{
					System.out.println("로그인 실패");
				}
			}
		}
	}

	public static void idSearch(){
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.print("비밀번호 : ");
		String pw = scanner.next();

		Member memberArray = new Member();
		memberArray.setId(name);
		memberArray.setPw(pw);

		for(int i = 0; i < 객체배열.length; i++){
			if(객체배열[i] != null){
				if(객체배열[i].getName().equals(name) && 객체배열[i].getPw().equals(pw)){
					System.out.println("아이디는 " + 객체배열[i].getId() + " 입니다.");
				}else{
					System.out.println("아이디가 존재하지 않습니다.");
				}
			}
		}
	}

	public static void pwSearch(){
		System.out.print("아이디 : ");
		String id = scanner.next();
		System.out.print("전화번호 : ");
		String phone = scanner.next();

		Member memberArray = new Member();
		memberArray.setId(id);
		memberArray.setPw(phone);

		for(int i = 0; i < 객체배열.length; i++){
			if(객체배열[i] != null){
				if(객체배열[i].getId().equals(id) && 객체배열[i].getPhone().equals(phone)){
					System.out.println("비밀번호는 " + 객체배열[i].getPw() + " 입니다.");
				}else{
					System.out.println("비밀번호가 존재하지 않습니다.");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			//System.out.println(Member.toString());

			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
			int ch = sc.nextInt();

			if( ch == 1 ) {
				MemberSys.signup();
			}
			else if( ch == 2 ) {
				MemberSys.login();
			}
			else if( ch == 3 ) {
				MemberSys.idSearch();
			}
			else if( ch == 4 ) {
				MemberSys.pwSearch();
			}

		} // w e
	} // m e 
} // class e 
/*
	주제 : 회원제 시스템 part2
	 	- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 기능별 함수를 4개 생성하시오.

		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		1. 생성자 사용하시오.
		2. getter , setter 메소드를 사용하시오.

		[ MemberSys 클래스 ]
		0. 배열
			Member[] 객체배열 = new Member[100];

		1. 초기 메뉴
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
			
		2. 조건 기능 
			1. 회원가입 메소드 
				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
				2. Member 객체화
				3. 객체를 배열 저장 
				 
			2. 로그인 메소드
				1. 아이디 , 비밀번호 입력받아 저장 
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 로그인 성공 
					- 아니면 실패
					 
			3. 아이디찾기 메소드
				1. 이름 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 아이디 출력 
					- 아니면 없다.
					 
			4. 비밀번호찾기 메소드 
				1. 아이디 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 비밀번호 출력
					- 아니면 없다.

			
*/














