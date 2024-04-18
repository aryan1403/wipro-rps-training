public class lambdaDemo {
    public static void main(String[] args) {
        inLambda in = () -> System.out.println("Talking");

        ShapeArea sa = (side) -> side * side;

        int area = sa.sqArea(10);
        System.out.println("Area: " + area);

    }
}

interface ShapeArea {
    int sqArea(int side);
}

interface inLambda {
    void talk();
}
