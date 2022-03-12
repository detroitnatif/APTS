public class Totality {
    public int sum(int[] a, String stype) {
        int fin = 0;
        if (stype.equals("even")) {
            for (int i = 0; i < a.length; i++) {
                if (i % 2 == 0) {
                    fin += a[i];
                }
            }
        } else if (stype.equals("odd")) {
            for (int i = 0; i < a.length; i++) {
                if (i % 2 != 0) {
                    fin += a[i];
                }
            }

        } else {
            for (int i : a) {
                fin += i;
            }
        }
        return fin;
    }
}
