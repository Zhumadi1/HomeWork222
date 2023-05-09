import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arr.add(random.nextInt(1, 100));
        }
        System.out.println(arr);
        List<Integer> arrTak = new ArrayList<>();
        List<Integer> arrJup = new ArrayList<>();
        for (Integer integer : arr) {
            if (integer % 2 == 0) {
                arrJup.add(integer);
            } else {
                arrTak.add(integer);
            }
        }
        System.out.println("jup sandar:" + arrJup);
        System.out.println("tak sandar:" + arrTak);


    }
}