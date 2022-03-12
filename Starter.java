import java.util.*;

public class Starter {
    public int begins(String[] words, String first) {
        int sum = 0;
        Set<String> unique = new HashSet<>(Arrays.asList(words));
        for (String word : unique) {
            if (word.startsWith(first)) {
                sum++;
            }
        }
        return sum;
    }
}
