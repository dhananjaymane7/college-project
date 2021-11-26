import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class MovieData {

    ImageIcon icon;
    JLabel label;

    public MovieData(String imagePath, int x, int y, int width, int height) {
        icon = new ImageIcon(imagePath);
        label = new JLabel(icon);
        label.setBounds(x, y, width, height);
    }

    public JLabel getLabel() {
        return label;
    }

}

class ButtonData {
    private final JButton button;
    private final Font font;
    private final Color background;
    private final Color foreground;

    public ButtonData(String text, Font font, Color background, Color foreground) {
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


public class Action extends Frame implements ActionListener {
    Font boldSansSerif = (new Font("Sans-Serif", Font.BOLD, 17));
    ArrayList<MovieData> movies = new ArrayList<>();

    public Action() {
        setVisible(true);
        setSize(1910, 1200);
        setLayout(null);
        setBackground(Color.white);

        //on frame
        movies.add(new MovieData("m1.jpg", 0, 24, 1900, 111));
        movies.add(new MovieData("aa1.jpg", 8, 150, 1900, 350));
        movies.add(new MovieData("aa2.jpg", 8, 570, 1900, 350));

        for (MovieData movie : movies) {
            add(movie.getLabel());
        }

        ButtonData bookData = new ButtonData("Book Now", boldSansSerif, Color.black, Color.white);

        bookData.setBounds(800, 950, 200, 50);
        JButton bookNow = bookData.create();
        add(bookNow);
        bookNow.addActionListener(this);
    }

    public static void main(String[] args) {
        new Action();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}