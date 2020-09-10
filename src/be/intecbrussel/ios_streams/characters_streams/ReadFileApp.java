package be.intecbrussel.ios_streams.characters_streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileApp {
    public static void main(String[] args) {
        try(FileReader fReader = new FileReader("MyTextFile.txt")) {
            int character;
            while((character = fReader.read()) != -1){
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
