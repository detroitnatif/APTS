
public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        StringBuilder str = new StringBuilder();
        for (int i : rights) {
            if (i < minPermission) {
                str.append("D");
            } else {
                str.append("A");
            }

        }

        return str.toString();
    }

}
