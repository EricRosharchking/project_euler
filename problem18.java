import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem18 {
    public static void main(String[] args) {
        /*
                      75
                     95 64
                    17 47 82
                   18 35 87 10
                  20 04 82 47 65
                 19 01 23 75 03 34
                88 02 77 73 07 63 67
               99 65 04 28 06 16 70 92
              41 41 26 56 83 40 80 70 33
             41 48 72 33 47 32 37 16 94 29
            53 71 44 65 25 43 91 52 97 51 14
           70 11 33 28 77 73 17 78 39 68 17 57
          91 71 52 38 17 14 91 43 58 50 27 29 48
         63 66 04 68 89 53 67 30 73 16 69 87 40 31
        04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
        */

        List<String[]> list = new ArrayList<>();

        /*String[] arr1 = */ list.add("75".split(" "));
        /*String[] arr2 = */ list.add("95 64".split(" "));
        /*String[] arr3 = */ list.add("17 47 82".split(" "));
        /*String[] arr4 = */ list.add("18 35 87 10".split(" "));
        /*String[] arr5 = */ list.add("20 04 82 47 65".split(" "));
        /*String[] arr6 = */ list.add("19 01 23 75 03 34".split(" "));
        /*String[] arr7 = */ list.add("88 02 77 73 07 63 67".split(" "));
        /*String[] arr8 = */ list.add("99 65 04 28 06 16 70 92".split(" "));
        /*String[] arr9 = */ list.add("41 41 26 56 83 40 80 70 33".split(" "));
        /*String[] arr10 =*/ list.add( "41 48 72 33 47 32 37 16 94 29".split(" "));
        /*String[] arr11 =*/ list.add( "53 71 44 65 25 43 91 52 97 51 14".split(" "));
        /*String[] arr12 =*/ list.add( "70 11 33 28 77 73 17 78 39 68 17 57".split(" "));
        /*String[] arr13 =*/ list.add( "91 71 52 38 17 14 91 43 58 50 27 29 48".split(" "));
        /*String[] arr14 =*/ list.add( "63 66 04 68 89 53 67 30 73 16 69 87 40 31".split(" "));
        /*String[] arr15 =*/ list.add( "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23".split(" "));

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        

        list2 = EulerUtil.getIntegersFromStrings(Arrays.asList(list.get(list.size()-1)));
        for (int i = list.size()-2; i >=0; i--) {
            list1 = getNewList(EulerUtil.getIntegersFromStrings(Arrays.asList(list.get(i))), list2);
            list2 = list1;
        }
        System.out.println(list1);

    }

    public static List<Integer> getNewList(List<Integer> list1, List<Integer> list2) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            // if (list2.get(i) > list2.get(i + 1)) {
            //     newList.add(list1.get(i) + list2.get(i));
            // } else {
            //     newList.add(list1.get(i) + list2.get(i+1));
            // }
            newList.add(list2.get(i) > list2.get(i + 1) ? list1.get(i) + list2.get(i) : list1.get(i) + list2.get(i+1));
        }
        return newList;
    }
}
