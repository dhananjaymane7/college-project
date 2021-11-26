package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

class MovieDataNew {

    ImageIcon icon;
    JLabel label;

    public MovieDataNew(String imagePath, int x, int y, int width, int height) {
        icon = new ImageIcon(imagePath);
        icon.setImage(icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        label = new JLabel(icon);
        label.setBounds(x, y, width, height);
    }

    public JLabel getLabel() {
        return label;
    }

}

class ButtonDataNew {
    private final JButton button;
    private final Font font;
    private final Color background;
    private final Color foreground;

    public ButtonDataNew(String text, Font font, Color background, Color foreground) {
        this.button = new JButton(text);
        this.font = font;
        this.background = background;
        this.foreground = foreground;
    }

    public void setBounds(int x, int y, int width, int height) {
        this.button.setBounds(x, y, width, height);
    }

    public JButton create() {
        this.button.setFont(this.font);
        this.button.setBackground(this.background);
        this.button.setForeground(this.foreground);
        return this.button;
    }
}

class Posters extends JPanel {
    ArrayList<MovieDataNew> movies = new ArrayList<>();

    public Posters() {
        setVisible(true);
        setSize(1910, 1000);
        setLayout(null);
        setBackground(Color.white);

        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection co = DriverManager.getConnection("jdbc:odbc:book1");

            PreparedStatement ps = co.prepareStatement("select * from movies");
            ResultSet rs = ps.executeQuery();

            int x = 100;
            int y = 100;
            int i = 0;
            while (rs.next()) {
                String path = rs.getString(1);
                System.out.println(path);
                movies.add(new MovieDataNew(path, x, y, 250, 350));
                if (i < 5) {
                    x = x + 290;
                    i++;
                } else {
                    x = 100;
                    y = y + 400;
                    i = 0;
                }
            }
            co.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "" + e);
        }

        for (MovieDataNew movie : movies) {
            add(movie.getLabel());
        }
    }

}

public class ActionNew extends Frame implements ActionListener {
    Font boldSansSerif = (new Font("Sans-Serif", Font.BOLD, 17));

    public ActionNew() {
        setVisible(true);
        setSize(1910, 1200);
        setLayout(null);
        setBackground(Color.white);

        Posters posters = new Posters();
        JScrollPane scrPane = new JScrollPane(posters, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrPane.setSize(1910, 1000);
        add(scrPane);

        ButtonDataNew bookData = new ButtonDataNew("Book Now", boldSansSerif, Color.black, Color.white);

        bookData.setBounds(800, 950, 200, 50);
        JButton bookNow = bookData.create();
        add(bookNow);
        bookNow.addActionListener(this);
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new ActionNew();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}