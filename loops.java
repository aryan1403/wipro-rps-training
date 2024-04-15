public class loops {
    public static void table(int num) {
        // 1 -- 10
        for (int i = 1; i <= 10; i++) {
            if(i == 6) {
                break; // exit the loop
            }
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
    // to do a task repeatedly over a given condition
    public static void main(String[] args) {
        // for i
        // for each
        // while -- do while

        // initialization --> condition ? true (exec) -- increment/dec : false (terminate)
        // 0 -- 9
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello Aaryan " + (i+1));
        }
        // 0 -- 4
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        table(6);

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            // increment/dec
            i++;
        }
    }
}
