
// 執行緒類別, 繼承 Thread 類別
class UserThread1 extends Thread {
	
	private int length;
	// 建構子
	public UserThread1(int length, String name) {
		super(name);
		this.length = length;
	}
	// 執行執行緒
	public void run() {
		int temp = 0;
		for (int i = 1; i <= length; i++) temp += i;
		System.out.println(Thread.currentThread() + "總和 = " + temp);
	}
}

// 主類別
public class Ch10_Thread {

	public static void main(String[] args) {
	
		System.out.println("執行緒: " + Thread.currentThread());
		// 建立執行緒物件
		UserThread1 ut1 = new UserThread1(5, "執行緒 A");
		UserThread1 ut2 = new UserThread1(4, "執行緒 B");
		// 啟動執行緒
		ut1.start();		ut2.start();																								  	
	}
}
