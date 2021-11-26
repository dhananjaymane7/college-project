package src;

import javax.swing.*;
import java.awt.*;

public class Booking1 extends Frame //implements ActionListener
{
    Font f = (new Font("Gorgia", Font.BOLD, 23));
    Font f1 = (new Font("Sans-Serif", Font.BOLD, 45));
    Font f2 = (new Font("Sans-Serif", Font.BOLD, 17));
    JButton b1, b2;
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField t1, t3;
    JPasswordField t2;
    ImageIcon i1, i2, i4;

    public Booking1() {

        setSize(1657, 850);
        setVisible(true);
        setLayout(null);
        setBackground(Color.black);

        i1 = new ImageIcon("ground.jpg");
        l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1657, 850);
        add(l1);

        l2 = new JLabel("jdsuuycdhhsbbbbbbbb");
        l2.setBounds(300, 300, 400, 50);
        l1.add(l2);

        b1 = new JButton("Submit");
        b2.setBounds(400, 500, 150, 50);
        l1.add(b1);
    }

    public static void main(String args[]) {
        Booking1 b = new Booking1();
    }
}