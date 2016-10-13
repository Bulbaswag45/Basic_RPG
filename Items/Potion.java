
public class Potion extends Item{
	int[] potion_values = new int[2];
	public Potion() 
	{
		name = "potion";
		desc = "A potion is here";
		
	}
	
	/** The integer array holds the type of potion
	 * index 0 is the effect of the potion
	 *     1 = health restore
	 *     2 = increased accuracy
	 *     3 = poison
	 * index 1 holds the strength of the effect
	 * 
	 */
}
