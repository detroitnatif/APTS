public class Anonymous {
    private int[] getCounts(String[] strings) {
        int[] counts = new int[300];
        for(String s : strings) {
            for(char ch : s.toLowerCase().toCharArray()) {
                counts[ch] ++;
            }
        }
        return counts;
    }
    
    public int howMany(String[] headlines, String[] messages) {
        int numPos = 0;
        int[] countHead = getCounts(headlines);
        for(String s : messages) {
            String[] stringArr = s.toLowerCase().split(" ");
            int[] messageCount = getCounts(stringArr);
            int flag = 0;

            for(char i = 'a'; i <= 'z'; i++) {
                if(messageCount[i] > countHead[i]) {
                    flag = 1;
                }
            }

            if(flag == 0) {
                numPos++;
            }
        }


        return numPos;
    }
    
}