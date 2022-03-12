import java.util.*;

public class SyllableSort {
    public String[] sortWords(String[] words) {
        for (String i : words) {
            ArrayList<String> syl = new ArrayList<>();
            for (int j = 0; j < i.length(); j++) {
                if (isVowel(i.charAt(j))) {
                    for (int k = j; k < i.length(); k++) {
                        if (!isVowel(i.charAt(k))) {
                            syl.add(i.substring(j, k));

                        }

                    }

                }

            }
            String [] ret = new String[syl.size()];
            return ret.

        }
        
    }

    public boolean isVowel(char j) {
        if (j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u') {
            return true;

        }
        return false;
    }

}
