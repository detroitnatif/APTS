import java.util.*;

public class PairDown {

    public int[] fold(int[] list) {
        ArrayList<Integer> out = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (i % 2 != 0) {
                out.add(list[i] + list[i - 1]);
            }

        }
        if (list.length % 2 == 1) {
            out.add(list[list.length - 1]);
        }

        int[] s = new int[out.size()];
        for (int i = 0; i < s.length; i++) {
            s[i] = out.get(i).intValue();
        }
        // System.out.println(s);
        return s;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        PairDown test = new PairDown();
        int[] result = test.fold(nums);
        System.out.println(result);
    }
}