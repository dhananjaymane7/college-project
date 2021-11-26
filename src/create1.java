package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// Registartion Page
public class create1 extends Frame implements ActionListener {
    Font f = (new Font("Sans-Serif", Font.BOLD, 45));
    Font f1 = (new Font("Sans-Serif", Font.BOLD, 21));
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20;
    JRadioButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    JCheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13;
    JButton k1, k2;
    ImageIcon im1;


    public create1() {
        setVisible(true);
        setSize(1657, 1200);
        setLayout(null);
        setBackground(Color.black);


        im1 = new ImageIcon("sign.jpg");
        l1 = new JLabel(im1);
        l1.setBounds(0, 20, 1657, 196);
        add(l1);

        l2 = new JLabel("Sign up for BookMyShow");
        l2.setBounds(555, 240, 600, 60);
        l2.setForeground(Color.white);

        add(l2);
        l2.setFont(f);

        l15 = new JLabel("Dear Valued Customer,");
        l15.setBounds(50, 330, 300, 40);
        l15.setFont(f1);
        add(l15);
        l15.setForeground(Color.white);

        l11 = new JLabel("Kindly complete this form to enable us serve you better (all changes in current information must be supported by documented evidence.");
        l11.setBounds(50, 370, 1800, 40);
        l11.setFont(f1);
        l11.setForeground(Color.white);
        add(l11);

			/*l2=new JLabel("HOLDER_ID:");
			l2.setBounds(50,370,200,40);
			l2.setForeground(Color.white);
			l2.setFont(f1);
			add(l2);

			t1=new JTextField();
			t1.setBounds(200,370,250,40);
			t1.setFont(f1);
			add(t1);*/
        //

        l10 = new JLabel("TITLE:");
        l10.setBounds(50, 450, 200, 40);
        l10.setFont(f1);
        l10.setForeground(Color.white);
        add(l10);

        b6 = new JRadioButton("Dr.");
        b6.setBounds(200, 450, 100, 40);
        b6.setFont(f1);
        add(b6);

        b7 = new JRadioButton("Mr.");
        b7.setBounds(310, 450, 100, 40);
        b7.setFont(f1);
        add(b7);

        b8 = new JRadioButton("Mrs.");
        b8.setBounds(420, 450, 100, 40);
        b8.setFont(f1);
        add(b8);

        b9 = new JRadioButton("Miss.");
        b9.setBounds(530, 450, 100, 40);
        b9.setFont(f1);
        add(b9);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(b6);
        bg1.add(b7);
        bg1.add(b8);
        bg1.add(b9);


        l3 = new JLabel("SURNAME*:");
        l3.setBounds(50, 530, 200, 40);
        l3.setFont(f1);
        l3.setForeground(Color.white);
        add(l3);

        t2 = new JTextField();
        t2.setBounds(200, 530, 250, 40);
        t2.setFont(f1);
        add(t2);

        l4 = new JLabel("FIRST NAME*:");
        l4.setBounds(500, 530, 200, 40);
        l4.setFont(f1);
        l4.setForeground(Color.white);
        add(l4);

        t3 = new JTextField();
        t3.setBounds(650, 530, 250, 40);
        t3.setFont(f1);
        add(t3);

        l5 = new JLabel("MIDDLE NAME*:");
        l5.setBounds(950, 530, 200, 40);
        l5.setForeground(Color.white);
        l5.setFont(f1);
        add(l5);

        t4 = new JTextField();
        t4.setBounds(1150, 530, 250, 40);
        t4.setFont(f1);
        add(t4);

        l6 = new JLabel("DATE OF BIRTH*:");
        l6.setBounds(50, 600, 200, 40);
        l6.setForeground(Color.white);
        l6.setFont(f1);
        add(l6);

        t5 = new JTextField();
        t5.setBounds(240, 600, 250, 40);
        t5.setFont(f1);
        add(t5);

        l7 = new JLabel("EMAIL-ADDRESS:");
        l7.setBounds(50, 680, 220, 40);
        l7.setForeground(Color.white);

        l7.setFont(f1);
        add(l7);

        t6 = new JTextField();
        t6.setBounds(250, 680, 300, 40);
        t6.setFont(f1);
        add(t6);


        l8 = new JLabel("MOBILE NO*:");
        l8.setBounds(650, 680, 200, 40);
        l8.setForeground(Color.white);
        l8.setFont(f1);
        add(l8);

        t7 = new JTextField();
        t7.setBounds(850, 680, 250, 40);
        t7.setFont(f1);
        t7.setText("+91");
        add(t7);

			/*l9=new JLabel("DO YOU OWN A ROYAL ENFIELD MOTORCYCLE?");
			l9.setBounds(50,760,500,40);
				l9.setForeground(Color.white);
			l9.setFont(f1);
			add(l9);*/


        l19 = new JLabel("PLEASE SET USERNAME AND PASSWORD*");
        l19.setBounds(500, 760, 500, 40);
        l19.setForeground(Color.white);
        l19.setFont(f1);
        add(l19);


			/*b10=new JRadioButton("Yes");
			b10.setBounds(50,840,100,40);
			b10.setFont(f1);
			add(b10);

			b11=new JRadioButton("No");
			b11.setBounds(200,840,100,40);
			b11.setFont(f1);
			add(b11);

			ButtonGroup bg2=new ButtonGroup();
			bg2.add(b10);bg2.add(b11);*/


        l17 = new JLabel("USERNAME*:");
        l17.setBounds(50, 820, 250, 40);
        l17.setFont(f1);
        l17.setForeground(Color.white);
        add(l17);

        t8 = new JTextField();
        t8.setBounds(250, 820, 250, 40);
        t8.setFont(f1);
        add(t8);

        l18 = new JLabel("PASSWORD*:");
        l18.setBounds(530, 820, 200, 40);
        l18.setForeground(Color.white);
        l18.setFont(f1);
        add(l18);

        t9 = new JTextField();
        t9.setBounds(750, 820, 250, 40);
        t9.setFont(f1);
        add(t9);

        k1 = new JButton("SUBMIT");
        k1.setBounds(1300, 975, 180, 40);
        add(k1);
        k1.setFont(f1);

        k1.setBackground(Color.black);
        k1.setForeground(Color.white);


        l20 = new JLabel(" Disclaimer: By signing this form/checking this box,you acknowledge and agree that we may use the inforamation you share with us. ");
        l20.setBounds(50, 900, 1600, 40);
        l20.setForeground(Color.white);
        l20.setFont(f1);
        add(l20);

        c1 = new JCheckBox(" I accept the terms and conditions as well as privacy policy.");
        c1.setFont(f1);
        c1.setBounds(50, 950, 800, 35);
        add(c1);

        k1.addActionListener(this);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.white);
        g.drawLine(0, 750, 1800, 750);
        g.drawLine(0, 752, 1800, 752);
        //g.drawLine(0,630,1800,630);
        //g.drawLine(0,632,1800,632);

    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        {
            if (s.equals("SUBMIT")) {
                try {
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    JOptionPane.showMessageDialog(this, "Driver Registered");


                    Connection co = DriverManager.getConnection("jdbc:odbc:book1");
                    JOptionPane.showMessageDialog(this, "Connection Created");


                    PreparedStatement ps = co.prepareStatement("insert into Register values(?,?,?,?,?,?)");

                    String a1 = t2.getText();
                    String a2 = t3.getText();
                    String a3 = t4.getText();
                    String a4 = t5.getText();
                    String a5 = t6.getText();
                    String a6 = t7.getText();


                    ps.setString(1, a1);
                    ps.setString(2, a2);
                    ps.setString(3, a3);
                    ps.setString(4, a4);
                    ps.setString(5, a5);
                    ps.setString(6, a6);
										
										
										
										/*ps.setString(5,a5);
										ps.setString(6,a6);
											ps.setString(7,a7);
												ps.setString(8,a8);*/

                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Values inserted successfully....");

                    //Home h=new Home();

                    PreparedStatement ps1 = co.prepareStatement("insert into Login values(?,?)");

                    String a7 = t8.getText();
                    String a8 = t9.getText();

                    ps1.setString(1, a7);
                    ps1.setString(2, a8);

                    ps1.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Values inserted successfully....");

                    co.close();

                } catch (Exception h) {
                    JOptionPane.showMessageDialog(this, "" + h);

                }

            }
        }
    }

    public static void main(String args[]) {
        create1 r = new create1();
    }
}