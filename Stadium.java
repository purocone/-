package じゃんけんゲーム;

public class Stadium {

	String winner;
	String loser;
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
					break;

				case CHOKI:
					this.winner = p1.name;
					this.loser = p2.name;
					p1.score = Hands.GU.score;
					break;

				case PA:
					this.winner = p2.name;
					this.loser = p1.name;
					p2.score = Hands.PA.score;
					break;
				}

			break;

			case CHOKI:

			switch(p2.hand) {

				case GU:
					this.winner = p2.name;
					this.loser = p1.name;
					p2.score = Hands.GU.score;
					break;

				case CHOKI:
					this.winner = "Nothing";
					break;

				case PA:
					this.winner = p1.name;
					this.loser = p2.name;
					p1.score = Hands.CHOKI.score;
					break;
				}

			break;

			case PA:

				switch(p2.hand) {

				case GU:
					this.winner = p1.name;
					this.loser = p2.name;
					p1.score = Hands.PA.score;
					break;

				case CHOKI:
					this.winner = p2.name;
					this.loser = p1.name;
					p2.score = Hands.CHOKI.score;
					break;

				case PA:
					this.winner = "Nothing";
					break;
				}
			
				break;	
			
			}
			
		if(this.winner == "nothing") {
			this.loser = "nothing";
			p1.score = 0;
			p2.score = 0;
		}
		
		if(this.loser == p1.name) {
			p1.score = 0;
		}
		
		if(this.loser == p2.name) {
			p2.score = 0;
		}
	}
}

