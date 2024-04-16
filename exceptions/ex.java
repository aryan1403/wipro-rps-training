package exceptions;

public class ex {
    public static void main(String[] args) {
        int res = 3 / 0;
        String[] arr = {"a", "b", "c"};
        try {
            System.out.println(arr[4]);
            System.out.println(res);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hello Aaryan");
    }
}
