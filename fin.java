@FunctionalInterface
interface in { // functional interface - 1 method inside them
    void start();
}

public class fin {
    public static void main(String[] args) {
        in obj = new in() {
            @Override
            public void start() {
                System.out.println("Started");
            }
        };
        obj.start();
    }
}

/* class impl implements in {
    @Override
    public void start() {
        System.out.println("Started");    
    }
} */