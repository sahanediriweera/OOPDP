import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCalculator {

    public JCalculator(){
        JFrame jFrame = new JFrame("Swing Calculator");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,100);

        JTextField jTextField = new JTextField(50);
        jFrame.add(jTextField);

        JLabel jLabel = new JLabel();
        jFrame.add(jLabel);

        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] args = jTextField.getText().split(" ");
                Arguments arguments = new CommandLineArguments(args);
                Operation operation = OperationFactory.create(arguments.getOperator(),arguments.getOperands());
                Double result = operation.execute();
                jLabel.setText(String.format("%s == %s",arguments.getOperator(),result));
            }
        });

        jFrame.setVisible(true);
    }

}
