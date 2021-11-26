package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Recomm extends Frame implements ActionListener {
    Font f = (new Font("Sans-Serif", Font.BOLD, 45));
    Font f1 = (new Font("Sans-Serif", Font.BOLD, 17));
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20;
    JCheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9;
    JButton b1, b2, b3, b4, b5, b6;
    ImageIcon i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12;
    String msg = "";
    JPanel d, d1, d2, d3, d4, d5, d6, d7;


    public Recomm() {

        setVisible(true);

        setSize(1910, 1200);
        setLayout(null);
        setBackground(Color.white);
        //on frame
        i2 = new ImageIcon("m1.jpg");
        l2 = new JLabel(i2);
        l2.setBounds(0, 24, 1900, 111);
        add(l2);

        i3 = new ImageIcon("r1.jpg");
        l3 = new JLabel(i3);
        l3.setBounds(8, 150, 1900, 350);
        add(l3);

        i4 = new ImageIcon("r2.jpg");
        l4 = new JLabel(i4);
        l4.setBounds(8, 570, 1900, 350);
        add(l4);

        b1 = new JButton("Book Now");
        b1.setBounds(800, 950, 200, 50);
        b1.setFont(f1);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        add(b1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String args[]) {
        Recomm r1 = new Recomm();
    }
}