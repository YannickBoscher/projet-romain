import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listAppend = new ArrayList<>();
        listAppend.add("ligne 1");
        listAppend.add("ligne2");
        listAppend.add("ligne3");
        Path path = Paths.get("testa.txt");
        boolean exists = Files.exists(path);
        if (!exists){
            Files.createFile(path);
            Files.write(path,listAppend, StandardOpenOption.APPEND);
            List<String> lines = Files.readAllLines(path);
            System.out.println(lines);
        }
        Files.delete(path);
    }

}
