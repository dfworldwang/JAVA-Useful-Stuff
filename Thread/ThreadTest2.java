
public class ThreadTest2 {
	
	public static void main(String[] args) {
		HelloThread t1 = new HelloThread();
		t1.setName("T1");			// �]�w������W��
		t1.start();
		System.out.println("�i�ΰ���� : " + Thread.activeCount() + " ��");
		// �p��X�ثe�t�Τ��i�Ϊ�������ƶq
	}
}
