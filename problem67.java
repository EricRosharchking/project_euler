import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem67 {
    public static void main(String[] args) {
        List<String[]> list = new ArrayList<>();

        try {  
            File file=new File("/Users/ly/Downloads/p067_triangle.txt");    //creates a new file instance  
            FileReader fr=new FileReader(file);   //reads the file  
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
            // StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
            String line;  
            while((line=br.readLine())!=null) {  
                    // sb.append(line);      //appends line to string buffer  
                    // sb.append("\n");     //line feed   
                    list.add(line.split(" "));
            }  
            fr.close();    //closes the stream and release the resources  
            // System.out.println("Contents of File: ");  
            // System.out.println(sb.toString());   //returns a string that textually represents the object  
        } catch(IOException e) {  
            e.printStackTrace();  
        }

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
            newList.add(list2.get(i) > list2.get(i + 1) ? list1.get(i) + list2.get(i) : list1.get(i) + list2.get(i+1));
        }
        return newList;
    }
}
