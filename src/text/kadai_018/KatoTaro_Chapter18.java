package text.kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
//	継承
	KatoTaro_Chapter18(){
		super("Kato");
		
	}
	
//	givenName
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	void eachIntroduce() {
		System.out.println("名前は加藤 " + this.givenName + "です");
		commonIntroduce();
		System.out.println("Javaが得意です");
		
	}
}
