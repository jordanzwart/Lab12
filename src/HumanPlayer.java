
public class HumanPlayer extends Player{

	@Override
	public String getRoshambo() {
		// TODO Auto-generated method stub
		return super.getRoshambo();
	}

	@Override
	public void setRoshambo(String roshambo) {
		super.setRoshambo(roshambo);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public void start(String name, String choice) {
		System.out.print(name + ": ");
		if(choice.equalsIgnoreCase("R")){
			System.out.println("Rock");
		}if(choice.equalsIgnoreCase("P")){
			System.out.println("Paper");
		}if(choice.equalsIgnoreCase("S")){
			System.out.println("Scissors");
		}
		
		
	}

	@Override
	public void generateRoshambo(String name, String choice) {
		// TODO Auto-generated method stub
		super.generateRoshambo(name, choice);
	}
	

	
}
