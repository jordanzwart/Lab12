import java.util.Random;


public class RandomPlayer extends Player {
	@Override
	public void start(String name, String choice) {
		System.out.println(name + choice);
		if(choice.equals("R")){
			System.out.println("Tie");
		}if(choice.equals("P")){
			System.out.println("Winner");
		}if(choice.equals("S")){
			System.out.println("Loser");
		}
	}
	

}
