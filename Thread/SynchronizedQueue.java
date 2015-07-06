
// 使用 synchronized 關鍵字來鎖定資源, 以避免 2 個方法同時存取此物件

public class SynchronizedQueue {

	Queue queue;
	// 建構子
	public SynchronizedQueue() { queue = new Queue(); }
	// 存入資料
	public synchronized void enqueue(int value) {
		try {	// 如果序列已滿
			while (queue.isFull()) {
				System.out.println();
				System.out.println("序列已滿, 稍等...");
				wait();			// 等待
			}
		}
		catch (InterruptedException e) { }
		queue.enqueue(value);	// 存入
		notify();				// 通知 dequeue()
	}
	
	// 取出資料
	public synchronized int dequeue() {
		try {		// 如果序列已空
			while (queue.isEmpty()) {
				System.out.println();
				System.out.println("序列已空, 稍等...");
				wait();			// 等待																					
			}
		}
		catch (InterruptedException e) { }
		int data = queue.dequeue(); 	// 取出
		notify();				// 通知 enqueue()
		return data;
	}
}
