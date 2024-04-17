import java.util.ArrayList;
import java.util.List;

public class compare1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Arush", new Marks(90, 95, 62)));
        list.add(new Student(0, "Aaryan", new Marks(91, 100, 63)));

        /* Collections.sort(list, (s1, s2) -> {
            if(s1.marks.avg() < s2.marks.avg()) {
                return -1; // swap
            }
            return 0;
        }); */
        Student maxStudent = list.stream().max((s1, s2) -> {
            if(s1.marks.avg() < s2.marks.avg()) {
                return -1; // swap
            }
            return 0;
        }).get();
        System.out.println("Highest marks : " + maxStudent.name);
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