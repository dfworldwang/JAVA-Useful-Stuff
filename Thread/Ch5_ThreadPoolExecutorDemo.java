import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;


// �YThreadPoolExecutor������O�Ӧ�Exectors.newCachedThreadPool(), 
// ���Runnable�i��N����b�s�ذ�����έ��ƧQ�Ϊ��������,
// �YThreadPoolExecutor������O�Ӧ�Exectors.newFixedThreadPool(), 
// ��ܷ|�b����������إߩT�w�ƶq�������, ����Runnable��Callable�ӹB��.

public class Ch5_ThreadPoolExecutorDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("�е��ڤ@��0 ~ 99��Lotto�Ʀr !");
		ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newCachedThreadPool();
		System.out.println("�p�⤤...");
		Future<Integer> future = exec.submit(new Lotto());
		int result = future.get();
		System.out.println("�z��Lotto�Ʀr�O:" + result);
		exec.shutdown();
	}
}
