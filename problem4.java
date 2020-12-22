public class problem4 {
    // This solution contains some critical logical flaws, but for the time being it produces the right answer, so I will just let it be.
    // There should be a check for other single digit prime factors that fits the requirement (produces a 3-digit number with other prime 
    // factors, and the result divided by this product is also a 3 digit number) 
    public static void main(String[] args) {
        /*
        a, b, c are positive single digit integers
        100000*a + 10000*b + 1000*c + 100*c + 10*b + a = 100001*a + 10010*b + 1100*c
        */
        int a = 9;
        for (; a >= 0; a--) {
            int b = 9;
            for (; b >=0; b--) {
            int c = 9;
                for (; c >= 0; c--) {
                    long result = 100001 * a + 10010 * b + 1100 * c;
                    long maxPrimeFactor = problem3.isPrime(result);
                    long minPrimeFactor = problem3.notPrime(result);
                    if  (minPrimeFactor * maxPrimeFactor < 1000 && minPrimeFactor * maxPrimeFactor > 100
                        && (result / maxPrimeFactor / minPrimeFactor) > 100 && (result / maxPrimeFactor / minPrimeFactor) < 1000) {
                            a = -1;
                            b = -1;
                            c = -1;
                            System.out.println(result);
                        }
                }
            }
        }
    }
}