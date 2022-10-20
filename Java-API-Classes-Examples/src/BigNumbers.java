import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static BigInteger factorial(int n) {
        var result = BigInteger.ONE;

        for(int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
