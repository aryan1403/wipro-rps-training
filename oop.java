public class oop {
    public static void main(String[] args) {
        B obj = new B();
        obj.start();
        obj.drink();
    }
}

class A { // parent class
    void start() {

    }
}

class B extends A implements in { // child class

    @Override
    public void walk() {
        System.out.println("Walking");
    }

    @Override
    public void talk() {
        System.out.println("Talking");
    }

    @Override
    public void drink() {
        System.out.println("Drinking");
    } 

}

interface in {
    void walk();
    void talk();
    void drink();
}
