package じゃんけんゲーム;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int gameCnt;
		String playerName1 = "cp1";
		String playerName2 = "cp2";
		
		//何回戦行うのか入力する
		Scanner scanner = new Scanner(System.in);
		System.out.println("試合数を入力してください");
		gameCnt = scanner.nextInt();

		System.out.println("プレイヤー1の名前を入力してください");
		//playerName1 = scanner.next();
		Player p1 = new Player(playerName1);

		System.out.println("プレイヤー2の名前を入力してください");
		//playerName = scanner.next();
		Player p2 = new Player(playerName2);

		System.out.println("試合を開始します");

		for(int i = 1; i <= gameCnt; i++ ) {

			p1.handChoice();
			p2.handChoice();

			System.out.println(p1.name + ":"+ p1.hand);
			System.out.println(p2.name + ":" + p2.hand);

			Stadium stadium = new Stadium(p1,p2);
			stadium.judgeWinner();

			if(stadium.winner.equals("Nothing")){
					System.out.println("あいこです");

					do {

						p1.handChoice();
						p2.handChoice();
						stadium.judgeWinner();

						System.out.println(p1.name + ":"+ p1.hand);
						System.out.println(p2.name + ":" + p2.hand);

						if(stadium.winner.equals("Nothing")){
							System.out.println("あいこです");
						}

					}while(stadium.winner.equals("Nothing"));
			}

			System.out.println(stadium.winner + "の勝ちです。");

		}
	}

}
