import java.util.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> s = new ArrayList<>();

        for (String i : list) {
            if (i.length() >= minLength && !s.contains(i)) {
                s.add(i);

            }

        }
        String[] str = s.toArray(new String[s.size()]);

        return str;
    }

}

