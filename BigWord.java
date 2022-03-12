import java.util.*;

public class BigWord {
    public String most(String[] sentences) {
        for (int j = 0; j < sentences.length; j++) {
            sentences[j] = sentences[j].toLowerCase();
        }
        String w = sentences.toString();
        w = w.split(" ");
        List<String> m = Arrays.asList(sentences);

        return sentences[0];
    }
}