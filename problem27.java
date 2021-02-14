import java.util.List;

public class problem27 {
    public static void main(String[] args) {
        /*
         * Quadratic Primes
         */

        int a = 0;
        int b = 0;
        int numberOfPrimes = 0;
        List<Long> bList = EulerUtil.getPrimesBelow(999);

        // bList.clear();
        // bList.add(41L);
        for (long bPrime : bList) {
            for (int aPrime = -999; aPrime < 1000; aPrime++) {
                int n = 0;
                // System.out.println(EulerUtil.isPrime(41));
                for (; EulerUtil.isPrime(n * n + n * aPrime + bPrime); n++) {
                }
                if (numberOfPrimes < n) {
                    numberOfPrimes = n;
                    a = aPrime;
                    b = (int)bPrime;
                }
            }
        }

        System.out.println("a: "+a+", b: "+b+", numberOfPrimes"+numberOfPrimes);
        System.out.println(a*b);

    }
}
