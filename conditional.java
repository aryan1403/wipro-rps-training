public class conditional {
    public boolean isEligible(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    // if, else, if else
    public static void main(String[] args) {
        // comparision operators
        boolean b = 2 > 3;
        b = 2 == 3;
        b = 2 >= 1;
        b = 3 != 6;

        // logical operators
        b = (2 > 1) && (3 < 4); // AND (&&) --> both the conditions must be true ? true : false
        // b = (4 != 4) && ( 5 < 3);

        b = (2 > 3) || (4 < 5); // OR (||) --> atleast one condition must be true ? true : false
        b = (2 > 3) || (4 > 5);

        int a = 6;
        int c = 6;

        if(a < c) {
            System.out.println("ok");
        } else if(a == c) {
            System.out.println("both are equal");
        } else {
            System.out.println("no");
        }

        conditional c1 = new conditional();
        c1.isEligible(19);
    }
}
