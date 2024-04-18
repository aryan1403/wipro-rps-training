import java.io.IOException;
import java.net.URL;

public class urlex {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://google.com");

            System.out.println(url.getHost());
            System.out.println(url.getContent().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
