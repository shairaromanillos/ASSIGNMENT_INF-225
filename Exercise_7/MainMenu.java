import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame{
    MainMenu(){

        // JLabel
        JLabel imageLabel = new JLabel();
        // Cat image downloaded from internet
        ImageIcon catImage = new ImageIcon("kitty.jpg");
        // Set image to label
        imageLabel.setIcon(catImage);

        // JButton
        JButton startButton = new JButton();
        startButton.setText("START GAME");
        startButton.setFont(new Font("Arial", Font.BOLD, 35));

        // Add event to start button
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        // Add label and image to frame
        this.add(imageLabel);
        this.add(startButton);


        // Frame Layout
        this.setLayout(new FlowLayout());
        // Frame title
        this.setTitle("Snake Game");
        // Terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Frame size
        this.setSize(350, 350);
        // Puts frame in the middle
        this.setLocationRelativeTo(null);
        // Make frame appear
        this.setVisible(true);
        // Disable resize
        this.setResizable(false);
        // Set background color
        this.getContentPane().setBackground(Color.BLACK);

    }

    // Event Handler
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            // Goes to color menu
            new ColorMenu();

            // Closes frame
            dispose();
        }      
    }
}
