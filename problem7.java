public class problem7 {

    public static void main(String[] args) {
        // 10001 st prime number
        int count = 2;
        int i = 3;
        for (; count < 10001; ) {
            i += 2;
            if (EulerUtil.isPrime(i))
                count ++;
        }
        System.out.print(i);
    }
    
}
