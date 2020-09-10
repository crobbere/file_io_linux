package be.intecbrussel.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class app {
    public static void main(String[] args) {
        Path destDir = Paths.get("home/christophe/Data/folder1/");
        Path destFile = destDir.resolve("testing.txt");
        try {
            Files.createDirectories(destDir);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            MyFileUtil.checkIfFileExistsElseCreate(destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            MyFileUtil.writeSomething(destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stream<String> content = null;
        try {
            content = Files.lines(destFile);
            content.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            assert content != null;
            content.close();
        }

        try {
            Files.copy(destFile, Paths.get(String.valueOf(destDir.resolve("copy_text2.txt").toUri())));
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            Files.deleteIfExists(destDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
