
public class ThreadTest4 {

	public static void main(String[] args) {
		HelloThread r1 = new HelloThread();
		HelloThread r2 = new HelloThread();
		Thread t1 = new Thread(r1, "T1");
		Thread t2 = new Thread(r2, "T2");
		// 建立 Thread 物件並將 Runnable 物件以及執行緒名稱傳入
		t1.start();
		t2.start();
	}
}
