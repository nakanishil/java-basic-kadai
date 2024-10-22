package text.kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	
	KatoIchiro_Chapter18(){
		super("Kato");
		
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	void eachIntroduce() {
		System.out.println("名前は加藤 " + this.givenName + "です");
		commonIntroduce();
		System.out.println("好きな食べ物はリンゴです");
		
	}
}

