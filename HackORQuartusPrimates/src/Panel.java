
public class Panel {
	String panelID;
	Panel[] choices;
	
	public Panel(String id) {
		panelID = id;
	}
	
	public Panel(String id, Panel[] c) {
		panelID = id;
		choices = c;
	}
	
	// TODO: add Panel c to the array of Panels
	void addChoice(Panel c) {
		
	}
	
	Panel[] getChoices() {
		return choices;
	}

}
