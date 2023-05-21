package Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowsButton implements Button {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button;

    @Override
    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hellow World");
        label.setOpaque(true);
        label.setBackground(new Color(235,233,156));
        label.setFont(new Font("Dialog",Font.BOLD,44));
        label.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        label.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.setSize(400,400);
        frame.setVisible(true);
        onClick();
    }

    @Override
    public void onClick() {
        button = new JButton();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
