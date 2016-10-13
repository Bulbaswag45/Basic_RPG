
public class Item {
String name;
String desc;
int inRoom;
boolean isWearable = false;
String wearLoc = null;

boolean inInventory;

	public Item() 
	{
		name = "ether";
		desc = "an ethereal spark flits about in your hand";
		inRoom = 0;
		inInventory = false;
	}
}
