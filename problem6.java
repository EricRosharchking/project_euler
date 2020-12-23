public class problem6 {
    public static void main(String[] args) {
        int n = 100;
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i <= n; i ++) {
            num1 += i*i;
            num2 += i;
        }
        int result = num2*num2 - num1;
        System.out.println(result);

    }
}
