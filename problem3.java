public class problem3 {
    public static void main(String[] args) {
        // larget prime factor of 600851475143 
        long num =  600851475143l;
        System.out.print(isPrime(num));
    }

    public static long isPrime(long num) {
        double sqrt = Math.sqrt((double) num);
        long intermediate = num;
        for (int i = 2; i <= sqrt & intermediate >= sqrt; i ++) {
            if (intermediate % i == 0) {
                intermediate /= i;
            }
        }
        return intermediate;
    }
}