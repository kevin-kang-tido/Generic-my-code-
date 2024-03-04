public class Test {
    static class USDToRiel {
        static double usdToRiel(double usd){
            return usd*4000;
        }
    }
    static class RielToUSD {
         static double rielToUSD(double riel){
            return riel/4000;
        }
    }
}
class Main2 {
    public static void main(String[] args) {
        System.out.println(String.format("%.4f",Test.RielToUSD.rielToUSD(2000000)));
        System.out.println(Test.USDToRiel.usdToRiel(20));
        System.out.println(Test.RielToUSD.rielToUSD(20000));
    }
}

