import java.util.HashMap;

public class Encryption {
    public String encrypt(String message) {
        HashMap<Character, Character> charMap = new HashMap<Character, Character>();
        char[] l = message.toCharArray();
        char w = 'a';

        for (int i = 0; i < l.length; i++) {
            if (charMap.putIfAbsent(l[i], w) == null) {
                w++;
            }
        }

        String d = "";
        for (int e = 0; e < l.length; e++) {
            d += charMap.get(l[e]);
        }

        return d;
    }
}
