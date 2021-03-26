
public class Item {
	
	private String uniqueID;
	private String name;
	
	public Item() {
		uniqueID = "";
		name = "";
	}
	
	public Item(String id) {
		uniqueID = id;
		name = "";
	}
	
	public Item(String id, String n) {
		uniqueID = id;
		name = n;
	}
	
	void setName(String n) {
		name = n;
	}
	
	String getName() {
		return name;
	}
}
