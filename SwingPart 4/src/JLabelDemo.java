import javax.swing.*;
import java.awt.*;

public class JLabelDemo {

    public JLabelDemo(){
        JFrame jFrame = new JFrame("JLabelDemo");

        jFrame.setLayout(new FlowLayout());

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setSize(260,210);

        ImageIcon imageIcon = new ImageIcon("hourglass.png");

        JLabel jLabel = new JLabel("Hourglass",imageIcon,JLabel.CENTER);

        jFrame.add(jLabel);

        jFrame.setVisible(true);

    }
}
