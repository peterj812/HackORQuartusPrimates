import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Main {
	Player p = new Player();
	
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
		p.setHealth(p.getHealth() - damage);
	}
	
	static void initialize() {
		// these should be between 0 and 100 inclusive
		double hasAdultItemChance = 25;
		double hasBandagesChance = 25;
		double hasKnifeChance = 25;
		double hasSmallEngine = 25;
		double hasWaterBottleChance = 25;
		double tripChance = 25;
		
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
		
		// e choices
		
		// f choices
		
		// g choices
		
		// h choices
		
		// i choices
		
		// j choices
		
		// m choices
		
		// determine what items will be in backpack
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
