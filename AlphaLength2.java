import java.util.TreeSet;
import java.util.*;

public class AlphaLength2 {
    public ListNode create(String[] words) {
        TreeSet<String> tree = new TreeSet<>();
        for (String a : words) {
            tree.add(a);
        }
        ListNode n1 = new ListNode(words[0].length());
        ListNode n2 = n1;

        for (String s : tree) {
            n2.next = new ListNode(s.length());
            n2 = n2.next;
        }
        n1 = n1.next;

        return n1;
    }
}