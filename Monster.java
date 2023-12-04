import java.util.Random;
import java.util.Scanner;

public class Monster {
	
	protected String name;
	//protected User user;;
	
	public Monster(String name) {
		this.name = name;
		//User user = new User();
	}
	
	
	public void monsterSound() {
		System.out.println("Monster Sound");
	}
	
	public void eat() {
		
	}
	
	public int damageDealt(boolean bool) {
		return 0;
	}
	
	public int pointsFromBattle(boolean bool) {
		if (bool) {
			return 10;
		}
		else {
			return -10;
		}
	}
	
	public boolean battle() {
		
		System.out.println("You are now facing a monster! Roll a dice and the higher score will be awarded points!"); 
		System.out.println("Input 'roll' to roll the dice!" + "\n"); 
		
		Scanner input = new Scanner(System.in);
		
		String result = input.nextLine();
		
		while( !result.equalsIgnoreCase("roll")) {
			
			System.out.println("Please enter a valid input.");
			result = input.next();
		}
	
		
		
		// Puts in a timer for visual aesthetics
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(".");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("..");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			System.out.println("\n");
		
		Random r = new Random();
		
		
		
		//what if they tie?
		int monsterRoll = r.nextInt(10);
		int playerRoll = r.nextInt(10);
		
		
		
		
		System.out.println("Monster roll: " + monsterRoll);
		System.out.println("Player roll: " + playerRoll);
		
		if(monsterRoll > playerRoll) {
			System.out.println("Monster wins!  " + "\n");
			return false;
		}
		else {
			System.out.println("Player wins!  " + "\n");
			return true;
			}
		}
	
	}

	

