package day05;

public class Step2 {
    public static void main(String[] args) {
        // 165P : 배열(Array) 타입
        /*
            - 변수는 하나의 값만 저장
            1. 배열 : 연속된 공간에 값을 나열하고 각 값에 인덱스 부여
                - 인덱스 : 각 항목(요소)의 값을 호출 하거나 저장하는데 사용
            2. 특징
                1. 배열은 같은 타입의 값만 저장
                    int = [57 , "가"] X불가능
                2. 배열의 길이는 선언된 이후 늘리거나 줄일 수 없다
                    int = [57 , 62 , 97] : 항목/요소를 추가/삭제 할 수 없다.
                3. 선언
                    - 변수선언 : int 변수명;
                    - 배열선언 : int[] 변수명; vs int 변수명[];
                4. 값 목록으로 배열 선언
                    - 배열생성1 : 타입[] 변수명 = {값0 , 값1 , 값2 , 값3};
                    - 배열생성2 : 타입[] 변수명 = new 타입[길이];
                5. 배열의 길이를 구하는 속성명
                    - 배열명.length : 현재 배열의 길이를 알려준다
                6. 배열 항목/요소 값 넣기
                    - 배열명[인덱스] = 새로운값;
                7. 배열 항목/요소 값 호출
                    - 배열명[인덱스]
                8. 배열 항목/요소 값 수정
                    - 배열명[인덱스] = 새로운값;
                9. 배열 항목/요소 값 삭제 [항목/요소 위치 삭제는 없고 처음값으로 초기화 한다]
                    - 배열명[인덱스] = 각 타입의 초기값
        */
        // 1. 배열 생성/선언 : 여러개 문자열을 저장하는 배열 선언
        String[] season = {"Spring" , "Summer" , "Fall" , "Winter"};

        // 2. 배열의 각 요소/항목의 값 호출
        System.out.println("season = " + season);
        // 기본타입(7가지+String) 말고 참조타입 호출시 주소값이 나옴

        System.out.println("season = " + season[0]);
        System.out.println("season = " + season[1]);
        System.out.println("season = " + season[2]);
        System.out.println("season = " + season[3]);
        // System.out.println("season = " + season[4]);

        // 2. for반복문을 이용한 호출
        for(int i = 0; i < season.length; i++){
            // i는 0부터 마지막인덱스까지 1씩 증가
            System.out.println("season["+i+"] = " + season[i]);
        }

        // 3. 각 요소/항목의 값 수정
        season[1] = "여름";
        System.out.println("season = " + season[1]);

        // 1. int형 84,90,87 3개 정수를 저장하는 배열 선언
        int[] scores = {83,90,87};
        // 2. 배열 내 항목/요소 총합계
        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += scores[i];
        }
        System.out.println("sum = " + sum);
        double avg = (double) sum / 3;
        System.out.println("avg = " + avg);

        // 173P new 연산자를 이용한 배열 선언
        int[] arr1 = new int[3];

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        System.out.println();

        for(int i = 0; i < 3; i++){
            System.out.printf("arr1[%1d] : %2d ," , i , arr1[i] );
        }

        // 1. double형 3개를 저장할 수 있는 배열 선언
        double[] arr2 = new double[3];

        for(int i = 0; i < 3; i++){
            System.out.printf("arr2[%1d] : %2f ," , i , arr2[i] );
        }

        // 2.
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.printf("arr2[%1d] : %2f ," , i , arr2[i] );
        }

        // 1. String형 3개를 저장할 수 있는 배열 선언
        String[] arr3 = new String[3];
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.printf("arr3[%1d] : %2s ," , i , arr3[i] );
        }

        // 2.
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.printf("arr3[%1d] : %2s ," , i , arr3[i] );
        }
    }
}
