
public class Item {
	private String name;
	private String description;
	
	public Item() {
		name = "";
		description = "";
	}
	
	public Item(String n) {
		name = n;
		description = "";
	}
	
	public Item(String n, String d) {
		name = n;
		description = d;
	}
	
	void setName(String n) {
		name = n;
	}
	
	String getName() {
		return name;
	}
	
	void setDescription(String d) {
		description = d;
	}
	
	String getDescription() {
		return description;
	}
}
