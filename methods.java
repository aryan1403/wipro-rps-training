public class methods {
    // function/method --> static/non-static
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void task() {
        System.out.println("Task 1 started");
        System.out.println("Task1 completed");
    }

    // non-static function
    public int product(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        System.out.println("Result: " + sum(a, b));
        task();
        // new keyword
        methods obj = new methods();
        System.out.println("Product: " + obj.product(a, b));
    }
}
