
public class RockPlayer extends Player {

	public void start(String name, String Choice) {
		System.out.println(name + "Rock");
		if(Choice.equals("R")){
			System.out.println("Tie");
		}if(Choice.equals("P")){
			System.out.println("Winner");
		}if(Choice.equals("S")){
			System.out.println("Loser");
		}
		
	}
	
}


