package day01;

public class Step3 {
    public static void main(String[] args) {
        // 41P 진수 표현하는 방법 [ int타입이 자동으로 10진수 변환 ]
        int var1 = 0b1011;  // 2진수 : 데이터 앞에 0b   1011[2] -> 11[10]
        System.out.println("var1 : " + var1); // "문자열"+변수명
        int var2 = 0206;    // 8진수 : 데이터 앞에 0      206[8] -> 134[10]
        System.out.println("var2 : " + var2);
        int var3 = 365;     // 10진수 : 365[10] -> 365[10]
        System.out.println("var3 : " + var3);
        int var4 = 0xB3;    // 16진수 : 데이터 앞에 0x     B3[16] -> 179[10]
        System.out.println("var4 : " + var4);

        // 42P byte타입 [ -128 ~ 127 ] : 1바이트 => 8bit -> 1[부호]+7[값] -> 2의7승
        byte b1 = -128;
        System.out.println("b1 : " + b1);
        byte b2 = 127;
        System.out.println("b2 : " + b2);
        //byte b3 = 200;
        //System.out.println("b3 : " + b3);
        
        // short타입 [ -32768 ~ 32767 ] : 2바이트
        short s1 = 32000;
        System.out.println("s1 : " + s1);
        //short s2 = -50000;
        //System.out.println("s2 : " + s2);
        
        // int타입 [+-21억정도] : 4바이트 : !!! : 정수타입 리터럴(그 값 자체)
        int i1 = 2000000000;
        System.out.println("i1 : " + i1);
        //int i2 = 3000000000;
        //System.out.println("i2 : " + i2);

        // long타입 [+-21억이상] : 8바이트 : !!! : 정수타입 리터럴 뒤에 l/L
        long l1 = 3000000000L;
        System.out.println("l1 : " + l1);

        // 43P char [ 0 ~ 65535 ] : 2바이트 : !!! : ''작은따옴표 , 65536개 문자 표현가능 , 부호[signed]/부호없음[unsigned]
        char c1 = 'A';
        System.out.println("c1 : " + c1);
        char c2 = '가';
        System.out.println("c2 : " + c2);
        //char c3 = "가";
        //System.out.println("c3 : " + c3);

        int i3 = 'A';
        System.out.println("i3 : " + i3);
        int i4 = '가';
        System.out.println("i4 : " + i4);
        char c4 = 80;
        System.out.println("c4 : " + c4);

        // 49P 문자열[] : "" 큰따옴표 , 참조자료형/클래스
        String str1 = "안녕하세요";
        System.out.println("str1 : " + str1);
        String str2 = "나는 \"자바\"를 배웁니다";
        System.out.println("str2 : " + str2);
        String str3 = "번호\t이름\t직업";
        System.out.println("str3 : " + str3);
        // java/jdk13 이후 가능한 문법
        String str4 = """
                    나는 자바를
                    학습합니다.
                    나는 자바 고수가 될 겁니다.
                """;
        System.out.println("str4 : " + str4);

        // 45P float [7자리 유효] : 4바이트 : 반올림
        float f1 = 0.123456789123456789F;
        System.out.println("f1 : " + f1);

        // double [15자리 유효] : 8바이트 : 실수타입의 기본타입
        double d1 = 0.123456789123456789;
        System.out.println("d1 : " + d1);

        // boolean [true 또는 false] : 1바이트
        boolean bool1 = true;
        //boolean bool2 = 1;    1[int]이므로 boolean에 저장할 수 없다.
    }
}
