import java.util.ArrayList;

public class Player {
	public String name;
	public ArrayList<Item> backpack = new ArrayList<Item>();;
	int health;
	
	public Player() {
		name = "";
		health = 10;
	}
	
	public Player(String n) {
		name = n;
		health = 10;
	}
	
	void setName(String n) {
		name = n;
	}
	
	String getName() {
		return name;
	}
	
	int getHealth() {
		return health;
	}
	
	void setHealth(int h) {
		if (h > 10 || h < 0) return;
		else health = h;
		
	}
	
	// TODO: this method should print all of the Items in ArrayList backpack
	void checkBackpack() {
		
	}
	
	// checks whether there is at least one offensive item in backpack
	boolean setsoffTSA() {
		for (int idx = 0; idx < backpack.size(); idx++) { if (backpack.get(idx).willSetoffTSA) return true; }
		return false;
	}
	
	// adds Item i to backpack
	void addItem(Item i) {
		if(!hasItem(i)) backpack.add(i);
	}
	
	void removeItem(Item i) {
		if (hasItem(i) == true) { backpack.remove(i); }
	}
	
	// checks if Item i is in Backpack
	boolean hasItem(Item i) {
		for (int idx = 0; idx < backpack.size(); idx++) { if (backpack.get(idx).getName().equals(i.getName())) return true; }
		return false;
	}

}
