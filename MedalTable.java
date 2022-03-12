import java.util.HashMap;

import java.util.*;

public class MedalTable {

    public String[] generate(String[] results) {
        Map<String, Medal> map = new HashMap<>();
        for (int i = 0; i < results.length; i++) {
            String[] a = results[i].split(" ");
            for (int j = 0; j < 3; j++) {
                if (!map.containsKey(a[j])) {
                    map.put(a[j], new Medal(a[j]));

                }
                if (j == 0) {
                    map.get(a[j]).gold += 1;
                }
                if (j == 1) {
                    map.get(a[j]).silver += 1;

                }
                if (j == 2) {
                    map.get(a[j]).bronze += 1;

                }

            }
        }

        ArrayList<Medal> vals = new ArrayList<>(map.values());
        Comparator<Medal> names = Comparator.comparing(Medal::getname);
        Comparator<Medal> golds = Comparator.comparing(Medal::getgold).reversed();
        Comparator<Medal> silvers = Comparator.comparing(Medal::getsilver).reversed();
        Comparator<Medal> bronzes = Comparator.comparing(Medal::getbronze).reversed();
        Comparator<Medal> comp = golds.thenComparing(silvers).thenComparing(bronzes)
                .thenComparing(names);
        Collections.sort(vals, comp);
        String[] ret = new String[vals.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = vals.get(i).toString();
        }
        return ret;
    }

    private class Medal {
        String countryname;
        int gold;
        int silver;
        int bronze;

        private Medal(String name) {
            countryname = name;

        }

        public String getname() {
            return countryname;
        }

        public int getgold() {
            return gold;
        }

        public int getsilver() {
            return silver;
        }

        public int getbronze() {
            return bronze;
        }

        @Override
        public String toString() {
            return String.format("%s %d %d %d", countryname, gold, silver, bronze);

        }
    }
}