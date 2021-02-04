import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class problem22 {
    public static void main(String[] args) {
        /*
        Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

        For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

        What is the total of all the name scores in the file?
        */

        List<String> names = new ArrayList<>();

        try {  
            File file=new File("/Users/ly/Downloads/p022_names.txt");    //creates a new file instance  
            FileReader fr=new FileReader(file);   //reads the file  
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
            int line;  
            int i = 0;
            String name = "";  
            while((line=br.read())!=-1 && i < 50) {  
                    char c = (char)line;
                    if ( c == '"' || c == ',') {
                        if (!name.isEmpty()) {
                            names.add(name);
                            name ="";
                        }
                    } else {
                        name += c;
                    }
            }  
            fr.close();    //closes the stream and release the resources  
        } catch(IOException e) {  
            e.printStackTrace();  
        }

        System.out.println(names.size());
        Collections.sort(names);
        long result = 0L;

        for (int i = 0; i < names.size(); i ++) {
            result += (i+1)*getNameScore(names.get(i));
        }
        System.out.println(result);
    }

    public static Integer getNameScore(String name) {
        int result = 0;
        result = name.chars().sum() - name.length() * ('A' - 1);
        return result;
    }
}
