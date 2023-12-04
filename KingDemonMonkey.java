
public class KingDemonMonkey extends Monster{



	public KingDemonMonkey(String name) {

		super(name);

		// TODO Auto-generated constructor stub

	}

	

	public void monsterSound() {

		//overiding from Monster class

		System.out.println("OOO OOO AHHHHHHHHH   ");

	}

	

	public void eat() {

		//overiding from Monster class

		System.out.println("Yum Yum can't wait to eat you!");

	}

	

	public int damageDealt(boolean bool) {

		//takes boolean from the result of the battle method from super class

		if (bool == false) {

			

			//user.updateScore(-10);

			//int score = user.returnScore();

			System.out.println("You put up a good fight but " + name + " the King Demon Monkey beat you and took 10 of your treasures." + "\n");

					//+ " and took 10 of your treasures. Your score is now " + score);
			return -10;

		}

		

		else {

			//user.updateScore(10);

			//int score = user.returnScore();

			System.out.println("Congrats! You have defeated " + name + " the King Demon Monkey." + "\n");
			return 10;

		}
	}
}
