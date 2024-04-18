import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class jclient {
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;

    // 127.0.0.1 --> localhost
    jclient(String addr, int port) {
        try {
            socket = new Socket(addr, port);
            System.out.println("Connected");

            output = new DataOutputStream(socket.getOutputStream());
            // takes the input
            /* input = new DataInputStream(System.in);

            // output

            String data = input.readLine(); // "Hello world"
            output.writeUTF(data);

            input.close();
            output.close();
            socket.close(); */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String takeInput() {
        input = new DataInputStream(System.in);

        try {
            return input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "Error";
        }
    }

    public void sendMessage(String msg) {
        try {
            output.writeUTF(msg);
            System.out.println("msg sent: " + msg);
        } catch (IOException e) {
            System.out.println("Failed sending msg");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        jclient cJclient = new jclient("127.0.0.1", 8080);
        while (true) {
            System.out.println("1. Send Message");
            System.out.println("2. Exit the server");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String msg = cJclient.takeInput();
                    cJclient.sendMessage(msg);
                    break;
                case 2:
                    System.out.println("Exiting the server");
                    sc.close();
                    cJclient.input.close();
                    cJclient.output.close();
                    cJclient.socket.close();
                    break;
                default:
                    break;
            }
        }
    }
}
