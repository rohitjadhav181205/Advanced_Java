/*
 * 
4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or
 “Hour Glass  is pressed” depending upon the Jbutton with image  either  Digital Clock 
 or  Hour Glass is pressed by implementing the event handling mechanism with
  addActionListener( ).

 */
package Swings;
	
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExercise1 {
    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Image Button Demo");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Label to display message
        JLabel messageLabel = new JLabel("Press any button", JLabel.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(messageLabel, BorderLayout.NORTH);

        // Panel for buttons
        JPanel panel = new JPanel();

        // Load Images (Make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("digital clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hour glass.png");

        // Create Buttons
        JButton clockButton = new JButton(clockIcon);
        JButton hourGlassButton = new JButton(hourGlassIcon);

        // Add Action Listener for Clock Button
        clockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        // Add Action Listener for Hour Glass Button
        hourGlassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add buttons to panel
        panel.add(clockButton);
        panel.add(hourGlassButton);

        // Add panel to frame
        frame.add(panel, BorderLayout.CENTER);

        // Set visible
        frame.setVisible(true);
    }
}