import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class TicketData
{
    JLabel label;
    JButton Button;
    JComboBox comboBox;
    JTextField textField;

    public TicketData()
    {

    }

}
class LabelData
{
    JButton button;
    Font font;
    Color background;
    Color foreground;

    JLabel label1;
    public LabelData(String text, Font font, Color background, Color foreground)
    {
        this.font=font;
        this.background=background;
        this.foreground=foreground;
        this.label1=new JLabel(text);

    }
    public void setBounds(int x, int y, int width, int height)
    {
        this.label1.setBounds(x, y, width, height);
    }
    public void create()
    {
        this.label1.setFont(this.font);
        this.label1.setBackground(this.background);
        this.label1.setForeground(this.foreground);

        //return this.label1;
    }
}
class textfieldData
{
    JTextField textField=new JTextField();
    Font font;
    public textfieldData()
    {
        this.font=font;

        this.textField=new JTextField();

    }
    public void setBounds(int x, int y, int width, int height)
    {
        this.textField.setBounds(x, y, width, height);
    }
    public void create()
    {
        this.textField.setFont(this.font);
        //return this.label1;
    }


}

public class Ticket extends Frame implements ActionListener
{
    Font boldsansserif=(new Font("Sans-Serif", Font.BOLD, 20));
    ArrayList<TicketData> Tickets=new ArrayList<>();
    public Ticket()
    {
        setSize(1910,1200);
        setVisible(true);
        setLayout(null);
        setBackground(Color.white);

        Tickets.add(new TicketData(100,200,300,50));


        Tickets.add(new TicketData(100,400,300,50));

        LabelData labelData=new LabelData("Enter Your Name",boldsansserif,Color.black,Color.cyan);
        LabelData labelData=new LabelData("Hello",boldsansserif,Color.black,Color.cyan);
            labelData.setBounds(100,200,200,50);
       // JLabel Name=labelData.create();
        add(labelData.label1);

        textfieldData tdata=new textfieldData(boldsansserif);
        tdata.setBounds(500,200,200,50);
        add(tdata.textField);




    }
    public static void main(String[] args)
    {
        new Ticket();
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {

    }

}