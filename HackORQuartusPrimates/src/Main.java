
public class Main {
	
	// these should be between 0 and 100 inclusive
	double hasAdultItemChance = 25;
	double hasBandagesChance = 25;
	double hasKnifeChance = 25;
	double hasSmallEngine = 25;
	double hasWaterBottleChance = 25;
	double tripChance = 25;
	
	Player p = new Player();
	
	// ITEMS
	Item adultItem = new Item("adult item", true);
	Item bandages = new Item("bandages", false);
	Item knife = new Item("knife", true);
	Item smallEngine = new Item("small engine", true);
	Item waterBottle = new Item("water bottle", true);
	
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
	
	public static void main() {
		
	}

}
