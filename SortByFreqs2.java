import java.util.*;

public class SortByFreqs2 {
    public String[] sort(String[] data) {
        Map<String, Integer> map = new TreeMap<>();
        for (String i : data) {

            map.putIfAbsent(i, 0);
            map.put(i, map.get(i) + 1);

        }
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Collections.reverseOrder(Comparator.comparing(Map.Entry::getValue)));
        String[] ret = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i).getKey();
        }
        return ret;
    }

    public static void main(String[] args) {
        SortByFreqs test = new SortByFreqs();
        String[] sam = { "a", "a", "a", "b", "c", "c" };
        String[] out = test.sort(sam);
        System.out.println(Arrays.toString(out));
    }
}
