import java.util.HashMap;
import java.util.Map;

public class mapex {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Phonebook
        map.put("Aaryan", 123456789);
        map.put("Arun", 1234);
        map.put("Arush", 56789);
        map.put("Ananya", 89);

        System.out.println(map.get("Aaryan"));
        map.containsKey("Aaryan");
        map.forEach((k, v) -> System.out.println(k + ": " + v));

        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);
    }
}
