import java.util.*;

public class Prefix {
    public String[] group(String[] words) {
        Arrays.sort(words);
        Map<String, ArrayList<String>> m = new TreeMap<String, ArrayList<String>>();
        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            boolean f = false;
            for (String j : m.keySet()) {
                if (m.get(j).contains(words[i])) {
                    f = true;
                }

            }
            if (f == false) {
                m.put(words[i], new ArrayList<String>());
                m.get(words[i]).add(words[i]);
                for (int k = 0; k < words.length; k++) {
                    if (i != k && isPrefix(words[i], words[k])) {
                        m.get(words[i]).add(words[k]);

                    }
                }
            }

        }
        // if no words share the same prefix return original array\
        boolean flag = false;

        for (String f : m.keySet()) {
            if (m.get(f).size() > 1) {
                flag = true;
                break;
            }

        }
        if (!flag) {
            return words;
        }

        // else
        String[] ret = new String[m.keySet().size()];
        ArrayList<String> arr = new ArrayList<String>();
        Set<String> keys = m.keySet();
        for (String key : keys) {
            arr.add(String.join(" ", m.get(key)));
        }
        for (int x = 0; x < ret.length; x++) {
            ret[x] = arr.get(x);
        }
        return ret;

    }

    public boolean isPrefix(String prefix, String word) {
        if (word.length() < prefix.length()) {
            return false;

        }
        return prefix.equals(word.substring(0, prefix.length()));

    }
}