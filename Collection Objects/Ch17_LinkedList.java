import java.util.LinkedList;


public class Ch17_LinkedList {

	public static void main(String[] args) {
		// ���X���� LinkedList �ŧi
		LinkedList<String> llist = new LinkedList<>();
		llist.addFirst("���j��");			// �s�W����
		System.out.println("addFirst(): " + llist);
		llist.addFirst("���p��");
		System.out.println("addFirst(): " + llist);
		llist.addLast("�p�s�k");
		System.out.println("addLast(): " + llist);
		llist.addLast("������");
		System.out.println("addLast(): " + llist);
		// ��ܶ��X���󤺮e
		System.out.print("���X����:");
		for (int i = 0; i < llist.size(); i++)
			System.out.print(" " + i + ":" + llist.get(i));
		System.out.println();
		System.out.println("�Ĥ@��: " + llist.getFirst());
		System.out.println("�̫�@��: " + llist.getLast());
		llist.removeFirst(); 			// �R������
		System.out.println("removeFirst(): " + llist);
		llist.removeLast();
		System.out.println("removeLast(): " + llist);
	}
}
