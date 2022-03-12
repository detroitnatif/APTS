public class Anonymous {

    public int howMany(String[] headlines, String[] messages) {
        int v = 0;
        int[] ct = what(headlines);
        for (String g : messages) {
            String[] ar = g.toLowerCase().split(" ");
            int[] mc = what(ar);
            int d = 0;

            for (char n = 'a'; n <= 'z'; n++) {
                if (mc[n] > ct[n]) {
                    d = 1;
                }
            }

            if (d == 0) {
                v++;
            }
        }

        return v;
    }

    private int[] what(String[] strings) {
        int[] f = new int[200];
        for (String s : strings) {
            for (char letter : s.toLowerCase().toCharArray()) {
                f[letter]++;
            }
        }
        return f;
    }

}