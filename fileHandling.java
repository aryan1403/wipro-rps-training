import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
        // Read
        File f = new File("./names1.txt");
        try {
            f.createNewFile(); // create
            f.deleteOnExit(); // delete
            FileWriter fw = new FileWriter(f);
            fw.append("Aaryan is a Trainer");
            
            fw.close();
        } catch (IOException e) {
            System.out.println("File not found");
            // e.printStackTrace();
        }
    }
}
