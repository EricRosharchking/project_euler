public class problem3 {
    public static void main(String[] args) {
        // larget prime factor of 600851475143 
        long num = 600851475143l;
        System.out.println(EulerUtil.getMaxPrimeFactor(num));
    }

    public static long isPrime(long num) {
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

    public static long notPrime(long num) {
        for (long i = 2; i <= num; i ++) {
            if (num % i ==0) {
                return i;
            }
        }
        return num;
    }
}