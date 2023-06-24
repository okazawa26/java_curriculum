package inheritance2;

// キャラクタークラスを継承してサブクラスヒーローを定義
public class Hero extends Character{

	// コンストラクタを定義
	public Hero() {

		// 親クラス(キャラクタークラス)のコンストラクタを呼び出す
		super();
	}

	// ステータスを表示するメソッドを定義
	public void printStatus() {

		System.out.println("こんにちは " + getName() + "さん");

		System.out.println("ステータス");

		System.out.println("HP：" + getHp());

		System.out.println("MP：" + getMp());

		System.out.println("攻撃力：" + getAttack());

		System.out.println("素早さ：" + getSpeed());

		System.out.println("防御力：" + getDefense());

		System.out.println("さあ冒険に出かけよう！");
	}

}
