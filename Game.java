package じゃんけんゲーム;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int gameCnt;
		String playerName1 = "cp1";
		String playerName2 = "cp2";
		String winner;
		
		//何回戦行うのか入力する
		Scanner scanner = new Scanner(System.in);
		System.out.println("試合数を入力してください");
		gameCnt = scanner.nextInt();
		
		//scoreArrayの初期化
		int scoreArray[][]= new int[2][gameCnt];
		for(int i = 0; i <= gameCnt-1; i++) {
			scoreArray[0][i] = 0;
			scoreArray[1][i] = 0;
		}
		
		ScoreBoard scoreboard = new ScoreBoard(scoreArray);
		
		System.out.println("プレイヤーを選択してください");
		Players.print();

		System.out.println("プレイヤー1の名前を入力してください");
		playerName1 = scanner.next();
		Player p1 = new Player(playerName1);

		System.out.println("プレイヤー2の名前を入力してください");
		playerName2 = scanner.next();
		Player p2 = new Player(playerName2);
		System.out.println("----------------------------------------");

		System.out.println("試合を開始します");
		System.out.println("----------------------------------------");
		
		for(int i = 1; i <= gameCnt; i++ ) {

			System.out.println("【" + i + "回戦目" + "】" );
			
			p1.handChoice();
			p2.handChoice();

			System.out.println(p1.name + ":"+ p1.hand);
			System.out.println(p2.name + ":" + p2.hand);

			Stadium stadium = new Stadium(p1,p2);
			stadium.judgeWinner();
			scoreboard.add(p1.score,p2.score,i);

			if(stadium.winner.equals("Nothing")){
					System.out.println("あいこです");

					/*
					do {

						p1.handChoice();
						p2.handChoice();
						stadium.judgeWinner();
						scoreboard.add(p1.score,p2.score,gameCnt);

						System.out.println(p1.name + ":"+ p1.hand);
						System.out.println(p2.name + ":" + p2.hand);

						if(stadium.winner.equals("Nothing")){
							System.out.println("あいこです");
						}

					}while(stadium.winner.equals("Nothing"));
					*/
					
			} else {
			
			System.out.println(stadium.winner + "の勝ちです。");
			System.out.println("----------------------------------------");
			
			}
		
	}
	
	scoreboard.print(p1,p2);
	System.out.println("----------------------------------------");
		
	winner = scoreboard.finalJudge(p1,p2);
		
	if(winner == "引き分け"){
		System.out.println("引き分けです");
		System.out.println("お疲れ様でした");
		} else {
			System.out.println(winner + "さんの勝ちです！");
			System.out.println(winner + "さん、おめでとう！");
		}
		
  }
}
