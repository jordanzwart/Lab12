
public abstract class Player {
	private String name;
	private Roshambo roshambo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Roshambo getRoshambo() {
		return roshambo;
	}
	public void setRoshambo(Roshambo roshambo) {
		this.roshambo = roshambo;
	}
	
	public abstract Roshambo generateRoshambo();
}
