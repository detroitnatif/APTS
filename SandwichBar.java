import java.util.*;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders) {
        Set<String> ava = new HashSet<>(Arrays.asList(available));
        // turn the available items into an array and eliminate repeats
        for (int i = 0; i < orders.length; i++) {
            // split up each order, and also hash it
            Set<String> a = new HashSet<>(Arrays.asList(orders[i].split(" ")));
            // copy this same thing in memory
            HashSet<String> copy = new HashSet<>(a);
            // retainAll leaves only the overlap, in this case between ingredients and
            // availale items
            a.retainAll(ava);
            // retainAll alters the array, and if this size is the same as before all the
            // ingredidents hit as matches
            if (a.size() == copy.size()) {
                // return the index
                return i;
            } else {
                continue;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        String[] testAva = { "ham", "cheese", "mustard" };
        String[] testOrder = { "ham cheese" };
        SandwichBar testInstance = new SandwichBar();
        int result = testInstance.whichOrder(testAva, testOrder);
        System.out.println(result);
    }
}
