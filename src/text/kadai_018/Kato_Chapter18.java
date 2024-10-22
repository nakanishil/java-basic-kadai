package text.kadai_018;

abstract public class Kato_Chapter18 {
	
	
	Kato_Chapter18()  {
	}
	
//	共通の紹介を出力
	public void commonIntroduce() {
		System.out.println("住所は東京都中野区〇×です");
	}
	
//	抽象メソッド
//	個別の紹介を出力
	abstract void eachIntroduce();
	
//	紹介を実行
	public void execIntroduce() {
		eachIntroduce();
	}
	
}
