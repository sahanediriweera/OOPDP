import Listeners.EmailNotificationListener;
import Listeners.LogOpenListener;
import Editor.Editor;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.event.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.event.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}