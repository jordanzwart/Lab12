
public class HumanPlayer extends Player {
	private String userChoice;
	

	public String getUserChoice() {
		return userChoice;
	}

	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}
	@Override
	public Roshambo generateRoshambo() {
		if(getUserChoice().equalsIgnoreCase("rock")){
			return Roshambo.Rock;
		}
		if(getUserChoice().equalsIgnoreCase("paper")){
			return Roshambo.Paper;
		}
		
		return Roshambo.Scissors;
	}

}
