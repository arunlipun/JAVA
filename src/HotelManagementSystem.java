//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.util.ArrayList;
//import java.time.LocalDate;
//
//public class HotelManagementSystem extends JFrame {
//    static class Customer {
//        String name, room, govtId, mobile, gender, age, acType;
//        LocalDate date;
//        Customer(String name, String room, String govtId, String mobile, String gender, String age, String acType) {
//            this.name = name;
//            this.room = room;
//            this.govtId = govtId;
//            this.mobile = mobile;
//            this.gender = gender;
//            this.age = age;
//            this.acType = acType;
//            this.date = LocalDate.now();
//        }
//        public String toString() {
//            return "Name: " + name + ", Room: " + room + ", Govt ID: " + govtId +
//                    ", Mobile: " + mobile + ", Gender: " + gender + ", Age: " + age +
//                    ", AC Type: " + acType + ", Date: " + date;
//        }
//    }
//
//    static ArrayList<Customer> customers = new ArrayList<>();
//
//    public HotelManagementSystem() {
//        setTitle("Hotel Management System");
//        setSize(600, 400);
//        setLayout(new BorderLayout());
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//        JLabel title = new JLabel("Welcome to My Hotel", JLabel.CENTER);
//        title.setFont(new Font("Arial", Font.BOLD, 24));
//        add(title, BorderLayout.NORTH);
//
//        JPanel buttonPanel = new JPanel();
//        JButton bookBtn = new JButton("Book Room");
//        JButton detailsBtn = new JButton("Customer Details");
//        JButton checkoutBtn = new JButton("Check Out");
//
//        bookBtn.addActionListener(e -> showBookingForm());
//        detailsBtn.addActionListener(e -> showCustomerDetails());
//        checkoutBtn.addActionListener(e -> checkOutCustomer());
//
//        buttonPanel.add(bookBtn);
//        buttonPanel.add(detailsBtn);
//        buttonPanel.add(checkoutBtn);
//
//        add(buttonPanel, BorderLayout.CENTER);
//        setVisible(true);
//    }
//
//    private void showBookingForm() {
//        JFrame bookingFrame = new JFrame("Book a Room");
//        bookingFrame.setSize(400, 500);
//        bookingFrame.setLayout(null);
//
//        JLabel nameLabel = new JLabel("Name:");
//        JTextField nameField = new JTextField();
//        JLabel roomLabel = new JLabel("Room No:");
//        JTextField roomField = new JTextField();
//        JLabel idLabel = new JLabel("Govt ID:");
//        JTextField idField = new JTextField();
//        JLabel mobileLabel = new JLabel("Mobile:");
//        JTextField mobileField = new JTextField();
//        JLabel genderLabel = new JLabel("Gender:");
//        String[] genders = { "Male", "Female", "Other" };
//        JComboBox<String> genderBox = new JComboBox<>(genders);
//        JLabel ageLabel = new JLabel("Age:");
//        JTextField ageField = new JTextField();
//        JLabel acLabel = new JLabel("Room Type:");
//        String[] acTypes = { "AC", "Non-AC" };
//        JComboBox<String> acBox = new JComboBox<>(acTypes);
//        JButton submitBtn = new JButton("Book");
//
//        nameLabel.setBounds(30, 30, 100, 30);
//        nameField.setBounds(150, 30, 180, 30);
//        roomLabel.setBounds(30, 70, 100, 30);
//        roomField.setBounds(150, 70, 180, 30);
//        idLabel.setBounds(30, 110, 100, 30);
//        idField.setBounds(150, 110, 180, 30);
//        mobileLabel.setBounds(30, 150, 100, 30);
//        mobileField.setBounds(150, 150, 180, 30);
//        genderLabel.setBounds(30, 190, 100, 30);
//        genderBox.setBounds(150, 190, 180, 30);
//        ageLabel.setBounds(30, 230, 100, 30);
//        ageField.setBounds(150, 230, 180, 30);
//        acLabel.setBounds(30, 270, 100, 30);
//        acBox.setBounds(150, 270, 180, 30);
//        submitBtn.setBounds(120, 330, 100, 40);
//
//        submitBtn.addActionListener(e -> {
//            String name = nameField.getText();
//            String room = roomField.getText();
//            String id = idField.getText();
//            String mobile = mobileField.getText();
//            String gender = (String) genderBox.getSelectedItem();
//            String age = ageField.getText();
//            String acType = (String) acBox.getSelectedItem();
//
//            if (name.isEmpty() || room.isEmpty() || id.isEmpty() || mobile.isEmpty() || age.isEmpty()) {
//                JOptionPane.showMessageDialog(bookingFrame, "Please fill all fields!");
//            } else {
//                customers.add(new Customer(name, room, id, mobile, gender, age, acType));
//                JOptionPane.showMessageDialog(bookingFrame, "Room Booked Successfully!");
//                bookingFrame.dispose();
//            }
//        });
//
//        bookingFrame.add(nameLabel); bookingFrame.add(nameField);
//        bookingFrame.add(roomLabel); bookingFrame.add(roomField);
//        bookingFrame.add(idLabel); bookingFrame.add(idField);
//        bookingFrame.add(mobileLabel); bookingFrame.add(mobileField);
//        bookingFrame.add(genderLabel); bookingFrame.add(genderBox);
//        bookingFrame.add(ageLabel); bookingFrame.add(ageField);
//        bookingFrame.add(acLabel); bookingFrame.add(acBox);
//        bookingFrame.add(submitBtn);
//        bookingFrame.setVisible(true);
//    }
//
//    private void showCustomerDetails() {
//        JFrame detailsFrame = new JFrame("Customer Details");
//        detailsFrame.setSize(500, 400);
//        JTextArea area = new JTextArea();
//        if (customers.isEmpty()) {
//            area.setText("No bookings available.");
//        } else {
//            StringBuilder sb = new StringBuilder("All Customer Bookings:\n\n");
//            for (Customer c : customers) {
//                sb.append(c).append("\n\n");
//            }
//            area.setText(sb.toString());
//        }
//        area.setEditable(false);
//        detailsFrame.add(new JScrollPane(area));
//        detailsFrame.setVisible(true);
//    }
//
//    private void checkOutCustomer() {
//        JFrame checkoutFrame = new JFrame("Check Out Customer");
//        checkoutFrame.setSize(300, 200);
//        checkoutFrame.setLayout(null);
//
//        JLabel label = new JLabel("Enter Room No:");
//        JTextField roomField = new JTextField();
//        JButton removeBtn = new JButton("Check Out");
//
//        label.setBounds(30, 30, 120, 30);
//        roomField.setBounds(150, 30, 100, 30);
//        removeBtn.setBounds(90, 80, 100, 30);
//
//        removeBtn.addActionListener(e -> {
//            String roomNo = roomField.getText();
//            boolean removed = customers.removeIf(c -> c.room.equals(roomNo));
//            if (removed) {
//                JOptionPane.showMessageDialog(checkoutFrame, "Customer Checked Out!");
//            } else {
//                JOptionPane.showMessageDialog(checkoutFrame, "No customer found with this Room No.");
//            }
//            checkoutFrame.dispose();
//        });
//
//        checkoutFrame.add(label);
//        checkoutFrame.add(roomField);
//        checkoutFrame.add(removeBtn);
//        checkoutFrame.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new HotelManagementSystem();
//    }
//}
//



//============================================================================================================================


// HotelManagementSystem.java
// Full code with booking, AC/Non-AC + suite type + price, calendar date selection, check-in, and customer details.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.HashMap;

public class HotelManagementSystem extends JFrame {
    static class Customer {
        String name, room, govtId, mobile, gender, age;
        String acType, suiteType;
        int price;
        LocalDate date;
        boolean isCheckedIn;

        Customer(String name, String room, String govtId, String mobile, String gender, String age,
                 String acType, String suiteType, int price, LocalDate date) {
            this.name = name;
            this.room = room;
            this.govtId = govtId;
            this.mobile = mobile;
            this.gender = gender;
            this.age = age;
            this.acType = acType;
            this.suiteType = suiteType;
            this.price = price;
            this.date = date;
            this.isCheckedIn = false;
        }

        public String toString() {
            return "Name: " + name + ", Room: " + room + ", Govt ID: " + govtId +
                    ", Mobile: " + mobile + ", Gender: " + gender + ", Age: " + age +
                    ", AC Type: " + acType + ", Suite Type: " + suiteType +
                    ", Price: ₹" + price + ", Booking Date: " + date +
                    ", Checked-In: " + (isCheckedIn ? "Yes" : "No");
        }
    }

    static ArrayList<Customer> customers = new ArrayList<>();

    public HotelManagementSystem() {
        setTitle("Hotel Management System");
        setSize(600, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel title = new JLabel("Welcome to My Hotel", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        add(title, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        JButton bookBtn = new JButton("Book Room");
        JButton detailsBtn = new JButton("Customer Details");
        JButton checkInBtn = new JButton("Check In");
        JButton checkoutBtn = new JButton("Check Out");

        bookBtn.addActionListener(e -> showBookingForm());
        detailsBtn.addActionListener(e -> showCustomerDetails());
        checkInBtn.addActionListener(e -> checkInCustomer());
        checkoutBtn.addActionListener(e -> checkOutCustomer());

        buttonPanel.add(bookBtn);
        buttonPanel.add(detailsBtn);
        buttonPanel.add(checkInBtn);
        buttonPanel.add(checkoutBtn);

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void showBookingForm() {
        JFrame bookingFrame = new JFrame("Book a Room");
        bookingFrame.setSize(400, 600);
        bookingFrame.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel roomLabel = new JLabel("Room No:");
        JTextField roomField = new JTextField();
        JLabel idLabel = new JLabel("Govt ID:");
        JTextField idField = new JTextField();
        JLabel mobileLabel = new JLabel("Mobile:");
        JTextField mobileField = new JTextField();
        JLabel genderLabel = new JLabel("Gender:");
        String[] genders = { "Male", "Female", "Other" };
        JComboBox<String> genderBox = new JComboBox<>(genders);
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();
        JLabel acLabel = new JLabel("AC Type:");
        String[] acTypes = { "AC", "Non-AC" };
        JComboBox<String> acBox = new JComboBox<>(acTypes);
        JLabel suiteLabel = new JLabel("Suite Type:");
        String[] suiteTypes = { "Single", "Double" };
        JComboBox<String> suiteBox = new JComboBox<>(suiteTypes);
        JLabel dateLabel = new JLabel("Booking Date:");
        JSpinner dateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "yyyy-MM-dd");
        dateSpinner.setEditor(dateEditor);
        JButton submitBtn = new JButton("Book");

        nameLabel.setBounds(30, 30, 100, 25);
        nameField.setBounds(150, 30, 180, 25);
        roomLabel.setBounds(30, 60, 100, 25);
        roomField.setBounds(150, 60, 180, 25);
        idLabel.setBounds(30, 90, 100, 25);
        idField.setBounds(150, 90, 180, 25);
        mobileLabel.setBounds(30, 120, 100, 25);
        mobileField.setBounds(150, 120, 180, 25);
        genderLabel.setBounds(30, 150, 100, 25);
        genderBox.setBounds(150, 150, 180, 25);
        ageLabel.setBounds(30, 180, 100, 25);
        ageField.setBounds(150, 180, 180, 25);
        acLabel.setBounds(30, 210, 100, 25);
        acBox.setBounds(150, 210, 180, 25);
        suiteLabel.setBounds(30, 240, 100, 25);
        suiteBox.setBounds(150, 240, 180, 25);
        dateLabel.setBounds(30, 270, 100, 25);
        dateSpinner.setBounds(150, 270, 180, 25);
        submitBtn.setBounds(130, 320, 100, 35);

        submitBtn.addActionListener(e -> {
            String name = nameField.getText();
            String room = roomField.getText();
            String id = idField.getText();
            String mobile = mobileField.getText();
            String gender = (String) genderBox.getSelectedItem();
            String age = ageField.getText();
            String ac = (String) acBox.getSelectedItem();
            String suite = (String) suiteBox.getSelectedItem();
            java.util.Date selectedDate = (java.util.Date) dateSpinner.getValue();
            LocalDate date = new java.sql.Date(selectedDate.getTime()).toLocalDate();

            int price = 0;
            if (ac.equals("AC") && suite.equals("Single")) price = 1500;
            else if (ac.equals("AC") && suite.equals("Double")) price = 2500;
            else if (ac.equals("Non-AC") && suite.equals("Single")) price = 1000;
            else price = 1800;

            if (name.isEmpty() || room.isEmpty() || id.isEmpty() || mobile.isEmpty() || age.isEmpty()) {
                JOptionPane.showMessageDialog(bookingFrame, "Please fill all fields!");
            } else {
                customers.add(new Customer(name, room, id, mobile, gender, age, ac, suite, price, date));
                JOptionPane.showMessageDialog(bookingFrame, "Room Booked Successfully!");
                bookingFrame.dispose();
            }
        });

        bookingFrame.add(nameLabel); bookingFrame.add(nameField);
        bookingFrame.add(roomLabel); bookingFrame.add(roomField);
        bookingFrame.add(idLabel); bookingFrame.add(idField);
        bookingFrame.add(mobileLabel); bookingFrame.add(mobileField);
        bookingFrame.add(genderLabel); bookingFrame.add(genderBox);
        bookingFrame.add(ageLabel); bookingFrame.add(ageField);
        bookingFrame.add(acLabel); bookingFrame.add(acBox);
        bookingFrame.add(suiteLabel); bookingFrame.add(suiteBox);
        bookingFrame.add(dateLabel); bookingFrame.add(dateSpinner);
        bookingFrame.add(submitBtn);
        bookingFrame.setVisible(true);
    }

    private void showCustomerDetails() {
        JFrame frame = new JFrame("Customer Details");
        frame.setSize(500, 400);
        JTextArea area = new JTextArea();
        StringBuilder sb = new StringBuilder();
        if (customers.isEmpty()) {
            sb.append("No customers found.");
        } else {
            for (Customer c : customers) sb.append(c).append("\n\n");
        }
        area.setText(sb.toString());
        area.setEditable(false);
        frame.add(new JScrollPane(area));
        frame.setVisible(true);
    }

    private void checkInCustomer() {
        String roomNo = JOptionPane.showInputDialog("Enter Room No to Check-In:");
        boolean found = false;
        for (Customer c : customers) {
            if (c.room.equals(roomNo)) {
                c.isCheckedIn = true;
                JOptionPane.showMessageDialog(this, "Customer Checked-In Successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(this, "Room not found.");
        }
    }

    private void checkOutCustomer() {
        String roomNo = JOptionPane.showInputDialog("Enter Room No to Check-Out:");
        boolean removed = customers.removeIf(c -> c.room.equals(roomNo));
        if (removed) {
            JOptionPane.showMessageDialog(this, "Customer Checked-Out Successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "No customer found with this Room No.");
        }
    }

    public static void main(String[] args) {
        new HotelManagementSystem();
    }
}
