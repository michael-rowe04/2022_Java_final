import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ScorableItem {
	
	
	private Map<String, Integer> items; //Items yet to be found on the game map
	
	
	
	public ScorableItem() {
		items = new HashMap<>();
		init();
	}
	

	public boolean checkIfItemsContains(String key) {

		return items.containsKey(key);
	}
	
	
	public void displayCurrentItems() {
		Iterator<String> it = items.keySet().iterator();
		
		System.out.println("The following items are still to be found.");
		while (it.hasNext()) {
			String currentThing = it.next();
			System.out.println(currentThing + " Points: " + items.get(currentThing));
		}
	}
	
	
	public int getValue(String key) {
		//get the value of the items to use in User class
		int value = items.get(key);
		
		/*
		integer currentScore = updateScore(items.get(key));
		
		System.out.println("You found the " + key + ". \n "
				+ "It is worth " + value + "points!" + "\n"
				+ "Your current score is now: " + currentScore);
		*/
		items.remove(key);
		
		return value;
		
	}
	
	
	//
	
	private void init() {
		//populate game map
		items.put("Rusty Amulet", -15);
		items.put("Love Potion", 10);
		items.put("Immunity Boost", 15);
		items.put("Goblin Eye", -20);
		items.put("Power Boost", 5);
		items.put("Golden Nugget", 10);
		items.put("Bubbling Chalice", -20);
		items.put("Angry Elf", -20);
		items.put("Flying Fairy", 10);
		items.put("Golden Crown", 25);
		items.put("Spider Nest", -10);
		items.put("Mermaid Pearl", 15);
		items.put("Witch Stew", -10);
		items.put("Scroll of Protection", 5);
		items.put("Dragon Scale Shield", 15);
		
	}
}
	
