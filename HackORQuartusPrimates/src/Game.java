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
    JPanel titleNamePanel, endGameButtonPanel, playGameButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, picturePanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, pictureLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 40);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton endGameButton, playGameButton, choice1, choice2, choice3;
    JTextArea mainTextArea;
    String position;
    int playerHp;
    ImageIcon image1, image2;

    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ExitHandler eHandler = new ExitHandler();
    ChoiceHandler cHandler = new ChoiceHandler();

    public static void main(String[] args) {

        new Game();

    }

    public Game() {

        //setting the window of the game
        window = new JFrame();
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);       

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        
        con = window.getContentPane();

        //creates the title page panel
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(200, 200, 700, 200);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Laughing Stock");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        //panel that holds the buttons in order to play the game
        playGameButtonPanel = new JPanel();
        playGameButtonPanel.setBounds(200, 400, 200, 100);
        playGameButtonPanel.setBackground(Color.black);
        
        //panel that holds the end game button
        endGameButtonPanel = new JPanel();
        endGameButtonPanel.setBounds(800, 15, 200, 100);
        endGameButtonPanel.setBackground(Color.black);
        
        //button that prompts user to end the game
        endGameButton = new JButton("EXIT");
        endGameButton.setBackground(Color.black);
        endGameButton.setForeground(Color.black);
        endGameButton.setFont(normalFont);
        
        endGameButton.addActionListener(eHandler);
        endGameButton.setFocusPainted(false);

        //button that prompts user to play the game
        playGameButton = new JButton("PLAY");
        playGameButton.setBackground(Color.black);
        playGameButton.setForeground(Color.black);
        playGameButton.setFont(normalFont);
        
        playGameButton.addActionListener(tsHandler);
        playGameButton.setFocusPainted(false);
        
        //adds the title name and the play button to the panel
        titleNamePanel.add(titleNameLabel);
        playGameButtonPanel.add(playGameButton);
        endGameButtonPanel.add(endGameButton);

        //adds the panels to the container
        con.add(titleNamePanel);
        con.add(playGameButtonPanel);
        con.add(endGameButtonPanel);
        window.setVisible(true);
    }

    //function that creates the game screen 
    public void createGameScreen() {

        //sets the title panel and play button to false
        titleNamePanel.setVisible(false);
        playGameButtonPanel.setVisible(false);

        //creates a text area panel that shows the message to the user
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 800, 150);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        //sets the text area
        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100, 350, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        //choice button panel that shows the choices for the user
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(400, 590, 400, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(3,1));
        con.add(choiceButtonPanel);

        //creates choice 1 button
        choice1 = new JButton();
        choice1.setBackground(Color.white);
        choice1.setForeground(Color.black);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);
        
        //creates choice 2 button
        choice2 = new JButton();
        choice2.setBackground(Color.white);
        choice2.setForeground(Color.black);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2); 
        
        //creates choice 3 button
        choice3 = new JButton();
        choice3.setBackground(Color.white);
        choice3.setForeground(Color.black);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        //shows the status of the player when they lose or gain hp
        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.red);
        playerPanel.setLayout(new GridLayout(1,3));
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

        //calls playerSetup function
        playerSetup();

    }

    //where it shows the hp bar with a unspecified hp
    public void playerSetup () {
        playerHp = Main.health;
        hpLabelNumber.setText("" + playerHp);
        panelInit();
    }

    //choices to show the first scenario
    public void panelInit() {
    	
    	 //these picture panels is what calls the images from the folder
    	/*
        picturePanel = new JPanel();
        picturePanel.setBounds(200, 90, 500, 500);
        picturePanel.setBackground(Color.blue);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        image1 = new ImageIcon(".//Images//TSA.jpg.jpeg");
        pictureLabel.setIcon(image1);
        picturePanel.add(pictureLabel);
		*/
    	
        position = "panelInit";
        mainTextArea.setText(Main.init.prompt);

        choice1.setText("Look through bag");
        choice2.setText("Go through metal detector");
        choice3.setText("Go home, flying is scary");
    }
    
    public void panelA() {
        position = "panelA";
        mainTextArea.setText(Main.a.prompt);

        choice1.setText("Throw away contraband");
        choice2.setText("Put bag down and go through security");
        choice3.setText("");
        choice3.setVisible(false);
    }

    //choices to show the second scenario
    public void panelB() {
        position = "panelB";
        mainTextArea.setText(Main.b.prompt);
        
        choice1.setText("Next.....");
        choice2.setText("");
        choice3.setText("");
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelC() {
        position = "panelC";
        mainTextArea.setText(Main.c.prompt);

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelD() {
        position = "panelD";
        mainTextArea.setText(Main.d.prompt);

        choice1.setText("Fall Asleep");
        choice2.setText("Keep reading paper");
        choice3.setText("Put feet up");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
    }
    
    public void panelE() {
        position = "panelE";
        mainTextArea.setText(Main.e.prompt);

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelF() {
        position = "panelF";
        mainTextArea.setText(Main.f.prompt);

        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelG() {
        position = "panelG";
        mainTextArea.setText(Main.g.prompt);

        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");        
        choice1.setVisible(true);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelH() {
        position = "panelH";
        mainTextArea.setText(Main.h.prompt);

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelI() {
        position = "panelI";
        mainTextArea.setText(Main.i.prompt);

        choice1.setText("Walk toward abandoned carnival");
        choice2.setText("Examine the plane crash");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(false);
    }
    
    public void panelJ() {
        position = "panelJ";
        mainTextArea.setText(Main.j.prompt);

        choice1.setText("Pull out the shrapnel");
        choice2.setText("Walk toward abandoned carnival");
        choice3.setText("Examine the plane crash");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
    }
    
    public void panelK() {
        position = "panelK";
        mainTextArea.setText(Main.k.prompt);

        choice1.setText("Cover it with your hand");
        choice2.setText("");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelL() {
        position = "panelL";
        mainTextArea.setText(Main.l.prompt);

        choice1.setText("Walk toward abandoned carnival");
        choice2.setText("Give up");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(false);
    }
    
    public void panelL1() {
        position = "panelL1";
        mainTextArea.setText(Main.l1.prompt);

        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelM() {
        position = "panelM";
        mainTextArea.setText(Main.m.prompt);

        choice1.setText("Pick up bandage");
        choice2.setText("Walk into carnival");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(false);
    }
    
    public void panelM1() {
        position = "panelM1";
        mainTextArea.setText(Main.m1.prompt);

        choice1.setText("Walk into carnival");
        choice2.setText("");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelN() {
        position = "panelN";
        mainTextArea.setText(Main.n.prompt);

        choice1.setText("Walk into the carnival");
        choice2.setText("Open backpack");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(false);
    }
    
    // TODO: add choices
    public void panelO() {
        position = "panelO";
        mainTextArea.setText(Main.o.prompt);

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelP() {
        position = "panelP";
        mainTextArea.setText(Main.p.prompt);

        choice1.setText("You sure you don't want to give up?");
        choice2.setText("Go to the mirror building");
        choice3.setText("Go to the hotdog building");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
    }
    
    public void panelQ() {
        position = "panelQ";
        mainTextArea.setText(Main.q.prompt);

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelR() {
        position = "panelR";
        mainTextArea.setText(Main.r.prompt);

        choice1.setText("Pull on the door");
        choice2.setText("Push the door");
        choice3.setText("Ignore it");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
    }
    
    public void panelS() {
        position = "panelS";
        mainTextArea.setText(Main.s.prompt);

        choice1.setText("Locate the source of the smell");
        choice2.setText("Leave the building");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(false);
    }
    
    public void panelT() {

        position = "panelT";
        mainTextArea.setText(Main.t.prompt);

        choice1.setText("Pull the door");
        choice2.setText("Push the door");
        choice3.setText("Walk away");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
    }
    
    public void panelU() {

        position = "panelU";
        mainTextArea.setText(Main.u.prompt);

        choice1.setText("Run as fast as you can in a straight line");
        choice2.setText("Try to escape the maze");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(false);
    }
    
    public void panelV() {
        position = "panelV";
        mainTextArea.setText(Main.v.prompt);

        choice1.setText("Pull the door");
        choice2.setText("Push the door");
        choice3.setText("Just walk awayayyay");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
    }
    
    public void panelW() {
        position = "panelW";
        mainTextArea.setText(Main.w.prompt);

        choice1.setText("Push the door");
        choice2.setText("Walk out the way you came");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(false);
    }
    
    public void panelX() {
        position = "panelX";
        mainTextArea.setText(Main.x.prompt);

        choice1.setText("Yank the door!");
        choice2.setText("Charge the door!");
        choice3.setText("Just walk awayayyay");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
    }
    
    public void panelY() {
        position = "panelY";
        mainTextArea.setText(Main.y.prompt);

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelZ() {
        position = "panelZ";
        mainTextArea.setText(Main.z.prompt);

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");     
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelAA() {
        position = "panelAA";
        mainTextArea.setText(Main.aa.prompt);

        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelAB() {
        position = "panelAB";
        mainTextArea.setText(Main.ab.prompt);

        choice1.setText("Close backpack and head to the carnival");
        choice2.setText("Take out shrapnel and apply bandage");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(false);
    }
    
    public void panelAC() {
        position = "panelAC";
        mainTextArea.setText(Main.ac.prompt);

        choice1.setText("Screeeeeaaammm!!!");
        choice2.setText("Run out of the building, but you can't scream");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(false);
    }
    
    public void panelAD() {
        position = "panelAD";
        mainTextArea.setText(Main.ad.prompt);

        choice1.setText("You sure you don't want to give up?");
        choice2.setText("Go to the mirror building");
        choice3.setText("Go to the hotdog building");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
    }
    
    public void panelAE() {
        position = "panelAE";
        mainTextArea.setText(Main.ae.prompt);

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelAF() {
        position = "panelAF";
        mainTextArea.setText(Main.af.prompt);

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    public void panelAG() {
        position = "panelAG";
        mainTextArea.setText(Main.ag.prompt);

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
    }
    
    //supposed to transition to a death screen when player chooses to bad routes but still doesn't work yet
    public void death() {
    	position = "death";
    	mainTextArea.setText(Main.o.prompt);
    	
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice1.setVisible(false);
		choice2.setVisible(false);
		choice3.setVisible(false);
    }

    //supposed to transition to a winning screen when player chooses great routes
    public void winning() {
    	position = "winning";
    	mainTextArea.setText(Main.c.prompt);
    	
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice1.setVisible(false);
		choice2.setVisible(false);
		choice3.setVisible(false);
    }
    
    //actions that handle the titlescreen
    public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            createGameScreen();
        }
    }
    
    //action that handles the exit button
    public class ExitHandler implements ActionListener {
    	public void actionPerformed(ActionEvent event) {
    		System.exit(0);
    	}
    }
    
    //actions that handle the choices when user 
    public class ChoiceHandler implements ActionListener {
    	
    	// TODO: fix this to be dynamic
    	// ie: ACTION = CURRENTPANEL.getChoice(BUTTONCLICKED.getText())
    	// actionToPerform, currentPanel, and buttonClicked aren't the actual variable names
        public void actionPerformed(ActionEvent event) {    
            
        	// get what button is pressed
            String buttonPressed = event.getActionCommand();

            //Main.init.prompt;
            // see what button has been pressed
            switch(position) {
            case "panelInit":
            	switch(buttonPressed) {
            		case "c1": panelA(); break;
            		case "c2": panelB(); break;
            		case "c3": panelC(); break;
            	}
            	break;
            case "panelA":
            	switch(buttonPressed) {
            		case "c1": panelD(); break;
            		case "c2": panelE(); break;
            	}
            	break;
            case "panelB":
            	death();break;
            	
            case "panelC":
            	winning();break;
            
            case "panelD":
            	switch(buttonPressed) {
            		case "c1": panelF(); break;
            		case "c2": panelG(); break;
            		case "c3": panelH(); break;
            	}
            	break;
            case "panelE":
            	death(); break;
            	
            case "panelF":
            	switch(buttonPressed) {
            		case "c1": panelI(); break;
            		case "c2": panelJ(); break;
            	}
            	break;
            case "panelG":
            	switch(buttonPressed) {
            		case "c1": panelI(); break;
            		case "c2": panelJ(); break;
            	}
            	break;
            case "panelH":
            	death(); break;
            	
            case "panelI":
            	switch(buttonPressed) {
            		case "c1": panelL(); break;
            		case "c2": panelM1(); break;
            	}
            	break;
            case "panelJ":
            	switch(buttonPressed) {
            		case "c1": panelK(); break;
            		case "c2": panelO(); break;
            		case "c3": panelM(); break;
            	}
            	break;
            case "panelK":
            	death(); break;
            	
            case "panelL":
            	switch(buttonPressed) {
            		case "c1": panelP(); break;
            		case "c2": panelQ(); break;
            	}
            	break;
            case "panelM":
            	switch(buttonPressed) {
            		case "c1": panelN(); break;
            		case "c2": panelO(); break;
            	}
            	break;
            case "panelM1":
            	switch(buttonPressed) {
            	case "c1": panelL(); break;
            	}
            	break;
            case "panelO":
            	death(); break;
            	
            case "panelP":
            	switch(buttonPressed) {
            		case "c1": panelQ(); break;
            		case "c2": panelR(); break;
            		case "c3": panelS(); break;
            	}
            	break;
            case "panelQ":
            	death(); break;
            	
            case "panelR": 
				switch(buttonPressed) {
				case "c1": panelT();break;
				case "c2": panelV();break;
				case "c3": panelU();break;
				}
				break;
			case "panelS": 
    			switch(buttonPressed) {
    			case "c1": panelW();break;
    			case "c2": panelAA();break;
    			}
    			break;
    		case "panelT": 
    			switch(buttonPressed) {
    			case "c1": panelY();break;
    			case "c2": panelX();break;
    			case "c3": panelU();break;
    			}
    			break;
    		case "panelU": 
    			switch(buttonPressed) {
    			case "c1": panelY();break;
    			case "c2": panelZ();break;
    			}
    			break;
    		case "panelV": 
    			switch(buttonPressed) {
    			case "c1": panelX();break;
    			case "c2": panelY();break;
    			case "c3": panelU();break;
    			}
    			break;
    		case "panelW": 
    			switch(buttonPressed) {
    			case "c1": panelAC();break;
    			case "c2": panelAA();break;
    			}
    			break;
    		case "panelX": 
    			switch(buttonPressed) {
    			case "c1": panelY();break;
    			case "c2": panelY();break;
    			case "c3": panelU();break;
    			}
    			break;
    		case "panelY": 
    			death(); break;
    		case "panelAA": 
    			switch(buttonPressed) {
    			case "c1": panelAD();break;
    			}
    			break;   
    		case "panelAC": 
    			switch(buttonPressed) {
    			case "c1": panelAE();break;
    			case "c2": panelAF();break;
    			}
    			break;
    		case "panelAD": 
    			switch(buttonPressed) {
    			case "c1": panelQ();break;
    			case "c2": panelR();break;
    			case "c3": panelS(); break;
    			}
    			break;
            }
        }
    }
}    