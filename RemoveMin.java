import java.util.*;

public class RemoveMin {
    public ListNode remove(ListNode list) {
        ListNode a = list, prev = null;
        List<Integer> f = new ArrayList<>();
        while (a != null) {
            f.add(a.info);
            a = a.next;

        }

        Collections.sort(f);
        return delete(list, f.get(0));
    }

    public ListNode delete(ListNode b, int key) {
        ListNode q = b, pre = null;
        if (q != null && q.info == key) {
            b = q.next;
            return b;
        }
        while (q != null && q.info != key) {
            pre = q;
            q = q.next;
        }
        if (q == null) {
            return b;
        }

        return q;
    }

}
