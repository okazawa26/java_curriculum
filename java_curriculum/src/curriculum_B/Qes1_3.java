package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// Q1 ログイン時の入力チェックシステムを下記条件で作成してください
		//	・コンソールにユーザー名を入力できるようにしてください
		//	・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		//	・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		//	・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください

		// コンソールから入力を受け付けるためのScannerオブジェクトを作成
		Scanner scanner = new Scanner(System.in);
		// ユーザー名を初期化
		String userName = null;

		// ユーザー名が空文字の時このループを続ける
		while (userName == null || userName.isEmpty()) {
			// ユーザー名を入力してくださいと出力
			System.out.print("ユーザー名を入力してください：");
			// コンソールに入力した文字を受け取り変数に代入
			userName = scanner.nextLine();

			// 受けとったユーザー名が10文字以内かif文で判定し、10文字より多い場合10文字以内にしてと出力
			if (userName.length() > 10) {
				System.out.println("「名前を10文字以内にしてください」");
				// 無効なユーザー名（10文字を超えるユーザー名)を入力した場合に、ユーザー名をnullでリセット
				userName = null;
				// 条件式を再評価
				continue;

				// ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力
			} else if (userName.length() <= 0 || userName ==  null) {
				System.out.println("「名前を入力してください」");
				// 無効なユーザー名（ユーザー名の文字数が0文字以下もしくはnull)を入力した場合に、ユーザー名をnullでリセット
				userName = null;
				// 条件式を再評価
				continue;

				// Q2 ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
				// 半角の英大文字と小文字、そして数字0から9までを許容
			} else if (!userName.matches("[a-zA-Z0-9]*")) {
				System.out.println("「半角英数字のみで名前を入力してください」");
				// 無効なユーザー名（半角英数字以外)を入力した場合に、ユーザー名をnullでリセット
				userName = null;
				// 条件式を再評価
				continue;

				// ユーザー名が上記の条件にも当てはまらない場合、ユーザー名が登録されたことを示すメッセージを出力
			} else {
				System.out.println("「ユーザー名「" + userName + "」を登録しました」\n");
			}
		}

		// Q3 じゃんけんのシステムを下記の条件で作成してください
		//	・「0はグー、1：チョキ、2：パー」とすること
		//	・じゃんけんに勝つまでループすること
		//	・一回ごとに自分の手と相手の手を下記の通り出力してください

		//	ユーザー名「name」を登録しました
		//	nameの手は「パー」
		//	相手の手は「グー」
		//	・条件分岐の設定
		//	・自分がじゃんけんに勝った場合、下記が出力されるようにしてください
		//	やるやん。
		//	次は俺にリベンジさせて
		//	・自分がじゃんけんでグーに負けた場合、下記が出力されるようにしてください	
		//	俺の勝ち！
		//	負けは次につながるチャンスです！
		//	ネバーギブアップ！

		//	・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください
		//	俺の勝ち！
		//	たかがじゃんけん、そう思ってないですか？
		//	それやったら次も、俺が勝ちますよ

		//	・自分がじゃんけんでパーに負けた場合、下記が出力されるようにしてください	
		//	俺の勝ち！
		//	なんで負けたか、明日まで考えといてください
		//	そしたら何かが見えてくるはずです

		//	・あいこの場合、下記が出力されるようにしてください
		//	DRAW あいこ もう一回しましょう！

		//	じゃんけんを行った回数を表示してください
		//	勝つまでにかかった合計回数は1回です

		//	ユーザー名が正常の場合じゃんけんのシステムが起動するようにしてください
		System.out.println("じゃんけんで出す手を選んでください");
		// じゃんけんの回数を初期化
		int battleCount = 0;

		// 勝つまで続けるじゃんけんのループ
		while (true) {
			// じゃんけんの手を選ぶ
			System.out.println("\n0: グー\n1: チョキ\n2: パー");

			// ユーザーの選択を受け取る
			int userChoice = scanner.nextInt();
			//　cpuの選択をランダムに生成
			int cpuChoice = new Random().nextInt(3);
			// 勝つまでにかかった回数を1ずつ増やす
			battleCount ++;

			// 数字の選択肢を対応する文字列に変換
			String userHand = "", cpuHand = "";
			// switch文の引数にユーザーの選択を渡し、選択ごとに処理をする
			switch (userChoice) {
			// 0を選択したとき手をグーで上書き
			case 0 :
				userHand = "グー";
				break;
				// 1を選択したとき手をチョキで上書き
			case 1 :
				userHand = "チョキ";
				break;
				// 2を選択したとき手をパーで上書き
			case 2 :
				userHand = "パー";
				break;
			}
			// switch文の引数にcpuのランダムな選択を渡し、選択ごとに処理をする
			switch (cpuChoice) {
			// 0を選択したとき手をグーで上書き
			case 0 :
				cpuHand = "グー";
				break;
				// 1を選択したとき手をチョキで上書き
			case 1 :
				cpuHand = "チョキ";
				break;
				// 2を選択したとき手をパーで上書き
			case 2 :
				cpuHand = "パー";
				break;
			}
			// 受け取ったユーザー名と選択したじゃんけんの手を出力
			System.out.println(userName + "の手は「" + userHand + "」");
			// ランダムに選択されたcpuの手を出力
			System.out.println("相手の手は「" + cpuHand + "」");

			// ユーザーの手とcpuの手が同じときはあいこ
			if (userChoice == cpuChoice) {
				System.out.println("DRAW あいこ もう一回しましょう！");
				// 結果がtrueのときcpuが選択した手によって出力内容を変更
			} else if (userChoice == (cpuChoice + 1) % 3) {
				System.out.println("俺の勝ち！");
				// 引数にcpuのランダムな選択を渡し、選択ごとに処理をする
				switch (cpuChoice) {
				// 0 (グー)で負けた時の出力
				case 0 :
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！");
					break;
					// 1 (チョキ)で負けた時の出力
				case 1:
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");
					break;
					// 2 (パー)で負けた時の出力
				case 2:
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです");
					break;
				}
				// 上記以外(ユーザーがじゃんけんに勝った時)の出力
			} else {
				System.out.println("\nやるやん。");
				System.out.println("次は俺にリベンジさせて");
				// ループ回数(勝つまでにかかったじゃんけんの回数)を出力
				System.out.println("\n勝つまでにかかった合計回数は" + battleCount +"です");
				break;
			}
		}
	}
}
