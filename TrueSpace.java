import java.util.*;

public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long output = 0;
        List<String> myList = new List<>();
        for (int i : sizes) {
            double u = (double) i;
            double p = clusterSize * Math.ceil(u / clusterSize);
            long z = (long) p;
            output = output + z;
        }
        return output;
    }
}
