
public class MonsterBattleHistory {
	
	public boolean mdBool ;
	public boolean KMBool ;
	public boolean GMBool;

	public void History(String name, boolean bool) {
		if(name.equalsIgnoreCase("Klaus")){
			this.GMBool = bool;
		}
		
		else if(name.equalsIgnoreCase("Bartholomew")){
			this.KMBool = bool;
		}
		
		else if(name.equalsIgnoreCase("Guadelupe")) {
			this.mdBool = bool;
		}
	}
}
