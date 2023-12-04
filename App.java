import java.util.Scanner;
public class App {
	

	public static void main(String[] args) {
		App app = new App();
		app.process();

	}

	/**
	 * main interactive loop of program
	 * 
	 */

	public void process() {
		

		System.out.println("-- Let's Play! -- "
				+ "\n");
		
		
		System.out.println("Hello there adventurer . . . or should I say theif?! \n"
				+ "Your adventure has taken you deep into the Temple of the Demon Monkeys. \n"
				+ "For some reason you thought it wise to steal their sacred golden idol. \n"
				+ "My only advice to you now is, RUN!"
				+ "\n");
		
		User player1 = new User();
		
		Scanner s = new Scanner(System.in);
		System.out.println("--  What's your name thief?  --");
		
		
		String name = s.nextLine();
		player1.setName(name);
		
		
		while(true) {
			
			if (player1.returnScore() >= 50) {
				System.out.println("\n" + "-*-*- WINNER -*-*-");
				System.out.println("Congratulations thief you managed to escape the demon monkeys with their sacred golden idol!");
				break;
			}
			
			if(player1.returnScore() <= -30) {
				System.out.println("\n" + "Oh no " + player1.getName() + "... the evil demon monkeys caught you :( ");
				System.out.println("-*-*- GAME OVER -*-*-" + "\n" + "You have been fed to Klaus.");
				break;
			}
			
			System.out.println("Press 'H' for Help (Map)");

			
			System.out.println("You can go N/S/E/W - choose");

			String nextMove = s.nextLine();
			//Nextmove is still a string at this point, line below would change to enum
			//Directions d = Directions.valueOf(nextMove);
			
			if(nextMove.equalsIgnoreCase("H"))
				Help.printMap();
			else if(nextMove.equalsIgnoreCase("score")) {
				System.out.println("Your current score is: " + player1.returnScore());
			}
			else
				player1.move(nextMove);
			
			
			System.out.println("\n" + "You are here: " + player1.getCurrentLocation());
			System.out.println("****");
		
		}

	}
}
