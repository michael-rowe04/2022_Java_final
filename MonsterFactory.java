
public class MonsterFactory {
	
	public static Monster getMonster(MonsterEnums type, String name ) {
		//MonsterEnums are goon, king, and dragon
		Monster monster = null;
		
		if (type.equals(MonsterEnums.dragon)) {
        	
            monster = new EvilMineDragon(name);
        } else if (type.equals(MonsterEnums.goon)) {
        	monster = new GoonDemonMonkey(name);
        } else if (type.equals(MonsterEnums.king)) {
        	monster = new KingDemonMonkey(name);
        }
        return monster;
     
		
	}

}
