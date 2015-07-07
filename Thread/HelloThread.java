
public class HelloThread extends Thread {

	public void run() {			// 執行執行緒的工作
		for (int i = 1; i <= 1000; i++) {
			String tName = Thread.currentThread().getName();
			System.out.println(tName + " : " + i);
		}
	}
}
