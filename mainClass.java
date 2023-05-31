import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mainClass {

    static JFrame mainFrame;
    JPanel mainPanel;
    JLabel imageLabel;
    JLabel TextLabel;

    mainClass() {

        mainFrame = new JFrame("FORMULA WIZARD");
        mainPanel = new JPanel();
        mainFrame.setResizable(false);
        ImageIcon image = new ImageIcon(getClass().getResource("coolasf.jpg"));
        imageLabel = new JLabel(image);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        mainFrame.add(mainPanel);
        mainFrame.setSize(screenWidth, screenHeight);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel.setBackground(Color.cyan);
        JFrame.setDefaultLookAndFeelDecorated(true);

        imageLabel.setSize(screenWidth, screenHeight);

        JLabel titleLabel = new JLabel("FORMULA WIZARD");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 48));
        titleLabel.setForeground(Color.white);
        titleLabel.setBounds(580, 250, screenWidth, screenHeight / 4);
        mainPanel.add(titleLabel);

        JLabel centerTextLabel = new JLabel("Click Anywhere to proceed");
        centerTextLabel.setFont(new Font("Serif", Font.BOLD, 28));
        centerTextLabel.setForeground(Color.white);
        centerTextLabel.setBounds(screenWidth / 2 - 150, 780, 700, 50);
        mainPanel.add(centerTextLabel);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(imageLabel, BorderLayout.NORTH);

        mainFrame.pack();
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);

    }
}
