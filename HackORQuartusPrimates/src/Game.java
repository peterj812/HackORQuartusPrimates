
//import statements
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Game {

    JFrame window;
    Container con;
    JPanel titleNamePanel, playGameButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 30);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton playGameButton, choice1, choice2, choice3;
    JTextArea mainTextArea;
    int playerHp;

    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler cHandler = new ChoiceHandler();

    public static void main(String[] args) {

        new Game();

    }

    public Game() {

        //setting the window of the game
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        //creates the title page panel
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("WELCOME TO FLIGHT SIMULATOR X");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        //panel that holds the buttons in order to play the game
        playGameButtonPanel = new JPanel();
        playGameButtonPanel.setBounds(300, 400, 200, 100);
        playGameButtonPanel.setBackground(Color.black);

        //button that prompts user to play the game
        playGameButton = new JButton("PLAY GAME");
        playGameButton.setBackground(Color.black);
        playGameButton.setForeground(Color.white);
        playGameButton.setFont(normalFont);
        playGameButton.setFocusPainted(false);
        playGameButton.addActionListener(tsHandler);

        //adds the title name and the play button to the panel
        titleNamePanel.add(titleNameLabel);
        playGameButtonPanel.add(playGameButton);

        //adds the panels to the container
        con.add(titleNamePanel);
        con.add(playGameButtonPanel);

    }

    //function that creates the game screen 
    public void createGameScreen() {

        //sets the title panel and play button to false
        titleNamePanel.setVisible(false);
        playGameButtonPanel.setVisible(false);

        //creates a text area panel that shows the message to the user
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 150);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        //sets the text area
        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        //choice button panel that shows the choices for the user
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 300, 400, 150);
        choiceButtonPanel.setBackground(Color.blue);
        choiceButtonPanel.setLayout(new GridLayout(3,1));
        con.add(choiceButtonPanel);

        //creates choice 1 button
        choice1 = new JButton();
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choiceButtonPanel.add(choice1);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1");

        //creates choice 2 button
        choice2 = new JButton();
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choiceButtonPanel.add(choice2);
        choice2.addActionListener(cHandler);
        choice1.setActionCommand("c2");
         
        //creates choice 3 button
        choice3 = new JButton();
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choiceButtonPanel.add(choice3);
        choice3.addActionListener(cHandler);
        choice1.setActionCommand("c3");

        //shows the status of the player when they lose or gain hp
        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.red);
        playerPanel.setLayout(new GridLayout(1,4));
        con.add(playerPanel);
        
        //sets the hp label
        hpLabel = new JLabel("HP: ");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);

        //sets the number of the hp label
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(normalFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);

        //calss playerSetup function
        playerSetup();

    }

    //where it shows the hp bar with a unspecified hp
    public void playerSetup () {
        playerHp = Main.health;
        hpLabelNumber.setText("" + playerHp);
        airport();
    }

    //choices to show the first scenario
    public void airport() {
        mainTextArea.setText("You approach the gate at TSA what do you do?");
        choice1.setText("Look through bag");
        choice2.setText("Go Through Metal Detector");
        choice3.setText("Go home, flying is scary");
    }

    //choices to show the second scenario
    public void choice2Chosen() {
        mainTextArea.setText("Metal Detector goes off from the Contraband, alarm sounds, TSA agent yells HEY YOU!!");
        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
    }


    //actions that handle the titlescreen
    public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            createGameScreen();
        }
    }

    //actions that handle the choices when user 
    public class ChoiceHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {    
            
            String yourChoice = event.getActionCommand();

            if (yourChoice.equals("c2")) {
                choice2Chosen();
            }
        }
    }
}
