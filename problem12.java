import java.util.ArrayList;
import java.util.List;

public class problem12 {

    public static void main(String[] args) {
        // So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
        // 28 is the first triangle number to have over five divisors
        // what is the value of first triangle number to have over five hundred divisors
        long numOfDivisor = 0;
        long triangleNum = 1;
        long n = 1;
        for (; numOfDivisor <= 500; n ++) {
            triangleNum = n * (n + 1) / 2;
            numOfDivisor = getDivisors(triangleNum).size();
        }
        System.out.println(triangleNum);
        System.out.println(EulerUtil.getAllPrimeFactors(triangleNum));
    }

    public static long getChooseMfromN(long m, long n) {
        long result = 1;
        for (long i = n; i >= m && i > n - m + 1; i --) {
            result *= i;
            result /= (n - i + 1);
        }
        return result;
    }

    public static long getArrangeMfromN(long m, long n) {
        long result = 1;
        for (long i = n; i >= m; i --) {
            result *= i;
        }
        return result;
    }

    public static List<Long> getDivisors(long num) {
        List<Long> resultList = new ArrayList<>();
        for (long i = 1; i < Math.sqrt(num); i ++) {
            if (num % i == 0) {
                resultList.add(i);
                resultList.add(num / i);
            }
        }
        if (Math.sqrt(num) % 1 == 0)
            resultList.add((long)Math.sqrt(num));

        return resultList;
    }
}
