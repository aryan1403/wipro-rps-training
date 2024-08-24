package Singleton;

public class SingletonObj {
    private static SingletonObj obj = new SingletonObj();

    private SingletonObj() {} // to restrain creation of objects

    public static SingletonObj getInstance() {
        return obj;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton");
    }
}
