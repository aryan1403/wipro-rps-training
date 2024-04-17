public class thex {
    public static void main(String[] args) {
        Thread th = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }
        };
        Thread th2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i * -1);
                }
            }
        };
        th.start();
        th2.start();
    }
}
