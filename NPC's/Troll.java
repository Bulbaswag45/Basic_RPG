
public class Troll extends NPC {
	public Troll(){
		hp = Game_Objects.rng.returnRandom(5) + 5;
		accuracy = Game_Objects.rng.returnRandom(5) + 5;
		desc = "A Troll stands here.";
		richDesc = "A troll with scaly, green skin. It is drooling onto the floor.";
		name = "Troll";
		inRoom = 0;
		minDmg = 5;
		bonusDmg = 15;
	}
}
