import java.util.*;

public class ListsEqual {
    public int equal(ListNode a1, ListNode a2) {
        ListNode first = a1;
        ListNode second = a2;
        List<Integer> compare1 = new ArrayList<>();
        List<Integer> compare2 = new ArrayList<>();
        while (first != null && first.next != null) {
            compare1.add(first.info);
            first = first.next;
        }
        while (second != null && second.next != null) {
            compare2.add(second.info);
            second = second.next;
        }
        if (compare1.equals(compare2)) {
            return 1;
        }

        return 0;
    }
}
