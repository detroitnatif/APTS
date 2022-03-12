import java.util.*;

public class SetAside1 {
    public String common(String[] list) {
        Set<Character> s = new HashSet<>();
        StringBuilder o = new StringBuilder();
        for (String i : list) {
            char[] a = i.toCharArray();
            for (int j = 0; j < i.length(); j++) {
                s.add(a[j]);
                for (char k : s) {
                    o.append(k);
                    o.append(" ");

                }
            }

        }
        String fin = new String(o);
        return fin;
    }
}

/*
 * public static void main(String[] args) {
 * String[] let = { "a b c d", "b c d", "b c d e", "b c f" };
 * SetAside1 test = new SetAside1();
 * String result = test.common(let);
 * System.out.println(result);
 * 
 * }
 * }
 */