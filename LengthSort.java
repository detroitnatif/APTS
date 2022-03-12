import java.util.Comparator;

import java.util.*;

public class LengthSort {
    public String[] rearrange(String[] values) {
        Comparator<String> comp = Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder());
        Arrays.sort(values, comp);
        return values;
    }

}
