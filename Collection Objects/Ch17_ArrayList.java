import java.util.ArrayList;


public class Ch17_ArrayList {

	public static void main(String[] args) {
		// ���X���� ArrayList �ŧi
		ArrayList<String> alist = new ArrayList<>(4);
		String name ="���j��";
		// �s�W����
		alist.add("���j��");		alist.add("���p��");
		alist.add("������");		alist.add("�i�L��");
		// ��ܤؤo�M����
		System.out.println("����ؤo=" + alist.size());
		System.out.println("���X����: " + alist);
		alist.add(2, name);			// ���J���w��m������
		
		// ��ܶ��X���󤺮e
		System.out.print("���X����:");
		for (int i = 0; i < alist.size(); i++)
			System.out.print(" " + i + ":" + alist.get(i));
		System.out.println();		// �j�M����
		System.out.println("�j�M: " + name);
		System.out.println("indexOf(): " + alist.indexOf(name));
		System.out.println("lastIndexOf(): " + alist.lastIndexOf(name));
		alist.set(3, "�i�T��");		// ���N����
		System.out.println("���N���� 3: " + alist);
		alist.remove(0);			// �R������
		System.out.println("�R������ 0: " + alist);
	}
}
