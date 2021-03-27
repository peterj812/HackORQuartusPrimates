
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


import java.util.Random;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Main {
	private static Random rand = new Random();
	public static Player jimbo = new Player("");
	
	static Panel homescreen, choosename, init, a, b, c, d, e, f, g, h, i, j, k, l, l1, m, n, o, p, q, r, s, t, u, v, w, x, y, z, aa, ab, ac, ad, ae, af, ag;
  static JPanel titleNamePanel, playGameButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
  static JLabel titleNameLabel, hpLabel, hpLabelNumber;

  static Font titleFont = new Font("Times New Roman", Font.PLAIN, 30);
  static Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
  static JButton playGameButton, choice1, choice2, choice3;
  static JTextArea mainTextArea;
	static JFrame window;
	static Container con;

	static Item adultItem, bandages, knife, smallEngine, waterBottle;
	static Game gam;
	public static int health = jimbo.getHealth();
	
	// METHODS

	void trip() {
		int min_damage = 0;
		int max_damage = 3;
		injury(min_damage, max_damage);
	}

	void crash() {
		int min_damage = 3;
		int max_damage = 10;
		injury(min_damage, max_damage);
	}

	// TODO: finish this method please :)
	void injury(int min_damage, int max_damage) {
		int damage = 0; // determine the damage using min_damage and max_damage inclusive
		jimbo.setHealth(jimbo.getHealth() - damage);
	}

	static final void initialize() {

		// these should be between 0 and 100 inclusive
		double hasAdultItemChance = 25;
		double hasBandagesChance = 25;
		double hasKnifeChance = 25;
		double hasSmallEngine = 25;
		double hasWaterBottleChance = 25;
		double tripChance = 25;
		
		// ITEMS
		adultItem = new Item("adult item", true);
		bandages = new Item("bandages", false);
		knife = new Item("knife", true);
		smallEngine = new Item("small engine", true);
		waterBottle = new Item("water bottle", true);

		// PANELS
		homescreen = new Panel("Homescreen", "");
		choosename = new Panel("", "What's your name?");
		init = new Panel("TSA Checkpoint", "Welcome to hel...Los Angeles International Airport, your flight leaves soon so you better get a move on.");
		a = new Panel("", "Jimbo sees his water bottle and whatever else is in the bag.");
		b = new Panel("", "You have been arrested and put on a terrorist watch list for having CONTRABAND in the airport.");
		c = new Panel("", "YOU WIN! It's a pandemic, staying home is a smart choice! (Yet do you feel this is a deserved victory?");
		d = new Panel("", "*Airplane go brrrr.*");
		e = new Panel("", "You have been arrested and put on a terrorist watch list for having CONTRABAND in the airport.");
		f = new Panel("Crash site", "*Crash noises*");
		g = new Panel("", "*Crash noises*");
		h = new Panel("", "The Airmarshall sitting in front of you stands up and knocks you out.");
		i = new Panel("", "You are shaken up by the plane crash, you are lucky to have surived, it seems no one else did. Is that a carnival next to you?");
		j = new Panel("", "You seem to have been impaled by some shrapnel. At least you survived as it seems no one else did. Is that a carnival next to you?");
		k = new Panel("", "GAME OVER. As you pull the shrapnel out of your body, you feel the life quickly leave your body.");
		l = new Panel("", "You approach the carnival. The air feels thinner here, as if something is sucking it out of the world. You feel a shiver go down your spine as you walk through the clown headed gates.");
		l1 = new Panel("", "");
		m = new Panel("", "As you stare into the firey wreck of the plane, you notice a bandage lying at your feet.");
		n = new Panel("", "You put the bandage in your backpack.");
		o = new Panel("", "GAMEOVER. The pain from the shrapnel is too much to handle. Your body gives in on itself, and you feel the life leave you");
		p = new Panel("", "You walk further into the carnival. The sky becomes darker as you leave the fire of the crash. The air getting even thinner. You can hear the sound of clowns laughing in the distance. It seems the noise is coming towards you. You can see a building to your left, and a building to your right. The left building has a giant mirror on it, the right has a giant hotdog on top." );
		q = new Panel("", "GAME OVER. 'F*** this' you say to yourself as you curl into a fetal position, giving yourself up to the darkness. You can hear the faint sound of a clown laughing. It seems to be coming closer.");
		r = new Panel("", "You go towards the mirror building in hopes of finding a telephone, maybe a place to collect your thoughts. As you walk through the front door, you hear it slam shut behind you.");
		s = new Panel("", "You go towards the hotdog building in hopes of finding a telephone, maybe a place to collect your thoughts. As you enter the building the sweet aroma of freshly cooked meat fills your nose. Strange, no one seems to be around.");
		t = new Panel("", "The door doesn't budge.");
		u = new Panel("", "You walk further into the building. Quickly, you become lost in a maze of mirrors. Which way is forward? Where did you come from? You swear the sound of the clowns is even closer now");
		v = new Panel("", "The door doesn't budge.");
		w = new Panel("", "You follow your nose and find a door slightly gaped. It looks like it leads into a kitchen.");
		x = new Panel("", "The door doesn't budge.");
		y = new Panel("", "GAME OVER. Trust us, we're doing you a favor. You're not smart enough to make it any farther. Your arms fall off and you bleed out.");
		z = new Panel("", "");
		aa = new Panel("", "You turn and leave the hotdog building. The smell of meat gets fainter. Maybe you made the wrong choice...");
		ab = new Panel("", "You open your backpack.");
		ac = new Panel("", "You push open the door. To your horror, you see a clown cooking what looks like a deceased mime, a clowns worst enemy.");
		ad = new Panel("", "You walk back into the carnival and once again can see the two buildings");
		ae = new Panel("", "");
		af = new Panel("", "");
		ag = new Panel("", "");

		// SET CHOICES
		
		// homescreen choices - Start(/Credits/Exit -> if time)
		homescreen.setChoice("Start", init);
		// homescreen.setChoice("Credits", credits);
		// homescreen.setChoice("Exit", exit);

		// init choices
		init.setChoice("Look through bag", a);
		init.setChoice("Go through metal detector", b);
		init.setChoice("Go home, flying is scary", c);

		// a choices
		a.setChoice("Throw away contraband", d);
		a.setChoice("Put bag down and go through security", e);

		// b choices
		// TODO: Implement prison game over

		// c choices
		// TODO: Implement unaccomplished win

		// d choices
		d.setChoice("Take a nap", f);
		d.setChoice("Keep reading paper", g);
		d.setChoice("Put feet up", h);
		
		// e choices - TODO: Implement prison; game over
	
		// f track - TODO: Implement movement to crash shit w/ damage
		
		// g track - TODO: Either death or higher chance of injury/more damage
		
		// h choices - TODO: Implement prison; game over
		
		// i choices
		i.setChoice("Walk toward abandoned carnival", l);
		i.setChoice("Examine the plane crash", m);
		
		// j choices
		j.setChoice("Pull out the shrapnel", k);
		j.setChoice("Walk toward abandoned carnival", l);
		j.setChoice("Examine the plane crash", m);		
		
		// k choices
		// TODO: Say you are starting to bleed out quick
		k.setChoice("Cover it with your hand", n);
		
		// l choices
		l.setChoice("Walk further into carnival", p);
		l.setChoice("Give up", q);
		
		// l1 track
		// TODO: Automatically go to track l
		
		// m choices
		m.setChoice("Pick up bandage", n);
		m.setChoice("Walk into carnival", l);
		
		// n 
		n.setChoice("Walk into the carnival", o);
		n.setChoice("Open backpack", ab);
		
		// o
		// TODO: Death from shrapnel 
		
		// p
		p.setChoice("You sure you don't want to give up?", q);
		p.setChoice("Go to the mirror building", r);
		p.setChoice("Go to the hotdog building", p);
		
		// q
		// TODO: Death from crying 
		
		// r
		r.setChoice("Pull on the door", t);
		r.setChoice("Push the door", v);
		r.setChoice("Ignore it", u);
		
		// s
		s.setChoice("Locate the source of the smell", w);
		s.setChoice("Leave the building", aa);
		
		// t
		t.setChoice("Pull the door", y);
		t.setChoice("Push the door", p);
		t.setChoice("Walk away", u);
		
		// u
		u.setChoice("Run as fast as you can in a straight line", y);
		u.setChoice("Try to escape the maze", z);
		
		// v
		v.setChoice("Pull the door", x);
		v.setChoice("Push the door", y);
		v.setChoice("Just walk awayayyay", u);
		
		// w
		w.setChoice("Push the door", ac);
		w.setChoice("Walk out the way you came", aa);
		
		// x
		x.setChoice("Yank the door!", y);
		x.setChoice("Charge the door!", y);
		x.setChoice("Just walk awayayyay", u);
		
		// y
		// TODO: Gameover
		
		// z - AWAITING PANEL
		
		// aa
		// TODO: GO to track ad
		
		// ab
		ab.setChoice("Close backpack and head to the carnival", o);
		ab.setChoice("Take out shrapnel and apply bandage", l1);
		
		// ac
		ac.setChoice("Screeeeeaaammm!!!", ae);
		ac.setChoice("Run out of the building, but you can't scream", af);
				
		// ad
		ad.setChoice("You sure you don't want to give up?", q);
		ad.setChoice("Go to the mirror building", r);
		ad.setChoice("Go to the hotdog building", s);
		
		// ae - AWAITING PANEL
		
		
		// af - AWAITING PANEL
		
		// ag - AWAITING PANEL
		
		
		// determine what items will be in backpack
		
	}

	static void RandomItem(Item in) {
		int chance = 100;
		int val = rand.nextInt(chance);
		if (val <= 25) {
			jimbo.addItem(in);
		}
	}
	
	// TODO: change mainTextArea, choice1, choice2, and choice3 dynamically based on Panel pan
	// TODO: see Game.java's method public void airport for guide
	public static void updatePanel(Panel pan) {
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("WELCOME TO FLIGHT SI");
        titleNameLabel = new JLabel(pan.getPrompt());
        
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


        //adds the title name and the play button to the panel
        titleNamePanel.add(titleNameLabel);
        playGameButtonPanel.add(playGameButton);

        //adds the panels to the container
        con.add(titleNamePanel);
        con.add(playGameButtonPanel);
	}

	public static void main(String[] args) {
		initialize();
		
		gam = new Game();
	}

}
