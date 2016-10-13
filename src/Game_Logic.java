
public class Game_Logic {
	public Game_Logic() {
		Game_Objects.room = new Room(1);
	}

	public void waitForCommand() {
		if (Game_Objects.pc.inRoom == 0) {
			createCharacter();
		}

		System.out.println("What do?");
		String com = Game_Objects.input.returnString();
		String[] words = com.split(" ");
		processCommand(words);

	}

	public void processCommand(String[] x) {
		if (x[0].equalsIgnoreCase("summon")) {
			Game_Objects.room.summon(x);
		}
		if (x[0].equalsIgnoreCase("look")) {
			Game_Objects.room.look(x);
		}
		if (x[0].equalsIgnoreCase("attack")) {
			Game_Objects.combat.attack(x);
		}
		if (x[0].equalsIgnoreCase("create")) {
			Game_Objects.room.create_item(x);
		}
		if (x[0].equalsIgnoreCase("get")) {
			Game_Objects.room.get(x);
		}
		if (x[0].equalsIgnoreCase("drink")) {
			Game_Objects.pc.drink(x);
		}
	}
	
	public void createCharacter(){
		System.out.println("Welcome to the dungeon. What is your name?");
		Game_Objects.pc.name = Game_Objects.input.returnString();
		System.out.println("The creator has given you 100 hp and 85 accuracy.");
		Game_Objects.pc.hp = 100;
		Game_Objects.pc.accuracy = 85;
		Game_Objects.pc.inRoom = 1;
	}
}
