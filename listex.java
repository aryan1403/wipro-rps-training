import java.util.ArrayList;
import java.util.List;

public class listex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(23);
        list.add(45);
        list.add(56);

        /* System.out.println(list.get(2));
        System.out.println(list.toString());
        System.out.println(list.remove(2));
        System.out.println(list.size());
        System.out.println(list.contains(24));
        // list.clear(); // flush the list
        System.out.println(list.isEmpty()); */

        // -> lambda | functional interfaces
        // list.forEach(e -> System.out.println(e));
        list.forEach(System.out::println);

        // Method refrencing --> System.out :: println (e)
    }
}
