public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] y = new int[matches.length];
        for (int i = 0; i < matches.length; i++) {
            char[] u = matches[i].toCharArray();
            for (int s = 0; s < u.length; s++) {
                if (u[s] == 'W') {
                    y[i] += 3;
                } else if (u[s] == 'L') {
                    y[s] += 3;
                } else if (u[s] == 'D') {
                    y[i] += 1;
                    y[s] += 1;
                }
            }
        }

        return y;
    }
}
