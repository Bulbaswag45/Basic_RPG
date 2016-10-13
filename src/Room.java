
public class Room {
	String name = null;
	String desc = null;
	int number;

	public Room(int x) {
		name = "Blank Room";
		desc = "You float in an infinite void";
		number = x;
	}
	
	public void get(String[] x) {
		if (x.length == 1) {
			System.out.println("Get what exactly?");
		}
		
		if (x.length == 2) {
			for(int i = 0; i < Game_Objects.item.size(); i++) {
				
				if (Game_Objects.item.get(i).inRoom == Game_Objects.pc.inRoom && 
						x[1].equalsIgnoreCase(Game_Objects.item.get(i).name)) {
					Game_Objects.item.get(i).inRoom = 0;
					Game_Objects.item.get(i).inInventory = true;
					System.out.println("You pick up a " + Game_Objects.item.get(i).name);
				}
			}
		}
	}
	
	public void create_item(String[] x) {
		if (x.length == 1) {
			System.out.println("Create what exactly?");
		}
		if (x.length == 2) {
			if (x[1].equalsIgnoreCase("health")) {
				Potion z = new Potion();
				z.potion_values[0] = 1;
				z.potion_values[1] = 50;
				
				Game_Objects.item.add(z);
				Game_Objects.item.get(Game_Objects.item.size() - 1).inRoom = Game_Objects.pc.inRoom;
				
				System.out.println("You summoned a health potion!");
			}
		}
	}
	
	public void look(String[] x) {
		if (x.length == 1) {

			if (Game_Objects.room.number == Game_Objects.pc.inRoom) {
				System.out.println(Game_Objects.room.name);
				System.out.println(Game_Objects.room.desc);
			}
			for (int i = 0; i < Game_Objects.npc.size(); i++) {
				if (Game_Objects.npc.get(i).inRoom == Game_Objects.pc.inRoom) {
					System.out.println(Game_Objects.npc.get(i).desc);
				}
			}
			for (int i = 0; i < Game_Objects.item.size(); i++) {
				if (Game_Objects.item.get(i).inRoom == Game_Objects.pc.inRoom) {
					System.out.println(Game_Objects.item.get(i).desc);
				}
			}
		}
		if (x.length == 2) {
			if (x[1].equals("self")) {
				Game_Objects.pc.look();
			}
			for (int i = 0; i < Game_Objects.npc.size(); i++) {
				if (Game_Objects.npc.get(i).inRoom == Game_Objects.pc.inRoom
						&& x[1].equalsIgnoreCase(Game_Objects.npc.get(i).name)) {
					Game_Objects.npc.get(i).look();
				}
			}
		}
	}

	public void summon(String[] x) {
		if (x.length == 1) {
			System.out.println("Summon what exactly?");
		}
		if (x.length == 2) {
			for (int i = 0; i < Game_Objects.allNPCs.size(); i++){
				NPC localNPC = (NPC) Game_Objects.allNPCs.get(i);
				if (localNPC.name.equalsIgnoreCase(x[1])) {
				
						try {
							Game_Objects.npc.add((NPC) Class.forName(localNPC.name).newInstance());
						} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
					Game_Objects.npc.get(Game_Objects.npc.size() - 1).inRoom = 1;
					System.out.println("You summon a " + Game_Objects.npc.get(Game_Objects.npc.size() - 1).name);
				}
			}
		}

	}
}
