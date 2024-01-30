package day21;

public class Click implements Button.ClickListener{
    @Override
    public void onClick(){
        System.out.println("[구현 객체응 이용한] ok버튼을 클릭했습니다.");
    }
}
