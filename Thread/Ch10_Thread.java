
// ��������O, �~�� Thread ���O
class UserThread1 extends Thread {
	
	private int length;
	// �غc�l
	public UserThread1(int length, String name) {
		super(name);
		this.length = length;
	}
	// ��������
	public void run() {
		int temp = 0;
		for (int i = 1; i <= length; i++) temp += i;
		System.out.println(Thread.currentThread() + "�`�M = " + temp);
	}
}

// �D���O
public class Ch10_Thread {

	public static void main(String[] args) {
	
		System.out.println("�����: " + Thread.currentThread());
		// �إ߰��������
		UserThread1 ut1 = new UserThread1(5, "����� A");
		UserThread1 ut2 = new UserThread1(4, "����� B");
		// �Ұʰ����
		ut1.start();		ut2.start();																								  	
	}
}
