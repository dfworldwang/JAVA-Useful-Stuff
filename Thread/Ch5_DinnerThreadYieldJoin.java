
class WorkerThread implements Runnable {

	public void run() {
		System.out.println("工人下班回家");
		System.out.println("工人準備吃飯");
		System.out.println("工人發現沒晚餐了");
		System.out.println("工人打電話請服務生送晚餐");
		Thread waiter = new Thread(new WaiterThread());
		System.out.println("工人等待服務生 ...");
		waiter.start();
		
		try {
			waiter.join();
		}
		catch (InterruptedException e) {
			System.out.println("工人決定今天不吃晚餐了 !");
		}
		
		System.out.println("工人開始吃晚餐了 !");
		System.out.println("工人吃完飯了 !");
	}
}

class WaiterThread implements Runnable {
	
	public void run() {
		System.out.println();
		System.out.println("服務生送晚餐中 ...");
		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(1000);
				System.out.print(i + " 分鐘, ");	
			}		// 模擬服務生送晚餐的時間
		}
		catch (InterruptedException ie) {
			System.err.println("服務生送晚餐途中發生意外 !");
		}
		// sleep() 會 throws InterruptedException 例外事件, 
		// 必須要在 try - catch 區塊中呼叫
		System.out.println();
		System.out.println("服務生將晚餐送到家了 !");
		System.out.println("服務生收費完畢 !");
		System.out.println();
	}
}

public class Ch5_DinnerThreadYieldJoin {
	
	public static void main(String[] args) {
		Thread worker = new Thread(new WorkerThread());
		worker.start();
	}
}
