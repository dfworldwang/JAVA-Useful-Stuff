
class Cookies {

	private int cookiesNo;			// 磚塊編號
	private boolean empty = true;
	
	public synchronized void put(int cNo) {		// 工人放磚塊的方法
		
		while (!empty) {
			try {
				wait();		// 若輸送帶不是空的, 則工人進入等待狀態
			}
			catch(InterruptedException e) {}
		}
		System.out.println("工人放了第 " + cNo + " 塊磚塊.");
		cookiesNo = cNo;
		empty = false;		// 輸送帶不是空的, 意味著輸送帶有磚塊了
		notify();			// 通知機器來吃磚塊
	}
	public synchronized void eat(int cNo) {		// 機器吃磚塊的方法
		while (empty) {
			try {
				wait();		// 若輸送帶是空的, 則機器進入等待狀態
			}
			catch(InterruptedException e) {} 
		}
		System.out.println("機器吃了第 " + cNo + " 塊磚塊.");
		empty = true;		// 輸送帶是空的, 意味著輸送帶沒有磚塊了
		notify();			// 通知工人來放磚塊
	}
}

class Eat implements Runnable {
	
	Cookies cookies;
	Eat(Cookies cookies) {
		this.cookies = cookies;
	}
	public void run() {
		// 利用for-loop來表示機器吃了10次餅乾
		for (int i = 1; i <= 10; i++) {
			cookies.eat(i);
		}
	}
}

class Put implements Runnable {
	
	Cookies cookies;
	Put(Cookies cookies) {
		this.cookies = cookies;
	}
	public void run() {
		// 利用for-loop來表示工人放了10次磚塊
		for (int i = 1; i <= 10; i++) {
			cookies.put(i);
		}
	}
}

public class Ch5_WaitNotify2 {

	public static void main(String[] args) {
		
		Cookies cookies = new Cookies();
		Put put = new Put(cookies);			// 工人放磚塊
		Eat eat = new Eat(cookies);			// 機器吃磚塊
		Thread machine = new Thread(eat);	// 機器執行緒
		Thread worker = new Thread(put);	// 工人執行緒
		machine.start();
		worker.start();
	}
}
