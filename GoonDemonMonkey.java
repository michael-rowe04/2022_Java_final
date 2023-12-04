
class GoonDemonMonkey extends Monster{



	public GoonDemonMonkey(String name) {

		super(name);

		// TODO Auto-generated constructor stub

	}

	

	public void monsterSound() {

		//overiding from Monster class

		System.out.println("BANANAAAAAA");

	}

	

	public void eat() {

		//overiding from Monster class

		System.out.println("I wish you were a banana but I guess you'll do...");

	}

	

	public int damageDealt(boolean bool) {

		//takes boolean from the result of the battle method from super class

		if (bool == false) {

			

			//user.updateScore(-10);

			//int score = user.returnScore();

			System.out.println("You put up a good fight but " + name + " the Goon Demon Money beat you and took 10 of your treasures. " + "\n");

					//+ " and took 10 of your treasures. Your score is now " + score);
			return -10;

		}

		

		else {

			//user.updateScore(10);

			//int score = user.returnScore();

			System.out.println("Congrats! You have defeated " + name + " the Goon Demon Monkey. Here is 10 gold for your troubles. " + "\n");

					//+ " Here is 10 gold for your troubles. Your score is now " + score);
			return 10;

		}

	}





}
