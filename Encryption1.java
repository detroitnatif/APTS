import java.util.HashMap;

public class Encryption {
    public String encrypt(String message){
        HashMap<Character, Character> charMap = new HashMap<Character, Character>();
        char[] letters = message.toCharArray();
        char currChar = 'a';

        for(int i = 0; i < letters.length; i++) {
            if(charMap.putIfAbsent(letters[i], currChar) == null) {
                currChar++;
            }
        }

        String ret = "";
        for(int i = 0; i < letters.length; i++) {
            ret += charMap.get(letters[i]);
        }

        return ret;
    }
}
