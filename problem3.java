public class problem3 {
    public static void main(String[] args) {
        // larget prime factor of 600851475143 
        long num =  906609;
        System.out.println(isPrime(num));
        System.out.println(notPrime(num));
    }

    public static long isPrime(long num) {
        double sqrt = Math.sqrt((double) num);
        long intermediate = num;
        for (int i = 2; i <= sqrt & intermediate >= sqrt;) {
            if (intermediate % i == 0) {
                intermediate /= i;
            } else {
                 i ++;
            }
        }
        return intermediate;
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