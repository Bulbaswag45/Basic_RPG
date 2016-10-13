
public class NPC {
	String name = null;
	String desc = null;
	String richDesc = null;
	int hp;
	int accuracy;
	int inRoom;
	int minDmg;
	int bonusDmg;
	
	public NPC(){
		name = "Blob";
		hp = 0;
		accuracy = 0;
		desc = "A blob sits here.";
		richDesc = "A quivering mass of gelatinous substance. It looks unsure of what to do.";
		inRoom = 0;
		minDmg = 0;
		bonusDmg = 0;
	}
	public void look(){
		System.out.println(name);
		System.out.println(richDesc);
		System.out.println("Damage: " + minDmg + " - " + (minDmg + bonusDmg));
		System.out.println("Accuracy: " + accuracy);
		System.out.println("hp: " + hp);
	}
}
