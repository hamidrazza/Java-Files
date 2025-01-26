import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
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

            // Writing bytes in files
            Path anotherIso88591File = Files.createTempFile("some", ".txt");
            Files.write(anotherIso88591File, "this is my string ää öö üü".getBytes(StandardCharsets.ISO_8859_1));
            System.out.println("anotherIso88591File: "+anotherIso88591File);

            // Reading the files
            String s = Files.readString(utfFile);
            System.out.println("String: " + s);

            s = Files.readString(utfFile, StandardCharsets.ISO_8859_1);
            System.out.println("String: " + s);

            // Reading Bytes
            s = new String(Files.readAllBytes(utfFile), StandardCharsets.ISO_8859_1);
            System.out.println("Reading bytes: " + s);

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }


        // Moving, Deleting, Listing the Files
        try {
            Path newUtfFile = Files.createTempFile("some", ".txt");

            // Files.move(newUtfFile, Path.of("D:/Coding Tutorial/Java API"), null); // This is wrong way!
            Files.move(newUtfFile, Path.of("D:/Coding Tutorial/Java API").resolve(newUtfFile.getFileName().toString()));

            // Other options to move files
            Files.move(newUtfFile, Path.of("D:/Coding Tutorial/Java API").resolve(newUtfFile.getFileName().toString()), StandardCopyOption.REPLACE_EXISTING); // This will replace the existing one file.

            // This will move a file into a directory and be guaranteed that any process watching the directory accesses a complete file and not just a partial file.
            Files.move(newUtfFile, Path.of("D:/Coding Tutorial/Java API").resolve(newUtfFile.getFileName().toString()), StandardCopyOption.ATOMIC_MOVE);

            // Deleting the files            

        } catch (IOException e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}