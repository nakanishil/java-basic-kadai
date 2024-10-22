package text.kadai_018;

abstract public class Kato_Chapter18 {
	String familyName = ""; // 姓
	String givenName = ""; // 名
	String address = ""; // 住所
	
	
	Kato_Chapter18(String familyName)  {
		this.familyName = familyName;
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