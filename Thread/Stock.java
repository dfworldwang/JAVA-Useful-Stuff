import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class Stock {

	// ReentrantReadWriteLock: �ѨM�@�ɸ귽�P�ɶ��Q�h������j�q�ާ@�P�ק諸���D
	private ReadWriteLock lock = new ReentrantReadWriteLock();
	private int price;
	public Stock(int price) {
		setPrice(price);
	}
	public int getPrice() {
		try {
			// �S������g�J��w��, �j�a���i�H�i��Ū
			lock.readLock().lock();
			return price;
		} finally {
			lock.readLock().unlock();
		}
	}
	public void setPrice(int price) {
		try {
			// �S������Ū���μg�J��w��, ���W����w�����D
			lock.writeLock().lock();
			Thread.sleep(1000);
			this.price = price;
		}
		catch(InterruptedException e) {}
		finally {
			lock.writeLock().unlock();
		}
	}
}
