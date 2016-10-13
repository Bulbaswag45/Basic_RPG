import java.util.ArrayList;
import java.util.List;

public class Game_Objects {
	static PC pc = new PC();
	static Room room = new Room(0);
	static List<NPC> npc = new ArrayList<NPC>();
	static RNG rng = new RNG();
	static List<Item> item = new ArrayList<Item>();
	static Combat combat = new Combat();
	static Input input = new Input();
	static List<Object> allNPCs = new ArrayList<Object>();
	
	public static void initalizeArray() {
		allNPCs.add(new NPC());
		allNPCs.add(new Troll());
		allNPCs.add(new Dragon());
		allNPCs.add(new Crawler());
	}
}
