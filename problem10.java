public class problem10 {

    public static void main(String[] args) {

        // the sum of all the primes below two million.
        //142913828922
        long result = 0;
        for (long i = 2; i < 2000000; i += 1) {
            if (EulerUtil.isPrime(i)) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
