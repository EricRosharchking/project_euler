import java.util.Arrays;
import java.util.List;

public class problem11 {
    public static void main(String[] args) {
        List<String> list0 = Arrays.asList("08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08".split(" "));
        List<String> list2 = Arrays.asList("49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00".split(" "));
        List<String> list1 = Arrays.asList("81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65".split(" "));
        List<String> list3 = Arrays.asList("52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91".split(" "));
        List<String> list4 = Arrays.asList("22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80".split(" "));
        List<String> list5 = Arrays.asList("24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50".split(" "));
        List<String> list6 = Arrays.asList("32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70".split(" "));
        List<String> list7 = Arrays.asList("67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21".split(" "));
        List<String> list8 = Arrays.asList("24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72".split(" "));
        List<String> list9 = Arrays.asList("21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95".split(" "));
        List<String> list10 = Arrays.asList("78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92".split(" "));
        List<String> list11 = Arrays.asList("16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57".split(" "));
        List<String> list12 = Arrays.asList("86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58".split(" "));
        List<String> list13 = Arrays.asList("19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40".split(" "));
        List<String> list14 = Arrays.asList("04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66".split(" "));
        List<String> list15 = Arrays.asList("88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69".split(" "));
        List<String> list16 = Arrays.asList("04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36".split(" "));
        List<String> list17 = Arrays.asList("20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16".split(" "));
        List<String> list18 = Arrays.asList("20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54".split(" "));
        List<String> list19 = Arrays.asList("01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48".split(" "));

        List[] listArray = {list0, list1, list2, list3, list4, list5, list6, list7, list8, list9,
                            list10, list11, list12, list13, list14, list15, list16, list17, list18, list19};

        long result = 0;
        for (int i = 0; i <= 19; i ++) {
            for (int j = 0; j <= 19; j ++) {
                long prod1 = 0;
                long prod2 = 0;
                long prod3 = 0;
                long prod4 = 0;
                if (j <= 16) 
                // {
                //     int a = Integer.parseInt((String)listArray[i].get(j));
                //     int b = Integer.parseInt((String)listArray[i].get(j + 1));
                //     int c = Integer.parseInt((String)listArray[i].get(j + 2));
                //     int d = Integer.parseInt((String)listArray[i].get(j + 3));
                //     prod1 = a * b * c * d;
                //     if (prod1 > 0)
                //         System.out.println(a + "\t * " +  b + "\t * " +  c + "\t * " +  d + "\t= " +prod1);
                // } 
                    prod2 = Integer.parseInt((String)listArray[i].get(j)) * Integer.parseInt((String)listArray[i].get(j + 1)) 
                                * Integer.parseInt((String)listArray[i].get(j + 2)) * Integer.parseInt((String)listArray[i].get(j + 3));
                
                if (j <= 16 && i <= 16) 
                // {
                //     int a = Integer.parseInt((String)listArray[i].get(j));
                //     int b = Integer.parseInt((String)listArray[i + 1].get(j + 1));
                //     int c = Integer.parseInt((String)listArray[i + 2].get(j + 2));
                //     int d = Integer.parseInt((String)listArray[i + 3].get(j + 3));
                //     prod2 = a * b * c * d;
                //     if (prod2 > 0)
                //         System.out.println(a + "\t * " +  b + "\t * " +  c + "\t * " +  d + "\t= " +prod2);
                // }
                    prod2 = Integer.parseInt((String)listArray[i].get(j)) * Integer.parseInt((String)listArray[i + 1].get(j + 1)) 
                                * Integer.parseInt((String)listArray[i + 2].get(j + 2)) * Integer.parseInt((String)listArray[i + 3].get(j + 3));
                
                if (i <= 16) 
                // {
                //     int a = Integer.parseInt((String)listArray[i].get(j));
                //     int b = Integer.parseInt((String)listArray[i + 1].get(j));
                //     int c = Integer.parseInt((String)listArray[i + 2].get(j));
                //     int d = Integer.parseInt((String)listArray[i + 3].get(j));
                //     prod3 = a * b * c * d;
                //     if (prod3 > 0)
                //         System.out.println(a + "\t * " +  b + "\t * " +  c + "\t * " +  d + "\t= " +prod3);
                // }
                    prod3 = Integer.parseInt((String)listArray[i].get(j)) * Integer.parseInt((String)listArray[i + 1].get(j)) 
                                * Integer.parseInt((String)listArray[i + 2].get(j)) * Integer.parseInt((String)listArray[i + 3].get(j));
                
                if (i >= 3 && j <= 16) 
                // {
                //     int a = Integer.parseInt((String)listArray[i].get(j));
                //     int b = Integer.parseInt((String)listArray[i - 1].get(j + 1));
                //     int c = Integer.parseInt((String)listArray[i - 2].get(j + 2));
                //     int d = Integer.parseInt((String)listArray[i - 3].get(j + 3));
                //     prod4 = a * b * c * d;
                //     if (prod4 > 0)
                //         System.out.println(a + "\t * " +  b + "\t * " +  c + "\t * " +  d + "\t= " +prod4);
                // }
                    prod4 = Integer.parseInt((String)listArray[i].get(j)) * Integer.parseInt((String)listArray[i - 1].get(j + 1)) 
                                * Integer.parseInt((String)listArray[i - 2].get(j + 2)) * Integer.parseInt((String)listArray[i - 3].get(j + 3));

                if (result < prod1)
                    result = prod1;
                if (result < prod2)
                    result = prod2;
                if (result < prod3)
                    result = prod3;
                if (result < prod4)
                    result = prod4;
            }
        }
        System.out.println(result);
    }
}