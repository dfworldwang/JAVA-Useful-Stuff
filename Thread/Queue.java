
// enqueue() ��k��ǦC�w����, �I�s wait() ��k���ݤU�� dequeue() ��k
// �� notify() �q���w�g���X��ƫ�, �N�i�H�A���s�J���. �̫᪺ notify() ��k
// �O�q�� dequeue() ��k�w�g�s�J���.

// dequeue() ��k���X��Ʈ�, �p�G�o�{�ǦC�w��, �N�ݭn�I�s wait() ��k����,
// ���� enqueue() ��k�I�s notify() ��k�����(��ܤw�g�s�J���), �H�K�i�H�q
// �ǦC���X���

public class Queue {

	static final int MAXQUEUE = 3;
	int[] queue = new int[MAXQUEUE];
	int front, rear;
	// �غc�l
	public Queue() { front = 0; rear = 0; }
	// �ǦC�O�_�O�Ū�
	public boolean isEmpty() { return (front == rear); }
	// �ǦC�O�_�w��
	public boolean isFull() {
		int index = rear + 1 < MAXQUEUE ? rear + 1 : 0;
		return (index == front);
	}
	
	// �s�J���
	public void enqueue(int value) {
		queue[rear] = value;
		rear = rear + 1 < MAXQUEUE ? rear + 1 : 0;
	}
	// ���X���
	public int dequeue() {
		int data = queue[front];
		front = front + 1 < MAXQUEUE ? front + 1 : 0;
		return data;
	}
}
