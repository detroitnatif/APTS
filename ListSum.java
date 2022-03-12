import java.util.*;

public class ListSum {
    public int sum(ListNode list, int thresh) {
        ListNode current = list;
        int count = 0;
        while (current != null) {
            if (current.info > thresh) {
                count += current.info;
                current = current.next;
            }

        }
        return count;
    }
}