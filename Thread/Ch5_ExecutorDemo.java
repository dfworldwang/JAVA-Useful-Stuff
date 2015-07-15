import java.util.concurrent.Executor;

// java.util.concurrent.Executor 介面分離了執行緒定義與呼叫程序

class MyExecutor implements Executor {
	@Override
	public void execute(Runnable r) {
		new Thread(r).start();		// 自行建立一條執行緒來實施Runnable物件所應執行的程序
	}
}

public class Ch5_ExecutorDemo {

	public static void main(String[] args) throws Exception {
		Executor exec = new MyExecutor();
		exec.execute(new GetTimeRunnable());	
		// 透過.execute()方法調用傳入Runnable物件
		exec.execute(new GetTimeRunnable());
		exec.execute(new GetTimeRunnable());
	}
}
