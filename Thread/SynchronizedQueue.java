
// �ϥ� synchronized ����r����w�귽, �H�קK 2 �Ӥ�k�P�ɦs��������

public class SynchronizedQueue {

	Queue queue;
	// �غc�l
	public SynchronizedQueue() { queue = new Queue(); }
	// �s�J���
	public synchronized void enqueue(int value) {
		try {	// �p�G�ǦC�w��
			while (queue.isFull()) {
				System.out.println();
				System.out.println("�ǦC�w��, �y��...");
				wait();			// ����
			}
		}
		catch (InterruptedException e) { }
		queue.enqueue(value);	// �s�J
		notify();				// �q�� dequeue()
	}
	
	// ���X���
	public synchronized int dequeue() {
		try {		// �p�G�ǦC�w��
			while (queue.isEmpty()) {
				System.out.println();
				System.out.println("�ǦC�w��, �y��...");
				wait();			// ����																					
			}
		}
		catch (InterruptedException e) { }
		int data = queue.dequeue(); 	// ���X
		notify();				// �q�� enqueue()
		return data;
	}
}
