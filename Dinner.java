import java.util.*;

public class Dinner {
    public String favorite(String[] available) {
        List<String> yes = new ArrayList<>();
        for (String i : available) {
            String[] u = i.split(" ");

            for (String j : u) {
                for (String q : available) {
                    String[] t = q.split(" ");

                }

            }

        }
        return "";
    }

    public static void main(String[] args) {
        Dinner test = new Dinner();
        String[] first = { "sushi pizza ramen", "sushi burgers", "lomein hotdogs" };
        String[] second = { "pizza ramen sushi", "", "sushi hotpot spaghetti" };
        System.out.println(test.favorite(first));
        System.out.println(test.favorite(second));

    }
}
