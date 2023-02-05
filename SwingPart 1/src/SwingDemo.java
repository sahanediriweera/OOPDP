import javax.swing.*;

public class SwingDemo {
    SwingDemo(){
        JFrame jFrame = new JFrame("A simple Swing Application");

        jFrame.setSize(275,100);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("Swing means powerful GUIs");

        jFrame.add(jLabel);

        jFrame.setVisible(true);
    }
}
