import java.util.ArrayList;


public class Ch17_ArrayList {

	public static void main(String[] args) {
		// 集合物件 ArrayList 宣告
		ArrayList<String> alist = new ArrayList<>(4);
		String name ="陳大明";
		// 新增元素
		alist.add("陳大明");		alist.add("江小魚");
		alist.add("陳允傑");		alist.add("張無忌");
		// 顯示尺寸和元素
		System.out.println("物件尺寸=" + alist.size());
		System.out.println("集合元素: " + alist);
		alist.add(2, name);			// 插入指定位置的元素
		
		// 顯示集合物件內容
		System.out.print("集合元素:");
		for (int i = 0; i < alist.size(); i++)
			System.out.print(" " + i + ":" + alist.get(i));
		System.out.println();		// 搜尋元素
		System.out.println("搜尋: " + name);
		System.out.println("indexOf(): " + alist.indexOf(name));
		System.out.println("lastIndexOf(): " + alist.lastIndexOf(name));
		alist.set(3, "張三豐");		// 取代元素
		System.out.println("取代元素 3: " + alist);
		alist.remove(0);			// 刪除元素
		System.out.println("刪除元素 0: " + alist);
	}
}
