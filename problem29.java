import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class problem29 {
    
    public static void main(String[] args) {
        /*
         *
         */
        Map<BigInteger, String> map = new HashMap<>();

        // for (int num = 3; num <= 100; num++) {
            int num = 100;
            for (int a = 2; a <= num; a++) {
                for (int b = 2; b <= num; b++) {
                    BigInteger number = BigInteger.valueOf(a);
                    for (int i = 1; i < b; i++) {
                        number = number.multiply(BigInteger.valueOf(a));
                    }
                    map.put(number, "");
                }
            }
        // }
        System.out.println(map.keySet().size());
    }
}
