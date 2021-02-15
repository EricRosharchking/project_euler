import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem {
    public static void main(String[] args) {
        /*
         *
         */
        Map<Long, String> map = new HashMap<>();

        for (int num = 3; num <= 5; num++) {
            for (int a = 2; a <= num; a++) {
                for (int b = 2; b <= num; b++) {
                    long number = a;
                    for (int i = 1; i < b; i++) {
                        number *= a;
                    }
                    map.put(number, "");
                }
            }
            // for (int key: map.keySet()) {
            // System.out.print(key + " ");
            // }
            System.out.println(num + ":\t " + (num-1) * (num-1) + ":\t " + map.keySet().size());
        }
        System.out.println(map.keySet().size());
    }
}