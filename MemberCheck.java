import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        Set<String> u = new HashSet<>();
        Set<String> r = new HashSet<>(Arrays.asList(club1));
        Set<String> y = new HashSet<>(Arrays.asList(club2));
        Set<String> a = new HashSet<>(Arrays.asList(club3));

        u.addAll(i(r, y));
        u.addAll(i(y, a));
        u.addAll(i(r, a));

        String[] io = u.toArray(new String[0]);
        Arrays.sort(io);
        return io;
    }

    private Set<String> i(Set<String> s1, Set<String> s2) {
        Set<String> intersect = new HashSet<>();
        intersect.addAll(s1);
        intersect.retainAll(s2);
        return intersect;
    }
}
