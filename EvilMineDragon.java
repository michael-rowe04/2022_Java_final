
public class EvilMineDragon extends Monster{



	public EvilMineDragon(String name) {

		super(name);

		// TODO Auto-generated constructor stub

	}

	

	public void monsterSound() {

		//overiding from Monster class

		System.out.println("ROAARRRRRRRR GOLDDDD");

	}

	

	public void eat() {

		//overiding from Monster class

		System.out.println("MMMMM my dinner has arrived!!!" + "\n");

	}

	

	public int damageDealt(boolean bool) {

		//takes boolean from the result of the battle method from super class

		if (bool == false) {

			

			//user.updateScore(-10);

			//int score = user.returnScore();

			System.out.println("You put up a good fight but " + name + " the Evil Mine Dragon beat you"

					+ " and took 10 of your treasures. " + "\n");
					//+ "Your score is now " + score);
			return -10;

		}

		

		else {

			//user.updateScore(10);

			//int score = user.returnScore();

			System.out.println("Congrats! You have defeated " + name + " the Evil Mine Dragon."

					+ " Here is 10 gold for your trouble. " + "\n");
			return 10;

		}

	}



}