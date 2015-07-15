import java.util.concurrent.Executor;

// java.util.concurrent.Executor ���������F������w�q�P�I�s�{��

class MyExecutor implements Executor {
	@Override
	public void execute(Runnable r) {
		new Thread(r).start();		// �ۦ�إߤ@��������ӹ�IRunnable����������檺�{��
	}
}

public class Ch5_ExecutorDemo {

	public static void main(String[] args) throws Exception {
		Executor exec = new MyExecutor();
		exec.execute(new GetTimeRunnable());	
		// �z�L.execute()��k�եζǤJRunnable����
		exec.execute(new GetTimeRunnable());
		exec.execute(new GetTimeRunnable());
	}
}
