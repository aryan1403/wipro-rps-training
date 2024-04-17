import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class compare1 {
    public static int check(String s) {
        int sum = 0;
        //Aaryan
        //Arush
        // logic
        for(char ch : s.toCharArray()) {
            sum += (int) ch;
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Arush", new Marks(90, 95, 62)));
        list.add(new Student(0, "Aaryan", new Marks(91, 100, 63)));
        list.add(new Student(1, "Sumit", null));
        list.add(new Student(0, "Riya", null));

        // (sum) -> this function
        // Aryan, Zeon --> A,Z
        Collections.sort(list, (s1, s2) -> {
            if(s1.name.charAt(0) < s2.name.charAt(0)) {
                return -1;
            }
            /* if(check(s1.name) < check(s2.name)) {
                return -1; // swap
            } */
            return 0;
        });

        System.out.println(list);
        /* Student maxStudent = list.stream().max((s1, s2) -> {
            // return s1.name.compareTo(s2.name);
            if(s1.marks.avg() < s2.marks.avg()) {
                return -1; // swap
            }
            return 0;
        }).get(); */
        // System.out.println("Highest marks : " + maxStudent.name);
        // list.forEach(System.out::println);
    }
}

class Student {
    int rollno;
    String name;
    Marks marks;

    Student(int rollno, String name, Marks marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", " + rollno;
    }
}

class Marks  {
    int pmarks;
    int cmarks;
    int mmarks;

    public Marks(int pmarks, int cmarks, int mmarks) {
        this.pmarks = pmarks;
        this.cmarks = cmarks;
        this.mmarks = mmarks;
    }

    public double avg() {
        return (pmarks + cmarks + mmarks) / 3;
    }

    @Override
    public String toString() {
        return "Marks [pmarks=" + pmarks + ", cmarks=" + cmarks + ", mmarks=" + mmarks + "]";
    }
}