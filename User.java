import java.util.Scanner;

public class User {
		
		private String name;
		private Location location;
		private int score;
		boolean magicWord = false;
		
		
		private ScorableItem scorableItem;
		MonsterBattleHistory monsterBattleHistory = new MonsterBattleHistory(); 
		
		public User() {
			location = new Location();
			scorableItem = new ScorableItem();
			
		}
		
		public String getCurrentLocation() {
			return location.getLocation();
		}
		
		public String getName() {
			return name;

		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void move (String direction) throws IllegalArgumentException {
	
			if(checkMagicWord(direction)){ //won't get Default wrong input printed out when using magic word now
				checkMagicWord(direction); //need to be in Forest and go west,
			}
			
			else {
			checkForScoringOp(direction);
			checkForMonster(direction);
			
				try {
					location.move(direction); //move is really the only method that throws an error
				}
				catch(Exception IllegalArgumentException) {
				System.out.println("Please try a different move.");
			}
			}
			}	

		
		
		public boolean checkMagicWord(String nextMove) {
			
		
			
			if(location.getLocation().equals("Forest") && nextMove.equals("XYZZY") && magicWord == false) {
				
				//use Location class' teleport method to change current location
				
				location.teleport("Mineshaft");
				System.out.println("Congrats you discovered the magic word!! \n"
						+ "You have been teleported to the Mineshaft and have found a pile of Emeralds \n"
						+ "You have been awarded 10 points");
				
				//Update score
				score = score + 10;
				
				//This makes sure that the magic word can only be used once
				magicWord = true;
				
				
				return true;
				
				
			} //booleans so User.move doesnt throw an error in the try catch
			else {
				return false;
			}
		}
		
		public int returnScore() {
			return score;
		}
		
		public void putItemInRoom(String item) {
			Scanner scan = new Scanner(System.in);
			
			if (scorableItem.checkIfItemsContains(item)) { 
				//if no gold go to next room
				
				System.out.println("You see a " + item + " would you like to pick it up? To choose yes, input 'Y' and to choose no, input 'N.' ");
				String answer = scan.nextLine();
				
				while(!answer.equalsIgnoreCase("N") && !answer.equalsIgnoreCase("Y")){
					System.out.println("Please enter a valid input.");
					answer = scan.next();}
				
				if(answer.equalsIgnoreCase("Y")) {
					//Update score
					int value = scorableItem.getValue(item);
					score = score + value;
					System.out.println("The value of this item is " + value + ". Your score is now " + score + ".");
				}
				else if(answer.equalsIgnoreCase("N")) {
					//probably do need this else
					int value = scorableItem.getValue(item);
					score = score + 0;
					System.out.println("The value of this item was " + value + ". Your score is still " + score + "." + "\n");
				
						}
					}	
				
			}
			
		
		
		public void checkForScoringOp(String direction) {
			
			if(location.getLocation().equals("River")) {
				
				if ( direction.equalsIgnoreCase("E"))
				{
					putItemInRoom("Rusty Amulet");		
				}
				
				else if (direction.equalsIgnoreCase("W")){
					putItemInRoom("Love Potion");	
				}
				
				else if (direction.equalsIgnoreCase("N")){
					putItemInRoom("Dragon Scale Shield");	
				}
				
				else if (direction.equalsIgnoreCase("S")){
					putItemInRoom("Golden Crown");	
				}
			
			}
			if(location.getLocation().equals("Mineshaft")) {
				if (direction.equalsIgnoreCase("W")){
					putItemInRoom("Golden Nugget");	
				}
				
				else if (direction.equalsIgnoreCase("N")){
					putItemInRoom("Bubbling Chalice");	
				}
				
				else if (direction.equalsIgnoreCase("S")){
					putItemInRoom("Immunity Boost");
				}
				
				else if (direction.equalsIgnoreCase("E")){
					putItemInRoom("Spider Nest");	
				}
				
			}
			
			if(location.getLocation().equals("Zipline")) {
				

				if ( direction.equalsIgnoreCase("E")){
					putItemInRoom("Angry Elf");	
				}
			
				else if (direction.equalsIgnoreCase("N")){
					putItemInRoom("Flying Fairy");	
				}

				else if (direction.equalsIgnoreCase("S")){
					putItemInRoom("Power of Flight");
				}
				
				else if (direction.equalsIgnoreCase("W")){
					putItemInRoom("Mermaid Pearl");	
				}
			}
			
			if(location.getLocation().equals("Forest")) {
				if ( direction.equalsIgnoreCase("E")){
					putItemInRoom("Scroll of Protection");		
				}
				
				else if (direction.equalsIgnoreCase("W")){
					putItemInRoom("Goblin Eye");	
				}
				else if (direction.equalsIgnoreCase("S")){
					putItemInRoom("Power Boost");
				}
				
				else if (direction.equalsIgnoreCase("N")){
					putItemInRoom("Witch Stew");	
				}
			}
			
			if(location.getLocation().equalsIgnoreCase("Temple")) {
				
				if ( direction.equalsIgnoreCase("E")){
					putItemInRoom("gold");	
				}
				
				else if (direction.equalsIgnoreCase("W")){
					putItemInRoom("gold");	
				}
				
				else if (direction.equalsIgnoreCase("N")){
					putItemInRoom("gold");	
				}
				else if (direction.equalsIgnoreCase("S")){
					putItemInRoom("gold");	
				}
			}
		}
		
		
		private void checkForMonster(String direction) {

			Monster monster = null;

			boolean battleResults = false;

			//Get the monster

			if(getCurrentLocation().equals("Zipline") && direction.equalsIgnoreCase("W") && !monsterBattleHistory.GMBool) {

				System.out.println("You have crept up on a MONSTER...");

				 monster = MonsterFactory.getMonster(MonsterEnums.goon, "Klaus");

			}

			//the KMBool,GMBool,mdBool, are bools from MonsterBattleHistory

			else if(getCurrentLocation().equals("Forest") && direction.equalsIgnoreCase("N") && !monsterBattleHistory.KMBool) {

				System.out.println("You have crept up on a MONSTER...");

				 monster = MonsterFactory.getMonster(MonsterEnums.king, "Bartholomew");

			}

			

			else if(getCurrentLocation().equals("Mineshaft") && direction.equalsIgnoreCase("E") && !monsterBattleHistory.mdBool) {

				System.out.println("You have crept up on a MONSTER...");

				 monster = MonsterFactory.getMonster(MonsterEnums.dragon, "Guadelupe");

			}

			//do monster stuff

			if(monster!= null) {

				monster.monsterSound();;

				monster.eat();

				battleResults = monster.battle(); //super class method
				
				score = score + monster.pointsFromBattle(battleResults); //Monster super class deals with how many points rewarded or deducted

				monster.damageDealt(battleResults); //different for each sub class
				
				System.out.println("Your score is now: " + score + "\n"); //had to update score in user class couldnt do it in monster classes

				monsterBattleHistory.History(monster.name, battleResults); //makes sure monster goes away but can still fight others

			}

		}
	 
	}


