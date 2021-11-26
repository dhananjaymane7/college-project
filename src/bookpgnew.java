package src;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

class bookpgnew extends Frame //implements ActionListener
{
    Font fontKristen = new Font("Kristen ITC", Font.BOLD, 29);
    Font labelFont = new Font("Arial", Font.BOLD, 23);
    Font bookedLabel = new Font("Arial", Font.BOLD, 22);

    JLabel headerLabel, nameLabel, selectMovieLabel, selectTimeLabel, chooseSeatLabel, selectSofaLabel;
    JTextField nameTextField;
    JComboBox<String> selectMovieOptions, selectTimeOptions, selectSofaOptions;
    ArrayList<JButton> seats = new ArrayList<>();
    String[] movie = {"Select movie", "Sarkar", "A", "v", "S", "d", "gg", "ss", "we", "wer", "Ewr"};
    String[] time = {"Select time", "09:00AM - 11:00AM", "12:00PM - 02:00PM", "02.30PM - 04.30PM", "5PM - 7PM", "07.30PM - 09.30PM", "CLOSED"};
    String[] sofa = {"Select sofa", "Gold", "Silver", "Simple"};

    JButton confirm, reset;

    public bookpgnew() {
        setSize(1900, 1200);
        setVisible(true);
        setLayout(null);
        int totalSeats = 31;
        int bookedSeatsTotal = 10;

        ArrayList<Integer> bookedSeats = generateRandomArray(bookedSeatsTotal, totalSeats);
        System.out.println(bookedSeats);

        headerLabel = new JLabel("Book Your Seat Here !");
        headerLabel.setBounds(555, 27, 400, 100);
        add(headerLabel);
        headerLabel.setFont(fontKristen);

        //NAME
        nameLabel = new JLabel("Enter Your Name ");
        nameLabel.setBounds(100, 150, 200, 100);
        add(nameLabel);
        nameLabel.setFont(labelFont);

        nameTextField = new JTextField();
        nameTextField.setBounds(350, 180, 300, 30);
        add(nameTextField);
        nameTextField.setFont(new Font("Arial", Font.PLAIN, 15));

        //SELECT MOVIE
        selectMovieLabel = new JLabel("Select Movie ");
        selectMovieLabel.setBounds(100, 232, 200, 100);
        add(selectMovieLabel);
        selectMovieLabel.setFont(labelFont);

        selectMovieOptions = new JComboBox<>(movie);
        selectMovieOptions.setBounds(350, 260, 300, 30);
        add(selectMovieOptions);
        selectMovieOptions.setBackground(Color.white);
        selectMovieOptions.setFont(new Font("Arial", Font.PLAIN, 15));

//SELECT TIME
        selectTimeLabel = new JLabel("Select Time ");
        selectTimeLabel.setBounds(740, 232, 200, 100);
        add(selectTimeLabel);
        selectTimeLabel.setFont(labelFont);

        selectTimeOptions = new JComboBox<>(time);
        selectTimeOptions.setBounds(950, 265, 300, 30);
        add(selectTimeOptions);
        selectTimeOptions.setBackground(Color.white);
        selectTimeOptions.setFont(new Font("Arial", Font.PLAIN, 15));

//BOOK SEATS
        chooseSeatLabel = new JLabel("Choose seat no ");
        chooseSeatLabel.setBounds(100, 314, 200, 100);
        add(chooseSeatLabel);
        chooseSeatLabel.setFont(labelFont);

        createSeats(totalSeats);
        setSeatBounds(7, 5);

        for (JButton seat : seats) {
            seat.setBackground(Color.white);
            seat.setForeground(Color.black);
            add(seat);
        }
        for(int bookedSeat: bookedSeats) {
            seats.get(bookedSeat).setBackground(Color.red);
            seats.get(bookedSeat).setForeground(Color.white);
        }

//SOFA TYPE
        selectSofaLabel = new JLabel("Select Sofa ");
        selectSofaLabel.setBounds(100, 500, 200, 100);
        add(selectSofaLabel);
        selectSofaLabel.setFont(labelFont);

        selectSofaOptions = new JComboBox<>(sofa);
        selectSofaOptions.setBounds(350, 530, 300, 30);
        add(selectSofaOptions);
        selectSofaOptions.setBackground(Color.white);
        selectSofaOptions.setFont(new Font("Arial", Font.PLAIN, 15));


//confirm
        confirm = new JButton("Confirm");
        confirm.setBounds(180, 630, 250, 30);
        confirm.setFont(bookedLabel);
        add(confirm);
        confirm.setBackground(Color.white);
        confirm.setForeground(Color.black);

//reset
        reset = new JButton("Reset");
        reset.setBounds(480, 630, 250, 30);
        reset.setFont(bookedLabel);
        add(reset);
        reset.setBackground(Color.white);
        reset.setForeground(Color.black);
    }

    private void createSeats(int totalSeats) {
        for (int i = 1; i <= totalSeats; i++) {
            seats.add(new JButton(Integer.toString(i)));
        }
    }

    private void setSeatBounds(int leftSeatsSize, int rightSeatSize) {
        int seatWidth = 50;
        int seatHeight = 28;
        int startX = 355;
        int x = startX;
        int y = 344;
        int seatSideSpace = 58;
        int middleDifference = 107;
        int seatFrontSpace = 56;

        int rowSeatCount = 0;
        for (JButton seat : this.seats) {
            seat.setBounds(x, y, seatWidth, seatHeight);

            rowSeatCount += 1;
            if (rowSeatCount == leftSeatsSize) {
                x = x + middleDifference;
            } else {
                x = x + seatSideSpace;
            }
            if (rowSeatCount == leftSeatsSize + rightSeatSize) {
                x = startX;
                y = y + seatFrontSpace;
                rowSeatCount = 0;
            }
        }
    }

    public static ArrayList<Integer> generateRandomArray(int bookedTotal, int bound) {
        ArrayList<Integer> list = new ArrayList<>(bookedTotal);
        Random random = new Random();
        for (int i = 0; i < bookedTotal; i++) {
            list.add(random.nextInt(bound));
        }
        return list;
    }


    public static void main(String[] args) {
        new bookpgnew();
    }
}