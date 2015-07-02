
class UserClass {		// 宣告使用者類別
	private int length;
	// 建構子
	public UserClass(int length)
	{
		this.length = length;
	}
	// 計算總和
	public int sum() {
		int temp = 0;
		for (int i = 1; i <= length; i++) temp += i;
		return temp;
	}	
}

// 執行緒類別, 實作 Runnable 介面
class UserThread extends UserClass implements Runnable {
	// 建構子
	public UserThread(int length) { super(length); }
	// 執行執行緒
	public void run() {
		System.out.println(Thread.currentThread() + "總和 = " + sum());
	}
}

// 主類別
public class Ch10_RunnableThread {

	public static void main(String[] args) {
		
		System.out.println("執行緒: " + Thread.currentThread());
		// 建立執行緒物件
		UserThread ut1 = new UserThread(5);
		Thread t1 = new Thread(ut1, "執行緒 A");
		UserThread ut2 = new UserThread(4);
		Thread t2 = new Thread(ut2, "執行緒 B");
		// 啟動執行緒
		t1.start(); 	t2.start();
	}
}
