package day09;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankApplication[] Acccount = new BankApplication[100];
        int money = 0;
        boolean play = true;

        while (play){
            System.out.println("-------------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
            System.out.println("-------------------------------------");

            System.out.print("선택> ");
            int ch = scanner.nextInt();
            scanner.nextLine();

            if(ch == 1){
                System.out.println("-----------");
                System.out.println("계좌생성");
                System.out.println("-----------");

                System.out.print("계좌번호: ");
                String number = scanner.nextLine();
                System.out.print("계좌주: ");
                String name = scanner.nextLine();
                System.out.print("초기입금액: ");
                int firstMoney = scanner.nextInt();

                money += firstMoney;

                BankApplication newBank = new BankApplication(number,name,money);

                for(int i = 0; i < Acccount.length; i++){
                    if(Acccount[i] == null){
                        Acccount[i] = newBank;
                        break;
                    }
                    newBank.makeBank();
                }
            }else if(ch==2){
                System.out.println("-----------");
                System.out.println("계좌목록");
                System.out.println("-----------");

                for(int i = 0; i < Acccount.length; i++){
                    if(Acccount[i] != null){
                        System.out.printf("%s %8s %8d\n", Acccount[i].계좌번호 , Acccount[i].계좌주 , Acccount[i].잔액);
                    }else {
                        break;
                    }
                }
            }else if(ch==3){
                System.out.println("-----------");
                System.out.println("예금");
                System.out.println("-----------");

                System.out.print("계좌번호: ");
                String inputBank = scanner.nextLine();
                System.out.print("예금액: ");
                int inputMoney = scanner.nextInt();

                for(int i = 0; i < Acccount.length; i++){
                    if(Acccount[i].계좌번호.equals(inputBank) && Acccount[i].계좌번호 != null){
                        Acccount[i].잔액 += inputMoney;
                        System.out.println("결과 : 입금이 성공되었습니다.");
                    }else{
                        System.out.println("계좌번호가 일치하지 않거나 없습니다.");
                        break;
                    }
                }
            }else if(ch==4){
                System.out.println("-----------");
                System.out.println("출금");
                System.out.println("-----------");

                System.out.print("계좌번호: ");
                String outputBank = scanner.nextLine();
                System.out.print("출금액: ");
                int outputMoney = scanner.nextInt();

                for(int i = 0; i < Acccount.length; i++){
                    if(Acccount[i].계좌번호.equals(outputBank) && Acccount[i].계좌번호 != null){
                        Acccount[i].잔액 -= outputMoney;
                        System.out.println("결과 : 출금이 성공되었습니다.");
                    }else{
                        System.out.println("계좌번호가 일치하지 않거나 없습니다.");
                        break;
                    }
                }
            }else if(ch==5){
                System.out.println("프로그램 종료");
                play = false;
            }
        }
    }
}
