import java.util.Arrays;

public class str {
    public static void main(String[] args) {
        String s = "Aaryan is a Trainer\nAaryan is also a Developer\nOkay a Java Trainer";
        s.length();
        s.startsWith("Aa");
        s.endsWith("na");
        System.out.println(s.trim());
        char[] ch = s.toCharArray();
        char[] ch1 = {'a', 'b', 'c'};
        
        // compare ch & ch1
        Arrays.equals(ch, ch1);
        System.out.println(Arrays.binarySearch(ch, 'n'));
        Arrays.sort(ch);
        
        s.indexOf('n');
        System.out.println(s.substring(1, 5));
        s.split(" ");
        System.out.println(s.split(" ")[3]);

        s.lines()
            .map(line -> line.replace("Aaryan", "Arush"))
            .forEach(System.out::println);


    }
}
