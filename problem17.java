public class problem17 {
    public enum tens {Twenty, Thirty, Forty, Fifty, Sixty, Seventy, Eighty, Ninety}
    public enum ones {One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Eleven, Twelve, Thirteen, Fourteen, Fifteen, Sixteen, Seventeen, Eighteen, Nineteen}

    public static void main(String[] args){
        int result = 0;
        for (int i = 1; i <= 1000; i ++)
            result += numberToWord(i).replace(" ", "").length();
        System.out.println(numberToWord(342).replace(" ", "").length());
        System.out.println(numberToWord(900).replace(" ", ""));
        result = result + 3 * 99 * 9;
        System.out.println(result);

    }

    public static String numberToWord(int number) {
        String word = "";
        if (number >= 1000) {
            word = numberToWord(number / 1000) + " thousand" + numberToWord(number % 1000);
        }else if (number >= 100) {
            word = numberToWord(number / 100) + " hundred " + numberToWord(number % 100);
        } else {
            word = numberToWordBelow100(number); 
        }

        return word;
    }

    public static String numberToWordBelow100(int number) {
        if (number == 0)
        return "";

        if (number <= 19)
            return ones.values()[number - 1].toString();
        else {
            return tens.values()[number / 10 - 2] + " " + numberToWordBelow100(number % 10);
        }
    }
}
