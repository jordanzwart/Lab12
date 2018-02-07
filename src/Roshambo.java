
public enum Roshambo {
	Rock, Paper, Scissors;

	@Override
	public String toString() {
		switch(this){
		case Rock:
			return "rock";
			
		case Paper:
			return "paper";
			
		case Scissors:
			return "scissors";
			
		}
		return super.toString();
	}
	
	

}
