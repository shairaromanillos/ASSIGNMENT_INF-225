
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class TryAgain extends  JFrame{
    TryAgain(){


        JButton  tryAgainButton = new JButton();
        JButton  exitButton = new JButton();

        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 35));

        EventHandler handler = new EventHandler();
        tryAgainButton.addActionListener(handler);

        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 35));

        EventHandler1 handler1 = new EventHandler1();
        exitButton.addActionListener(handler1);


        this.add(tryAgainButton);
        this.add(exitButton);

    // Frame Layout
        this.setLayout(new FlowLayout());

    // Frame Title
        this.setTitle(" Snake Game");
    
    // Closes Java Program
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    // Frame size adjustment
        this.setSize(350, 350);
    
    // Puts Frame in the Middle
        this.setLocationRelativeTo(null);
    
    // Makes frame appear
        this.setVisible(true);

    // Disable Resize
        this.setResizable(true);

    // Set background color
    this.getContentPane().setBackground(Color.BLACK);

    }
private class EventHandler implements ActionListener{


    public void actionPerformed(ActionEvent event){
        // Goes to game frame
        new MainMenu();

        // Close frame
        dispose();

    }

    
}

private class EventHandler1 implements ActionListener{


    public void actionPerformed(ActionEvent event){
        

        // Close frame
        dispose();
    }
}
}
