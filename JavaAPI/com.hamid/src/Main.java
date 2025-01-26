import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("D:\\Coding Tutorial\\Java API\\demo.txt");
        System.out.println(path);

        // Checking file existence
        boolean exist = Files.exists(path);
        System.out.println("Exists: " + exist);

        // Throws the IOException
        try{
            // Last update of the file
            FileTime lastUpdate = Files.getLastModifiedTime(path);
            System.out.println("Last updation of the file: " + lastUpdate);

            // Comparing the two files
            long misMatchIndex = Files.mismatch(path, Path.of("D:/Coding Tutorial/Java API/demo2.txt"));
            System.out.println("Mismatch: " + misMatchIndex);

            // Get the owner of the file
            UserPrincipal owner = Files.getOwner(path);
            System.out.println("Owner: " + owner);

            // Creating the temporary files
            Path tempFile1 = Files.createTempFile("somePrefixOrNull",".jpg");
            System.out.println("TempFile1: " + tempFile1);
            // Defining our own directory instead of Default temp files Directory.
            Path tempFile2 = Files.createTempFile(path.getParent(), "somePrefixOrNull",".jpg");
            System.out.println("TempFile2: " + tempFile2);
            // Creating the Temporary Directory
            Path tempDir = Files.createTempDirectory("prefix");
            System.out.println("TempDirectory: " + tempDir);

            // Now creating the Files and Directory
            Path newDir = Files.createDirectories(path.getParent().resolve("DemoDir/Dir"));
            System.out.println("Created new Directory: "+newDir);
            Path newFiles = Files.createFile(newDir.resolve("emptyFile.txt"));
            System.out.println("Created new File: "+newFiles);

            // Getting the Posix permissions
            Set<PosixFilePermission> permissions = Files.getPosixFilePermissions(path);
            System.out.println("Permissions : " + permissions);

            //

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        // Writing & Reading Files
        try{
            Path utfFile = Files.createTempFile("some",".txt");
            Files.writeString(utfFile,"this is my string ää öö üü"); //UTF 8
            System.out.println("Utf File: " + utfFile);

            Path iso88591File = Files.createTempFile("some", ".txt");
            Files.writeString(iso88591File, "this is my string ää öö üü", StandardCharsets.ISO_8859_1);
            System.out.println("iso88591File : " + iso88591File);

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}