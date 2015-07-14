
class Cookies {

	private int cookiesNo;			// �j���s��
	private boolean empty = true;
	
	public synchronized void put(int cNo) {		// �u�H��j������k
		
		while (!empty) {
			try {
				wait();		// �Y��e�a���O�Ū�, �h�u�H�i�J���ݪ��A
			}
			catch(InterruptedException e) {}
		}
		System.out.println("�u�H��F�� " + cNo + " ���j��.");
		cookiesNo = cNo;
		empty = false;		// ��e�a���O�Ū�, �N���ۿ�e�a���j���F
		notify();			// �q�������ӦY�j��
	}
	public synchronized void eat(int cNo) {		// �����Y�j������k
		while (empty) {
			try {
				wait();		// �Y��e�a�O�Ū�, �h�����i�J���ݪ��A
			}
			catch(InterruptedException e) {} 
		}
		System.out.println("�����Y�F�� " + cNo + " ���j��.");
		empty = true;		// ��e�a�O�Ū�, �N���ۿ�e�a�S���j���F
		notify();			// �q���u�H�ө�j��
	}
}

class Eat implements Runnable {
	
	Cookies cookies;
	Eat(Cookies cookies) {
		this.cookies = cookies;
	}
	public void run() {
		// �Q��for-loop�Ӫ�ܾ����Y�F10���氮
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
		// �Q��for-loop�Ӫ�ܤu�H��F10���j��
		for (int i = 1; i <= 10; i++) {
			cookies.put(i);
		}
	}
}

public class Ch5_WaitNotify2 {

	public static void main(String[] args) {
		
		Cookies cookies = new Cookies();
		Put put = new Put(cookies);			// �u�H��j��
		Eat eat = new Eat(cookies);			// �����Y�j��
		Thread machine = new Thread(eat);	// ���������
		Thread worker = new Thread(put);	// �u�H�����
		machine.start();
		worker.start();
	}
}
