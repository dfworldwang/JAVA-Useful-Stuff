import java.util.HashMap;
import java.util.TreeMap;


public class Ch17_TreeMap {

	public static void main(String[] args) {
		// ���X���� HashMap �ŧi
		HashMap<String, String> hmap = new HashMap<>();
		String key1 = "Joe", key2 = "Tom";
		hmap.put(key1, "���j��");			// �s�W����
		hmap.put("Jane", "���p��");		hmap.put(key2, "�i�L��");
		// ���X���� TreeMap �ŧi
		TreeMap<String, String> tmap = new TreeMap<String, String>(hmap);
		// ��ܶ��X���󤺮e
		System.out.println("TreeMap ���e: " + tmap);
		tmap.put("Marry", "�p�s�k");
		tmap.put("Jason", "������");
		// ��ܶ��X���󤺮e
		System.out.println("�s�W�G����: " + tmap);
		System.out.println("�Ĥ@��: " + tmap.firstKey());
		System.out.println("�̫�@��: " + tmap.lastKey());
		// ���X���󪺳������e
		System.out.print("�b[" + key1 + "]��ȫe: ");
		System.out.println(tmap.headMap(key1));
		System.out.print("�b[" + key2 + "]��ȫ�: ");
		System.out.println(tmap.tailMap(key2));
		System.out.print("�b[" + key1 + "]�M[" + key2 + "]����: ");
		System.out.println(tmap.subMap(key1, key2));
	}
}
