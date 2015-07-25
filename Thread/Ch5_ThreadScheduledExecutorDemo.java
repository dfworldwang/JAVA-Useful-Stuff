import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// ScheduledThreadPoolExecutor: �䴩�u�@�Ƶ{���������, 
// �z�Lschedule()��k�ӱƩwRunnable�PCallable���B��u�@, 
// �B�椤���^�ǵ��G�|�o��ScheduledFuture�����

// �Y�O�z�LExecutors.newScheduledThreadPool(poolSize)�h�i�H���w�إ߰�����ƶq�Ӱ���Ʃw�u�@
// �z�LExecutors.newSingleThreadScheduledExecutor()�h��ܥγ�@������Ӱ���Ʃw�u�@

public class Ch5_ThreadScheduledExecutorDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("�е��ڤ@��0 ~ 99��Lotto�Ʀr !");
		ScheduledExecutorService exec = null;
		exec = Executors.newSingleThreadScheduledExecutor();
		System.out.println("���@���}�l�Ƶ{..." + new Date());
		ScheduledFuture<Integer> future = 
				exec.schedule(new Lotto(), 1000, TimeUnit.MILLISECONDS);
		System.out.println("�p�⤤...");
		int result = future.get();
		System.out.println("�z��Lotto�Ʀr�O:" + result);
		exec.shutdown();
	}
}
