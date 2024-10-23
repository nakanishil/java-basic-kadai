package text.kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
//	HashMapの宣言
	HashMap<String, String> dic = new HashMap<String, String>();
	
//	辞書の内容登録
	public Dictionary_Chapter21() {
		dic.put("apple"     , "りんご");
		dic.put("peach"     , "桃");
		dic.put("banana"    , "バナナ");
		dic.put("lemon"     , "レモン");
		dic.put("pear"      , "梨");
		dic.put("kiwi"      , "キウィ");
		dic.put("strawberry", "いちご");
		dic.put("grape"     , "ぶどう");
		dic.put("muscat"    , "マスカット");
		dic.put("cherry"    , "さくらんぼ");
	}
	
//	判定メソッド
	public void judge(String search) {
		if(dic.get(search) == null) {
			System.out.println("辞書に存在していません");
		} else {
			System.out.println(dic.get(search));
		}
	}
	
	
}
