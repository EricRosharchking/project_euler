import java.util.ArrayList;
import java.util.List;

public class problem14 {
    public static void main(String[] args) {
        Collatz collatz = new Collatz();
        int result = 0;
        long element = 999999L;
        for (long num = 999999L; num >= 500000; num--) {
            int size = collatz.getCollatzSequence(num).size();
            if (result < size) {
                result = size;
                element = num;
            }
        }
        System.out.println(element);
        System.out.println(result);
    }
}

class Collatz {

    public Collatz() {}
    
    public List<Long> getCollatzSequence(Long element) {
        List<Long> sequence =  new ArrayList<>();
        while (element > 1) {
            sequence.add(element);
            element = getNext(element);
        }
        sequence.add(1L);
        return sequence;
    }

    private Long getNext(Long element) {
        if (element % 2 == 1) {
            return (element * 3 + 1);
        }
        return element /= 2;
    }
}
