import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        Set<String> e = new HashSet<>();
        Set<String> q = new HashSet<>(Arrays.asList(club1));
        Set<String> y = new HashSet<>(Arrays.asList(club2));
        Set<String> k = new HashSet<>(Arrays.asList(club3));

        e.addAll(i(q, y));
        e.addAll(i(y, k));
        e.addAll(i(q, k));

        String[] finalList = e.toArray(new String[0]);
        Arrays.sort(finalList);
        return finalList;
    }

    private Set<String> i(Set<String> s1, Set<String> s2) {
        Set<String> intersect = new HashSet<>();
        intersect.addAll(s1);
        intersect.retainAll(s2);
        return intersect;
    }
}
