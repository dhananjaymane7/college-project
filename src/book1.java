import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class book1 extends Frame
{
    JLabel label1,label2,label3,label4,label5,label6;
    JButton button;
    Font font=(new Font("Sans-Serif",Font.BOLD,17));
    ImageIcon image1;

    public book1()
    {
        setVisible(true);
        setLayout(null);
        setSize(1900,1200);
        setBackground(Color.black);

        label1=new JLabel("Enter Your Name");
        label1.setBounds(100,200,300,50);
        label1.setFont(font);
        label1.setForeground(Color.white);
        add(label1);
    }

}