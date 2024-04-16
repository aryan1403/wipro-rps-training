public class sc {
    public static void main(String[] args) {
        // menu-driven program
        int choice = 10;
        // 1 --> start
        // 2 --> resume
        // 3 --> stop

        /* if(choice == 1) {

        } else if(choice == 2) {

        } else if(choice == 3) {
            
        } else {
            System.out.println("Wrong choice");
        } */

        switch (choice) {
            case 1:
                System.out.println("1 selected, started");
                break;
            case 2:
                System.out.println("2 selected, resumed");
                break;
            case 3:
                System.out.println("3 selected, stopped");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
