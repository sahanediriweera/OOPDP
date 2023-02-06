import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UI ui = UIFactory.create(args);
        ui.show();
    }
}