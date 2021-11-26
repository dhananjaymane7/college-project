package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends Frame implements ActionListener {
    Font f = (new Font("Sans-Serif", Font.BOLD, 45));
    Font f1 = (new Font("Sans-Serif", Font.BOLD, 17));
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20;
    JCheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9;
    JButton b1, b2, b3, b4, b5, b6;
    ImageIcon i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12;


    public Home() {

        setVisible(true);

        setSize(1657, 1200);
        setLayout(null);
        setBackground(Color.black);

        i2 = new ImageIcon("t1.jpg");
        l2 = new JLabel(i2);
        l2.setBounds(0, 45, 1657, 141);
        add(l2);


        i3 = new ImageIcon("b1.jpg");
        l3 = new JLabel(i3);
        l3.setBounds(0, 200, 1657, 650);
        add(l3);

        i4 = new ImageIcon("sign.jpg");
        l4 = new JLabel(i4);
        l4.setBounds(0, 850, 1657, 196);
        add(l4);


        b1 = new JButton("HOME");
        b1.setBounds(450, 105, 150, 35);
        b1.setFont(f1);
        add(b1);
        b1.setBackground(Color.red);
        b1.setForeground(Color.white);


        b2 = new JButton("MOVIES");
        b2.setBounds(650, 105, 200, 35);
        b2.setFont(f1);
        add(b2);
        b2.setBackground(Color.red);
        b2.setForeground(Color.white);


        b3 = new JButton("SNAKS");
        b3.setBounds(900, 105, 200, 35);
        b3.setFont(f1);
        add(b3);
        b3.setBackground(Color.red);
        b3.setForeground(Color.white);

        b4 = new JButton("DRINKS");
        b4.setBounds(1150, 105, 150, 35);
        b4.setFont(f1);
        add(b4);
        b4.setBackground(Color.red);
        b4.setForeground(Color.white);

        b5 = new JButton("LOCAT_US");
        b5.setBounds(1350, 105, 150, 35);
        b5.setFont(f1);
        add(b5);
        b5.setBackground(Color.red);
        b5.setForeground(Color.white);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        String b = ae.getActionCommand();
        if (b.equals("MOVIES")) {
            Movie1 m = new Movie1();
        }
        if (b.equals("SNAKS")) {
            Snacks s = new Snacks();
        }
        if (b.equals("DRINKS")) {
            Drinks d = new Drinks();
        }
			/*if(b.equals("LOCAT_US"))
			{
				Location s=new Location();
			}*/
    }

    public static void main(String args[]) {
        Home h = new Home();
    }

}
