import javax.swing.*;

public class PaintDemo {

    JLabel jLabel;
    PainPanel painPanel;

    PaintDemo(){
        JFrame jFrame = new JFrame("Paint Demo");

        jFrame.setSize(200,150);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        painPanel = new PainPanel();

        jFrame.add(painPanel);

        jFrame.setVisible(true);
    }

}
