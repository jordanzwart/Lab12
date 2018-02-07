import java.util.Random;


public class RandomPlayer extends Player{

	
	
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Randy";
	}

	@Override
	public Roshambo generateRoshambo() {
		Random rand = new Random();
		int randNum = rand.nextInt(3)+1;
		if(randNum == 1){
			return Roshambo.Rock;
		}
		if(randNum == 2){
			return Roshambo.Paper;
		}
		
		return Roshambo.Scissors;
	}
	

}
