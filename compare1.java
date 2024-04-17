import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class compare1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Arush"));
        list.add(new Student(0, "Aaryan"));

        Collections.sort(list, (s1, s2) -> {
            if(s1.rollno < s2.rollno) {
                return -1; // swap
            }
            return 0;
        });
        Student maxStudent = list.stream().max((s1, s2) -> {
            if(s1.rollno < s2.rollno) {
                return -1; // swap
            }
            return 0;
        }).get();
        System.out.println("Highest rollno : " + maxStudent.name);
        list.forEach(System.out::println);
    }
}

class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", " + rollno;
    }
}