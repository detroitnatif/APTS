import java.util.*;

public class Common {
    public int count(String a, String b) {
        ArrayList<Character> a1 = new ArrayList<>();
        ArrayList<Character> b1 = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            a1.add(a.charAt(i));
        }
        for (int i = 0; i < a.length(); i++) {
            b1.add(b.charAt(i));
        }
        a1.retainAll(b1);
        Set<Character> output = new HashSet<Character>(a1);

        return output.size();
    }
}
