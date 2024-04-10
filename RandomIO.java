package javaProgram;

import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomIO {
    public static void main(String args[]) throws IOException {
        RandomAccessFile file = new RandomAccessFile("myfile.dat", "rw");
        file.writeChar('S');
        file.writeInt(2222);
        file.writeDouble(22.22);
        file.seek(0); // Moving the file pointer to the beginning
        System.out.println(file.readChar());
        System.out.println(file.readInt());
        System.out.println(file.readDouble());
        file.seek(2); // Moving the file pointer to the 2nd item
        System.out.println(file.readInt());
        file.seek(file.length());
        file.writeBoolean(true);
        file.seek(4); // Moving the file pointer to the 4th item
        System.out.println(file.readBoolean());
        file.close();
    }
}
