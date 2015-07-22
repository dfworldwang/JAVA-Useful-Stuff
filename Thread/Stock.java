import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class Stock {

	// ReentrantReadWriteLock: 解決共享資源同時間被多執行緒大量操作與修改的問題
	private ReadWriteLock lock = new ReentrantReadWriteLock();
	private int price;
	public Stock(int price) {
		setPrice(price);
	}
	public int getPrice() {
		try {
			// 沒有任何寫入鎖定時, 大家都可以進來讀
			lock.readLock().lock();
			return price;
		} finally {
			lock.readLock().unlock();
		}
	}
	public void setPrice(int price) {
		try {
			// 沒有任何讀取或寫入鎖定時, 有獨佔鎖定的問題
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
