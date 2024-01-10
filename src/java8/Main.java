package java8;

public class Main {

	public static void main(String[] args) {
		//1.勇者を生成
		Hero h = new Hero();
		//インスタンスを入れる変数の型を宣言（HeroはHero.javaのこと）し、インスタンスを代入
		//2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A'; //区別するための通し番号をつけることsuffix
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
	//冒険の始まり
		h.slip();
		m1.run();
		m2.run();
		h.run();

	}

}
