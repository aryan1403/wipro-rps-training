import java.util.ArrayList;
import java.util.List;

public class empSys {
    public static void main(String[] args) {
        emp e1 = new emp("Aaryan", "Trainer", 100);
        emp e2 = new emp("Arush", "Developer", 1000);
        emp e3 = new emp("Ananya", "Trainee", 200);
        List<emp> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

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
    String name;
    String role;
    double salary;

    public emp(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp: {" + name + ", " + role + ", " + salary + "}";
    }
}
