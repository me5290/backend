package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        붕어빵틀[] 붕어빵트레이 = new 붕어빵틀[100];

        while (true){
            // System.out.println(Arrays.toString(붕어빵트레이)); 배열 내 객체들 주소 확인
            for(int i = 0; i < 붕어빵트레이.length; i++){
                if(붕어빵트레이[i] != null){
                    System.out.println(붕어빵트레이[i].속재료);
                }
            }
            System.out.print("1.굽기 2.판매 : ");
            int ch = scanner.nextInt();

            if(ch==1){
                System.out.println("속재료 : ");
                String 입력속재료 = scanner.next();

                // 1. 객체 생성 : 1.new -> 2. 클래스/생성자()
                붕어빵틀 붕어빵 = new 붕어빵틀(); // (1개의 주소 생성)붕어빵 생성

                붕어빵.속재료 = 입력속재료;

                for(int i = 0; i < 붕어빵트레이.length; i++){
                    if(붕어빵트레이[i] == null){
                        붕어빵트레이[i] = 붕어빵; // if 끝나면 객체를 참조하는 변수는 사라지니까 얼른 객체의 참조주소를 옮긴다
                        break; // 트레이[배열]에 붕어빵을 넣었으면 끝
                    }
                }
            } // if 끝나면 '붕어빵'의 지역변수는 사라짐 => 곧 객체도 사라짐
            else if (ch==2){
                System.out.print("판매할 붕어빵 위치 : ");
                int dNo = scanner.nextInt();

                // - 자바는 힙영역에 객체를 제거 하는 방법을 제공하지 않는다. 그래서 초기화(null) 활용
                붕어빵트레이[dNo-1] = null;
                // - 만약 삭제할 객체 인덱스 뒤로 객체가 존재하면 한칸씩 옮기기
                for(int i = dNo-1; i < 붕어빵트레이.length-1; i++){
                    // i는 삭제한 객체의 인덱스 위치부터 마지막 인덱스까지 반복
                    if(i == 붕어빵트레이.length){ // 마지막인덱스이면 생략
                        break;
                    }
                    붕어빵트레이[i] = 붕어빵트레이[i+1]; // 뒤에 객체를 앞으로 이동
                }
            }
        }
    }
}
