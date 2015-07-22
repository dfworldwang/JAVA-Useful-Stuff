import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;


public class Lotto3 implements Runnable {

	private String username;
	private static final ReentrantLock lock = new ReentrantLock();
	public Lotto3(String username) {
		this.username = username;
	}
	@Override
	public void run() {
		try {
			lock.lock(); 		// ������w�귽
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(1000);				// �����n��O���ɶ�
				int number = (int)(Math.random() * 100);
				System.out.println(username + " �o��� " + i + " �ո��X:" + 
						number + " ,�ɶ�:" + new Date());
			}
		} catch(Exception e) {	
		} finally {
			lock.unlock();		// ���F�קK�����o��, ����@�ߩ�bfinally�Ϭq
		}
	}
}
