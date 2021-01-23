import java.security.interfaces.EdECKey;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class problem14 {
    public static void main(String[] args) {
        // Collatz collatz = new Collatz();
        // int result = 0;
        // long element = 999999L;
        // for (long num = 999999L; num >= 500000; num--) {
        //     int size = collatz.getCollatzSequence(num).size();
        //     if (result < size) {
        //         result = size;
        //         element = num;
        //     }
        // }
        // System.out.println(element);
        // System.out.println(result);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        try {
            for (long num = 999999L; num >= 549999; num -= 50000) {
                executorService.submit(new Collatz(num));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public static void calculate(Long element) {

    }
}

class Collatz implements Runnable{

    private Long firstLong;
    private Long lastLong;

    public Collatz(Long firstLong) {
        this.firstLong = firstLong;
        lastLong = firstLong - 50000;
    }
    
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

    public void run() {
        int result = 0;
        long element = firstLong;
        for (long num = firstLong; num >= lastLong; num--) {
            int size = getCollatzSequence(num).size();
            if (result < size) {
                result = size;
                element = num;
            }
        }
        System.out.println(result + ", " + element);
    }
}
