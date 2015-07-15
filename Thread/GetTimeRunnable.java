import java.util.Date;


public class GetTimeRunnable implements Runnable {

	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + ":" + new Date());
	}
}
