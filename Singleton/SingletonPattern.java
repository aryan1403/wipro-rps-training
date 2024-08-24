package Singleton;

public class SingletonPattern {
    public static void main(String[] args) {
        SingletonObj sObj = SingletonObj.getInstance();

        sObj.showMessage();
    }
}
