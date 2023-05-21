import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileNameStore implements Database {

    private static final String FILE_NAME = "name_store.txt";

    @Override
    public String GetData(String id) {
        try{
            Path of = Path.of(FILE_NAME);
            List<String> lines = Files.readAllLines(of);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void StoreData(String id, String name) {
        try{
            Files.writeString(Path.of(FILE_NAME),id+","+name, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
