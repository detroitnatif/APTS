public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        String[] s = str.split(" ");

        int[] t = new int[words.length];

        for (int o = 0; o < words.length; o++) {
            String q = words[o];
            for (String c : s) {
                if (q.equals(c)) {
                    t[o]++;
                }
            }
        }
        return t;
    }
}
