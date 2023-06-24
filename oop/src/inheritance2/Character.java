/*

 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

 */

package inheritance2;

import java.util.Random;

public class Character {

	// 各フィールドを定義
	private String name;

	private int hp;

	private int mp;

	private int attack;

	private int speed;

	private int defense;

	// コンストラクタを定義
	public Character() {

		Random random = new Random();

		this.hp = random.nextInt(1000);

		this.mp = random.nextInt(1000);

		this.attack = random.nextInt(1000);

		this.speed = random.nextInt(1000);

		this.defense = random.nextInt(1000);

	}

	// 名前のゲッターを定義
	public String getName() {

		return name;
	}

	// 名前のセッターを定義 受け取った名前をフィールドに設定
	public void setName(String name) {

		// NULLチェック
		if (name == null || name.trim().isEmpty()) {

			throw new IllegalArgumentException("nameはNULLです");
		}

		this.name = name;
	}

	// HPのゲッターを定義
	public int getHp() {

		return hp;
	}

	// MPのゲッターを定義
	public int getMp() {

		return mp;
	}

	// 攻撃力のゲッターを定義
	public int getAttack() {

		return attack;
	}

	// 素早さのゲッターを定義
	public int getSpeed() {

		return speed;
	}

	// 防御力のゲッターを定義
	public int getDefense() {

		return defense;
	}










}
