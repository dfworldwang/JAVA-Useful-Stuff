import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Ch17_Iterator {

	public static void main(String[] args) {
		// ���X���� HashSet �ŧi
		HashSet<String> hset = new HashSet<>();
		hset.add("���j��");		hset.add("���p��");
		hset.add("������");
		System.out.println("HashSet ���e: " + hset);
		HashMap<String, String> hmap = new HashMap<>();		// ���X���� HashMap �ŧi
		
		hmap.put("Joe", "���j��");
		hmap.put("Jane", "���p��");
		hmap.put("Jason", "������");
		System.out.println("HashMap ���e: " + hmap);
		// �ϥ� Iterator ������� HashSet ����
		Iterator<String> iterator = hset.iterator();
		System.out.print("HashSet ���X(iterator):");
		while (iterator.hasNext())
			System.out.print(" " + iterator.next());
		System.out.println();
		// �ϥ� Iterator ������� Keys ����
		Set<String> keys = hmap.keySet();
		Iterator<String> iterator1 = keys.iterator();
		System.out.print("HashMap �� Keys ���X(iterator):");
		while (iterator1.hasNext())
			System.out.print(" " + iterator1.next());
		System.out.println();
	}
}
