import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class problem5 {
    public static void main(String[] args) {
        // 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
        // find the least common multiple of integers from 1 to 20;
        // find the least common multiple of two integers and interate

        List<Long> resultList = new ArrayList<>();
        for (int num = 2; num <= 10; num++) {
            System.out.print("for num " + num);
            List<Long> numPrimeFactorList = getAllPrimeFactors(num);
            Collections.sort(numPrimeFactorList);
            int index = 0;
            for (; index < resultList.size() && index >= 0; index ++) {
                int jndex = 0;
                for (; jndex < numPrimeFactorList.size() && jndex >= 0; jndex ++) {
                    long factor = numPrimeFactorList.get(jndex);
                    if (factor == resultList.get(index)) {
                        numPrimeFactorList.remove(jndex);
                        jndex --;
                        index ++;
                        System.out.println("removed " + factor);
                    }
                }
            }
            // System.out.println(numPrimeFactorList);
            // System.out.println(resultList);
            resultList.addAll(numPrimeFactorList);
            // System.out.println(resultList);
            Collections.sort(resultList);
        }
        System.out.println(getProduct(resultList));
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
