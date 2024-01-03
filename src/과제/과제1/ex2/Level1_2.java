package 과제.과제1.ex2;

import java.time.LocalDateTime;

public class Level1_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
		System.out.println("-------------------------------------------------------------");
		/* 문제풀이 위치 */
		boolean bool = true;
		System.out.printf("%-10s   %15s   %30s\n" , "boolean" , bool , "true or false");
		byte b = 100;
		System.out.printf("%-10s   %15s   %30s\n" , "byte" , b , "-128 ~ 127");
		char c = 'A';
		System.out.printf("%-10s   %15s   %30s\n" , "char" , c , "0~65535[ character 1 ]");
		short s = 30000;
		System.out.printf("%-10s   %15s   %30s\n" , "short" , s , "-32768 ~ 32767");
		int i = 2000000000;
		System.out.printf("%-10s   %15s   %30s\n" , "int" , i , "-+2000 million");
		long l = 40000000000L;
		System.out.printf("%-10s   %15s   %30s\n" , "long" , l , "-+2000 million Excess");
		float f = 3.123F;
		System.out.printf("%-10s   %15s   %30s\n" , "float" , f , "8 decimal places");
		double d = 3.12312312;
		System.out.printf("%-10s   %15s   %30s\n" , "double" , d , "17 decimal places");
		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개 선언하고 임의값을 대입하여 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. printf() 메소드 사용
*/
