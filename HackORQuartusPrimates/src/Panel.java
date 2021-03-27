import java.util.HashMap;

public class Panel {
	public String name;
	public String prompt;
	private HashMap<String, Panel> choices = new HashMap<String, Panel>();
	
	public Panel(String n, String p) {
		name = n;
		prompt = p;
	}
	
	public void setChoice(String choice, Panel p) {
		if(choices.get(choice) == null) choices.put(choice, p);
		else choices.replace(choice, p);
	}
	
	public Panel getChoice(String choice) {
		return choices.get(choice);
	}
	
	public void removeChoice(String choice) {
		choices.remove(choice);
	}
	
	public boolean hasChoice(String choice) {
		if(choices.containsKey(choice) != false) return true;
		else return false;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPrompt() {
		return prompt;
	}
	
}
