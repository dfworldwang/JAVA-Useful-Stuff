
// �Yt1������w�i�J Stock ���� setPrice() ��k�è��olock.writeLock().lock() �g�J��
// �ht2�ȮɵL�k���o�Ӫ��󪺥�����, ����t1����F��lock().writeLock().unlock()
// t2�~�o�H�i���ꪺ���o�ð���

public class Ch5_ReentrantReadWriteLockDemo {

	public static void main(String[] args) {
		final Stock stock = new Stock(100);
		Thread t1 = new Thread() {
			@Override
			public void run() {
				stock.setPrice(200);
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println(stock.getPrice());
			}
		};
		t1.start();
		t2.start();
	}
}
