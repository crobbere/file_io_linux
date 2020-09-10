package be.intecbrussel.FileSystem;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.attribute.UserPrincipalLookupService;

public class FileSystemApp {
    public static void main(String[] args) {

        final String NEW_LINE = "\n";

        FileSystem fileSystem = FileSystems.getDefault();

        System.out.println("Separated by: " + fileSystem.getSeparator());

        // what are the root dirs

        fileSystem.getRootDirectories()
                  .forEach(System.out::println);
        System.out.println(NEW_LINE + "System is read only: " + fileSystem.isReadOnly() + NEW_LINE);

        System.out.println(NEW_LINE + "Access levels on root: ");
        fileSystem.supportedFileAttributeViews()
                  .forEach(System.out::println);

        UserPrincipalLookupService userLookUp = fileSystem.getUserPrincipalLookupService();

        try {
            System.out.println("Check out this user: " + userLookUp.lookupPrincipalByName("Christophe"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
