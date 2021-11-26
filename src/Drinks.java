package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static src.Login.IMAGE_PATH;

public class Drinks extends Frame implements ActionListener {
    Font f = (new Font("Sans-Serif", Font.BOLD, 45));
    Font f1 = (new Font("Sans-Serif", Font.BOLD, 17));
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20;
    JCheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9;
    JButton b1, b2, b3, b4, b5, b6;
    ImageIcon i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12;
    String msg = "";


    public Drinks() {

        setVisible(true);

        setSize(1657, 1200);
        setLayout(null);
        setBackground(Color.black);

        i2 = new ImageIcon(IMAGE_PATH + "Drinks1.jpg");
        l2 = new JLabel(i2);
        l2.setBounds(0, 250, 1657, 830);
        add(l2);

        i1 = new ImageIcon(IMAGE_PATH + "Drinks.jpg");
        l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1657, 244);
        add(l1);

        c1 = new JCheckBox("Rs.60");
        c1.setBounds(1450, 310, 100, 40);
        c1.setBackground(Color.yellow);
        c1.setForeground(Color.black);
        c1.setFont(f1);

        c2 = new JCheckBox("Rs.70");
        c2.setBounds(1450, 470, 100, 40);
        c2.setBackground(Color.yellow);
        c2.setForeground(Color.black);
        c2.setFont(f1);

        c3 = new JCheckBox("Rs.247");
        c3.setBounds(1450, 650, 100, 40);
        c3.setBackground(Color.yellow);
        c3.setForeground(Color.black);
        c3.setFont(f1);

        c4 = new JCheckBox("Rs.247");
        c4.setBounds(1450, 810, 100, 40);
        c4.setBackground(Color.yellow);
        c4.setForeground(Color.black);
        c4.setFont(f1);

        c5 = new JCheckBox("Rs.113");
        c5.setBounds(1450, 960, 100, 40);
        c5.setBackground(Color.yellow);
        c5.setForeground(Color.black);
        c5.setFont(f1);

		/*c6=new JCheckBox("Rs.120");
		c6.setBounds(1125,900,100,40);
		c6.setBackground(Color.black);
		c6.setForeground(Color.white);
		c6.setFont(f1);*/


        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);//add(c6);

        b1 = new JButton("ORDER");
        b1.setBounds(800, 980, 170, 40);
        b1.setBackground(Color.red);
        b1.setForeground(Color.white);
        b1.setFont(f1);
        add(b1);

        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent m) {
        float amt = 0.0f;
        if (c1.isSelected()) {
            amt = amt + 60;
            msg = "COKE ZERO CAN - 60\n";
        }
        if (c2.isSelected()) {
            amt = amt + 70;
            msg = msg + "MIXED FRUIT JUICE - 70\n";
        }
        if (c3.isSelected()) {
            amt = amt + 247;
            msg = msg + "MOCHA OREO - 247\n";
        }
        if (c4.isSelected()) {
            amt = amt + 247;
            msg = msg + "STRAWBERRY OREO - 247\n";
        }
        if (c5.isSelected()) {
            amt = amt + 113;
            msg = "MASALA KADAK CHAI - 113\n";
        }
		/*if(c6.isSelected())
		{
			amt=amt+120;
			msg=msg+"MOONG JAR- 120\n";
		}*/
        msg = "BOOKMYSHOW PARTNERSHIP WITH MC DONALD'S \n************************\n" + msg + "---------------------------------\n";
        JOptionPane.showMessageDialog(this, msg + "Total = " + amt);
    }

    public static void main(String args[]) {
        Drinks m = new Drinks();
    }
}