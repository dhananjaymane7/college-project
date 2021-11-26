package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends Frame implements ActionListener {
    Font f = (new Font("Gorgia", Font.BOLD, 23));
    Font f1 = (new Font("Sans-Serif", Font.BOLD, 45));
    Font f2 = (new Font("Sans-Serif", Font.BOLD, 17));
    JButton b1, b2;
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField t1, t3;
    JPasswordField t2;
    ImageIcon i1, i2, i4;

    public Login() {

        setSize(1657, 1200);
        setVisible(true);
        setLayout(null);
        setBackground(Color.black);

        l1 = new JLabel();
        l1.setBounds(0, 0, 1657, 300);
        i1 = new ImageIcon("title.jpg");
        l1.setIcon(i1);
        add(l1);

        l2 = new JLabel("Log in for BookMyShow");
        l2.setBounds(555, 300, 600, 60);
        l2.setForeground(Color.white);

        add(l2);
        l2.setFont(f1);

        t1 = new JTextField();
        t1.setBounds(280, 450, 400, 40);
        t1.setFont(f);
        add(t1);

        t2 = new JPasswordField();
        t2.setBounds(950, 450, 400, 40);
        t2.setFont(f);
        add(t2);

        l3 = new JLabel("USERNAME*");
        l3.setBounds(400, 390, 300, 40);
        add(l3);
        l3.setForeground(Color.white);
        l3.setFont(f);

        l4 = new JLabel("PASSWORD*");
        l4.setBounds(1070, 390, 300, 40);
        add(l4);
        l4.setForeground(Color.white);
        l4.setFont(f);

        l5 = new JLabel();
        l5.setBounds(0, 750, 1657, 279);
        i2 = new ImageIcon("front.jpg");
        l5.setIcon(i2);
        add(l5);

        l6 = new JLabel();
        l6.setBounds(250, 630, 1155, 104);
        i4 = new ImageIcon("lg.jpg");
        l6.setIcon(i4);
        add(l6);

        b1 = new JButton("REGISTER ACCOUNT");
        b1.setBounds(950, 530, 300, 40);
        b1.setFont(f2);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        add(b1);


        b2 = new JButton("LOG IN");
        b2.setBounds(280, 530, 150, 40);
        b2.setFont(f2);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        {
            if (s.equals("REGISTER ACCOUNT")) {
                create1 c = new create1();
            }
            //if(s.equals("LOG IN"))
            //{
            //	try
            //	{
            //String User=t1.getText();
            //String pass=t2.getText();

				/*if(User.equals("Dhananjay") && (pass.equals("Hello")))
				{
						JOptionPane.showMessageDialog(this,"Login Successfully Done!....");
						Home c=new Home();
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Invalid User Info please fill Correct Info ");
				}
				if(User.equals("Dhananjay"))
				{
					//JOptionPane.showMessageDialog(this,"");
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Incorrect user name");
				}
				if(pass.equals("Hello") && pass.length()<=5)
				{
					//JOptionPane.showMessageoDialog(this,"");
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Incorrect Password");
				}
				if(pass.length()<=5)
				{
					//JOptionPane.showMessageDialog(this,"");
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Enter password must be 5 digit's");
				}*/

            String s1 = "", s2 = "";
            Boolean x = false;
            if (s.equals("LOG IN")) {
                try {
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    JOptionPane.showMessageDialog(this, "Driver Registerd");

                    Connection co = DriverManager.getConnection("jdbc:odbc:book1");
                    JOptionPane.showMessageDialog(this, "Connection Created");

                    s1 = t1.getText();
                    s2 = t2.getText();

                    PreparedStatement ps = co.prepareStatement("select * from Login");
                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {
                        if (s1.equals(rs.getString(1)) && s2.equals(rs.getString(2))) {

                            x = true;
                        }

                    }
                    //co.close();
                    if (x == true) {
                        JOptionPane.showMessageDialog(this, "Login Successfully...");
                        Home h = new Home();
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid User Info.... /n please try again :");
                    }

					/*if(s1.equals(a1))
					{
						JOptionPane.showMessageDialog(this,"Ooops..........! Invalid Username");	
					}
					

					if(s2.equals(a2))
					{
						JOptionPane.showMessageDialog(this,"Invalid User Info.... /n please try again :");	
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Ooops..........! Invalid Password");	
					}*/

                    co.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "" + e);
                }


            }

        }
    }

    public static void main(String args[]) {

        Login e = new Login();

    }
}
	