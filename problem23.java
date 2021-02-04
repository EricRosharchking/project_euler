import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem23 {
    public static void main(String[] args) {
        /*
        
        */
        List<Long> abundantList = new ArrayList<>();
        for (long i = 1L; i <= 28123; i ++) {
            List<Long> list = EulerUtil.getDivisors(i);
            list.remove(i);
            Long abundantLong = 0L;
            for (long j: list) {
                abundantLong += j;
            }
            if (i < abundantLong) {
                abundantList.add(i);
            }
        }
        
        long result = 0L;
        Map<Long, String> sumMap = new HashMap<Long, String>();

        for (int i = 0; abundantList.get(i+1) + abundantList.get(i) <= 28123; i ++) {
            for (int j = i; abundantList.get(i) + abundantList.get(j) <= 28123; j ++) {
                sumMap.put(abundantList.get(i) + abundantList.get(j), "");
            }
        }
        for (long num = 1L; num <= 28123; num ++) {
            result += sumMap.keySet().contains(num) ? 0 : num;
        }
        System.out.println(result);
    }
}
