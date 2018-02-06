import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Prompt the player to enter a name and select an opponent

//Prompt the player to select rock, paper, or scissors. Then display the players choice, the 
//opponents choice and the result of the match.

//Continue until the user doesn't want to play anymore

//If the user makes an invalid selection, display an appropriate error message and prompt the use again
//until the user makes a valid selection

public class RoshamboMain {
	public enum Roshambo {Rock, Paper, Scissors};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int opponent;
		String choice;
		HumanPlayer humanPlayer;
		Roshambo rosham = Roshambo.Rock;
		ArrayList<Player> games = new ArrayList<Player>();
		
		
		
		
		
		//Prompt the player to enter a name and select an opponent
		System.out.println("Welcome to Rock Paper Scissors!\n");
		System.out.println("Please enter your name: ");
		name = scan.next();
		System.out.println(name);
		
		
		//select the opponent you want to play
		opponent = Validator.getInt(scan, "Hello " + name + ". would you like to play against the Rock(1) or RandomPlayer(2)? Enter(1 or 2)", 1, 2);
		
		//Prompt the player to select rock, paper, or scissors
		choice = Validator.getString(scan, "What would you like to play? Rock, Paper, or Scissors: (Enter R/P/S)");
		
		
		//Display results of manametch
		if(opponent == 1){
			humanPlayer = new HumanPlayer();
			humanPlayer.setRoshambo(choice);
			humanPlayer.setName(name);
			humanPlayer.generateRoshambo(name, choice);
			
			Player rockPlayer = new RockPlayer();
//			rockPlayer.setRoshambo(Roshambo.Rock);
			rockPlayer.generateRoshambo("Rock: ", choice);
			games.add(humanPlayer);
			games.add(rockPlayer);
			
		}else{
			humanPlayer = new HumanPlayer();
			humanPlayer.setRoshambo(choice);
			humanPlayer.setName(name);
			humanPlayer.generateRoshambo(name, choice);
			
			Player randomPlayer = new RandomPlayer();
//			randomPlayer.setRoshambo(random.Roshambo());
			randomPlayer.generateRoshambo("Randy: ", choice);
			games.add(humanPlayer);
			games.add(randomPlayer);
		}
		
		
		
	}//end of main
//public String toString(enum Roshambo){
//	return;
//}
}//end
