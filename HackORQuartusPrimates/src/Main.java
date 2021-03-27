import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.Random;

public class Main {
	private static Random rand = new Random();
	static Player jimbo = new Player("");
	
	static Panel init, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
	static Item adultItem, bandages, knife, smallEngine, waterBottle;

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
		init = new Panel("TSA Checkpoint", "");
		a = new Panel("", "");
		b = new Panel("", "");
		c = new Panel("", "");
		d = new Panel("", "");
		e = new Panel("", "");
		f = new Panel("", "");
		g = new Panel("", "");
		h = new Panel("", "");
		i = new Panel("", "");
		j = new Panel("", "");
		k = new Panel("", "");
		l = new Panel("", "");
		m = new Panel("", "");
		n = new Panel("", "");
		o = new Panel("", "");
		p = new Panel("", "");
		q = new Panel("", "");
		r = new Panel("", "");
		s = new Panel("", "");
		t = new Panel("", "");
		u = new Panel("", "");
		v = new Panel("", "");
		w = new Panel("", "");
		x = new Panel("", "");
		y = new Panel("", "");
		z = new Panel("", "");
		
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
		d.setChoice("Put your feet up and just relax", h);
		
		// e choices
		//prison
	
		// f track
		// TODO: 
		
		// g track
		// TODO: Either death or higher chance of injury/more damage
		
		// h choices
		// game over prison
		
		
		// i choices
		i.setChoice("Walk toward abandoned carnival.", l);
		i.setChoice("Examine the plane crash", m);
		
		// j choices
		j.setChoice("Pull out the shrapnel in your leg.", k);
		j.setChoice("Walk toward abandoned carnival.", l);
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
			jimbo.addItem(in);
		}
	}
	
	public static void updatePanel(Panel pan) {
		
	}

	public static void main(String[] args) {
		initialize();
		
		updatePanel(init);

		// set the player name

		// airport sequence

		// plane sequence

		// crash sequence

		// ???
	}

}