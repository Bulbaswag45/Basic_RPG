
public class Dragon extends NPC {
	public Dragon() {	
		hp = Game_Objects.rng.returnRandom(5) + 30;
		accuracy = Game_Objects.rng.returnRandom(5) + 40;
		desc = "A Dragon is here.";
		richDesc = "A huge dragon with obsidian black scales, smoke curling from its mouth.";
		name = "Dragon";
		inRoom = 0;
		minDmg = 15;
		bonusDmg = 10;
	}
}
