import java.util.TreeMap;

public class BigWord2 {
    public String most(String[] sentences) {

        TreeMap<String, Count> map = new TreeMap<>();
        for (String i : sentences) {
            String[] splt = i.split(" ");
            for (String k : splt) {
                boolean flag = false;
                String j = k.toLowerCase();
                if (map.containsKey(j)) {
                    map.get(j).num += 1;
                } else {
                    map.put(j, new Count(j));
                    map.get(j).num += 1;
                }

            }
        }
        int number = 0;
        String fin = null;
        for (String i : map.keySet()) {
            if (map.get(i).num > number) {
                number = map.get(i).num;
                fin = i;
            }

        }
        return fin;
    }

    private class Count {
        String Myname;
        int num;

        Count(String name) {
            Myname = name;
        }

    }
}
