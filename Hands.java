package じゃんけんゲーム;

public enum Hands {
	 PA(5),
	 GU(0),
	 CHOKI(2);

	public final int score;

  private Hands(int score){
		this.score = score;
	}

}