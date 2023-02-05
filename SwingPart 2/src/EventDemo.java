import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {
    JLabel jLabel;

    EventDemo(){
        JFrame jFrame = new JFrame("An Event Example");

        jFrame.setLayout(new FlowLayout());

        jFrame.setSize(220,90);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButtonAlpha = new JButton("Alpha");
        JButton jButtonBeta = new JButton("Beta");

        jButtonAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Alpha was pressed");
            }
        });

        jButtonBeta.addActionListener(e -> jLabel.setText("Beta was pressed"));

        jFrame.add(jButtonAlpha);
        jFrame.add(jButtonBeta);

        jLabel = new JLabel("Press a button");

        jFrame.add(jLabel);

        jFrame.setVisible(true);
    }
}
