
public class ThreadTest4 {

	public static void main(String[] args) {
		HelloThread r1 = new HelloThread();
		HelloThread r2 = new HelloThread();
		Thread t1 = new Thread(r1, "T1");
		Thread t2 = new Thread(r2, "T2");
		// �إ� Thread ����ñN Runnable ����H�ΰ�����W�ٶǤJ
		t1.start();
		t2.start();
	}
}
