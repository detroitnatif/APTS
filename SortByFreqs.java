import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {
        Map<String, Num> map = new HashMap<>();
        for (String i : data) {
            map.putIfAbsent(i, new Num(i));
            map.get(i).n += 1;

        }
        System.out.println(map);

        ArrayList<Num> vals = new ArrayList<>(map.values());
        System.out.println(vals);
        Comparator<Num> v = Comparator.comparing(Num::getNum).reversed().thenComparing(Num::getName);
        Collections.sort(vals, v);
        String[] ret = new String[vals.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = vals.get(i).toString();
        }
        return ret;
    }

    private class Num {
        String Wname;
        int n;

        private Num(String name) {
            Wname = name;
        }

        public int getNum() {
            return n;
        }

        public String getName() {
            return Wname;
        }

        @Override
        public String toString() {
            return String.format("%s", Wname);
        }
    }

    public static void main(String[] args) {
        SortByFreqs test = new SortByFreqs();
        String[] sam = { "a", "a", "a", "b", "c", "c" };
        String[] out = test.sort(sam);
        System.out.println(Arrays.toString(out));
    }

}
