
public class PC {
	String name = null;
	int hp = 0;
	int accuracy = 0;
	int inRoom = 0;
	int minDmg = 10;
	int bonusDmg = 5;
	
	public PC(){
		
	}
	public void look(){
		System.out.println(name);
		System.out.println("Accuracy: " + accuracy);
		System.out.println("hp: " + hp);
		System.out.println("damage: " + minDmg + " - " + (minDmg + bonusDmg));
		for(int i = 0; i < Game_Objects.item.size(); i++) {
			if(Game_Objects.item.get(i).inInventory = true) {
				System.out.println("You are carrying " + Game_Objects.item.get(i).name);
			}
		}
	}
	
	public void drink(String[] x) {
		if (x.length == 1) {
			System.out.println("Drink what exactly?");
		}
		if (x.length == 2) {
			for(int i = 0; i < Game_Objects.item.size(); i++) {
				if (Game_Objects.item.get(i).inInventory == true && Game_Objects.item.get(i).name.equals("potion")) {
					Potion z = (Potion) Game_Objects.item.get(i);
					if (z.potion_values[0] == 1 && x[1].equalsIgnoreCase("health")) {
						Game_Objects.pc.hp = Game_Objects.pc.hp + z.potion_values[1];
						System.out.println("You gained " + z.potion_values[1] + " health!");
						Game_Objects.item.remove(i);
						break;
					}
				}
			}
		}
	}
}
