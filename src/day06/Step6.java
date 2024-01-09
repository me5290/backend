package day06;

import java.util.Scanner;

public class Step6 {
    public static void main(String[] args) {
        // 3. 전화번호부 만들기
        Scanner scanner = new Scanner(System.in);
        
        String 전화번호부 = "";
        
        while (true){
//            for(int i = 0; i < (전화번호부.length()); i++){
//                if(phoneBook[i] != null){
//                    System.out.printf("%2s %7s %15s\n",i+1,phoneBook[i],phoneBook[i+1]);
//                }
//            }

            System.out.println("1.전화번호 등록 | 2.전화번호 삭제");
            System.out.print("선택> ");


            String ch = scanner.nextLine();

            if(ch.equals("1")){
                System.out.print("이름과 전화번호사이에 띄어쓰기를 입력해주세요. : ");
                // 전화번호부 += name + ' '+phone +'/'
                // 전화번호부.split('/').split(" ")[0] 1
                // 전화번호부.split('/').lenght;
                전화번호부 = scanner.nextLine();
                String[] phoneBook = 전화번호부.split(" ");
                String[] name = {phoneBook[0]};
                String[] number = {phoneBook[1]};
                String num1 = number[0].substring(0,3);
                String num2 = number[0].substring(3,7);
                String num3 = number[0].substring(7,11);
                number = new String[]{num1 + "-" + num2 + "-" + num3}; // 이승호 010213123 ,


                System.out.println("============ 전화번호부 ============");
                System.out.printf("%s %5s %10s\n","순번","이름","전화번호");

                for(int i = 0; i < 전화번호부.length(); i++) {
                    System.out.printf("%2s %7s %15s\n", i + 1, name[i], number[i]);
                }

            }else if(ch.equals("2")){
                System.out.print("삭제할 번호 순번 선택 : ");
                int del = scanner.nextInt();
                for(int i = 0; i < 전화번호부.length(); i++){
                    if(del == i+1){

                    }
                }
            }else{
                break;
            }

        }
    }
}
