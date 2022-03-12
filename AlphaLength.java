import java.util.*;
import java.io.*;

public class AlphaLength {
    public ListNode create(String[] words) {
        Set<String> uni = new TreeSet<>();
        for (String i : words) {
            uni.add(i);

        }

        List<String> sort = new ArrayList<>(uni);
        Collections.sort(sort);
        ListNode start = new ListNode(sort.get(0).length());
        ListNode ret = start;
        for (int i = 1; i < uni.size(); i++) {
            start.next = new ListNode(sort.get(i).length());
            start = start.next;

        }
        return ret;
    }

    public static void main(String[] args) {
        AlphaLength test = new AlphaLength();
        String[] str = { "dog", "cat", "fish", "horse" };
        ListNodeUtil.printList(test.create(str));
    }

}
