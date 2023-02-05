import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldDemo {

    public JTextFieldDemo(){
        JFrame jFrame = new JFrame("JTextFieldDemo");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(260,120);

        JTextField jTextField = new JTextField(15);
        jFrame.add(jTextField);

        JLabel jLabel = new JLabel();
        jFrame.add(jLabel);

        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(jTextField.getText());
            }
        });

        jFrame.setVisible(true);

    }
}
