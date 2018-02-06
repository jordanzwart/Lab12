


public abstract class Player {
	private String name;
	private String roshambo;
	
	public String getRoshambo() {
		return roshambo;
	}

	public void setRoshambo(String roshambo) {
		this.roshambo = roshambo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public enum Roshambo {Rock, Paper, Scissors};
	public String toString(){
		return "";
	}
	public abstract void start(String name, String choice);
	public void generateRoshambo(String name, String choice){
		start(name, choice);
	}
}
	
	
	

	
	


