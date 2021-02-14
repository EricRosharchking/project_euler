public class problem28 {
    public static void main(String[] args) {
        /*
         * Number spiral diagonals 
         * 21 22 23 24 25 
         * 20 7  8  9  10 
         * 19 6  1  2  11 
         * 18 5  4  3  12 
         * 17 16 15 14 13
         */
        
         long result = 0;
         for (int i = 0;  2 * i + 1 <= 1001; i ++) {
             int tmp = (2 * i + 1)*(2 * i + 1);
             result += (4 * tmp - 6 * 2 * i);
         }
         System.out.println(result - 3);

    }
}
