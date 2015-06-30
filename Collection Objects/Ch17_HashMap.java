import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class Ch17_HashMap {

	public static void main(String[] args) {
		// ���X���� HashMap �ŧi
		HashMap<String, String> hmap = new HashMap<>();
		String key = "Tom", name = "���j��";
		
		System.out.println("�s�W�����e�O�_�O�Ū�=" + hmap.isEmpty());
		hmap.put("Joe", name);			// �s�W����
		hmap.put("Jane", "���p��");
		hmap.put(key, "������");		hmap.put("Hueyan", name);
		// ��ܤؤo�M�O�_�O�Ū�
		System.out.println("�s�W��ؤo=" + hmap.size());
		System.out.println("�O�_�O�Ū�=" + hmap.isEmpty());
		// ��ܶ��X���󤺮e
		System.out.println("Hashmap ���e: " + hmap);
		
		// �O�_�֦����w����
		System.out.println("Hashmap �O�_��[" + key + "]: " + 
				hmap.containsKey(key));
		System.out.println("Hashmap �O�_��[" + name + "]: " + 
				hmap.containsValue(name));
		System.out.print("���: " + key);		// ���o���w����
		System.out.println(" --> ��: " + hmap.get(key));
		// �ഫ�� Set �M Collection ����
		Set<String> keys = hmap.keySet();
		System.out.println("Keys ���e: " + keys);
		Collection<String> values = hmap.values();
		System.out.println("Values ���e: " + values);
		hmap.remove(key);				// �R������
		System.out.println("Hashmap �R��[" + key + "]: " + hmap);
		hmap.clear();					// �M�����X����
	}
}
