
class WorkerThread implements Runnable {

	public void run() {
		System.out.println("�u�H�U�Z�^�a");
		System.out.println("�u�H�ǳƦY��");
		System.out.println("�u�H�o�{�S���\�F");
		System.out.println("�u�H���q�ܽЪA�ȥͰe���\");
		Thread waiter = new Thread(new WaiterThread());
		System.out.println("�u�H���ݪA�ȥ� ...");
		waiter.start();
		
		try {
			waiter.join();
		}
		catch (InterruptedException e) {
			System.out.println("�u�H�M�w���Ѥ��Y���\�F !");
		}
		
		System.out.println("�u�H�}�l�Y���\�F !");
		System.out.println("�u�H�Y�����F !");
	}
}

class WaiterThread implements Runnable {
	
	public void run() {
		System.out.println();
		System.out.println("�A�ȥͰe���\�� ...");
		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(1000);
				System.out.print(i + " ����, ");	
			}		// �����A�ȥͰe���\���ɶ�
		}
		catch (InterruptedException ie) {
			System.err.println("�A�ȥͰe���\�~���o�ͷN�~ !");
		}
		// sleep() �| throws InterruptedException �ҥ~�ƥ�, 
		// �����n�b try - catch �϶����I�s
		System.out.println();
		System.out.println("�A�ȥͱN���\�e��a�F !");
		System.out.println("�A�ȥͦ��O���� !");
		System.out.println();
	}
}

public class Ch5_DinnerThreadYieldJoin {
	
	public static void main(String[] args) {
		Thread worker = new Thread(new WorkerThread());
		worker.start();
	}
}
