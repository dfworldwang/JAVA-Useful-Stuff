import java.util.HashMap;
import java.util.TreeMap;


public class Ch17_TreeMap {

	public static void main(String[] args) {
		// 集合物件 HashMap 宣告
		HashMap<String, String> hmap = new HashMap<>();
		String key1 = "Joe", key2 = "Tom";
		hmap.put(key1, "陳大明");			// 新增元素
		hmap.put("Jane", "江小魚");		hmap.put(key2, "張無忌");
		// 集合物件 TreeMap 宣告
		TreeMap<String, String> tmap = new TreeMap<String, String>(hmap);
		// 顯示集合物件內容
		System.out.println("TreeMap 內容: " + tmap);
		tmap.put("Marry", "小龍女");
		tmap.put("Jason", "陳允傑");
		// 顯示集合物件內容
		System.out.println("新增二元素: " + tmap);
		System.out.println("第一個: " + tmap.firstKey());
		System.out.println("最後一個: " + tmap.lastKey());
		// 集合物件的部分內容
		System.out.print("在[" + key1 + "]鍵值前: ");
		System.out.println(tmap.headMap(key1));
		System.out.print("在[" + key2 + "]鍵值後: ");
		System.out.println(tmap.tailMap(key2));
		System.out.print("在[" + key1 + "]和[" + key2 + "]之間: ");
		System.out.println(tmap.subMap(key1, key2));
	}
}
