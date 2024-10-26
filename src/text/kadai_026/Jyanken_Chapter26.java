package text.kadai_026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Jyanken_Chapter26 {

//	じゃんけん辞書を作成
	HashMap<String, String> dic = new HashMap<String, String>();
	String enemyChoice;

	
//	scannerオブジェクト作成
	Scanner scanner = new Scanner(System.in);
	
//	dicに要素を追加
	public Jyanken_Chapter26() {
		dic.put("r", "グー");
		dic.put("s", "チョキ");
		dic.put("p", "パー");
		

	}

	
	public String getMyChoice() {
		System.out.println("出す手を入力してください");
		System.out.println("グー: [r]");
		System.out.println("チョキ: [s]");
		System.out.println("パー: [p]");
		String myChoiceKey = scanner.nextLine();
		scanner.close();
		return myChoiceKey;
	}
	
	public String getRandom() {
//		辞書を要素番号で抽出のためリスト化　getRandom()で使用
		List<String> choiceList = new ArrayList<String>(dic.values());
//		choiceListの内容を確認
//		System.out.println("choiceList:" + choiceList);
		try {
			int randomChoice = (int) Math.floor(Math.random() * 3);
//			randomchoiceの数値を確認
//			System.out.println(randomChoice);
			enemyChoice = choiceList.get(randomChoice);
			return choiceList.get(randomChoice);
		} catch (IndexOutOfBoundsException e) {
			return "要素範囲外エラー";
		}
		
	}
	
	public void playGame(String myChoiceKey) {
//		相手の手を出す
		getRandom();
		
		String myChoice = dic.get(myChoiceKey);
		System.out.println();
		System.out.println("自分は[" + myChoice + "]を出しました");
		
		System.out.println("相手は[" + enemyChoice + "]を出しました");
//		じゃんけん処理
		System.out.println();
		System.out.println("対戦結果：");
		if(enemyChoice.equals(myChoice)) {
			System.out.println("あいこです");
		} else if(enemyChoice.equals("チョキ") && myChoice.equals("グー") 
				|| enemyChoice.equals("パー") && myChoice.equals("チョキ")
				|| enemyChoice.equals("グー")&& myChoice.equals("パー")){
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}

}
