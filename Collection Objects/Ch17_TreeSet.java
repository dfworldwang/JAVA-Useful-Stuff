import java.util.HashSet;
import java.util.TreeSet;


public class Ch17_TreeSet {

	public static void main(String[] args) {
		// 集合物件 HashSet 宣告
		HashSet<String> hset = new HashSet<>();
		String name0 = "Joe Chen", name1 = "Tom Wang";
		hset.add(name0);		// 新增元素
		hset.add(name1);	hset.add("Jane Chiang");
		// 集合物件 TreeSet 宣告
		TreeSet<String> tset = new TreeSet<>(hset);
		// 顯示集合物件內容
		System.out.print("TreeSet 內容: ");
		System.out.println(tset);
		tset.add("Mary Lee");
		tset.add("Jason Chen");
		
		// 顯示集合物件內容
		System.out.print("新增二元素: ");
		System.out.println(tset);
		System.out.println("第一個: " + tset.first());
		System.out.println("最後一個: " + tset.last());
		// 集合物件的部分內容
		System.out.print("在[" + name0 + "]元素前: ");
		System.out.println(tset.headSet(name0));
		System.out.print("在[" + name0 + "]元素後: ");
		System.out.println(tset.tailSet(name0));
		System.out.print("在[" + name0 + "]和[" + name1 + "]之間: ");
		System.out.println(tset.subSet(name0, name1));
	}
}
