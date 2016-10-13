
public class Combat {
	public void attack(String[] x) {
		for (int i = 0; i < Game_Objects.npc.size(); i++) {
			System.out.println(i);
			if (Game_Objects.npc.get(i).inRoom == Game_Objects.pc.inRoom 
					&& x[1].equalsIgnoreCase(Game_Objects.npc.get(i).name)) {
				
				int npc_hit = Game_Objects.rng.returnRandom(100);
				npc_hit = npc_hit + (Game_Objects.npc.get(i).accuracy / 2);
				
				if (npc_hit > 50) {
					int npc_damage =
							Game_Objects.npc.get(i).minDmg + Game_Objects.rng.returnRandom(Game_Objects.npc.get(i).bonusDmg);
					Game_Objects.pc.hp = Game_Objects.pc.hp - npc_damage;
					System.out.println("The " + Game_Objects.npc.get(i).name + " hit you for " + npc_damage + " damage!");
				}
				
				else {
					System.out.println("The " + Game_Objects.npc.get(i).name + " missed!");
				}
				
				int pc_hit = Game_Objects.rng.returnRandom(100);
				pc_hit = pc_hit + (Game_Objects.pc.accuracy / 2);
				
				if (pc_hit > 50) {
					int pc_damage = 
							Game_Objects.pc.minDmg + Game_Objects.rng.returnRandom(Game_Objects.pc.bonusDmg);
					Game_Objects.npc.get(i).hp = Game_Objects.npc.get(i).hp - pc_damage;
					System.out.println("You hit the " + Game_Objects.npc.get(i).name + " for " + pc_damage + " damage!");
					if (Game_Objects.npc.get(i).hp <= 0) {
						npc_death(i);
					}
				}
				else {
					System.out.println("You missed!");
				}
				
			}
		}
	}
	public void npc_death(int x) {
		System.out.println("A " + Game_Objects.npc.get(x).name + " has died!");
		Game_Objects.npc.remove(x);
	}
}
