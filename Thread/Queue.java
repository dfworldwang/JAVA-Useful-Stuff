
// enqueue() 方法當序列已滿時, 呼叫 wait() 方法等待下面 dequeue() 方法
// 的 notify() 通知已經取出資料後, 就可以再次存入資料. 最後的 notify() 方法
// 是通知 dequeue() 方法已經存入資料.

// dequeue() 方法取出資料時, 如果發現序列已空, 就需要呼叫 wait() 方法等待,
// 直到 enqueue() 方法呼叫 notify() 方法喚醒它(表示已經存入資料), 以便可以從
// 序列取出資料

public class Queue {

	static final int MAXQUEUE = 3;
	int[] queue = new int[MAXQUEUE];
	int front, rear;
	// 建構子
	public Queue() { front = 0; rear = 0; }
	// 序列是否是空的
	public boolean isEmpty() { return (front == rear); }
	// 序列是否已滿
	public boolean isFull() {
		int index = rear + 1 < MAXQUEUE ? rear + 1 : 0;
		return (index == front);
	}
	
	// 存入資料
	public void enqueue(int value) {
		queue[rear] = value;
		rear = rear + 1 < MAXQUEUE ? rear + 1 : 0;
	}
	// 取出資料
	public int dequeue() {
		int data = queue[front];
		front = front + 1 < MAXQUEUE ? front + 1 : 0;
		return data;
	}
}
