import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
    public static void main(String args[]) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/home/techvidvan/file.txt");
            int k;
            while ((k = fis.read()) != -1) {
                System.out.println((char) k);
            }
            fis.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("The specified file is not present at the given path");
        } catch (IOException ioe) {
            System.out.println("I/O error occurred: " + ioe);
        }
    }
}
