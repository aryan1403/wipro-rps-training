/**
 * basic
 */
public class basic {
    public static void main(String[] args) {
        // Variables
        int a = 5;
        long l = 4l;
        float b = 5.5f;
        double d = 32.456788;
        String str = "Aaryan is a trainer";
        char ch = 'a';
        boolean bool = true; // true/false

        // Constants --> value that cannot be changed
        final int a1 = 5;

        a = 4;
        // a1 = 6; // compile-time error
        System.out.println("Hello " + args[0]);   
        System.out.println(a);
    }
}