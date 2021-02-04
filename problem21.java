import java.util.ArrayList;
import java.util.List;

public class problem21 {
    public static void main(String[] args) {
        /*
        Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
        If d(a) = b and d(b) = a, where a <> b, then a and b are an amicable pair and each of a and b are called amicable numbers.
        For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220
        Evaluate the sum of all the amicable numbers under 10000.
        */
        List<Long> amicableList = new ArrayList<>();
        for (long i = 1L; i < 10000; i ++) {
            if (amicableList.contains(i)) {
                continue;
            }
            List<Long> list = EulerUtil.getDivisors(i);
            list.remove(i);
            Long amicableLong = 0L;
            for (long j: list) {
                amicableLong += j;
            }
            if (i == amicableLong) {
                continue;
            }
            list = EulerUtil.getDivisors(amicableLong);
            list.remove(amicableLong);
            Long sum = 0L;
            for (long j: list) {
                sum += j;
            }
            if (i == sum) {
                amicableList.add(i);
                amicableList.add(amicableLong);
            }
        }
        System.out.println(amicableList);

        long x = 0L;
        for (long l: amicableList) {
            x += l;
        }
        System.out.println(x);
    }
}
