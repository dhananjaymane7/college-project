import java.awt.*;
import javax.swing.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.*;
// Booking seat Page

class bookpg extends Frame //implements ActionListener
{
	Font f1=new Font("Kristen ITC",Font.BOLD,29);
	Font f2=new Font("Arial",Font.BOLD,23);
	Font f3=new Font("Arial",Font.BOLD,22);
	
	JLabel l,l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4;
	JComboBox j1,j2,j3;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31; 
	String movie[]={"Select movie","Sarkar","A","v","S","d","gg","ss","we","wer","Ewr"};
	String time[]={"Select time","09:00AM - 11:00AM","12:00PM - 02:00PM","02.30PM - 04.30PM","5PM - 7PM","07.30PM - 09.30PM","CLOSED"};
	String sofa[]={"Select sofa","Gold","Silver","Simple"};
	JButton confirm,reset;

	public bookpg()
	{
		setSize(1900,1200);
		setVisible(true);
		setLayout(null);

		l=new JLabel("Book Your Seat Here !");
		l.setBounds(555,27,400,100);
		add(l);
		l.setFont(f1);

//NAME
		l1=new JLabel("Enter Your Name ");
		l1.setBounds(100,150,200,100);
		add(l1);
		l1.setFont(f2);

		t1=new JTextField();
		t1.setBounds(350,180,300,30);
		add(t1);
		t1.setFont(new Font("Arial", Font.PLAIN, 15)); 


//SELECT MOVIE
		l2=new JLabel("Select Movie ");
		l2.setBounds(100,232,200,100);
		add(l2);
		l2.setFont(f2);

		j1=new JComboBox(movie);
		j1.setBounds(350,260,300,30);
		add(j1);
		j1.setBackground(Color.white);
		j1.setFont(new Font("Arial", Font.PLAIN, 15)); 

//SELECT TIME
		l3=new JLabel("Select Time ");
		l3.setBounds(740,232,200,100);
		add(l3);
		l3.setFont(f2);

		j2=new JComboBox(time);
		j2.setBounds(950,265,300,30);
		add(j2);
		j2.setBackground(Color.white);
		j2.setFont(new Font("Arial", Font.PLAIN, 15)); 

//BOOK SEATS
		l4=new JLabel("Choose seat no ");
		l4.setBounds(100,314,200,100);
		add(l4);
		l4.setFont(f2);

		b1=new JButton("1");	b2=new JButton("2");
		b3=new JButton("3");	b4=new JButton("4");
		b5=new JButton("5");	b6=new JButton("6");
		b7=new JButton("7");	b8=new JButton("8");
		b9=new JButton("9");	b10=new JButton("10");
		b11=new JButton("11");	b12=new JButton("12");
		b13=new JButton("13");	b14=new JButton("14");
		b15=new JButton("15");	b16=new JButton("16");
		b17=new JButton("17");	b18=new JButton("18");
		b19=new JButton("19");	b20=new JButton("20");
		b21=new JButton("21");	b22=new JButton("22");
		b23=new JButton("23");	b24=new JButton("24");
		b25=new JButton("25");	b26=new JButton("26");
		b27=new JButton("27");	b28=new JButton("28");
		b29=new JButton("29");	b30=new JButton("30");
		b31=new JButton("31");

	//1st row		
		//LEFT
			b1.setBounds(355,344,50,28);
			b2.setBounds(413,344,50,28);
			b3.setBounds(471,344,50,28);
			b4.setBounds(529,344,50,28);
			b5.setBounds(587,344,50,28);
			b6.setBounds(645,344,50,28);
			b7.setBounds(703,344,50,28);

			b1.setBackground(Color.white);
			b1.setForeground(Color.black);
			b2.setBackground(Color.white);
			b2.setForeground(Color.black);
			b3.setBackground(Color.white);
			b3.setForeground(Color.black);
			b4.setBackground(Color.white);
			b4.setForeground(Color.black);
			b5.setBackground(Color.white);
			b5.setForeground(Color.black);
			b6.setBackground(Color.white);
			b6.setForeground(Color.black);
			b7.setBackground(Color.white);
			b7.setForeground(Color.black);
		
		//RIGHT	
			b8.setBounds(810,344,50,28);
			b9.setBounds(868,344,50,28);
			b10.setBounds(926,344,50,28);
			b11.setBounds(984,344,50,28);
			b12.setBounds(1042,344,50,28);

			b8.setBackground(Color.white);
			b8.setForeground(Color.black);
			b9.setBackground(Color.white);
			b9.setForeground(Color.black);
			b10.setBackground(Color.white);
			b10.setForeground(Color.black);
			b11.setBackground(Color.white);
			b11.setForeground(Color.black);
			b12.setBackground(Color.white);
			b12.setForeground(Color.black);

	//2nd row		
		//LEFT
			b13.setBounds(355,400,50,28);
			b14.setBounds(413,400,50,28);
			b15.setBounds(471,400,50,28);
			b16.setBounds(529,400,50,28);
			b17.setBounds(587,400,50,28);
			b18.setBounds(645,400,50,28);
			b19.setBounds(703,400,50,28);

			b13.setBackground(Color.white);
			b13.setForeground(Color.black);
			b14.setBackground(Color.white);
			b14.setForeground(Color.black);
			b15.setBackground(Color.white);
			b15.setForeground(Color.black);
			b16.setBackground(Color.white);
			b16.setForeground(Color.black);
			b17.setBackground(Color.white);
			b17.setForeground(Color.black);
			b18.setBackground(Color.white);
			b18.setForeground(Color.black);
			b19.setBackground(Color.white);
			b19.setForeground(Color.black);
		
		//RIGHT	
			b20.setBounds(810,400,50,28);
			b21.setBounds(868,400,50,28);
			b22.setBounds(926,400,50,28);
			b23.setBounds(984,400,50,28);
			b24.setBounds(1042,400,50,28);

			b20.setBackground(Color.white);
			b20.setForeground(Color.black);
			b21.setBackground(Color.white);
			b21.setForeground(Color.black);
			b22.setBackground(Color.white);
			b22.setForeground(Color.black);
			b23.setBackground(Color.white);
			b23.setForeground(Color.black);
			b24.setBackground(Color.white);
			b24.setForeground(Color.black);

	//3rd row		
		//LEFT
			b25.setBounds(355,456,50,28);
			b26.setBounds(413,456,50,28);
			b27.setBounds(471,456,50,28);
			b28.setBounds(529,456,50,28);
			b29.setBounds(587,456,50,28);
			b30.setBounds(645,456,50,28);
			b31.setBounds(703,456,50,28);
			
			b25.setBackground(Color.white);
			b25.setForeground(Color.black);
			b26.setBackground(Color.white);
			b26.setForeground(Color.black);
			b27.setBackground(Color.white);
			b27.setForeground(Color.black);
			b28.setBackground(Color.white);
			b28.setForeground(Color.black);
			b29.setBackground(Color.white);
			b29.setForeground(Color.black);
			b30.setBackground(Color.white);
			b30.setForeground(Color.black);
			b31.setBackground(Color.red);
			b31.setForeground(Color.white);
			
		//RIGHT	
			l5=new JLabel("ALREADY BOOKED!");
			l5.setBounds(810,450,500,50);
			l5.setForeground(Color.red);
			add(l5);
			l5.setFont(f3);


		add(b1);add(b2);add(b3);add(b4);add(b5);
		add(b6);add(b7);add(b8);add(b9);add(b10);
		add(b11);add(b12);add(b13);add(b14);add(b15);
		add(b16);add(b17);add(b18);add(b19);add(b20);
		add(b21);add(b22);add(b23);add(b24);add(b25);
		add(b26);add(b27);add(b28);add(b29);add(b30);add(b31);


//SOFA TYPE
		l5=new JLabel("Select Sofa ");
		l5.setBounds(100,500,200,100);
		add(l5);
		l5.setFont(f2);
	
		j3=new JComboBox(sofa);
		j3.setBounds(350,530,300,30);
		add(j3);
		j3.setBackground(Color.white);
		j3.setFont(new Font("Arial", Font.PLAIN, 15)); 


//confirm
		confirm=new JButton("Confirm");
		confirm.setBounds(180,630,250,30);
		confirm.setFont(f3);
		add(confirm);
		confirm.setBackground(Color.white);
		confirm.setForeground(Color.black);

//reset
		reset=new JButton("Reset");
		reset.setBounds(480,630,250,30);
		reset.setFont(f3);
		add(reset);
		reset.setBackground(Color.white);
		reset.setForeground(Color.black);
	}

	public static void main(String args[])
	{
		bookpg r=new bookpg();
	}
}