
public class Location implements LocationInterface {
	
	private String currentLocation;
	
	private static final String TEMPLE = "Temple";
	private static final String RIVER = "River";
	private static final String FOREST = "Forest";
	private static final String MINESHAFT = "Mineshaft";
	private static final String ZIPLINE = "Zipline";	

	public  Location() {
		currentLocation = TEMPLE;
	}
	
	public String getLocation() {
		//Used in magic word method to check if a player is in the correct
		//place to use the magic word
		return currentLocation;
	}
	
	public void teleport(String newLocation){
		//used to teleport for when user types magic word
		currentLocation = newLocation;
	}
	
	public void move(String d) {
			//Convert direction into an enum to make easier for switch case methods
			//Also did this to satisfy milestone 3
		
			Directions direction = Directions.valueOf(d);
		
		
			//Issue: Do not know how to account for lower case inputs for directions
			
			
			switch (currentLocation) {
				case TEMPLE:
				handleTempleMove(direction);
				break;
				
				case RIVER:
				handleRiverMove(direction);
				break;
				
				case FOREST:
				handleForestMove(direction);
				break;
				
				case MINESHAFT:
				handleMineshaftMove(direction);
				break;
				
				case ZIPLINE:
				handleZiplineMove(direction);
				break;
				
				default:
					System.out.println("Cant get there from here..");
			}
		
		
	}
	
	private void handleTempleMove(Directions direction) {
		
		switch (direction) {
			case N:
			case n:
				currentLocation = RIVER;
				break;
				
			case S:
			case s:
				currentLocation = FOREST;		 
				break;
				
			case E:
			case e:
				currentLocation = ZIPLINE;			 
				break;
				
			case W:
			case w:
				currentLocation = MINESHAFT;			 
				break;
			
			default:
				System.out.println("Please enter a valid direction: N/S/E/W");
		}
	}
	
	private void handleRiverMove(Directions direction) {
		
		switch (direction) {
			case N:
			case n:
				System.out.println("Can't go North from the river! Your location remains the same.");
				break;
				
			case S:
			case s:
				currentLocation = TEMPLE;		 
				break;
				
			case E:
			case e:
				currentLocation = ZIPLINE;			 
				break;
				
			case W:
			case w:
				currentLocation = MINESHAFT;			 
				break;
			
			default:
				System.out.println("Please enter a valid direction: N/S/E/W");
		}
	}
	
	private void handleForestMove(Directions direction) {
		
			switch (direction) {
				case N:
				case n:
					currentLocation = TEMPLE;
					break;
				
				case S:
				case s:
					System.out.println("Can't go South from the forest! Your location remains the same.");
					break;
				
				case E:
				case e:
					currentLocation = ZIPLINE;			 
					break;
				
				case W:
				case w:
					currentLocation = MINESHAFT;			 
					break;
			
				default:
					System.out.println("Please enter a valid direction: N/S/E/W");
			}
	}
	
	private void handleMineshaftMove(Directions direction) {
		
		switch (direction) {
			case N:
			case n:
				currentLocation = RIVER;
				break;
			
			case S:
			case s:
				currentLocation = FOREST;
				break;
			
			case E:
			case e:
				currentLocation = TEMPLE;			 
				break;
			
			case W:
			case w:
				System.out.println("Can't go West from the Mineshaft! Your location remains the same.");		 
				break;
		
			default:
				System.out.println("Please enter a valid direction: N/S/E/W");
		}
	}
	private void handleZiplineMove(Directions direction) {
		
			switch (direction) {
				case N:
				case n:
					currentLocation = RIVER;
					break;
			
				case S:
				case s:
					currentLocation = FOREST;
					break;
			
				case E:
				case e:
					System.out.println("Can't go East from the Zipline! Your location remains the same.");	
					break;
			
				case W:
				case w:
					currentLocation = TEMPLE; 
					break;
		
				default:
					System.out.println("Please enter a valid direction: N/S/E/W");
		}
	}
}

	