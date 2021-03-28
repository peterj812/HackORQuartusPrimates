package HackORQuartusPrimates.HackORQuartusPrimates.src;

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
import javax.swing.JComponent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Game {

    JFrame window;
    Container con;
    JPanel titleNamePanel, endGameButtonPanel, playGameButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, picturePanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, pictureLabel;
    
    JTextArea mainTextArea = new JTextArea();
    Font titleFont = new Font("Times New Roman", Font.BOLD, 90);
    Font titleButtonFont = new Font("Times New Roman", Font.PLAIN, 60);
    Font promptFont = new Font("Calibri", Font.BOLD, 25);
    Font choiceFont = new Font("Calibri", Font.BOLD, 18);
    Font hpFont = new Font("Calibri", Font.BOLD, 35);
    Font otherButtonFont = new Font("Times New Roman", Font.PLAIN, 45);
    
    JButton endGameButton, playGameButton, choice1, choice2, choice3;

    //JTextArea mainTextArea;
    String position;
    int playerHp;
    ImageIcon image1, image2;
    ImageIcon tsaNormal, tsaMad, planeMarshall, planeOne, planeTwo, planeCrash, mirrorBuilding, inHotDogBuild,
    hotDogBuild, gates, feetBandage, doorSlams, doorInHotDogBuild, backPack, afterPickUpBandage, twoBuilding, 
    clownCooking, winImage, deathGeneric;

    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ExitHandler eHandler = new ExitHandler();
    ChoiceHandler cHandler = new ChoiceHandler();

    public Game() {

        //setting the window of the game
        window = new JFrame();
        window.setSize(720,720);       
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        
        con = window.getContentPane();

        //creates the title page panel
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(0, 200, 720, 200);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Laughing Stock");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        //panel that holds the buttons in order to play the game
        playGameButtonPanel = new JPanel();
        playGameButtonPanel.setBounds(250, 400, 180, 100);
        playGameButtonPanel.setBackground(Color.black);

        //button that prompts user to play the game
        playGameButton = new JButton("PLAY");
        playGameButton.setBackground(Color.black);
        playGameButton.setForeground(Color.white);
        playGameButton.setFont(titleButtonFont);
        
        playGameButton.addActionListener(tsHandler);
        playGameButton.setFocusPainted(false);
        
        //panel that holds the end game button
        endGameButtonPanel = new JPanel();
        endGameButtonPanel.setBounds(285, 500, 120, 70);
        endGameButtonPanel.setBackground(Color.black);
        
        //button that prompts user to end the game
        endGameButton = new JButton("EXIT");
        endGameButton.setBackground(Color.black);
        endGameButton.setForeground(Color.white);
        endGameButton.setFont(otherButtonFont);
        
        endGameButton.addActionListener(eHandler);
        endGameButton.setFocusPainted(false);
        
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
    
    //method to set up typing
    public void createrTextEdit() {
    	// Make start button come here
    	// Set title and play button vis to false
    	
    	
    	
    	// Implement entering of name here
    	
    	// Have continue button move to createGameScreen
    }

    //function that creates the game screen 
    public void createGameScreen() {

        //sets the title panel and play button to false
        titleNamePanel.setVisible(false);
        playGameButtonPanel.setVisible(false);
        endGameButtonPanel.setVisible(false);

        //creates a text area panel that shows the message to the user
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(10, 499, 678, 100);
        mainTextPanel.setBackground(Color.white);
        con.add(mainTextPanel);

        //sets the text area
        mainTextArea = new JTextArea();
        mainTextArea.setBounds(2, 500, 680, 100);
        mainTextArea.setBackground(Color.white);
        mainTextArea.setForeground(Color.black);
        mainTextArea.setFont(promptFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        //choice button panel that shows the choices for the user
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(9, 600, 680, 70);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(1,3));
        con.add(choiceButtonPanel);

        //creates choice 1 button
        choice1 = new JButton();

        choice1.setBackground(Color.white);
        choice1.setForeground(Color.black);
        choice1.setFont(choiceFont);

        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);
        
        //creates choice 2 button
        choice2 = new JButton();

        choice2.setBackground(Color.white);
        choice2.setForeground(Color.black);
        choice2.setFont(choiceFont);

        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2); 
        
        //creates choice 3 button
        choice3 = new JButton();

        choice3.setBackground(Color.white);
        choice3.setForeground(Color.black);
        choice3.setFont(choiceFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        //shows the status of the player when they lose or gain hp
        playerPanel = new JPanel();
        playerPanel.setBounds(110, 0, 102, 37);
        playerPanel.setBackground(Color.red);
        playerPanel.setLayout(new GridLayout(1,3));
        con.add(playerPanel);
      
        //sets the hp label
        hpLabel = new JLabel("HP:");
        hpLabel.setFont(hpFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);

        //sets the number of the hp label
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(hpFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber); 

        //calls playerSetup method
        playerSetup();

    }
    
    private void takeDamageL() {
    	Main.injury(2, 5);
    	playerHp = Main.jimbo.getHealth();
    	hpLabelNumber.setText("" + playerHp);
    }
    
    private void takeDamageH() {
    	Main.injury(5, 11);
    	playerHp = Main.jimbo.getHealth();
    	hpLabelNumber.setText("" + playerHp);
    	if (playerHp <= 0) {
    		deathCrash();
    	}
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
    	
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        picturePanel.setBackground(Color.black);

        con.add(picturePanel);
        pictureLabel = new JLabel();
        tsaNormal = new ImageIcon(".//Images//TSA.jpg.jpeg");
        pictureLabel.setIcon(tsaNormal);
        picturePanel.add(pictureLabel);
		
        position = "panelInit";
        mainTextArea.setText(Main.init.prompt);

        choice1.setText("Go home, flying is scary");
        choice2.setText("Look through bag");
        choice3.setText("Go through metal detector");
    }
    
    public void panelA() {
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        backPack = new ImageIcon(".//Images//Backpack.jpg");
        pictureLabel.setIcon(backPack);
        picturePanel.add(pictureLabel);

        position = "panelA";
        mainTextArea.setText(Main.a.prompt);

        choice1.setText("Put bag down and go through security");
        choice2.setText("Throw away contraband");
        choice3.setText("");
        choice3.setVisible(false);
        // do right before switching panels con.remove(picturePanel);
    }

    //choices to show the second scenario
    public void panelB() {
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        tsaMad = new ImageIcon(".//Images//Tsamad.jpg");
        pictureLabel.setIcon(tsaMad);
        picturePanel.add(pictureLabel);

        position = "panelB";
        mainTextArea.setText(Main.b.prompt);

        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        //picturePanel.setBackground(Color.blue);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        tsaMad = new ImageIcon(".//Images//Tsamad.jpg");
        pictureLabel.setIcon(tsaMad);
        picturePanel.add(pictureLabel);
        
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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        planeOne = new ImageIcon(".//Images//PLane1.jpg");
        pictureLabel.setIcon(planeOne);
        picturePanel.add(pictureLabel);

        position = "panelD";
        mainTextArea.setText(Main.d.prompt);

        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        //picturePanel.setBackground(Color.blue);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        tsaMad = new ImageIcon(".//Images//Plane1.jpg");
        pictureLabel.setIcon(tsaMad);
        picturePanel.add(pictureLabel);

        choice1.setText("Keep reading paper");
        choice2.setText("Put feet up");
        choice3.setText("Fall Asleep");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
    }
    
    public void panelE() {
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        tsaMad = new ImageIcon(".//Images//Tsamad.jpg");
        pictureLabel.setIcon(tsaMad);
        picturePanel.add(pictureLabel);

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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        planeCrash = new ImageIcon(".//Images//Plane rash.jpg");
        pictureLabel.setIcon(planeCrash);
        picturePanel.add(pictureLabel);

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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        planeCrash = new ImageIcon(".//Images//Plane rash.jpg");
        pictureLabel.setIcon(planeCrash);
        picturePanel.add(pictureLabel);

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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        planeMarshall = new ImageIcon(".//Images//PlaneMarshal.jpg");
        pictureLabel.setIcon(planeMarshall);
        picturePanel.add(pictureLabel);
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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        planeCrash = new ImageIcon(".//Images//Plane rash.jpg");
        pictureLabel.setIcon(planeCrash);
        picturePanel.add(pictureLabel);

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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        planeCrash = new ImageIcon(".//Images//Plane rash.jpg");
        pictureLabel.setIcon(planeCrash);
        picturePanel.add(pictureLabel);

        position = "panelJ";
        mainTextArea.setText(Main.j.prompt);

        choice1.setText("Pull out the shrapnel");
        choice2.setText("Examine the plane crash");
        choice3.setText("Walk toward abandoned carnival");
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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        gates = new ImageIcon(".//Images//Gates.jpg");
        pictureLabel.setIcon(gates);
        picturePanel.add(pictureLabel);

        position = "panelL";
        mainTextArea.setText(Main.l.prompt);

        choice1.setText("Give up");
        choice2.setText("Walk toward abandoned carnival");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(false);
    }
    
    public void panelL1() {
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        planeCrash = new ImageIcon(".//Images//Plane rash.jpg");
        pictureLabel.setIcon(planeCrash);
        picturePanel.add(pictureLabel);
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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        feetBandage = new ImageIcon(".//Images//FeetBandage.jpg");
        pictureLabel.setIcon(feetBandage);
        picturePanel.add(pictureLabel);
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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        planeCrash = new ImageIcon(".//Images//Plane rash.jpg");
        pictureLabel.setIcon(planeCrash);
        picturePanel.add(pictureLabel);

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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        backPack = new ImageIcon(".//Images//Backpack.jpg");
        pictureLabel.setIcon(backPack);
        picturePanel.add(pictureLabel);

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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        twoBuilding = new ImageIcon(".//Images//2Building.jpg");
        pictureLabel.setIcon(twoBuilding);
        picturePanel.add(pictureLabel);

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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        mirrorBuilding = new ImageIcon(".//Images//MirrorBuilding.jpg");
        pictureLabel.setIcon(mirrorBuilding);
        picturePanel.add(pictureLabel);
        
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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        hotDogBuild = new ImageIcon(".//Images//HotDogBuild.jpg");
        pictureLabel.setIcon(hotDogBuild);
        picturePanel.add(pictureLabel);

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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        doorSlams = new ImageIcon(".//Images//DoorSlams.jpg");
        pictureLabel.setIcon(doorSlams);
        picturePanel.add(pictureLabel);

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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        twoBuilding = new ImageIcon(".//Images//2Building.jpg");
        pictureLabel.setIcon(twoBuilding);
        picturePanel.add(pictureLabel);

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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        doorSlams = new ImageIcon(".//Images//DoorSlams.jpg");
        pictureLabel.setIcon(doorSlams);
        picturePanel.add(pictureLabel);

        position = "panelV";
        mainTextArea.setText(Main.v.prompt);

        choice1.setText("Pull the door");
        choice2.setText("Push the door");
        choice3.setText("Walk away");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
    }
    
    public void panelW() {
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        doorInHotDogBuild = new ImageIcon(".//Images//DoorInHotDogBuild.jpg");
        pictureLabel.setIcon(doorInHotDogBuild);
        picturePanel.add(pictureLabel);

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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        doorSlams = new ImageIcon(".//Images//DoorSlams.jpg");
        pictureLabel.setIcon(doorSlams);
        picturePanel.add(pictureLabel);

        position = "panelX";
        mainTextArea.setText(Main.x.prompt);

        choice1.setText("Yank the door!");
        choice2.setText("Charge the door!");
        choice3.setText("Walk away");
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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        doorInHotDogBuild = new ImageIcon(".//Images//DoorInHotDogBuild.jpg");
        pictureLabel.setIcon(doorInHotDogBuild);
        picturePanel.add(pictureLabel);

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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        backPack = new ImageIcon(".//Images//BackPack.jpg");
        pictureLabel.setIcon(backPack);
        picturePanel.add(pictureLabel);

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
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        clownCooking = new ImageIcon(".//Images//ClownCooking.jpg");
        pictureLabel.setIcon(clownCooking);
        picturePanel.add(pictureLabel);
        
        position = "panelAC";
        mainTextArea.setText(Main.ac.prompt);

        choice1.setText("Screeeeeaaammm!!!");
        choice2.setText("Run out of the building");
        choice3.setText("");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(false);
    }
    
    public void panelAD() {
        picturePanel = new JPanel();
        picturePanel.setBounds(110, -5, 500, 500);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        twoBuilding = new ImageIcon(".//Images//2Building.jpg");
        pictureLabel.setIcon(twoBuilding);
        picturePanel.add(pictureLabel);

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
    
    public void deathGeneric() {
    	position = "deathG";
    	mainTextArea.setText(Main.ah.prompt);
    	Main.injury(10, 11);
    	playerHp = Main.jimbo.getHealth();
    	hpLabelNumber.setText("" + playerHp);
    	//GAME OVER
		choice1.setText("Restart");
		choice2.setText("");
		choice3.setText("");
		choice1.setVisible(true);
		choice2.setVisible(false);
		choice3.setVisible(false);
    }
    
    public void deathCrash() {
    	position = "deathG";
    	mainTextArea.setText(Main.ah.prompt);
    	//GAME OVER
		choice1.setText("Restart");
		choice2.setText("");
		choice3.setText("");
		choice1.setVisible(true);
		choice2.setVisible(false);
		choice3.setVisible(false);
    }
    
    public void deathShrapnel() {
    	position = "deathS";
    	mainTextArea.setText(Main.o.prompt);
    	Main.injury(10, 11);
    	playerHp = Main.jimbo.getHealth();
    	hpLabelNumber.setText("" + playerHp);
    	//GAME OVER, SHRAPNEL IN YOUR LEG WAS TOO MUCH
		choice1.setText("Restart");
		choice2.setText("");
		choice3.setText("");
		choice1.setVisible(true);
		choice2.setVisible(false);
		choice3.setVisible(false);
    }

    public void restart() {
        position = "restart";
        mainTextArea.setText(Main.init.prompt);

        choice1.setText("Go home, flying is scary");
        choice2.setText("Look through bag");
        choice3.setText("Go through metal detector");
    }
    
    
    //supposed to transition to a winning screen when player chooses great routes
    public void winning() {
    	position = "winning";
    	mainTextArea.setText(Main.c.prompt);
    	
		choice1.setText("Restart");
		choice2.setText("");
		choice3.setText("");
		choice1.setVisible(true);
		choice2.setVisible(false);
		choice3.setVisible(false);
    }
    
    //actions that handle the titlescreen
    public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            createGameScreen();
        }
    }
    
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
            		case "c1": panelC(); break;
            		case "c2": panelA(); break;
            		case "c3": panelB(); break;
            	}
            	break;
            case "panelA":
            	switch(buttonPressed) {
            		case "c1": panelE(); break;
            		case "c2": panelD(); break;
            	}
            	break;
            case "panelB":
            	deathGeneric();break;
            	
            case "panelC":
            	winning();break;
            
            case "panelD":
            	switch(buttonPressed) {
            		case "c1": { 
            			panelG();
            			takeDamageH();
            			break;
            		}
            		case "c2": panelH(); break;
            		case "c3": {
            			panelF(); 
            			takeDamageL();
            			break;
            		}
            	}
            	break;
            case "panelE":
            	deathGeneric(); break;
            	
            case "panelF":
            	switch(buttonPressed) {
            		case "c1": panelI(); break;
            	}
            	break;
            case "panelG":
            	switch(buttonPressed) {
            		case "c1": panelI(); break;
            	}
            	break;
            case "panelH":
            	deathGeneric(); break;
            	
            case "panelI":
            	switch(buttonPressed) {
            		case "c1": panelL(); break;
            		case "c2": panelM1(); break;
            	}
            	break;
            case "panelJ":
            	switch(buttonPressed) {
            		case "c1": panelK(); break;
            		case "c2": panelM(); break;
            		case "c3": panelO(); break;
            	}
            	break;
            case "panelK":
            	deathGeneric(); break;
            	
            case "panelL":
            	switch(buttonPressed) {
            		case "c1": panelQ(); break;
            		case "c2": panelP(); break;
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
            	deathShrapnel(); break;
            	
            case "panelP":
            	switch(buttonPressed) {
            		case "c1": panelQ(); break;
            		case "c2": panelR(); break;
            		case "c3": panelS(); break;
            	}
            	break;
            case "panelQ":
            	deathGeneric(); break;
            	
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
    			deathGeneric(); break;

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
