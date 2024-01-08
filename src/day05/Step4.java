package day05;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        // 199P 확인문제 9
        Scanner scanner = new Scanner(System.in);

        int[] student = new int[0];

        while (true){
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------");

            System.out.print("선택> ");
            String ch = scanner.nextLine();

            if(ch.equals("1")){
                System.out.print("학생수> ");
                String count = scanner.nextLine();
                student = new int[Integer.parseInt(count)];
            }else if(ch.equals("2")){
                for(int i = 0; i < student.length; i++){
                    System.out.printf("scores[%d]> " , i);
                    student[i] = Integer.parseInt(scanner.nextLine());
                }
            }else if(ch.equals("3")){
                for(int i = 0; i < student.length; i++){
                    System.out.printf("scores[%d]: %d\n" , i , student[i]);
                }
            }else if(ch.equals("4")){
                int max = 0;
                int sum = 0;

                for(int i = 0; i < student.length; i++){
                    if(student[i] >= max){
                        max = student[i];
                    }
                    sum += student[i];
                }
                System.out.println("max = " + max);

                double avg = sum/ student.length;
                System.out.printf("avg = %.1f \n" , avg);
            }else if(ch.equals("5")){
                System.out.println("프로그램 종료");
                break;
            }else{

            }

        }
    }
}
