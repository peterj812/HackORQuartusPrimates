import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.Random;

public class Main {
	private static Random rand = new Random();

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

	static void initialize() {

		// these should be between 0 and 100 inclusive
		double hasAdultItemChance = 25;
		double hasBandagesChance = 25;
		double hasKnifeChance = 25;
		double hasSmallEngine = 25;
		double hasWaterBottleChance = 25;
		double tripChance = 25;
		
		Player jimbo = new Player();
		
		// ITEMS
		Item adultItem = new Item("adult item", true);
		Item bandages = new Item("bandages", false);
		Item knife = new Item("knife", true);
		Item smallEngine = new Item("small engine", true);
		Item waterBottle = new Item("water bottle", true);

		// PANELS
		Panel init = new Panel("TSA Checkpoint", "");
		Panel a = new Panel("", "");
		Panel b = new Panel("", "");
		Panel c = new Panel("", "");
		Panel d = new Panel("", "");
		Panel e = new Panel("", "");
		Panel f = new Panel("", "");
		Panel g = new Panel("", "");
		Panel h = new Panel("", "");
		Panel i = new Panel("", "");
		Panel j = new Panel("", "");
		Panel k = new Panel("", "");
		Panel l = new Panel("", "");
		Panel m = new Panel("", "");
		Panel n = new Panel("", "");
		Panel o = new Panel("", "");
		Panel p = new Panel("", "");
		Panel q = new Panel("", "");
		Panel r = new Panel("", "");
		Panel s = new Panel("", "");
		Panel t = new Panel("", "");
		Panel u = new Panel("", "");
		Panel v = new Panel("", "");
		Panel w = new Panel("", "");
		Panel x = new Panel("", "");
		Panel y = new Panel("", "");
		Panel z = new Panel("", "");
		
		// SET CHOICES

		// init choices
		init.setChoice("Look through bag", a);
		init.setChoice("Go through metal detector", b);
		init.setChoice("Go home, flying is scary", c);

		// a choices
		a.setChoice("Throw away contraband", d);
		a.setChoice("Put bag down and go through security", e);

		// b choices
		// TODO: implement b outcome (see spreadsheet)

		// c choices
		// TODO: implement c outcome (see spreadsheet)

		// d choices
		d.setChoice("Take a nap", f);
		d.setChoice("Read the newspaper old man!", g);
		d.setChoice("Put your feet up and just relax.", h);
		
		// e choices
		//prison
	
		// f track
		// TODO: 
		
		// g track
		// TODO: Either death or higher chance of injury/more damage
		
		// h choices
		// game over prison
		
		
		// i choices
		i.setChoice("Walk toward abadonded carnival.", l);
		i.setChoice("Examine the plane crash", m);
		
		// j choices
		j.setChoice("Pull out the shrapanel in your leg.", k);
		j.setChoice("Walk toward abadonded carnival.", l);
		j.setChoice("Examine the plane crash", m);		
		
		// k choices
		// TODO: Say you are starting to bleed out quick
		k.setChoice("Cover it with your hand", n);
		
		// l choices
		
		
		// m choices
		
		// determine what items will be in backpack

	}

	static void RandomItem(Item in) {
		int chance = 100;
		int val = rand.nextInt(chance);
		if (val <= 25) {
			p.addItem(in);
		}
	}

	public static void main(String[] args) {
		initialize();

		// set the player name

		// airport sequence

		// plane sequence

		// crash sequence

		// ???
	}

}