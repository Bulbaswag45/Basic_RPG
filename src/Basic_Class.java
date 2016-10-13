public class Basic_Class {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game_Objects.initalizeArray();
		while(true)
		{
			game_loop();
		}
	}
	
	public static void game_loop()
	{
		Game_Logic gl = new Game_Logic();
		gl.waitForCommand();
	}

}
