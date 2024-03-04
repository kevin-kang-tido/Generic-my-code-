package TestingCode;



public class ExchangeMoney {
    static class KhmerToUs{
        static double khmerExchangeToUS(double khmer){
            return khmer / 4000;
        }

    }
    static  class USToKhmer{
        static double usMoneyToKhmer(double usMoney){

            return usMoney* 4000;
        }
    }

}
class SuperMan {
    public static void main(String[] args) {
        System.out.println(ExchangeMoney.KhmerToUs.khmerExchangeToUS(4000.0));
        System.out.println(ExchangeMoney.USToKhmer.usMoneyToKhmer(1.0));

    }
}



