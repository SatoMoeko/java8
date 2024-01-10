package java8;

public class Main {

	public static void main(String[] args) {
		//1.勇者を生成
		Hero h = new Hero();
		//インスタンスを入れる変数の型を宣言（HeroはHero.javaのこと）し、インスタンスを代入
		//2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者"+h.name+"を生み出しました！");
		//3.勇者インスタンスのメソッドを呼び出してゆく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		
		
		// 以下の内容をJavaで記述していく
		//勇者よ、この仮想世界に生まれよ！
		//お化けキノコよ、この仮想世界に生まれよ！
		//勇者よ、戦え！
		//お化けキノコよ、逃げろ！

	}

}
