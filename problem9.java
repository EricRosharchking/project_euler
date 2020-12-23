public class problem9 {
    public static void main(String[] args) {

        // Exactly one Pythagorean triplet for which a + b + c = 1000.
        // Find the product abc.
        // a + b + c = 1000 -> c = 1000 - a - b
        // c > b >= a;
        // a, b, c >= 1;
        // a + b > c -> a + b > 1000 - a - b -> a + b > 500
        // a+b>500>c>b>=a 
        for (int a = 1; a < 500; a ++) {
            for (int b = 501 - a; b < 500 && a < b; b ++) {
                int c = 1000 - a - b;
                if ( a * a + b * b == c * c) {
                    System.out.println(a * b * c);
                }
            }
        }
    }
}