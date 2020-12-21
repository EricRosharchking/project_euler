public class problem2 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int k = i + j;
        int result = 0;
        for (; k < 4000000; ) {
            if (k % 2 == 0) {
                result += k;
            }
        i = j;
        j = k;
        k = i + j;
        }

        System.out.println(result);
    }
}