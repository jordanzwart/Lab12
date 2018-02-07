import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		HumanPlayer hp = new HumanPlayer();
		
		
		System.out.println("Welcome to Rock Paper Scissors!/n");
		
		System.out.println("Enter your name: ");
		String name = scan.next();
		hp.setName(name);
		
		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Hey " + name
					+ ". Would you like to play Rock or Random?");
			String choice = scan.next();
			System.out.println("You are playing " + choice);
			switch (choice) {
			case ("Rock"):
				String hPSelection = Validator.getString(scan,
						"Please select ROCK, PAPER, or SCISSORS: ");
				RockPlayer rock = new RockPlayer();
				hp.setUserChoice(hPSelection);

				Roshambo p1 = hp.generateRoshambo();
				Roshambo p2 = rock.generateRoshambo();
				System.out.println();
				System.out.println(hp.getName() + ": " + p1);
				System.out.println(rock.getName() + ": " + p2);
				decideWinner(p1, p2);
				break;
			case ("Random"):
				String hPSelection2 = Validator.getString(scan,
						"Please select ROCK, PAPER, or SCISSORS: ");
				RandomPlayer rp2 = new RandomPlayer();

				hp.setUserChoice(hPSelection2);
				Roshambo p3 = hp.generateRoshambo();
				Roshambo p4 = rp2.generateRoshambo();
				System.out.println();
				System.out.println(hp.getName() + ": " + p3);
				System.out.println(rp2.getName() + ": " + p4);
				decideWinner(p3, p4);
				break;

			}
			System.out.println();
			cont = Validator.getString(scan, "Do you want to continue? y/n ");
			System.out.println();
		}
	}

	public static void decideWinner(Roshambo p1, Roshambo p2) {
		if ((p1 == Roshambo.Rock && p2 == Roshambo.Rock)
				|| (p1 == Roshambo.Scissors && p2 == Roshambo.Scissors)
				|| (p1 == Roshambo.Paper && p2 == Roshambo.Paper)) {
			System.out.println("TIE!");
		} else if ((p1 == Roshambo.Paper && p2 == Roshambo.Rock)
				|| (p2 == Roshambo.Paper && p1 == Roshambo.Rock)) {
			System.out.println(Roshambo.Paper + " WINS!");
		} else if ((p1 == Roshambo.Paper && p2 == Roshambo.Scissors)
				|| (p2 == Roshambo.Paper && p1 == Roshambo.Scissors)) {
			System.out.println(Roshambo.Scissors + " WINS!");
		} else if ((p1 == Roshambo.Scissors && p2 == Roshambo.Rock)
				|| (p1 == Roshambo.Rock && p2 == Roshambo.Scissors)) {
			System.out.println(Roshambo.Rock + " WINS!");
		}
	}
}
