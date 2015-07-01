import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Ch17_Iterator {

	public static void main(String[] args) {
		// 集合物件 HashSet 宣告
		HashSet<String> hset = new HashSet<>();
		hset.add("陳大明");		hset.add("江小魚");
		hset.add("陳允傑");
		System.out.println("HashSet 內容: " + hset);
		HashMap<String, String> hmap = new HashMap<>();		// 集合物件 HashMap 宣告
		
		hmap.put("Joe", "陳大明");
		hmap.put("Jane", "江小魚");
		hmap.put("Jason", "陳允傑");
		System.out.println("HashMap 內容: " + hmap);
		// 使用 Iterator 介面顯示 HashSet 元素
		Iterator<String> iterator = hset.iterator();
		System.out.print("HashSet 集合(iterator):");
		while (iterator.hasNext())
			System.out.print(" " + iterator.next());
		System.out.println();
		// 使用 Iterator 介面顯示 Keys 元素
		Set<String> keys = hmap.keySet();
		Iterator<String> iterator1 = keys.iterator();
		System.out.print("HashMap 的 Keys 集合(iterator):");
		while (iterator1.hasNext())
			System.out.print(" " + iterator1.next());
		System.out.println();
	}
}
