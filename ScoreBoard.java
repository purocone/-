package じゃんけんゲーム;

public class ScoreBoard {
	int scoreArray[][]= new int[2][];
	
	ScoreBoard(int[][] scoreArray){
		this.scoreArray = scoreArray;
	}
	
	void add(int p1Score,int p2Score, int cnt) {
		scoreArray[0][cnt-1] = p1Score;
		scoreArray[1][cnt-1] = p2Score;
	}
	
	void print(Player p1,Player p2){
		
		System.out.println("【試合結果】");
			for(int i = 0; i < scoreArray.length; i++) {
				//初期化処理
				int total = 0;
				for(int j = 0; j < scoreArray[0].length; j++) {
					if(i==0 && j==0) {
						System.out.print("|"+p1.name+"|"+scoreArray[i][j]+"|");
					} else if(i==1 && j==0){
						System.out.print("|"+p2.name+"|"+scoreArray[i][j]+"|");
					} else {
						System.out.print(scoreArray[i][j]+"|");
					}
					
					total += scoreArray[i][j];
				}
				
				System.out.println("|" + total + "|");
				
				if(i==0) {
					p1.total = total;
				} else if(i==1) {
					p2.total = total;
				}
			}
	}
	
	public String finalJudge(Player p1,Player p2) {
		if(p1.total > p2.total) {
			return p1.name;
		} else if(p1.total < p2.total) {
			return p2.name;
		} else {
			return "引き分け";
		}
	}

}	

