
// 若t1執行緒已進入 Stock 物件的 setPrice() 方法並取得lock.writeLock().lock() 寫入鎖
// 則t2暫時無法取得該物件的任何鎖, 直到t1釋放了鎖lock().writeLock().unlock()
// t2才得以進行鎖的取得並執行

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
