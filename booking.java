import java.awt.*;
import javax.swing.*;
import java.applet.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.*;
// Registartion Page
public class booking extends Frame implements ActionListener
{
	Font f=(new Font("Sans-Serif",Font.BOLD, 45));
	Font f1=(new Font("Sans-Serif",Font.BOLD, 21));
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
	JRadioButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
	JButton k1,k2;
	ImageIcon im1;


	public booking()
	{
			setVisible(true);
			setSize(1657,1200);
			setLayout(null);
			setBackground(Color.black);
			
			
			im1=new ImageIcon("sign.jpg");
			l1=new JLabel(im1);
			l1.setBounds(0,20,1657,196);
			add(l1);

			l2=new JLabel("Ticket Booking");
			l2.setBounds(555,240,600,60);
			l2.setForeground(Color.white);
			
			add(l2);	
			l2.setFont(f);
            
            l2=new JLabel("Enter Your Name");
			l2.setBounds(50,340,600,60);
			l2.setForeground(Color.white);
			
			add(l2);	
			l2.setFont(f1);
            
            t1=new JTextField();
            t1.setBounds(450,340,300,40);
            t1.setFont(f1);
            add(t1);	
			
            
            
            
            
        

			

			l20=new JLabel(" Disclaimer: By signing this form/checking this box,you acknowledge and agree that we may use the inforamation you share with us. ");
			l20.setBounds(50,900,1600,40);
			l20.setForeground(Color.white);
			l20.setFont(f1);
			add(l20);

			c1=new JCheckBox(" I accept the terms and conditions as well as privacy policy.");
			c1.setFont(f1);
			c1.setBounds(50,950,800,35);
			add(c1);

			k1.addActionListener(this);
	}
	public void paint(Graphics g)
	{
			super.paint(g);
			g.setColor(Color.white);
			g.drawLine(0,750,1800,750);
			g.drawLine(0,752,1800,752);
			//g.drawLine(0,630,1800,630);
			//g.drawLine(0,632,1800,632);
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		/*String s=ae.getActionCommand();
		{
			if(s.equals("SUBMIT"))
							{
								try
								{
										Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
										JOptionPane.showMessageDialog(this,"Driver Registered");


										Connection co=DriverManager.getConnection("jdbc:odbc:Enfield1");
										JOptionPane.showMessageDialog(this,"Connection Created");

										

										PreparedStatement ps=co.prepareStatement("insert into Login values(?,?,?)");
										System.out.println("Enter Passenger no : ");
										
										int a1=Integer.parseInt(t1.getText());
										String a2=t8.getText();
										String a3=t9.getText();
								
										
										ps.setInt(1,a1);
										ps.setString(2,a2);
										ps.setString(3,a3);
										
										
										/*ps.setString(5,a5);
										ps.setString(6,a6);
											ps.setString(7,a7);
												ps.setString(8,a8);*/
										
										/*ps.executeUpdate();
										JOptionPane.showMessageDialog(this,"Values inserted successfully....");

										//Home h=new Home();


								}catch(Exception h)
									{
										JOptionPane.showMessageDialog(this,""+h);

									}

							}*/
		
	}

	public static void main(String args[])
	{
		booking r=new booking();
	}
}