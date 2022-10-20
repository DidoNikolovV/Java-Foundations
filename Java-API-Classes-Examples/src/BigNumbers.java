import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
//        System.out.println(factorial(5));

        var a = new BigDecimal("5000000000.0000000037328");
        var b = new BigDecimal("0000000000.0000000000001");
        System.out.println(a.add(b));
    }

//    static BigInteger factorial(int n) {
//        var result = BigInteger.ONE;
//
//        for(int i = 2; i <= n; i++) {
//            result = result.multiply(BigInteger.valueOf(i));
//        }
//
//        return result;
//    }
}
