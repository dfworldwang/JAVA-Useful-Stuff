
// 生產者執行緒類別, 繼承 Thread 類別
class Producer extends Thread {
	public int count = 0;
	public void run() {			// 執行執行緒			
		int value;
		while (Ch10_ProducerConsumer.isRunning) {
			value = (int)(Math.random() * 100);
			Ch10_ProducerConsumer.squeue.enqueue(value);		// 存入
			System.out.print(">" + value + "]");
			count++;
			try {		// 暫停一段時間
				Thread.sleep((int)(Math.random() * 100));
			}
			catch (InterruptedException e) { }
		}
		System.out.println("\n" + Thread.currentThread() + "生產者執行緒結束");
	}
}

// 消費者執行緒類別, 繼承 Thread 類別
class Consumer extends Thread {
	public int count = 0;
	public void run() {			// 執行執行緒												
		int data;
		while (Ch10_ProducerConsumer.isRunning) {
			data = Ch10_ProducerConsumer.squeue.dequeue();		// 取出
			System.out.print("[" + data + ">");
			count++;
			try {		// 暫停一段時間		
				Thread.sleep((int)(Math.random() * 100));
			}
			catch (InterruptedException e) { }
		}
		System.out.println("\n" + Thread.currentThread() + "消費者執行緒結束");
	}
}

// 主類別
public class Ch10_ProducerConsumer {
	static final int MAXITEMS = 10;
	static SynchronizedQueue squeue = new SynchronizedQueue();
	// 建立序列物件
	static boolean isRunning = true;
	
	public static void main(String[] args) {
		// 建立執行緒物件
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		// 啟動執行緒
		producer.start();		consumer.start();
		while (true)		// 結束條件
			if (producer.count >= MAXITEMS && producer.count == consumer.count)
			{ isRunning = false;	break; }
	}
}
