import java.util.*;

public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        int[] freqs = new int[strands.length];
        int[] lens = new int[strands.length];

        for (int i = 0; i < strands.length; i++) {
            char[] a = strands[i].toCharArray();
            for (char j : a) {
                if (j == nuc.charAt(0)) {
                    freqs[i] += 1;
                }
            }

        }
        int sum = 0;
        for (int p : freqs) {
            sum = sum + p;
        }
        if (sum == 0) {
            return "";
        }
        for (int k = 0; k < strands.length; k++) {
            lens[k] = strands[k].length();
        }
        int lnum = 0;
        int l = 0;
        int idx = 0;

        int[] mxNum = new int[strands.length];
        for (int q = 0; q < strands.length; q++) {
            if (freqs[q] >= lnum && lens[q] > l) {
                lnum = freqs[q];
                l = lens[q];
                idx = q;

            }

        }
        return strands[idx];
    }

}