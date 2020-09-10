package be.intecbrussel.ios_streams.characters_streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WriteFileApp {
    public static void main(String[] args) {

//        Scanner kbd = new Scanner(System.in);
//
//        while(true){
//            try{
//                int choice = kbd.nextInt();
//            }catch (InputMismatchException im){
//                kbd.next();
//                im.printStackTrace();
//            }
//        }

        try (FileWriter fileWriter = new FileWriter("MyTextFile.txt");
             FileWriter fWriter = new FileWriter("SecondFile.txt")){
            fileWriter.write("Hello");
            fileWriter.write(" World!");
            fWriter.write("seg saluukes he.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
