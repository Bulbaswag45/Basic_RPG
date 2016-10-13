
public class Crawler extends NPC{
	public Crawler() {
		hp = Game_Objects.rng.returnRandom(5) + 10;
		accuracy = Game_Objects.rng.returnRandom(5) + 20;
		desc = "A Crawler is here.";
		richDesc = "A slender, insect-like creature with needle sharp mandibles. Its skin shimmers in and out of visibility.";
		name = "Crawler";
		inRoom = 0;
		minDmg = 30;
		bonusDmg = 15;
	}
}
