import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class empSys {
    public static void main(String[] args) {
        emp e1 = new emp(UUID.randomUUID().toString(), "Aaryan", "Trainer", 100);
        emp e2 = new emp(UUID.randomUUID().toString(), "Arush", "Developer", 1000);
        emp e3 = new emp(UUID.randomUUID().toString(), "Ananya", "Trainee", 200);
        List<emp> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        Set<String> sid = list.stream().map(e -> e.id).collect(Collectors.toSet());
        sid.forEach(System.out::println);

        // TODO: Filter emp where salary > 100
        // list.stream().filter(e -> e.role.equals("Trainer")).forEach(System.out::println);
        
        // TODO: sort them by salary
        list.stream().sorted((e, ee) -> {
            if(e.salary < ee.salary) {
                return -1; // swap
            }
            return 0; // don't swap
        }).forEach(System.out::println);
    }
}

// Model
class emp {
    String id;
    String name;
    String role;
    double salary;

    public emp(String id, String name, String role, double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp: {" + id + ", " + name + ", " + role + ", " + salary + "}";
    }
}
