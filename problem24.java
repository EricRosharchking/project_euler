import java.util.List;

public class problem24 {
    
    public static void main(String[] args) {
        List<Character> list = EulerUtil.getCharsFromString("0123456789");
        String str = "";
        long val = 1000000L -1;
        for (int i = 10; i > 0; i --) {
            long l = EulerUtil.getArrangeMfromN(i, i).longValue();
            System.out.print(i + ":" + val/l);
            if (val >= l) {
                System.out.print(":"+val%l);
                str += list.get((int)(val/l));
                list.remove((int)(val/l));
                val %=l;
            }
            System.out.println();
        }
        for (char c: list) {
            str += c;
        }
        System.out.println(str);
    }
}
