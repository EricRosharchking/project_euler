import java.util.ArrayList;
import java.util.List;

public class problem26 {
    public static void main(String[] args) {
        /*
        
        */

        int result = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 1000; i ++) {
            int j = 1;
            while ( !list.contains(1000 * j % i)) {
                j = getModulo(j, i);
                list.add(j);
            }
            result=result < list.size() ? i : result;
            list.clear();
        }
        System.out.println(result);
    }

    public static int getModulo(int i, int j) {
        int result = 0;

        result = i * 1000 % j;

        return result;
    }
}
