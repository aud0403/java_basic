package poly.ex.pay1;

public class PayService {

    private Pay pay;


    public void setPay(Pay pay) {
        this.pay = pay;
    }

    public void processPay(String option, int amount) {
        if(option.equals("kakao")) {
             pay = new KakaoPay();
            setPay(pay);
        }else if (option.equals("naver")) {
            pay = new NaverPay();
        }else{
            pay = new DefaultPay();
        }
       // setPay(pay);
        pay.pay(amount);
    }
}
