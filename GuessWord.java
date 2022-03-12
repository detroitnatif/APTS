import java.util.*;

public class GuessWord {
    public int getPoints(String word, String target) {
        int count = 0;
        char[] wo = word.toCharArray();
        char[] ta = word.toCharArray();

        Set<Character> w = new HashSet<>();
        Set<Character> t = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            w.add(wo[i]);
            for (int j = 0; j < word.length(); j++) {
                w.add(ta[j]);
                if (w.contains(j)) {
                    count += 1;
                }
                if (word.charAt(i) == target.charAt(i)) {
                    count += 1;
                }

            }
        }

        return count;
    }
}
