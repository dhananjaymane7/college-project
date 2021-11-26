package src;

import java.awt.*;
import javax.swing.*;
import java.applet.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.*;
import java.awt.FlowLayout;  
import javax.swing.JFrame;  
import javax.swing.JScrollPane;  

public class Movie1 extends Frame implements ActionListener
{
	Font f=(new Font("Sans-Serif",Font.BOLD, 45));
	Font f1=(new Font("Sans-Serif",Font.BOLD, 17));
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9;
	JButton b1,b2,b3,b4,b5,b6;
	ImageIcon i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;
    String msg="";
    JPanel d,d1,d2,d3,d4,d5,d6,d7;


	public Movie1()
	{

		setVisible(true);
		
		setSize(1910,1200);
		setLayout(null);
		setBackground(Color.white);
        //on frame
          i2=new ImageIcon("m1.jpg");
		l2=new JLabel(i2);
		l2.setBounds(0,24,1900,111);
		add(l2);


		i1=new ImageIcon("m3.jpg");
		l1=new JLabel(i1);
		l1.setBounds(0,100,1910,931);
		add(l1);
        
        b1=new JButton("Action");
		b1.setBounds(600,55,200,50);
        b1.setFont(f1);
		add(b1);
		b1.addActionListener(this);


		b2=new JButton("Crime");
		b2.setBounds(850,55,200,50);
			b2.setFont(f1);
		add(b2);
		b2.addActionListener(this);


		b3=new JButton("Top Selling");
		b3.setBounds(1100,55,200,50);
		b3.setFont(f1);
		add(b3);
		b3.addActionListener(this);


		b4=new JButton("Horror");
		b4.setBounds(1350,55,200,50);
		b4.setFont(f1);
		add(b4);
		b4.addActionListener(this);


		b5=new JButton("Recommended");
		b5.setBounds(1600,55,200,50);
		b5.setFont(f1);
		add(b5);
		b5.addActionListener(this);

		/*//Second Panel
		d1=new JPanel();
		d1.setBounds(0,130,1895,931);
		//d1.setVisible(false);
	
		
		i3=new ImageIcon("aa1.jpg");
		l3=new JLabel(i3);
		l3.setBounds(8,150,1900,350);
		d1.add(l3);

		i4=new ImageIcon("aa2.jpg");
		l4=new JLabel(i4);
		l4.setBounds(8,570,1900,350);
		d1.add(l4);

		add(d1);

		//Third Panel
		d2=new JPanel();
		d2.setBounds(0,130,1895,931);
		//d2.setVisible(false);

		d2.setBackground(Color.gray);
		
		i5=new ImageIcon("cr1.jpg");
		l5=new JLabel(i5);
		l5.setBounds(8,150,1900,350);
		d2.add(l5);

		i6=new ImageIcon("cr2.jpg");
		l6=new JLabel(i6);
		l6.setBounds(8,570,1900,350);
		d2.add(l6);

		add(d2);

		//Forth Panel
		d3=new JPanel();
		d3.setBounds(0,130,1895,931);
		//d3.setVisible(false);
		
		i7=new ImageIcon("to1.jpg");
		l7=new JLabel(i7);
		l7.setBounds(8,150,1900,350);
		d3.add(l7);

		i8=new ImageIcon("to2.jpg");
		l8=new JLabel(i8);
		l8.setBounds(8,570,1900,350);
		d3.add(l8);

		add(d3);

		//Fifth Panel
		d4=new JPanel();
		d4.setBounds(0,130,1895,931);
		//d4.setVisible(false);
		
		i9=new ImageIcon("h1.jpg");
		l9=new JLabel(i9);
		l9.setBounds(8,150,1900,350);
		d4.add(l9);

		i10=new ImageIcon("to2.jpg");
		l10=new JLabel(i10);
		l10.setBounds(8,570,1900,350);
		d4.add(l10);

		add(d4);*/
	}       
	public void actionPerformed(ActionEvent ae)
	{
		
		String s=ae.getActionCommand();
		if(s.equals("Action"))
		{
            Action a1=new Action();
		}
		if(s.equals("Crime"))
		{
			Crime c1=new Crime();
		}
		if(s.equals("Top Selling"))
		{
			
		   Selling s2=new Selling();
			
		}
		if(s.equals("Horror"))
		{
			Horror h2=new Horror();
			
		}
        if(s.equals("Recommended"))
		{
			Recomm r=new Recomm();
			
		}
	}
	
    public static void main(String args[])
    {
        Movie1 m=new Movie1();
    }
}