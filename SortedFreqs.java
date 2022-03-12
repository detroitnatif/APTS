import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {

        Comparator<String> comp = Comparator.naturalOrder();
        Arrays.sort(data, comp);

        Map<String, Integer> map = new TreeMap<>();
        for (String i : data) {
            map.putIfAbsent(i, 0);
            map.put(i, map.get(i) + 1);
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Map.Entry<String, Integer>[] ent = entrySet.toArray(new Map.Entry[entrySet.size()]);
        int[] vals = new int[ent.length];

        for (int j = 0; j < map.size(); j++) {
            vals[j] = ent[j].getValue();

        }
        return vals;
    }

    public static void main(String[] args) {
        SortedFreqs test = new SortedFreqs();
        String[] vals = { "apple", "pear", "cherry", "apple", "cherry", "pear", "apple", "banana" };
        System.out.println(test.freqs(vals));
    }
}
