import java.util.HashSet;
import java.util.TreeSet;


public class Ch17_TreeSet {

	public static void main(String[] args) {
		// ���X���� HashSet �ŧi
		HashSet<String> hset = new HashSet<>();
		String name0 = "Joe Chen", name1 = "Tom Wang";
		hset.add(name0);		// �s�W����
		hset.add(name1);	hset.add("Jane Chiang");
		// ���X���� TreeSet �ŧi
		TreeSet<String> tset = new TreeSet<>(hset);
		// ��ܶ��X���󤺮e
		System.out.print("TreeSet ���e: ");
		System.out.println(tset);
		tset.add("Mary Lee");
		tset.add("Jason Chen");
		
		// ��ܶ��X���󤺮e
		System.out.print("�s�W�G����: ");
		System.out.println(tset);
		System.out.println("�Ĥ@��: " + tset.first());
		System.out.println("�̫�@��: " + tset.last());
		// ���X���󪺳������e
		System.out.print("�b[" + name0 + "]�����e: ");
		System.out.println(tset.headSet(name0));
		System.out.print("�b[" + name0 + "]������: ");
		System.out.println(tset.tailSet(name0));
		System.out.print("�b[" + name0 + "]�M[" + name1 + "]����: ");
		System.out.println(tset.subSet(name0, name1));
	}
}
