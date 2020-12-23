import java.util.ArrayList;
import java.util.List;

public class EulerUtil {

    //Test method
    public static void main(String[] args) {
        long num = 1;

        System.out.println(getMaxPrimeFactor(num));
    }

    public static long getMaxPrimeFactor(long num) {
        double sqrt = Math.sqrt((double) num);
        long result = num;
        for (int i = 2; i < result && i <= sqrt;) {
            if (result % i == 0) {
                result /= i;
            } else {
                 i ++;
            }
        }
        return result;
    }

    public static long getMinPrimeFactor(long num) {
        for (long i = 2; i <= num; i ++) {
            if (num % i ==0) {
                return i;
            }
        }
        return num;
    }

    public static boolean isPrime(long num) {
        if (num == getMaxPrimeFactor(num)) {
            return true;
        }
        return false;
    }

    public static List<Long> getAllPrimeFactors(long num) {
        List<Long> resultList = new ArrayList<>();
        long factor = 0;
        for (; 1 < num; num /= factor) {
            factor = EulerUtil.getMaxPrimeFactor(num);
            resultList.add(factor); //auto wrapped long -> Long
        }
        return resultList;
    }

    public static long getProduct(List<Long> list) {
        long result = 1;
        for (int i = 0; i < list.size(); i ++) {
            result *= list.get(i);
        }
        return result;
    }
}
