package HackORQuartusPrimates.HackORQuartusPrimates.src;


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
import javax.swing.JTextField;

public class Main {
	private static Random rand = new Random();
	public static Player jimbo = new Player("");

	static Panel homescreen, choosename, init, a, b, c, d, e, f, g, h, i, j, k, l, l1, m, m1, n, o, p, q, r, s, t, u, v,
<<<<<<< HEAD
			w, x, y, z, aa, ab, ac, ad, ae, af, ag, ah, home;
=======
			w, x, y, z, aa, ab, ac, ad, ae, af, ag, ah, ai, go, win, winC, home;
>>>>>>> 26d49b4ed84e149cb93acd702303054d417440be
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
		double chance = Math.random();
		if (chance < 0.1) {
			int min_damage = 0;
			int max_damage = 3;
			injury(min_damage, max_damage);	
		} else 
			return;
	}

	// TODO: finish this method please :)
	static void injury(int min_damage, int max_damage) {
		int damage = rand.nextInt(max_damage - min_damage) + min_damage; // determine the damage using min_damage and max_damage inclusive
		jimbo.setHealth(jimbo.getHealth() - damage);
	}

	static final void initialize() {

		// these should be between 0 and 100 inclusive
		/*double hasAdultItemChance = 25;
		double hasBandagesChance = 25;
		double hasKnifeChance = 25;
		double hasSmallEngine = 25;
		double hasWaterBottleChance = 25;
		double tripChance = 25; */

		// ITEMS
		adultItem = new Item("adult item", true);
		bandages = new Item("bandages", false);
		knife = new Item("knife", true);
		smallEngine = new Item("small engine", true);
		waterBottle = new Item("water bottle", true);

		// PANELS/PROMPTS
		homescreen = new Panel("Homescreen", "");
		choosename = new Panel("", "What's your name?");

<<<<<<< HEAD
		init = new Panel("TSA Checkpoint", "Welcome to hel...Los Angeles International Airport,\nyour flight leaves soon so you better get a move on.");
		a = new Panel("", "You have contraband in your bag! Good thing you checked...");
		b = new Panel("",
				"TSA found contraband in your luggage! \nYou have been arrested and put on a terrorist\n watch list for having CONTRABAND \nin the airport.");
		c = new Panel("",
				"YOU WIN! It's a pandemic, staying home is a smart choice!\nYet do you feel this is a deserved victory?");
		d = new Panel("", "You successfully got on the flight and are sitting comfortably.\n Only a few hours to go");
		e = new Panel("",
				"TSA found contraband in your luggage! You have been arrested and put on a terrorist watch list for having CONTRABAND in the airport.");
		f = new Panel("Crash site", "You get startled by an announcement." + "\n" + "\"EMERGENCY! EMERGENCY! PLANE GOING DOWN!\"" + "\n" + "*Crash noises*");
		g = new Panel("", "You get startled by an announcement." + "\n" + "\"EMERGENCY! EMERGENCY! PLANE GOING DOWN!\"" + "\n" + "*Crash noises*");
		h = new Panel("",
				"Time to relax! As you put your feet up on the chair,\n the Airmarshall sitting in front of you \nstands up and knocks you out.");
		i = new Panel("",
				"You are shaken up by the plane crash,\nyou are lucky to have surived, it seems no one else did." + "\n" + " Is that a carnival next to you?");
=======
		init = new Panel("TSA Checkpoint",
				"<html><center> Welcome to hel...Los Angeles International Airport,<br> your flight leaves soon so you better get a move on.</center></html>");
		a = new Panel("",
				"<html><center>You have contraband in your bag! Good thing you checked...</html></center>");
		b = new Panel("",
				"<html><center>TSA found contraband in your luggage! <br> You have been arrested and put on a terrorist watch list <br> for having CONTRABAND in the airport.</center></html>");
		c = new Panel("",
				"<html><center>YOU WIN! It's a pandemic, staying home is a smart choice! <br> (Yet do you feel this is a deserved victory?</center></html>");
		d = new Panel("",
				"<html><center>You successfully got on the flight and are sitting comfortably. <br> Only a few hours to go</center></html>");
		e = new Panel("",
				"<html><center>TSA found contraband in your luggage! <br> You have been arrested and put on a terrorist watch list <br> for having CONTRABAND in the airport.</center></break>");
		f = new Panel("Crash site",
				"<html><center>You get startled by an announcement. <br> MAYDAY! MAYDAY! PLANE GOING DOWN! <br> *Crash noises*</center></html>");
		g = new Panel("",
				"<html><center>You get startled by an announcement. <br> MAYDAY! MAYDAY! PLANE GOING DOWN! <br> *Crash noises*</center></html>");
		h = new Panel("",
				"<html><center>Time to relax! <br> As you put your feet up on the chair, <br> 0the Airmarshall sitting in front of you stands up and knocks you out.</center></html>");
		i = new Panel("",
				"<html><center>You are shaken up by the plane crash, <br> you are lucky to have survived, it seems no one else did. <br> Is that a carnival next to you?</center></html>");
>>>>>>> 26d49b4ed84e149cb93acd702303054d417440be
		j = new Panel("",
				"<html><center>You seem to have been impaled by some shrapnel. <br> At least you survived as it seems no one else did. <br> Is that a carnival next to you?</center></html>");
		k = new Panel("",
<<<<<<< HEAD
				"GAME OVER." + "\n" + "As you pull the shrapnel out of your body, you feel the life quickly leave your body.");
		l = new Panel("",
				"You approach the carnival." + "\n" + "The air feels thinner here, as if something is sucking it out of the world." + "\n" + "You feel a shiver go down your spine as you walk through the clown headed gates.");
		l1 = new Panel("", "");
		m = new Panel("", "As you stare into the firey wreck of the plane, you notice a bandage lying at your feet.");
		m1 = new Panel("",
				"You stare at the crash and see nothing but burning rubble. For some reason, all you can think of is George Bush.");
		n = new Panel("", "You put the bandage in your backpack.");
=======
				"<html><center>You are bleeding.</center></html>");
		l = new Panel("",
				"<html><center>You approach the carnival. The air feels thinner here, <br> as if something is sucking it out of the world. You feel a shiver go <br> down your spine as you walk through the clown headed gates.</center></html>");
		l1 = new Panel("",
				"<html><center>You feel relieved. <br> There's nothing else here, time to head into the carnival.</center></html>");
		m = new Panel("",
				"<html><center>As you stare into the firey wreck of the plane, <br> you notice a bandage lying at your feet.</center></html>");
		m1 = new Panel("",
				"<html><center>You stare at the crash and see nothing but burning rubble. <br> For some reason, all you can think of is George Bush.</center></html>");
		n = new Panel("", "<html><center>You pick up the bandage.</center></html>");
>>>>>>> 26d49b4ed84e149cb93acd702303054d417440be
		o = new Panel("",
				"<html><center>GAMEOVER. <br> The pain from the shrapnel is too much to handle. <br> Your body gives in on itself, and you feel the life leave you.</center></html>");
		p = new Panel("",
				"<html><center>You walk further into the carnival. The sky becomes darker as you leave <br> the fire of the crash. The air getting even thinner. You can hear the sound of clowns laughing in the distance. <br> It seems the noise is coming towards you. You can see a building to your left, and a building to your right. <br> The left building has a giant mirror on it, the right has a giant hotdog on top.</center></html>");
		q = new Panel("",
				"<html><center>GAME OVER. <br> <q>F*** this</q> you say to yourself as you curl into a fetal position, <br> giving yourself up to the darkness. You can hear the faint sound of a clown laughing. <br> It seems to be coming closer.</center></html>");
		r = new Panel("",
				"<html><center>You go towards the mirror building in hopes of finding a telephone, <br> maybe a place to collect your thoughts. As you walk through the front door, <br> you hear it slam shut behind you.</center></html>");
		s = new Panel("",
				"<html><center>You go towards the hotdog building in hopes of finding a telephone, <br> maybe a place to collect your thoughts. As you enter the building the sweet aroma of freshly cooked meat fills your nose. <br> Strange, no one seems to be around.</center></html>");
		t = new Panel("", "<html><center>The door doesn't budge.</center></html>");
		u = new Panel("",
				"<html><center>You walk further into the building. Quickly, you become lost in a maze of mirrors. <br> Which way is forward? Where did you come from? <br> You swear the sound of the clowns is even closer now.</center></html>");
		v = new Panel("", "<html><center>The door doesn't budge.</center></html>");
		w = new Panel("",
				"<html><center>You follow your nose and find a door slightly gaped. It looks like it leads into a kitchen.</center></html>");
		x = new Panel("", "<html><center>The door doesn't budge.</center></html>");
		y = new Panel("",
				"<html><center>GAME OVER. <br> Trust us, we're doing you a favor. You're not smart enough to <br> make it any farther. Your arms fall off and you bleed out.</center></html>");
		z = new Panel("",
				"<html><center>As you run you hear the laughing of a clown close in on you. <br> Suddenly, you feel a blunt object hit you in the head.</center></html>");
		aa = new Panel("",
<<<<<<< HEAD
				"You turn and leave the hotdog building. The smell of meat gets fainter. Maybe you made the wrong choice...");
		ab = new Panel("", "You open your backpack.");
=======
				"<html><center>You turn and leave the hotdog building. <br> The smell of meat gets fainter. Maybe you made the wrong choice...</center></html>");
		ab = new Panel("", "<html><center>You have a bandage. Would you like to apply it?</center></html>");
>>>>>>> 26d49b4ed84e149cb93acd702303054d417440be
		ac = new Panel("",
				"<html><center>You push open the door. <br> To your horror, you see a clown cooking what looks like a deceased mime!</center></html>");
		ad = new Panel("", "<html><center>You walk back into the carnival and once again can see the two buildings</center></html>");
		ae = new Panel("",
				"<html><center>You scream, spooking the clown who chases after you, a hungry look on his face.</center></html>");
		af = new Panel("",
				"<html><center>You ask the clown if he needs help cooking. <br> He nods and you join him.</center></html>");
		ag = new Panel("", "");
<<<<<<< HEAD
		ah = new Panel("", "GAME OVER");
		home = new Panel("", "Laughing Stock");
=======
		ah = new Panel("", "<html><center>GAME OVER! <br> You died in the plane crash!</center</html>");
		home = new Panel("", "<html><center>Laughing Stock</center></html>");
		go = new Panel("", "<html><center>GAME OVER!</center></html>");
    win = new Panel("", "<html><center>Congratulations! You win!</center></html>");
    winC = new Panel("YOU WIN!", "<html><center>Joining the clown, <br> you and he develop an unbreakable bond and live happily ever after</center></html>");
		ai = new Panel("", "<html><center>GAME OVER! <br> The bleeding is too much, you feel the life rushing out of you. <br> You know there's nothing left to do but let death take you.</center></html>");

>>>>>>> 26d49b4ed84e149cb93acd702303054d417440be

	}

	static void RandomItem(Item in) {
		int chance = 100;
		int val = rand.nextInt(chance);
		if (val <= 25) {
			jimbo.addItem(in);
		}
	}

	// TODO: change mainTextArea, choice1, choice2, and choice3 dynamically based on
	// Panel pan
	// TODO: see Game.java's method public void airport for guide

	public static void main(String[] args) {
		initialize();

		gam = new Game();
	}

}
