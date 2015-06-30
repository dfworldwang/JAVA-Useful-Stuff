import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class Ch17_HashMap {

	public static void main(String[] args) {
		// 集合物件 HashMap 宣告
		HashMap<String, String> hmap = new HashMap<>();
		String key = "Tom", name = "陳大明";
		
		System.out.println("新增元素前是否是空的=" + hmap.isEmpty());
		hmap.put("Joe", name);			// 新增元素
		hmap.put("Jane", "江小魚");
		hmap.put(key, "陳允傑");		hmap.put("Hueyan", name);
		// 顯示尺寸和是否是空的
		System.out.println("新增後尺寸=" + hmap.size());
		System.out.println("是否是空的=" + hmap.isEmpty());
		// 顯示集合物件內容
		System.out.println("Hashmap 內容: " + hmap);
		
		// 是否擁有指定元素
		System.out.println("Hashmap 是否有[" + key + "]: " + 
				hmap.containsKey(key));
		System.out.println("Hashmap 是否有[" + name + "]: " + 
				hmap.containsValue(name));
		System.out.print("鍵值: " + key);		// 取得指定的值
		System.out.println(" --> 值: " + hmap.get(key));
		// 轉換成 Set 和 Collection 物件
		Set<String> keys = hmap.keySet();
		System.out.println("Keys 內容: " + keys);
		Collection<String> values = hmap.values();
		System.out.println("Values 內容: " + values);
		hmap.remove(key);				// 刪除元素
		System.out.println("Hashmap 刪除[" + key + "]: " + hmap);
		hmap.clear();					// 清除集合物件
	}
}
