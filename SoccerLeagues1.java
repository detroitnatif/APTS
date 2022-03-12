public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] ret = new int[matches.length];
        for(int i = 0; i < matches.length; i++) {
            char[] curr = matches[i].toCharArray();
            for(int j = 0; j < curr.length; j++) {
                if(curr[j] == 'W') {
                    ret[i] += 3;
                } else if(curr[j] == 'L') {
                    ret[j] += 3;
                } else if(curr[j] == 'D') {
                    ret[i] += 1;
                    ret[j] += 1;
                }
            }
        }

        return ret;
    }
}
