import javax.swing.*;

public class GUI implements UI{

    @Override
    public void show() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JCalculator();
            }
        });
    }
}
