import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Gui extends mainClass {

    JFrame frame;
    JPanel panel;
    JLabel TitleLabel;
    JButton Electronics_button;
    JPanel electronics_panel;
    JButton Electrical_button;
    JButton BasicMath_button;
    JButton BasicPhysics_button;
    JFrame Physics_frame;
    JRadioButton lawsRadioButton;
    JRadioButton thermoRadioButton;
    JRadioButton emRadioButton;
    JRadioButton keRadioButton;
    JRadioButton peRadioButton;
    JRadioButton workRadioButton;
    JRadioButton refractedRadioButton;
    JRadioButton efRadioButton;
    JRadioButton finalERadioButton;
    JRadioButton energyERadioButton;
    JRadioButton addRadioButton;
    JRadioButton subtractRadioButton;
    JRadioButton multiplyRadioButton;
    JRadioButton divideRadioButton;
    JRadioButton minimumRadioButton;
    JRadioButton maximumRadioButton;
    JRadioButton RectangleRadioButton;
    JRadioButton CircleRadioButton;
    JRadioButton TriangleRadioButton;
    JRadioButton OhmsLawRadioButton;
    JRadioButton PowerRadioButton;
    JRadioButton EnergyRadioButton;
    JRadioButton FrequencyRadioButton;
    JRadioButton ParallelRRadioButton;
    JRadioButton SeriesRRadioButton;
    JRadioButton InductiveRadioButton;
    JRadioButton CapacitiveRadioButton;
    JRadioButton ResistivityRadioButton;
    JRadioButton ImpedanceRadioButton;
    JRadioButton efficiencyRadioButton;
    JRadioButton voltageDivideRadioButton;
    JRadioButton CapacitanceRadioButton;
    JRadioButton InductanceRadioButton;
    JRadioButton ResonantFRadioButton;
    JRadioButton BWRadioButton;
    JRadioButton GainRadioButton;
    JRadioButton DecibelRadioButton;
    JRadioButton rctimeRadioButton;
    JRadioButton NoiseFigureRadioButton;

    public Gui() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        panel = new JPanel();
        panel.setLayout(null);
        frame = new JFrame("FORMULA WIZARD");
        frame.setSize(screenWidth, screenHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.add(panel);
        panel.setBackground(Color.decode("#242582"));

        TitleLabel = new JLabel("SELECT A DOMAIN");
        TitleLabel.setForeground(Color.WHITE);
        TitleLabel.setBounds(600, 200, 1000, 100);
        TitleLabel.setFont(new Font("Times New Roman", Font.PLAIN, 34));
        panel.add(TitleLabel, BorderLayout.NORTH);

        Electronics_button = new JButton("ELECTRONICS");
        Electronics_button.setBounds(200, 450, 250, 50);
        Electronics_button.setBorder(null);
        Electronics_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFrame entc_Frame = new JFrame("ELECTRONICS DOMAIN ");
                entc_Frame.setBounds(0, 0, screenWidth, screenHeight);
                electronics_panel = new JPanel();
                electronics_panel.setBackground(Color.decode("#077b8a"));
                electronics_panel.setLayout(null);

                JLabel labelh = new JLabel("ELECTRONICS DOMAIN ");
                labelh.setBounds(550, 50, 900, 50);
                labelh.setFont(new Font("Times New Roman", Font.PLAIN, 40));
                electronics_panel.add(labelh);

                voltageDivideRadioButton = new JRadioButton("Voltage Divider");
                voltageDivideRadioButton.setBounds(100, 200, 200, 50);
                voltageDivideRadioButton.setBackground(Color.decode("#e3b448"));
                voltageDivideRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electronics_panel.add(voltageDivideRadioButton);

                voltageDivideRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Voltage Divider");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("VOLTAGE DIVIDER CALCULATIONS");
                        main.setBounds(550, 50, 700, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Input Voltage (Vin) (Volts): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Resistance (R1) (Ohms): ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);
                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JLabel we = new JLabel("Resistance (R1) (Ohms): ");
                        we.setBounds(50, 500, 600, 40);
                        we.setForeground(Color.BLACK);
                        we.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(we);
                        JTextField wr = new JTextField();
                        wr.setBounds(500, 500, 300, 40);
                        fp.add(wr);

                        JLabel ans = new JLabel("");
                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(600, 600, 300, 30);
                        fp.add(calculateButton);
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, v, R1, R2;

                                    v = Double.parseDouble(ft.getText());
                                    R1 = Double.parseDouble(sa.getText());
                                    R2 = Double.parseDouble(wr.getText());

                                    answer = voltageDivider(v, R1, R2);
                                    String formattedAnswer = String.format("%.2f", answer);

                                    ans.setText("Voltage = " + formattedAnswer + " Volts");
                                    ans.setBounds(600, 750, 300, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                CapacitanceRadioButton = new JRadioButton("Capacitance");
                CapacitanceRadioButton.setBounds(100, 350, 200, 50);
                CapacitanceRadioButton.setBackground(Color.decode("#e3b448"));
                CapacitanceRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electronics_panel.add(CapacitanceRadioButton);

                CapacitanceRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Capacitance");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("CAPACITANCE CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Charge (Coulumb): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Voltage (Volts): ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);
                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JLabel ans = new JLabel("");
                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(600, 500, 300, 30);
                        fp.add(calculateButton);
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, v, R1;

                                    v = Double.parseDouble(ft.getText());
                                    R1 = Double.parseDouble(sa.getText());

                                    answer = capacitance(v, R1);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Capacitance = " + formattedAnswer + " micro Farads");
                                    ans.setBounds(600, 750, 400, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                InductanceRadioButton = new JRadioButton("Inductance");
                InductanceRadioButton.setBounds(100, 500, 200, 50);
                InductanceRadioButton.setBackground(Color.decode("#e3b448"));
                InductanceRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electronics_panel.add(InductanceRadioButton);

                InductanceRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Inductance");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("INDUCTANCE CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Voltage (Volts): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Change in current (didt): ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);
                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JLabel ans = new JLabel("");
                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(600, 500, 300, 30);
                        fp.add(calculateButton);
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, v, R1;

                                    v = Double.parseDouble(ft.getText());
                                    R1 = Double.parseDouble(sa.getText());

                                    answer = inductance(v, R1);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Inductance = " + formattedAnswer + " mili Henry");
                                    ans.setBounds(600, 750, 400, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                ResonantFRadioButton = new JRadioButton("Resonant Frequency");
                ResonantFRadioButton.setBounds(600, 200, 200, 50);
                ResonantFRadioButton.setBackground(Color.decode("#e3b448"));
                ResonantFRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electronics_panel.add(ResonantFRadioButton);

                ResonantFRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Resonant Frequency");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("RESONANT FREQUENCY CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Inductance (mili Henry): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Capacitance (micro Farad): ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);
                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JLabel ans = new JLabel("");
                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(600, 500, 300, 30);
                        fp.add(calculateButton);
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, v, R1;

                                    v = Double.parseDouble(ft.getText());
                                    R1 = Double.parseDouble(sa.getText());

                                    answer = resonantFrequency(v, R1);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Resonant Frequency = " + formattedAnswer + " Hertz");
                                    ans.setBounds(600, 750, 400, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                BWRadioButton = new JRadioButton("BandWidth");
                BWRadioButton.setBounds(600, 350, 200, 50);
                BWRadioButton.setBackground(Color.decode("#e3b448"));
                BWRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electronics_panel.add(BWRadioButton);

                BWRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("BandWidth");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("BANDWIDTH CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Frequency of upper Band (F1):");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Frequency of Lower Band (F2): ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);
                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JLabel ans = new JLabel("");
                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(600, 500, 300, 30);
                        fp.add(calculateButton);
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, v, R1;

                                    v = Double.parseDouble(ft.getText());
                                    R1 = Double.parseDouble(sa.getText());

                                    answer = bandwidth(v, R1);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("BandWidth = " + formattedAnswer + " Hertz");
                                    ans.setBounds(600, 750, 400, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                GainRadioButton = new JRadioButton("Gain");
                GainRadioButton.setBounds(600, 500, 200, 50);
                GainRadioButton.setBackground(Color.decode("#e3b448"));
                GainRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electronics_panel.add(GainRadioButton);

                GainRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Gain");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("GAIN CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Output Voltage(Volts): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Input Voltage(Volts):");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);
                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JLabel ans = new JLabel("");
                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(600, 500, 300, 30);
                        fp.add(calculateButton);
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, v, R1;

                                    v = Double.parseDouble(ft.getText());
                                    R1 = Double.parseDouble(sa.getText());

                                    answer = gain(v, R1);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Gain = " + formattedAnswer);
                                    ans.setBounds(600, 750, 400, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                DecibelRadioButton = new JRadioButton("Decibel(dB)");
                DecibelRadioButton.setBounds(1100, 200, 200, 50);
                DecibelRadioButton.setBackground(Color.decode("#e3b448"));
                DecibelRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electronics_panel.add(DecibelRadioButton);

                DecibelRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Decibel(dB)");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("DECIBEL CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Output Voltage(Volts): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Input Voltage(Volts):");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);
                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JLabel ans = new JLabel("");
                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(600, 500, 300, 30);
                        fp.add(calculateButton);
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, v, R1;

                                    v = Double.parseDouble(ft.getText());
                                    R1 = Double.parseDouble(sa.getText());

                                    answer = decibel(v, R1);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Decibel(dB) = " + formattedAnswer);
                                    ans.setBounds(600, 750, 400, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                rctimeRadioButton = new JRadioButton("RC time constant");
                rctimeRadioButton.setBounds(1100, 350, 200, 50);
                rctimeRadioButton.setBackground(Color.decode("#e3b448"));
                rctimeRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electronics_panel.add(rctimeRadioButton);

                rctimeRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("RC time constant");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("RC TIME CONSTANT CALCULATIONS");
                        main.setBounds(600, 50, 700, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Resistance (ohm): ");
                        fl.setBounds(50, 170, 600, 30);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(800, 170, 300, 30);
                        fp.add(ft);

                        JLabel sz = new JLabel("Capacitance (micro Farad):");
                        sz.setBounds(50, 240, 600, 30);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);
                        JTextField sa = new JTextField();
                        sa.setBounds(800, 240, 300, 30);
                        fp.add(sa);

                        JLabel yz = new JLabel("Voltage across the capacitor after time t:");
                        yz.setBounds(50, 310, 600, 30);
                        yz.setForeground(Color.BLACK);
                        yz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(yz);
                        JTextField zz = new JTextField();
                        zz.setBounds(800, 310, 300, 30);
                        fp.add(zz);

                        JLabel pp = new JLabel("Initial voltage across the capacitor (v0)");
                        pp.setBounds(50, 380, 600, 30);
                        pp.setForeground(Color.BLACK);
                        pp.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(pp);
                        JTextField pj = new JTextField();
                        pj.setBounds(800, 380, 300, 30);
                        fp.add(pj);

                        JLabel ans = new JLabel("");
                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(600, 500, 300, 30);
                        fp.add(calculateButton);
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, r, c, t1, t2;

                                    r = Double.parseDouble(ft.getText());
                                    c = Double.parseDouble(sa.getText());
                                    t1 = Double.parseDouble(zz.getText());
                                    t2 = Double.parseDouble(pj.getText());

                                    answer = rcTimeConstant(r, c, t1, t2);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("RC time constant = " + formattedAnswer + " seconds");
                                    ans.setBounds(600, 750, 400, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                NoiseFigureRadioButton = new JRadioButton("Noise Figure");
                NoiseFigureRadioButton.setBounds(1100, 500, 200, 50);
                NoiseFigureRadioButton.setBackground(Color.decode("#e3b448"));
                NoiseFigureRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electronics_panel.add(NoiseFigureRadioButton);

                NoiseFigureRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Noise Figure");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("NOISE FIGURE CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Input SNR: ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Ouput SNR: ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);
                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JLabel ans = new JLabel("");
                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(600, 500, 300, 30);
                        fp.add(calculateButton);
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, v, R1;

                                    v = Double.parseDouble(ft.getText());
                                    R1 = Double.parseDouble(sa.getText());

                                    answer = noiseFigure(v, R1);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Noise Figure = " + formattedAnswer);
                                    ans.setBounds(600, 750, 400, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });
                entc_Frame.add(electronics_panel);
                entc_Frame.setVisible(true);

            }
        });
        panel.add(Electronics_button);

        Electrical_button = new JButton("ELECTRICAL");
        Electrical_button.setBounds(500, 450, 250, 50);
        Electrical_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFrame EE_frame = new JFrame("ELECTRICAL DOMAIN ");
                EE_frame.setBounds(0, 0, screenWidth, screenHeight);
                JPanel electrical_panel = new JPanel();
                electrical_panel.setBackground(Color.decode("#077b8a"));
                electrical_panel.setLayout(null);

                JLabel labelh = new JLabel("ELECTRICAL DOMAIN ");
                labelh.setBounds(550, 50, 900, 50);
                labelh.setFont(new Font("Times New Roman", Font.PLAIN, 40));
                electrical_panel.add(labelh);

                OhmsLawRadioButton = new JRadioButton("Ohm's Law");
                OhmsLawRadioButton.setBounds(100, 200, 200, 50);
                OhmsLawRadioButton.setBackground(Color.decode("#e3b448"));
                OhmsLawRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electrical_panel.add(OhmsLawRadioButton);
                OhmsLawRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Ohm's Law");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("Ohms LAW CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel note = new JLabel("NOTE: Enter 0 for the quantity you want to find out");
                        note.setBounds(50, 650, 600, 45);
                        note.setForeground(Color.RED);
                        fp.add(note);

                        JLabel fl = new JLabel("Voltage (Volts): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Current (Amperes): ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);
                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JLabel we = new JLabel("Resistance (Ohm): ");
                        we.setBounds(50, 500, 600, 40);
                        we.setForeground(Color.BLACK);
                        we.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(we);
                        JTextField wr = new JTextField();
                        wr.setBounds(500, 500, 300, 40);
                        fp.add(wr);

                        JLabel ans = new JLabel("");
                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(600, 600, 300, 30);
                        fp.add(calculateButton);
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, v, I, R;

                                    // Check if the input fields are non-empty and contain valid numbers
                                    if (fl.getText().isEmpty() || !fl.getText().matches("-?\\d+(\\.\\d+)?")) {
                                        throw new NumberFormatException();
                                    }
                                    if (sa.getText().isEmpty() || !sa.getText().matches("-?\\d+(\\.\\d+)?")) {
                                        throw new NumberFormatException();
                                    }
                                    if (wr.getText().isEmpty() || !wr.getText().matches("-?\\d+(\\.\\d+)?")) {
                                        throw new NumberFormatException();
                                    }

                                    // Parse the input fields as doubles
                                    v = Double.parseDouble(ft.getText());
                                    I = Double.parseDouble(sa.getText());
                                    R = Double.parseDouble(wr.getText());

                                    answer = ohmsLaw(v, I, R);
                                    if (v == 0) {
                                        ans.setText("Voltage =" + Double.toString(answer) + " Volts");
                                    } else if (I == 0) {
                                        ans.setText("Current = " + Double.toString(answer) + " Amperes");
                                    } else if (R == 0) {
                                        ans.setText("Resistance = " + Double.toString(answer) + "Ohms");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Invalid input. Please Read the Note");
                                    }
                                    ans.setBounds(600, 600, 300, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                PowerRadioButton = new JRadioButton("Power");
                PowerRadioButton.setBounds(100, 350, 200, 50);
                PowerRadioButton.setBackground(Color.decode("#e3b448"));
                PowerRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electrical_panel.add(PowerRadioButton);
                PowerRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Power");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("POWER CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Voltage (Volts): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Current (Amperes): ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);
                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JLabel we = new JLabel("Power Factor(0-1): ");
                        we.setBounds(50, 500, 600, 40);
                        we.setForeground(Color.BLACK);
                        we.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(we);
                        JTextField wr = new JTextField();
                        wr.setBounds(500, 500, 300, 40);
                        fp.add(wr);

                        JLabel ans = new JLabel("");
                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(550, 600, 200, 30);
                        fp.add(calculateButton);
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, v, I, pf;

                                    v = Double.parseDouble(ft.getText());
                                    I = Double.parseDouble(sa.getText());
                                    pf = Double.parseDouble(wr.getText());

                                    if (pf > 1 || pf < 0) {
                                        JOptionPane.showMessageDialog(null, "Enter valid value of Power Factor");
                                    } else {

                                        answer = powerFormula(v, I, pf);
                                        ans.setText("Power =" + Double.toString(answer) + " Watts");
                                    }

                                    ans.setBounds(600, 700, 300, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                EnergyRadioButton = new JRadioButton("Energy");
                EnergyRadioButton.setBounds(100, 500, 200, 50);
                EnergyRadioButton.setBackground(Color.decode("#e3b448"));
                EnergyRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electrical_panel.add(EnergyRadioButton);
                EnergyRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Energy");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("ENERGY CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Power (Watts): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Time (Seconds): ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);

                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(550, 450, 200, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");

                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, power, time;

                                    power = Double.parseDouble(ft.getText());
                                    time = Double.parseDouble(sa.getText());

                                    answer = energyFormula(power, time);

                                    ans.setText("Energy= " + answer + " Joules");
                                    ans.setBounds(600, 550, 300, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                ParallelRRadioButton = new JRadioButton("Parallel Resistances");
                ParallelRRadioButton.setBounds(550, 200, 200, 50);
                ParallelRRadioButton.setBackground(Color.decode("#e3b448"));
                ParallelRRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electrical_panel.add(ParallelRRadioButton);
                ParallelRRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Parallel Resistances");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("PARALLEL RESISTANCE CALCULATIONS");
                        main.setBounds(550, 50, 700, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Enter number of Resistamces: ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JButton calculateButton = new JButton("CONFIRM");
                        calculateButton.setBounds(550, 400, 200, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");

                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int num1 = Integer.parseInt(ft.getText()); // get the first input as an integer
                                    String input = JOptionPane
                                            .showInputDialog("Enter " + num1 + " values separated by commas");
                                    String[] values = input.split(","); // split the string into an array of values
                                                                        // using a comma delimiter
                                    if (values.length != num1) { // check if the count of values entered by the user is
                                                                 // not equal to num1
                                        throw new NumberFormatException(); // throw an exception if the counts don't
                                                                           // match
                                    }
                                    double[] num2 = new double[values.length]; // create an integer array to store the
                                                                               // force
                                    // values
                                    for (int i = 0; i < values.length; i++) {
                                        num2[i] = Integer.parseInt(values[i]); // convert each value to an integer and
                                                                               // store it in the array
                                    }
                                    double answer = parallelResistanceFormula(num1, num2);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Resistance = " + formattedAnswer + " ohms");
                                    ans.setBounds(600, 600, 300, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter " + ft.getText()
                                            + " valid numbers separated by commas.");
                                }
                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                FrequencyRadioButton = new JRadioButton("Frequency");
                FrequencyRadioButton.setBounds(550, 500, 200, 50);
                FrequencyRadioButton.setBackground(Color.decode("#e3b448"));
                FrequencyRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electrical_panel.add(FrequencyRadioButton);
                FrequencyRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Frequency");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("FREQUENCY CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Inductance (mili henry): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Capacitance (micro farad): ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);

                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(550, 450, 200, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");

                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, power, time;

                                    power = Double.parseDouble(ft.getText());
                                    time = Double.parseDouble(sa.getText());

                                    answer = frequencyFormula(power, time);

                                    ans.setText("Frequency= " + answer + " Hertz");
                                    ans.setBounds(600, 550, 300, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                SeriesRRadioButton = new JRadioButton("Series Resistances");
                SeriesRRadioButton.setBounds(550, 350, 200, 50);
                SeriesRRadioButton.setBackground(Color.decode("#e3b448"));
                SeriesRRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electrical_panel.add(SeriesRRadioButton);
                SeriesRRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Series Resistances");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("SERIES RESISTANCE CALCULATIONS");
                        main.setBounds(550, 50, 700, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Enter number of Resistances: ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JButton calculateButton = new JButton("CONFIRM");
                        calculateButton.setBounds(550, 400, 200, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");

                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int num1 = Integer.parseInt(ft.getText()); // get the first input as an integer
                                    String input = JOptionPane
                                            .showInputDialog("Enter " + num1 + " values separated by commas");
                                    String[] values = input.split(","); // split the string into an array of values
                                                                        // using a comma delimiter
                                    if (values.length != num1) { // check if the count of values entered by the user is
                                                                 // not equal to num1
                                        throw new NumberFormatException(); // throw an exception if the counts don't
                                                                           // match
                                    }
                                    double[] num2 = new double[values.length]; // create an integer array to store the
                                                                               // force
                                    // values
                                    for (int i = 0; i < values.length; i++) {
                                        num2[i] = Double.parseDouble(values[i]); // convert each value to an integer and
                                                                                 // store it in the array
                                    }
                                    double answer = seriesResistanceFormula(num1, num2);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Resistance = " + formattedAnswer + " ohms");
                                    ans.setBounds(600, 600, 300, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter " + ft.getText()
                                            + " valid numbers separated by commas.");
                                }
                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                CapacitiveRadioButton = new JRadioButton("Capacitive Reactance");
                CapacitiveRadioButton.setBounds(350, 650, 300, 50);
                CapacitiveRadioButton.setBackground(Color.decode("#e3b448"));
                CapacitiveRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electrical_panel.add(CapacitiveRadioButton);
                CapacitiveRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Capacitive Reactance");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("CAPACITIVE REACTANCE CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Frequency (Hertz): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Capacitance (micro farad): ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);

                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(550, 450, 200, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");

                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, capacitance, frequency;

                                    frequency = Double.parseDouble(ft.getText());
                                    capacitance = Double.parseDouble(sa.getText());

                                    answer = capacitiveReactanceFormula(capacitance, frequency);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Capacitive Reactance = " + formattedAnswer + " Ohms");
                                    ans.setBounds(600, 550, 600, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                InductiveRadioButton = new JRadioButton("Inductive Reactance");
                InductiveRadioButton.setBounds(850, 650, 300, 50);
                InductiveRadioButton.setBackground(Color.decode("#e3b448"));
                InductiveRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electrical_panel.add(InductiveRadioButton);
                InductiveRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Inductive Reactance");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("INDUCTIVE REACTANCE CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Frequency (Hertz): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Inductance (mili Henry): ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);

                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(550, 450, 200, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");

                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, capacitance, frequency;

                                    frequency = Double.parseDouble(ft.getText());
                                    capacitance = Double.parseDouble(sa.getText());

                                    answer = inductiveReactanceFormula(frequency, capacitance);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Capacitive Reactance = " + formattedAnswer + " Ohms");
                                    ans.setBounds(600, 550, 600, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                ResistivityRadioButton = new JRadioButton("Resistivity");
                ResistivityRadioButton.setBounds(1050, 200, 200, 50);
                ResistivityRadioButton.setBackground(Color.decode("#e3b448"));
                ResistivityRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electrical_panel.add(ResistivityRadioButton);
                ResistivityRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Resistivity");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("RESISTIVITY CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Resistance (Ohms): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Length (cm): ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);

                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JLabel dl = new JLabel("Cross Sectional Area (sq cm): ");
                        dl.setBounds(50, 500, 600, 40);
                        dl.setForeground(Color.BLACK);
                        dl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(dl);

                        JTextField dd = new JTextField();
                        dd.setBounds(500, 500, 300, 40);
                        fp.add(dd);

                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(550, 650, 200, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");

                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, resistance, length, Area;

                                    resistance = Double.parseDouble(ft.getText());
                                    length = Double.parseDouble(sa.getText());
                                    Area = Double.parseDouble(dd.getText());

                                    answer = resistivityFormula(resistance, length, Area);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Capacitive Reactance = " + formattedAnswer + " Ohms");
                                    ans.setBounds(600, 750, 600, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                ImpedanceRadioButton = new JRadioButton("Impedance");
                ImpedanceRadioButton.setBounds(1050, 350, 200, 50);
                ImpedanceRadioButton.setBackground(Color.decode("#e3b448"));
                ImpedanceRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electrical_panel.add(ImpedanceRadioButton);
                ImpedanceRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Impedance");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("IMPEDANCE CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Resistance (Ohms): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Inductive Reactance (ohms): ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);

                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JLabel dl = new JLabel("Capacitive Reactance (ohms): ");
                        dl.setBounds(50, 500, 600, 40);
                        dl.setForeground(Color.BLACK);
                        dl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(dl);

                        JTextField dd = new JTextField();
                        dd.setBounds(500, 500, 300, 40);
                        fp.add(dd);

                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(550, 650, 200, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");

                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, resistance, length, Area;

                                    resistance = Double.parseDouble(ft.getText());
                                    length = Double.parseDouble(sa.getText());
                                    Area = Double.parseDouble(dd.getText());

                                    answer = impedanceFormula(resistance, length, Area);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Impedance = " + formattedAnswer + " Ohms");
                                    ans.setBounds(600, 750, 600, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                efficiencyRadioButton = new JRadioButton("Efficiency");
                efficiencyRadioButton.setBounds(1050, 500, 200, 50);
                efficiencyRadioButton.setBackground(Color.decode("#e3b448"));
                efficiencyRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                electrical_panel.add(efficiencyRadioButton);
                efficiencyRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Efficiency");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("EFFICIENCY CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Input Power (Watts): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel sz = new JLabel("Output Power (Watts): ");
                        sz.setBounds(50, 350, 600, 40);
                        sz.setForeground(Color.BLACK);
                        sz.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(sz);

                        JTextField sa = new JTextField();
                        sa.setBounds(500, 350, 300, 40);
                        fp.add(sa);

                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(550, 500, 200, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");

                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, resistance, length;

                                    resistance = Double.parseDouble(ft.getText());
                                    length = Double.parseDouble(sa.getText());

                                    answer = EfficiencyCalculation(resistance, length);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Impedance = " + formattedAnswer + " Ohms");
                                    ans.setBounds(600, 750, 600, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                EE_frame.add(electrical_panel);
                EE_frame.setVisible(true);

            }
        });
        panel.add(Electrical_button);

        BasicMath_button = new JButton("MATHEMATICS");
        BasicMath_button.setBounds(800, 450, 250, 50);
        BasicMath_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFrame Math_frame = new JFrame("MATHEMATICS ");
                Math_frame.setBounds(0, 0, screenWidth, screenHeight);
                JPanel Math_panel = new JPanel();
                Math_panel.setBackground(Color.decode("#077b8a"));
                Math_panel.setLayout(null);

                JLabel labelh = new JLabel("MATHEMATICS DOMAIN ");
                labelh.setBounds(600, 50, 900, 50);
                labelh.setFont(new Font("Times New Roman", Font.PLAIN, 40));
                Math_panel.add(labelh);

                JLabel labeln = new JLabel("Choose a Shape ");
                labeln.setBounds(950, 200, 900, 40);
                labeln.setFont(new Font("Times New Roman", Font.PLAIN, 40));
                Math_panel.add(labeln);

                addRadioButton = new JRadioButton("Addition");
                addRadioButton.setBounds(100, 200, 200, 50);
                addRadioButton.setBackground(Color.decode("#e3b448"));
                addRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                Math_panel.add(addRadioButton);
                addRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Addition");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("Addition of Numbers");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel(" Enter Count of Numbers: ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JButton calculateButton = new JButton("CONFIRM");
                        calculateButton.setBounds(600, 300, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int num1 = Integer.parseInt(ft.getText()); // get the first input as an integer
                                    String input = JOptionPane
                                            .showInputDialog("Enter " + num1 + " values separated by commas");
                                    String[] values = input.split(","); // split the string into an array of values
                                                                        // using a comma delimiter
                                    int[] num2 = new int[values.length]; // create an integer array to store the force
                                                                         // values
                                    for (int i = 0; i < values.length; i++) {
                                        num2[i] = Integer.parseInt(values[i]); // convert each value to an integer and
                                                                               // store it in the array
                                    }
                                    int answer = 0;
                                    for (int i = 0; i < num2.length; i++) {
                                        answer += num2[i]; // add up the force values
                                    }
                                    ans.setText("Addition = " + Double.toString(answer));
                                    ans.setBounds(600, 600, 300, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                subtractRadioButton = new JRadioButton("Subtraction");
                subtractRadioButton.setBounds(100, 400, 200, 50);
                subtractRadioButton.setBackground(Color.decode("#e3b448"));
                subtractRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                Math_panel.add(subtractRadioButton);
                subtractRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Subtraction");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("Subtraction of Numbers");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel(" Enter Count of Numbers: ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JButton calculateButton = new JButton("CONFIRM");
                        calculateButton.setBounds(600, 300, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int num1 = Integer.parseInt(ft.getText()); // get the first input as an integer
                                    String input = JOptionPane
                                            .showInputDialog("Enter " + num1 + " values separated by commas");
                                    String[] values = input.split(","); // split the string into an array of values
                                                                        // using a comma delimiter
                                    if (values.length != num1) { // check if the count of values entered by the user is
                                                                 // not equal to num1
                                        throw new NumberFormatException(); // throw an exception if the counts don't
                                                                           // match
                                    }
                                    int[] num2 = new int[values.length]; // create an integer array to store the force
                                                                         // values
                                    for (int i = 0; i < values.length; i++) {
                                        num2[i] = Integer.parseInt(values[i]); // convert each value to an integer and
                                                                               // store it in the array
                                    }
                                    int answer = num2[0];
                                    for (int i = 1; i < num2.length; i++) {
                                        answer -= num2[i];
                                    }
                                    ans.setText("Subtraction = " + Double.toString(answer));
                                    ans.setBounds(600, 600, 300, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter " + ft.getText()
                                            + " valid numbers separated by commas.");
                                }
                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                multiplyRadioButton = new JRadioButton("Multiplication");
                multiplyRadioButton.setBounds(100, 600, 200, 50);
                multiplyRadioButton.setBackground(Color.decode("#e3b448"));
                multiplyRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                Math_panel.add(multiplyRadioButton);
                multiplyRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Multiplication");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("Multiplication of Numbers");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel(" Enter Count of Numbers: ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JButton calculateButton = new JButton("CONFIRM");
                        calculateButton.setBounds(600, 300, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int num1 = Integer.parseInt(ft.getText()); // get the first input as an integer
                                    String input = JOptionPane
                                            .showInputDialog("Enter " + num1 + " values separated by commas");
                                    String[] values = input.split(","); // split the string into an array of values
                                                                        // using a comma delimiter
                                    if (values.length != num1) { // check if the count of values entered by the user is
                                                                 // not equal to num1
                                        throw new NumberFormatException(); // throw an exception if the counts don't
                                                                           // match
                                    }
                                    int[] num2 = new int[values.length]; // create an integer array to store the force
                                                                         // values
                                    for (int i = 0; i < values.length; i++) {
                                        num2[i] = Integer.parseInt(values[i]); // convert each value to an integer and
                                                                               // store it in the array
                                    }
                                    double answer = multiply(num2);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Multiplication = " + formattedAnswer);
                                    ans.setBounds(600, 600, 300, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter " + ft.getText()
                                            + " valid numbers separated by commas.");
                                }
                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                divideRadioButton = new JRadioButton("Division");
                divideRadioButton.setBounds(400, 200, 200, 50);
                divideRadioButton.setBackground(Color.decode("#e3b448"));
                divideRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                Math_panel.add(divideRadioButton);
                divideRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Division");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("Division of Numbers");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel(" Enter Count of Numbers: ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JButton calculateButton = new JButton("CONFIRM");
                        calculateButton.setBounds(600, 300, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int num1 = Integer.parseInt(ft.getText()); // get the first input as an integer
                                    String input = JOptionPane
                                            .showInputDialog("Enter " + num1 + " values separated by commas");
                                    String[] values = input.split(","); // split the string into an array of values
                                                                        // using a comma delimiter
                                    if (values.length != num1) { // check if the count of values entered by the user is
                                                                 // not equal to num1
                                        throw new NumberFormatException(); // throw an exception if the counts don't
                                                                           // match
                                    }
                                    int[] num2 = new int[values.length]; // create an integer array to store the force
                                                                         // values
                                    for (int i = 0; i < values.length; i++) {
                                        num2[i] = Integer.parseInt(values[i]); // convert each value to an integer and
                                                                               // store it in the array
                                    }
                                    double answer = divide(num2);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Multiplication = " + formattedAnswer);
                                    ans.setBounds(600, 600, 300, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter " + ft.getText()
                                            + " valid numbers separated by commas.");
                                }
                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                minimumRadioButton = new JRadioButton("Minimum Number Finder");
                minimumRadioButton.setBounds(400, 400, 300, 50);
                minimumRadioButton.setBackground(Color.decode("#e3b448"));
                minimumRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                Math_panel.add(minimumRadioButton);
                minimumRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Minimum Number out of all");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("Minimum out of all the Numbers");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel(" Enter Count of Numbers: ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JButton calculateButton = new JButton("CONFIRM");
                        calculateButton.setBounds(600, 300, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int num1 = Integer.parseInt(ft.getText()); // get the first input as an integer
                                    String input = JOptionPane
                                            .showInputDialog("Enter " + num1 + " values separated by commas");
                                    String[] values = input.split(","); // split the string into an array of values
                                                                        // using a comma delimiter
                                    if (values.length != num1) { // check if the count of values entered by the user is
                                                                 // not equal to num1
                                        throw new NumberFormatException(); // throw an exception if the counts don't
                                                                           // match
                                    }
                                    int[] num2 = new int[values.length]; // create an integer array to store the force
                                                                         // values
                                    for (int i = 0; i < values.length; i++) {
                                        num2[i] = Integer.parseInt(values[i]); // convert each value to an integer and
                                                                               // store it in the array
                                    }
                                    double answer = minimum(num2);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Multiplication = " + formattedAnswer);
                                    ans.setBounds(600, 600, 300, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter " + ft.getText()
                                            + " valid numbers separated by commas.");
                                }
                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                maximumRadioButton = new JRadioButton("Maximum Number Finder");
                maximumRadioButton.setBounds(400, 600, 300, 50);
                maximumRadioButton.setBackground(Color.decode("#e3b448"));
                maximumRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                Math_panel.add(maximumRadioButton);
                maximumRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Maximum Number out of all");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("Maximum out of all the Numbers");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel(" Enter Count of Numbers: ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JButton calculateButton = new JButton("CONFIRM");
                        calculateButton.setBounds(600, 300, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int num1 = Integer.parseInt(ft.getText()); // get the first input as an integer
                                    String input = JOptionPane
                                            .showInputDialog("Enter " + num1 + " values separated by commas");
                                    String[] values = input.split(","); // split the string into an array of values
                                                                        // using a comma delimiter
                                    if (values.length != num1) { // check if the count of values entered by the user is
                                                                 // not equal to num1
                                        throw new NumberFormatException(); // throw an exception if the counts don't
                                                                           // match
                                    }
                                    int[] num2 = new int[values.length]; // create an integer array to store the force
                                                                         // values
                                    for (int i = 0; i < values.length; i++) {
                                        num2[i] = Integer.parseInt(values[i]); // convert each value to an integer and
                                                                               // store it in the array
                                    }
                                    double answer = maximum(num2);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Multiplication = " + formattedAnswer);
                                    ans.setBounds(600, 600, 300, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter " + ft.getText()
                                            + " valid numbers separated by commas.");
                                }
                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                RectangleRadioButton = new JRadioButton("Rectangle");
                RectangleRadioButton.setBounds(950, 300, 300, 50);
                RectangleRadioButton.setBackground(Color.decode("#e3b448"));
                RectangleRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                Math_panel.add(RectangleRadioButton);
                RectangleRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Rectangle");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("Area Of Rectangle");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Length of rectangle (cm):");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel ff = new JLabel("Breadth of rectangle (cm):");
                        ff.setBounds(50, 400, 600, 40);
                        ff.setForeground(Color.BLACK);
                        ff.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(ff);
                        JTextField tx = new JTextField();
                        tx.setBounds(500, 400, 300, 40);
                        fp.add(tx);

                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(550, 500, 200, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, l, b;
                                    l = Double.parseDouble(ft.getText());
                                    b = Double.parseDouble(tx.getText());

                                    answer = rectangleArea(l, b);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Area of the Rectangle is  " + formattedAnswer + " sq cm . ");
                                    ans.setBounds(600, 600, 600, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter " + ft.getText()
                                            + " valid numbers separated by commas.");
                                }
                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                CircleRadioButton = new JRadioButton("Circle");
                CircleRadioButton.setBounds(950, 450, 300, 50);
                CircleRadioButton.setBackground(Color.decode("#e3b448"));
                CircleRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                Math_panel.add(CircleRadioButton);
                CircleRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Circle");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("Area Of Circle");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Radius of the circle (cm):");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(550, 300, 200, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double r, answer;
                                    r = Double.parseDouble(ft.getText());

                                    answer = circleArea(r);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Area of the circle is  " + formattedAnswer + " sq cm . ");
                                    ans.setBounds(600, 600, 600, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter " + ft.getText()
                                            + " valid numbers separated by commas.");
                                }
                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                TriangleRadioButton = new JRadioButton("Triangle");
                TriangleRadioButton.setBounds(950, 600, 300, 50);
                TriangleRadioButton.setBackground(Color.decode("#e3b448"));
                TriangleRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                Math_panel.add(TriangleRadioButton);
                TriangleRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Triangle");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("Area Of Triangle");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Height of Triangle (cm):");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel ff = new JLabel("Base of Triangle (cm):");
                        ff.setBounds(50, 400, 600, 40);
                        ff.setForeground(Color.BLACK);
                        ff.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(ff);
                        JTextField tx = new JTextField();
                        tx.setBounds(500, 400, 300, 40);
                        fp.add(tx);

                        JButton calculateButton = new JButton("CALCULATE");
                        calculateButton.setBounds(550, 500, 200, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    double answer, l, b;
                                    l = Double.parseDouble(ft.getText());
                                    b = Double.parseDouble(tx.getText());

                                    answer = triangleArea(l, b);
                                    String formattedAnswer = String.format("%.2f", answer);
                                    ans.setText("Area of the Rectangle is  " + formattedAnswer + " sq cm . ");
                                    ans.setBounds(600, 600, 600, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter " + ft.getText()
                                            + " valid numbers separated by commas.");
                                }
                            }
                        });

                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                Math_frame.add(Math_panel);
                Math_frame.setVisible(true);

            }
        });
        panel.add(BasicMath_button);

        BasicPhysics_button = new JButton("PHYSICS");
        BasicPhysics_button.setBounds(1100, 450, 250, 50);
        BasicPhysics_button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                mainFrame.dispose();
                Physics_frame = new JFrame("PHYSICS DOMAIN ");
                Physics_frame.setBounds(0, 0, screenWidth, screenHeight);
                JPanel Physics_panel = new JPanel();
                Physics_panel.setBackground(Color.decode("#077b8a"));
                Physics_panel.setLayout(null);

                JLabel labelh = new JLabel("PHYSICS DOMAIN ");
                labelh.setBounds(600, 50, 900, 50);
                labelh.setFont(new Font("Times New Roman", Font.PLAIN, 40));
                Physics_panel.add(labelh);

                lawsRadioButton = new JRadioButton("Force");
                lawsRadioButton.setBounds(100, 200, 200, 50);
                lawsRadioButton.setBackground(Color.decode("#e3b448"));
                lawsRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                Physics_panel.add(lawsRadioButton);
                lawsRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Force");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("FORCE CALCULATIONS");
                        main.setBounds(600, 50, 500, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.decode("#000000"));
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel(" Mass (kg) :");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(500, 200, 300, 40);
                        fp.add(ft);

                        JLabel acceleration = new JLabel(" Acceleration (m/s^2): ");
                        acceleration.setBounds(50, 400, 600, 40);
                        acceleration.setForeground(Color.BLACK);
                        acceleration.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(acceleration);
                        JTextField mt = new JTextField();
                        mt.setBounds(500, 400, 300, 40);
                        fp.add(mt);

                        JButton calculateButton = new JButton("Calculate");
                        calculateButton.setBounds(600, 500, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                double mass, accel;
                                try {
                                    mass = Double.parseDouble(ft.getText());
                                    accel = Double.parseDouble(mt.getText());

                                    double answer = calculateForce(mass, accel);
                                    ans.setText("Force = " + Double.toString(answer) + " N");
                                    ans.setBounds(600, 600, 300, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                                frame.dispose();
                            }
                        });
                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                thermoRadioButton = new JRadioButton("Gravitational Force");
                thermoRadioButton.setBounds(100, 400, 250, 50);
                thermoRadioButton.setBackground(Color.decode("#e3b448"));
                thermoRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                Physics_panel.add(thermoRadioButton);
                thermoRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Gravitational Force");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel(" GRAVITATIONAL FORCE CALCULATIONS");
                        main.setBounds(400, 50, 800, 40);
                        main.setFont(new Font("Times New Roman", Font.BOLD, 30));
                        main.setForeground(Color.BLACK);
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel(" Mass OF Object (kg): ");
                        fl.setBounds(50, 150, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(700, 150, 300, 30);
                        fp.add(ft);

                        JLabel acceleration = new JLabel(" Mass OF Object 2 (kg): ");
                        acceleration.setBounds(50, 350, 600, 40);
                        acceleration.setForeground(Color.BLACK);
                        acceleration.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(acceleration);
                        JTextField mt = new JTextField();
                        mt.setBounds(700, 350, 300, 30);
                        fp.add(mt);

                        JLabel distance = new JLabel(" Distance between object1 and 2 (kg): ");
                        distance.setBounds(50, 550, 800, 40);
                        distance.setForeground(Color.BLACK);
                        distance.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(distance);

                        JTextField dt = new JTextField();
                        dt.setBounds(700, 550, 300, 30);
                        fp.add(dt);

                        JButton calculateButton = new JButton("Calculate");
                        calculateButton.setBounds(800, 700, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                double mass1, mass2, distancebtw;
                                try {
                                    mass1 = Double.parseDouble(ft.getText());
                                    mass2 = Double.parseDouble(mt.getText());
                                    distancebtw = Double.parseDouble(dt.getText());

                                    double answer = calculateGravitationalForce(mass1, mass2, distancebtw);
                                    ans.setText("Gravitational Force = " + Double.toString(answer) + " N");
                                    ans.setBounds(600, 750, 800, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                                frame.dispose();
                            }
                        });
                        f.add(fp);
                        f.setVisible(true);

                    }
                });
                emRadioButton = new JRadioButton("Voltage");
                emRadioButton.setBounds(100, 600, 150, 50);
                emRadioButton.setBackground(Color.decode("#e3b448"));
                emRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                Physics_panel.add(emRadioButton);
                emRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Voltage");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel(" VOLTAGE CALCULATIONS");
                        main.setBounds(600, 50, 800, 40);
                        main.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        main.setForeground(Color.BLACK);
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel(" Current (I) in amps:  ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(700, 200, 300, 30);
                        fp.add(ft);

                        JLabel acceleration = new JLabel(" Resistance (R) in ohms:  ");
                        acceleration.setBounds(50, 400, 600, 40);
                        acceleration.setForeground(Color.BLACK);
                        acceleration.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(acceleration);

                        JTextField mt = new JTextField();
                        mt.setBounds(700, 400, 300, 30);
                        fp.add(mt);

                        JButton calculateButton = new JButton("Calculate");
                        calculateButton.setBounds(800, 600, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                double current, resistance;
                                try {
                                    current = Double.parseDouble(ft.getText());
                                    resistance = Double.parseDouble(mt.getText());

                                    double answer = calculateVoltage(current, resistance);
                                    ans.setText("Voltage = " + Double.toString(answer) + " Volts");
                                    ans.setBounds(600, 750, 800, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                                frame.dispose();
                            }
                        });
                        f.add(fp);
                        f.setVisible(true);

                    }
                });

                keRadioButton = new JRadioButton("Kinetic Energy");
                keRadioButton.setBounds(500, 200, 200, 50);
                keRadioButton.setBackground(Color.decode("#e3b448"));
                keRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                keRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Kinetic Energy");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("Kinetic Energy CALCULATIONS");
                        main.setBounds(600, 50, 800, 40);
                        main.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        main.setForeground(Color.BLACK);
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel(" Mass in Kg:  ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(700, 200, 300, 30);
                        fp.add(ft);

                        JLabel sf = new JLabel(" Velocity in m/s: ");
                        sf.setBounds(50, 400, 600, 40);
                        sf.setForeground(Color.BLACK);
                        sf.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(sf);

                        JTextField mt = new JTextField();
                        mt.setBounds(700, 400, 300, 30);
                        fp.add(mt);

                        JButton calculateButton = new JButton("Calculate");
                        calculateButton.setBounds(800, 600, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                double mass, Velocity;
                                try {
                                    mass = Double.parseDouble(ft.getText());
                                    Velocity = Double.parseDouble(mt.getText());

                                    double answer = calculateKineticEnergy(mass, Velocity);
                                    ans.setText("Kinetic Energy = " + Double.toString(answer) + " Joules");
                                    ans.setBounds(600, 750, 800, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                                frame.dispose();
                            }
                        });
                        f.add(fp);
                        f.setVisible(true);

                    }
                });
                Physics_panel.add(keRadioButton);

                peRadioButton = new JRadioButton("Potential Energy");
                peRadioButton.setBounds(500, 400, 250, 50);
                peRadioButton.setBackground(Color.decode("#e3b448"));
                peRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                peRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Potential Energy");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("POTENTIAL ENERGY CALCULATIONS");
                        main.setBounds(400, 50, 800, 40);
                        main.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        main.setForeground(Color.BLACK);
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel(" Mass OF Object (kg): ");
                        fl.setBounds(50, 150, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(700, 150, 300, 30);
                        fp.add(ft);

                        JLabel acceleration = new JLabel("Height(meter) of the pbject from the ground: ");
                        acceleration.setBounds(50, 350, 600, 40);
                        acceleration.setForeground(Color.BLACK);
                        acceleration.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(acceleration);
                        JTextField mt = new JTextField();
                        mt.setBounds(700, 350, 300, 30);
                        fp.add(mt);

                        JLabel distance = new JLabel("Gravitational force: ");
                        distance.setBounds(50, 550, 800, 40);
                        distance.setForeground(Color.BLACK);
                        distance.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(distance);

                        JTextField dt = new JTextField();
                        dt.setBounds(700, 550, 300, 30);
                        fp.add(dt);

                        JButton calculateButton = new JButton("Calculate");
                        calculateButton.setBounds(800, 700, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                double mass, Height, gravity;
                                try {
                                    mass = Double.parseDouble(ft.getText());
                                    Height = Double.parseDouble(mt.getText());
                                    gravity = Double.parseDouble(dt.getText());

                                    double answer = calculatePotentialEnergy(mass, Height, gravity);
                                    ans.setText("Potential Energy = " + Double.toString(answer) + " Joules");
                                    ans.setBounds(600, 750, 800, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                                frame.dispose();
                            }
                        });
                        f.add(fp);
                        f.setVisible(true);

                    }
                });
                Physics_panel.add(peRadioButton);

                workRadioButton = new JRadioButton("Work");
                workRadioButton.setBounds(500, 600, 150, 50);
                workRadioButton.setBackground(Color.decode("#e3b448"));
                workRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                workRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Work");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("WORK CALCULATIONS");
                        main.setBounds(600, 50, 800, 40);
                        main.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        main.setForeground(Color.BLACK);
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Force (N): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(700, 200, 300, 30);
                        fp.add(ft);

                        JLabel sf = new JLabel("Distance (m): ");
                        sf.setBounds(50, 400, 600, 40);
                        sf.setForeground(Color.BLACK);
                        sf.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(sf);

                        JTextField mt = new JTextField();
                        mt.setBounds(700, 400, 300, 30);
                        fp.add(mt);

                        JButton calculateButton = new JButton("Calculate");
                        calculateButton.setBounds(800, 600, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                double force, distance;
                                try {
                                    force = Double.parseDouble(ft.getText());
                                    distance = Double.parseDouble(mt.getText());

                                    double answer = calculateWork(force, distance);
                                    ans.setText("Work = " + Double.toString(answer) + " Joules");
                                    ans.setBounds(600, 750, 800, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                                frame.dispose();
                            }
                        });
                        f.add(fp);
                        f.setVisible(true);

                    }
                });
                Physics_panel.add(workRadioButton);

                refractedRadioButton = new JRadioButton("Refracted Angle");
                refractedRadioButton.setBounds(900, 200, 200, 50);
                refractedRadioButton.setBackground(Color.decode("#e3b448"));
                refractedRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                refractedRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Refracted Angle");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("REFRACTED ANGLE CALCULATIONS");
                        main.setBounds(400, 50, 800, 40);
                        main.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        main.setForeground(Color.BLACK);
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Refractive Index1: ");
                        fl.setBounds(50, 150, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(700, 150, 300, 30);
                        fp.add(ft);

                        JLabel acceleration = new JLabel("Angle of Incidence(in degrees): ");
                        acceleration.setBounds(50, 350, 600, 40);
                        acceleration.setForeground(Color.BLACK);
                        acceleration.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(acceleration);
                        JTextField mt = new JTextField();
                        mt.setBounds(700, 350, 300, 30);
                        fp.add(mt);

                        JLabel distance = new JLabel("Refractive Index1: ");
                        distance.setBounds(50, 550, 800, 40);
                        distance.setForeground(Color.BLACK);
                        distance.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(distance);

                        JTextField dt = new JTextField();
                        dt.setBounds(700, 550, 300, 30);
                        fp.add(dt);

                        JButton calculateButton = new JButton("Calculate");
                        calculateButton.setBounds(800, 700, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                double RI1, anglrIncidence, RI2;
                                try {
                                    RI1 = Double.parseDouble(ft.getText());
                                    anglrIncidence = Double.parseDouble(mt.getText());
                                    RI2 = Double.parseDouble(dt.getText());

                                    double answer = calculateRefractedAngle(RI1, anglrIncidence, RI2);
                                    ans.setText("Refracted Angle= " + Double.toString(answer) + " Degrees");
                                    ans.setBounds(600, 750, 800, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                                frame.dispose();
                            }
                        });
                        f.add(fp);
                        f.setVisible(true);

                    }
                });
                Physics_panel.add(refractedRadioButton);

                efRadioButton = new JRadioButton("Electric Force");
                efRadioButton.setBounds(900, 400, 200, 50);
                efRadioButton.setBackground(Color.decode("#e3b448"));
                efRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                efRadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Electric Force");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("ELECTRIC FORCE CALCULATIONS");
                        main.setBounds(400, 50, 800, 40);
                        main.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        main.setForeground(Color.BLACK);
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Charge 1 (Coulombs):  ");
                        fl.setBounds(50, 150, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(700, 150, 300, 30);
                        fp.add(ft);

                        JLabel acceleration = new JLabel("Charge 2 (Coulombs): ");
                        acceleration.setBounds(50, 350, 600, 40);
                        acceleration.setForeground(Color.BLACK);
                        acceleration.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(acceleration);
                        JTextField mt = new JTextField();
                        mt.setBounds(700, 350, 300, 30);
                        fp.add(mt);

                        JLabel distance = new JLabel("Distance between the charges(meter):");
                        distance.setBounds(50, 550, 800, 40);
                        distance.setForeground(Color.BLACK);
                        distance.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(distance);

                        JTextField dt = new JTextField();
                        dt.setBounds(700, 550, 300, 30);
                        fp.add(dt);

                        JButton calculateButton = new JButton("Calculate");
                        calculateButton.setBounds(800, 700, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                double c1, c2, Distance;
                                try {
                                    c1 = Double.parseDouble(ft.getText());
                                    c2 = Double.parseDouble(mt.getText());
                                    Distance = Double.parseDouble(dt.getText());

                                    double answer = calculateRefractedAngle(c1, c2, Distance);
                                    ans.setText("Electric Force = " + Double.toString(answer) + " N/C");
                                    ans.setBounds(600, 750, 800, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                                frame.dispose();
                            }
                        });
                        f.add(fp);
                        f.setVisible(true);

                    }
                });
                Physics_panel.add(efRadioButton);

                finalERadioButton = new JRadioButton("Final Energy");
                finalERadioButton.setBounds(900, 600, 200, 50);
                finalERadioButton.setBackground(Color.decode("#e3b448"));
                finalERadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                finalERadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Final Energy");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("FINAL ENERGY CALCULATIONS");
                        main.setBounds(600, 50, 800, 40);
                        main.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        main.setForeground(Color.BLACK);
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Initial Energy(J): ");
                        fl.setBounds(50, 200, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(700, 200, 300, 30);
                        fp.add(ft);

                        JLabel sf = new JLabel("WORK(J): ");
                        sf.setBounds(50, 400, 600, 40);
                        sf.setForeground(Color.BLACK);
                        sf.setFont(new Font("Maiandra GD", Font.BOLD, 30));
                        fp.add(sf);

                        JTextField mt = new JTextField();
                        mt.setBounds(700, 400, 300, 30);
                        fp.add(mt);

                        JButton calculateButton = new JButton("Calculate");
                        calculateButton.setBounds(800, 600, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                double Ie, work;
                                try {
                                    Ie = Double.parseDouble(ft.getText());
                                    work = Double.parseDouble(mt.getText());

                                    double answer = calculateFinalEnergy(Ie, work);
                                    ans.setText("Final Energy = " + Double.toString(answer) + " Joules");
                                    ans.setBounds(600, 750, 800, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                                frame.dispose();
                            }
                        });
                        f.add(fp);
                        f.setVisible(true);

                    }
                });
                Physics_panel.add(finalERadioButton);

                energyERadioButton = new JRadioButton("Energy Equivalent");
                energyERadioButton.setBounds(1300, 200, 250, 50);
                energyERadioButton.setBackground(Color.decode("#e3b448"));
                energyERadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
                energyERadioButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame f = new JFrame("Energy Equivalent");
                        JPanel fp = new JPanel();
                        JLabel main = new JLabel("ENERGY EQUIVALENT CALCULATIONS");
                        main.setBounds(450, 200, 800, 40);
                        main.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        main.setForeground(Color.BLACK);
                        f.setBounds(0, 0, screenWidth, screenHeight);
                        fp.setLayout(null);
                        fp.setBackground(Color.decode("#ecc19c"));
                        fp.add(main);

                        JLabel fl = new JLabel("Mass in kg:");
                        fl.setBounds(300, 350, 600, 40);
                        fl.setForeground(Color.BLACK);
                        fl.setFont(new Font("Naive Sans", Font.BOLD, 30));
                        fp.add(fl);
                        JTextField ft = new JTextField();
                        ft.setBounds(700, 350, 300, 30);
                        fp.add(ft);

                        JButton calculateButton = new JButton("Calculate");
                        calculateButton.setBounds(800, 450, 100, 30);
                        fp.add(calculateButton);

                        JLabel ans = new JLabel("");
                        calculateButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                double mass;
                                try {
                                    mass = Double.parseDouble(ft.getText());

                                    double answer = calculateEnergyEquivalent(mass);
                                    ans.setText("Energy Equivalent = " + Double.toString(answer) + " Joules");
                                    ans.setBounds(500, 600, 800, 40);
                                    ans.setFont(new Font("Maiandra GD", Font.BOLD, 20));
                                    ans.setForeground(Color.black);
                                    fp.add(ans);
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                }

                                frame.dispose();
                            }
                        });
                        f.add(fp);
                        f.setVisible(true);

                    }
                });
                Physics_panel.add(energyERadioButton);

                Physics_frame.add(Physics_panel);
                Physics_frame.setVisible(true);
            }
        });
        panel.add(BasicPhysics_button);

        frame.setVisible(true);
        mainFrame.dispose();

    }

    public static void main(String[] args) {

        new mainClass();
        mainFrame.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                mainFrame.dispose();
                new Gui();
            }
        });

    }

    // PHYSICS//
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    public static double calculateGravitationalForce(double mass1, double mass2, double distance) {
        final double G = 6.67430E-11;
        return (G * mass1 * mass2) / (distance * distance);
    }

    public static double calculateVoltage(double current, double resistance) {
        return current * resistance;
    }

    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * velocity * velocity;
    }

    public static double calculatePotentialEnergy(double mass, double height, double gravity) {
        return mass * gravity * height;
    }

    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    public static double calculateRefractedAngle(double refractiveIndex1, double angleOfIncidence,
            double refractiveIndex2) {
        return Math.asin(refractiveIndex1 * Math.sin(Math.toRadians(angleOfIncidence)) / refractiveIndex2);
    }

    public static double calculateElectricForce(double charge1, double charge2, double distance) {
        final double K = 8.99E9;
        return K * charge1 * charge2 / (distance * distance);
    }

    public static double calculateFinalEnergy(double initialEnergy, double work) {
        return initialEnergy + work;
    }

    public static double calculateEnergyEquivalent(double mass) {
        final double C = 3E8; // Speed of light in vacuum (m/s)
        return mass * C * C;
    }

    public static double calculateMassEnergyEquivalence(double mass) {
        double speedOfLight = 2.998e8; // Speed of light in m/s
        return mass * speedOfLight * speedOfLight;
    }

    // Math//

    public static double multiply(int[] nums) {
        double result = 1;
        for (int i = 0; i < nums.length; i++) {
            result *= nums[i];
        }
        return result;
    }

    public static double divide(int[] nums) {
        double result = (double) nums[0];
        for (int i = 1; i < nums.length; i++) {
            result /= nums[i];
        }
        return result;
    }

    public static double minimum(int[] nums) {
        double result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < result) {
                result = nums[i];
            }
        }
        return result;
    }

    public static double maximum(int[] nums) {
        double result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > result) {
                result = nums[i];
            }
        }
        return result;
    }

    public static double rectangleArea(double l, double b) {

        double rectangleArea = l * b;
        return rectangleArea;
    }

    public static double circleArea(double radius) {

        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }

    public static double triangleArea(double base, double height) {

        double triangleArea = 0.5 * base * height;
        return triangleArea;
    }

    // Electrical //

    public static double ohmsLaw(double voltage, double current, double resistance) {

        if (voltage == 0) {
            voltage = current * resistance;
            return voltage;
        } else if (current == 0) {
            current = voltage / resistance;
            return current;
        } else if (resistance == 0) {
            resistance = voltage / current;
            return resistance;
        } else {
            return 0;
        }
    }

    public static double powerFormula(double v, double I, double pf) {

        double power = v * I * pf;
        return power;
    }

    public static double energyFormula(double power, double time) {

        double energy = power * time;
        return energy;
    }

    public static double frequencyFormula(double inductance, double capacitance) {

        double frequency = 1 / (2 * Math.PI * Math.sqrt(inductance * capacitance));
        return frequency;
    }

    public static double parallelResistanceFormula(int n, double[] resistances) {

        double totalResistance = 0;
        for (int i = 0; i < n; i++) {

            totalResistance += 1 / resistances[i];
        }
        double parallelResistance = 1 / totalResistance;

        return parallelResistance;

    }

    public static double seriesResistanceFormula(int n, double[] resistances) {

        double totalResistance = 0;
        for (int i = 0; i < n; i++) {

            totalResistance += resistances[i];
        }
        return totalResistance;
    }

    public static double capacitiveReactanceFormula(double capacitance, double frequency) {

        double capacitiveReactance = 1 / (2 * Math.PI * frequency * capacitance);
        return capacitiveReactance;
    }

    public static double inductiveReactanceFormula(double inductance, double frequency) {

        double inductiveReactance = 2 * Math.PI * frequency * inductance;
        return inductiveReactance;
    }

    public static double resistivityFormula(double resistance, double length, double area) {

        double resistivity = (resistance * area) / length;
        return resistivity;
    }

    public static double impedanceFormula(double resistance, double inducitiveR, double capacitiveR) {

        double impedance = Math.sqrt(Math.pow(resistance, 2) + Math.pow(inducitiveR - capacitiveR, 2));
        return impedance;
    }

    public static double EfficiencyCalculation(double outputPower, double inputPower) {

        double efficiency = (outputPower / inputPower) * 100.0;
        return efficiency;
    }

    // Electronics //
    public static double voltageDivider(double vin, double r1, double r2) {
        return vin * (r2 / (r1 + r2));
    }

    public static double capacitance(double q, double v) {
        return q / v;
    }

    public static double inductance(double vt, double didt) {
        return vt / didt;
    }

    public static double resonantFrequency(double l, double c) {
        return 1 / (2 * Math.PI * Math.sqrt(l * c));
    }

    public static double bandwidth(double f1, double f2) {
        return f2 - f1;
    }

    public static double gain(double vout, double vin) {
        return vout / vin;
    }

    public static double decibel(double pout, double pin) {
        return 10 * Math.log10(pout / pin);
    }

    public static double rcTimeConstant(double r, double c, double vc, double v0) {
        return r * c * Math.log(1 + vc / v0);
    }

    public static double noiseFigure(double snrIn, double snrOut) {
        return 10 * Math.log10(snrOut / snrIn);
    }

}
