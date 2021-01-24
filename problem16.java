import java.math.BigDecimal;

public class problem16 {
    public static void main(String[] args) {
        /*
        2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
        What is the sum of the digits of the number 2^1000?
        */
        BigDecimal bd = new BigDecimal(2);
        String str = bd.pow(1000).toPlainString();
        long result = 0L;
        for (char digit: str.toCharArray()) {
            result += Integer.valueOf(String.valueOf(digit));
        }

        System.out.println(result);

        //10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983788156958581275946729175531468251871452856923140435984577574698574803934567774824230985421074605062371141877954182153046474983581941267398767559165543946077062914571196477686542167660429831652624386837205668069376
        
    }
}
