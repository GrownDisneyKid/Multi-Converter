/*
 * Justin McQueen
 * CMIS 242:6980
 * Week Six Discussion
 * 26 March 2023
 */

// required imports
// import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



class Frame extends JFrame implements ActionListener{ // brings in the JFRAME to the class

    // Attributes
    Converter myConverter = null; // sets the blank converter for user selection in run time
    JButton tempB = new JButton("Temperature");
    JButton distanceB = new JButton("Distance");
    JButton exitB = new JButton("Exit");

    public Frame() {

        //creates a frame    
        JFrame frame = new JFrame();
        frame.setSize(300, 200); // size of frame
        frame.setTitle("Converter"); // window title text
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits when window is closed
        frame.setBackground(Color.CYAN);  // title back ground color
        frame.setForeground(Color.GRAY);

        //creates a panel
        JPanel panel = new JPanel();
        panel.setVisible(true);
        panel.setBounds(0, 0, 300, 200);
        
        //add panel to the frame
        frame.add(panel);

        //dimensions of buttons
        tempB.setVisible(true);
        tempB.setBounds(90, 20, 125, 35);
        distanceB.setVisible(true);
        distanceB.setBounds(90, 60, 125, 35);
        exitB.setVisible(true);
        exitB.setBounds(90, 100, 125, 35);

        //add buttons to panle
        panel.add(tempB);
        panel.add(distanceB);
        panel.add(exitB);

        tempB.addActionListener(this);
        distanceB.addActionListener(this);
        exitB.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitB) {
            System.exit(0);
        } else if (e.getSource() == tempB) {
            myConverter = new TempConverter();
        } else if (e.getSource() == distanceB) {
            myConverter = new DistanceConverter();
        }
    }
}
