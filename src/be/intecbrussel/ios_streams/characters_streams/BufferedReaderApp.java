package be.intecbrussel.ios_streams.characters_streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderApp {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("MyTextFile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader)){
        String line = null;

        while((line = bufferedReader.readLine()) != null){
            if(line.trim().equals("")){
                line = "\n\t\t\t **** oooOoh whitespaces *** \n";
            }
            System.out.println(line);
        }
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
