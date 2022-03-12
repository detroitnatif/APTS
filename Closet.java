import java.util.*;

public class Closet {
    public String anywhere(String[] list) {
        Set<String> s = new HashSet<>();
        StringBuilder o = new StringBuilder();
        ArrayList<String[]> let = new ArrayList<>();
        for (String i : list) {
            let.add(i.split(" "));
        }
        for (String[] j : let) {
            for (String k : j) {
                s.add(k);
            }

        }
        Collections.sort(s);
        Iterator iter = s.iterator();
        while (iter.hasNext()) {
            o.append(iter.next());
            if (iter.hasNext()) {
                o.append(" ");
            }
        }

        return o.toString();
    }
    // return o.toString();

    public static void main(String[] args) {
        String[] g = { "a b c d", "b c d", "b c d e", "b c f" };
        Closet test = new Closet();
        String result = test.anywhere(g);
        System.out.println(result);

    }
}