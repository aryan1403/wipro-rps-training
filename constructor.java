public class constructor {
    // method with class name & no return type
    constructor() {
        System.out.println("Object created");
    }
    constructor(int a) {
        System.out.println("a = " + a);
    }
    public static void main(String[] args) {
        constructor c = new constructor(5); // create obj --> constructor is called
    }
}
