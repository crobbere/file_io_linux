package be.intecbrussel.ios_streams.byte_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamApp {
    public static void main(String[] args) {

        String sourceFile = "input.txt";
        String destFileName = "output.txt";

        try {
            try (FileOutputStream out = new FileOutputStream(destFileName);
                 FileInputStream in = new FileInputStream(sourceFile)) {
                int c;
                while((c = in.read()) != -1){
                    out.write(c);
                }
                System.out.println("Data taken from: " + sourceFile + " and written in: " + destFileName);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
