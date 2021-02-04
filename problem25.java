import java.math.BigInteger;

public class problem25 {
    
    public static void main(String[] agrs) {   
        BigInteger num = new BigInteger("0");
        int i = 1;
        for (i = 1; num.toString().length() < 1000; i ++) {
            num = num.add(EulerUtil.getFibonacci(i));
        }
        System.out.println(i+1);
    }
}
