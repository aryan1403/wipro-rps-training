import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class jserver {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream input = null;

    public jserver(int port) {
        try {
            server = new ServerSocket(port);

            System.out.println("Server started");
            socket = server.accept(); // enable client to join the server

            input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
    
            String data = input.readLine(); // data
    
            System.out.println("Data received: " + data);

            // socket.close();
            // input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        jserver sJserver = new jserver(8080);
    }
}
