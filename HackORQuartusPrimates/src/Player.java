
public class Player {
	public String name;
	private Item[] backpack;
	int health;
	
	public Player() {
		name = "";
		health = 100;
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
		if (h > 100 || h < 0) /* this is "error handling" */ ;
		else health = h;
		
	}
	
	// TODO: this method should print a list of all Items in backpack
	void checkBackpack() {
		
	}
	
	// TODO: this method should add Item i to the backpack
	void addItem(Item i) {
		
	}
	
	// TODO: this method should check if Item i is in the backpack (call hasItem(i)), and remove Item i from the backpack if it is in the backpack
	void removeItem(Item i) {
		
	}
	
	// TODO: this method should check if Item i is in the backpack, return true or false
	boolean hasItem(Item i) {
		return false;
	}

}
