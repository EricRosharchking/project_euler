public class problem20 {
    public static void main(String[] args) {
        /*
        n! means n × (n − 1) × ... × 3 × 2 × 1

        For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
        and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

        Find the sum of the digits in the number 100!
        */

        BigInteger val = EulerUtil.getArrangeMfromN(100, 100);
        System.out.println(val);
        long result = 0;
        String str = val.toString();
        for (char c: str.toCharArray()) {
            result += Integer.parseInt(String.valueOf(c));
        }
        System.out.println(result);
    }
}
