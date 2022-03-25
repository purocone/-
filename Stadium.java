package じゃんけんゲーム;

public class Stadium {

	String winner;
	int score;
	Player p1;
	Player p2;


	public Stadium(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public void judgeWinner() {
		switch(p1.hand){

			case GU:

			switch(p2.hand) {

				case GU:
					this.winner = "Nothing";
					this.score = 0;
					break;

				case CHOKI:
					this.winner = p1.name;
					this.score = Hands.GU.score;
					break;

				case PA:
					this.winner = p2.name;
					this.score = Hands.PA.score;
					break;
				}

			break;

			case CHOKI:

			switch(p2.hand) {

				case GU:
					this.winner = p2.name;
					this.score = Hands.GU.score;
					break;

				case CHOKI:
					this.winner = "Nothing";
					this.score = 0;
					break;

				case PA:
					this.winner = p1.name;
					this.score = Hands.CHOKI.score;
					break;
				}

			break;

			case PA:

				switch(p2.hand) {

				case GU:
					this.winner = p1.name;
					this.score = Hands.PA.score;
					break;

				case CHOKI:
					this.winner = p2.name;
					this.score = Hands.CHOKI.score;
					break;

				case PA:
					this.winner = "Nothing";
					this.score = 0;
					break;
				}

			break;

		}

	}
}

