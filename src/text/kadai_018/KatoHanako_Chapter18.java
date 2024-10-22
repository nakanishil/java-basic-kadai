package text.kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
	KatoHanako_Chapter18(){
		super("Kato");
		
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	void eachIntroduce() {
		System.out.println("名前は加藤 " + this.givenName + "です");
		commonIntroduce();
		System.out.println("趣味は読書です");
		
	}
}