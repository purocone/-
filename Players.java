package じゃんけんゲーム;

public class Players {
	
	public static String[] playerArray = new String[3];
	
	static {
	playerArray[0] = "cp1";
	playerArray[1] = "cp2";
	playerArray[2] = "cp3";
	}
	
	public static void print() {
		for(String player: playerArray){
			System.out.println(player);
		}
	}
}
