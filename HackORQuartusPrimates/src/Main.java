
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
			w, x, y, z, aa, ab, ac, ad, ae, af, ag, ah, home;
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
	
	static void heal(int min_gain, int max_gain) {
		int regain = rand.nextInt(max_gain - min_gain) + min_gain; // determine the damage using min_damage and max_damage inclusive
		jimbo.setHealth(jimbo.getHealth() + regain);
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

		init = new Panel("TSA Checkpoint", "Welcome to hel...Los Angeles International Airport, your flight leaves soon so you better get a move on.");
		a = new Panel("", "You have contraband in your bag! Good thing you checked...");
		b = new Panel("",
				"TSA found contraband in your luggage! You have been arrested and put on a terrorist watch list for having CONTRABAND in the airport.");
		c = new Panel("",
				"YOU WIN! It's a pandemic, staying home is a smart choice! (Yet do you feel this is a deserved victory?");
		d = new Panel("", "You successfully got on the flight and are sitting comfortably. Only a few hours to go");
		e = new Panel("",
				"TSA found contraband in your luggage! You have been arrested and put on a terrorist watch list for having CONTRABAND in the airport.");
		f = new Panel("Crash site", "You get startled by an announcement." + "\n" + "\"MAYDAY! MAYDAY! PLANE GOING DOWN!\"" + "\n" + "*Crash noises*");
		g = new Panel("", "You get startled by an announcement." + "\n" + "\"MAYDAY! MAYDAY! PLANE GOING DOWN!\"" + "\n" + "*Crash noises*");
		h = new Panel("",
				"Time to relax!" + "\n" + "As you put your feet up on the chair, the Airmarshall sitting in front of you stands up and knocks you out.");
		i = new Panel("",
				"You are shaken up by the plane crash, you are lucky to have surived, it seems no one else did." + "\n" + " Is that a carnival next to you?");
		j = new Panel("",
				"You seem to have been impaled by some shrapnel. At least you survived as it seems no one else did." + "\n" + "Is that a carnival next to you?");
		k = new Panel("",
				"GAME OVER." + "\n" + "As you pull the shrapnel out of your body, you feel the life quickly leave your body.");
		l = new Panel("",
				"You approach the carnival." + "\n" + "The air feels thinner here, as if something is sucking it out of the world." + "\n" + "You feel a shiver go down your spine as you walk through the clown headed gates.");
		l1 = new Panel("", "You feel relieved. There's nothing else here, time to head into the carnival");
		m = new Panel("", "As you stare into the firey wreck of the plane, you notice a bandage lying at your feet.");
		m1 = new Panel("",
				"You stare at the crash and see nothing but burning rubble. For some reason, all you can think of is George Bush.");
		n = new Panel("", "You pick up the bandage.");
		o = new Panel("",
				"GAMEOVER." + "\n" + "The pain from the shrapnel is too much to handle. Your body gives in on itself, and you feel the life leave you");
		p = new Panel("",
				"You walk further into the carnival. The sky becomes darker as you leave the fire of the crash. The air getting even thinner. You can hear the sound of clowns laughing in the distance. It seems the noise is coming towards you." + "\n" + "You can see a building to your left, and a building to your right. The left building has a giant mirror on it, the right has a giant hotdog on top.");
		q = new Panel("",
				"GAME OVER." + "\n" + "\"F*** this\" you say to yourself as you curl into a fetal position, giving yourself up to the darkness. You can hear the faint sound of a clown laughing. It seems to be coming closer.");
		r = new Panel("",
				"You go towards the mirror building in hopes of finding a telephone, maybe a place to collect your thoughts." + "\n" + "As you walk through the front door, you hear it slam shut behind you.");
		s = new Panel("",
				"You go towards the hotdog building in hopes of finding a telephone, maybe a place to collect your thoughts." + "\n" + "As you enter the building the sweet aroma of freshly cooked meat fills your nose. Strange, no one seems to be around.");
		t = new Panel("", "The door doesn't budge.");
		u = new Panel("",
				"You walk further into the building. Quickly, you become lost in a maze of mirrors. Which way is forward? Where did you come from? You swear the sound of the clowns is even closer now");
		v = new Panel("", "The door doesn't budge.");
		w = new Panel("",
				"You follow your nose and find a door slightly gaped. It looks like it leads into a kitchen.");
		x = new Panel("", "The door doesn't budge.");
		y = new Panel("",
				"GAME OVER." + "\n" + "Trust us, we're doing you a favor. You're not smart enough to make it any farther. Your arms fall off and you bleed out.");
		z = new Panel("",
				"GAME OVER." + "\n" + "You run into a clown and are knocked out");
		aa = new Panel("",
				"You turn and leave the hotdog building. The smell of meat gets fainter. Maybe you made the wrong choice...");
		ab = new Panel("", "You have a bandage. Would you like to apply it?");
		ac = new Panel("",
				"You push open the door. To your horror, you see a clown cooking what looks like a deceased mime!");
		ad = new Panel("", "You walk back into the carnival and once again can see the two buildings");
		ae = new Panel("",
				"GAME OVER." + "\n" + "You scream, spooking the clown who promptly attacks and eats you");
		af = new Panel("",
				"YOU WIN!" + "\n" + "You join the clown and live happily ever after");
		ag = new Panel("", "");
		ah = new Panel("", "GAME OVER!" + "\n" + " You died in the plane crash!");
		home = new Panel("", "Laughing Stock");

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
