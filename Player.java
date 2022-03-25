package じゃんけんゲーム;

public class Player {

	String name;
	Hands hand;
	int handNum;

	Player(String name){
		this.name = name;
	}
	
	//プレイヤーが出す手を選ぶ
	public void handChoice() {
		
		brainChoice();

		switch(this.handNum) {

		case 1:
			hand = Hands.GU;
			break;
		
		case 2:
			
			hand = Hands.CHOKI;
			break;
		
		case 3:
			
			hand = Hands.PA;
			break;
		
		}
	}
	
	//名前によって頭脳を選ぶ
	public void brainChoice() {
		
		switch(this.name) {
	
			case "cp1":
				this.handNum = cp1Brain();
				break;
			case "cp2":
				this.handNum = cp2Brain();
				break;
			case "cp3":
				this.handNum = cp3Brain();
				break;
		}
	
	}
	
	//CPの頭脳
	private int cp1Brain() {
		return 1;
	}
	
	private int cp2Brain() {
		return 2;
	}
	
	private int cp3Brain() {
		return 3;
	}

}

