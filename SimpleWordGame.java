import java.util.*;
import java.lang.Math;

public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) {
        int counter = 0;
        Set<String> ret = new HashSet<>(Arrays.asList(player));
        ArrayList<String> srt = new ArrayList<>(ret);
        Collections.sort(srt);
        for (int i = 0; i < ret.size(); i++) {
            for (String j : dictionary) {
                if (srt.get(i).equals(j)) {
                    counter += Math.pow(srt.get(i).length(), 2);

                }
            }
        }
        return counter;
    }
}
