
// �Ͳ��̰�������O, �~�� Thread ���O
class Producer extends Thread {
	public int count = 0;
	public void run() {			// ��������			
		int value;
		while (Ch10_ProducerConsumer.isRunning) {
			value = (int)(Math.random() * 100);
			Ch10_ProducerConsumer.squeue.enqueue(value);		// �s�J
			System.out.print(">" + value + "]");
			count++;
			try {		// �Ȱ��@�q�ɶ�
				Thread.sleep((int)(Math.random() * 100));
			}
			catch (InterruptedException e) { }
		}
		System.out.println("\n" + Thread.currentThread() + "�Ͳ��̰��������");
	}
}

// ���O�̰�������O, �~�� Thread ���O
class Consumer extends Thread {
	public int count = 0;
	public void run() {			// ��������												
		int data;
		while (Ch10_ProducerConsumer.isRunning) {
			data = Ch10_ProducerConsumer.squeue.dequeue();		// ���X
			System.out.print("[" + data + ">");
			count++;
			try {		// �Ȱ��@�q�ɶ�		
				Thread.sleep((int)(Math.random() * 100));
			}
			catch (InterruptedException e) { }
		}
		System.out.println("\n" + Thread.currentThread() + "���O�̰��������");
	}
}

// �D���O
public class Ch10_ProducerConsumer {
	static final int MAXITEMS = 10;
	static SynchronizedQueue squeue = new SynchronizedQueue();
	// �إߧǦC����
	static boolean isRunning = true;
	
	public static void main(String[] args) {
		// �إ߰��������
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		// �Ұʰ����
		producer.start();		consumer.start();
		while (true)		// ��������
			if (producer.count >= MAXITEMS && producer.count == consumer.count)
			{ isRunning = false;	break; }
	}
}
