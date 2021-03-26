
public class Item {
	public boolean willSetoffTSA;
	private String name;
	private String description;
	
	public Item() {
		name = "";
		description = "";
		willSetoffTSA = false;
	}
	
	public Item(String n) {
		name = n;
		description = "";
		willSetoffTSA = false;
	}
	
	public Item(String n, boolean tsa) {
		name = n;
		willSetoffTSA = tsa;
	}
	
	public Item(String n, String d, boolean tsa) {
		name = n;
		description = d;
		willSetoffTSA = tsa;
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
