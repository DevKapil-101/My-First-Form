import javax.swing.*;
import java.awt.*;

public class myWindow extends JFrame {
    private JLabel heading;
    private Font headingFont = new Font("Arial", Font.BOLD, 30);
    private Font labelFont = new Font("Arial", Font.PLAIN, 18);
    private Font textFieldFont = new Font("Arial", Font.PLAIN, 22);

    private JPanel mainPanel;
    private JLabel nameLabel, passLabel, emailLabel;
    private JTextField nameTextField, emailTextField;
    private JPasswordField passField;
    private JButton btn1, btn2;

    // Constructor
    myWindow() {
        super.setTitle("First Form");
        super.setSize(600, 400);
        super.setLocation(200, 50);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.createGUI();

        super.setVisible(true);

        System.out.println("This is constructor...");
    }

    public void createGUI() {
        // This method creates our GUI
        this.setLayout(new BorderLayout());
        heading = new JLabel("MY FIRST FORM");
        heading.setFont(headingFont);
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0)); // Added margin to the heading

        this.add(heading, BorderLayout.NORTH);

        // Working with JPanel
        mainPanel = new JPanel();

        // Setting layout for mainPanel
        mainPanel.setLayout(new GridLayout(4, 2, 10, 10)); // Added spacing between components

        nameLabel = new JLabel("Enter Name");
        nameLabel.setFont(labelFont);

        passLabel = new JLabel("Enter Password");
        passLabel.setFont(labelFont);

        emailLabel = new JLabel("Enter Email");
        emailLabel.setFont(labelFont);

        nameTextField = new JTextField();
        nameTextField.setFont(textFieldFont);

        passField = new JPasswordField();
        passField.setFont(textFieldFont);

        emailTextField = new JTextField();
        emailTextField.setFont(textFieldFont);

        btn1 = new JButton("SUBMIT");
        btn1.setFont(labelFont);

        btn2 = new JButton("RESET");
        btn2.setFont(labelFont);

        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);

        mainPanel.add(passLabel);
        mainPanel.add(passField);

        mainPanel.add(emailLabel);
        mainPanel.add(emailTextField);

        mainPanel.add(btn1);
        mainPanel.add(btn2);

        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Added padding to the panel

        this.add(mainPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new myWindow();
    }
}
