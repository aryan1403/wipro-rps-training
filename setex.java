import java.util.HashSet;
import java.util.Set;

public class setex {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(2);
        set.add(3);
        set.add(45);

        set.add(2);

        System.out.println(set);
    }
}
