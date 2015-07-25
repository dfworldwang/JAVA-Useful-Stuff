import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// ScheduledThreadPoolExecutor: 支援工作排程的執行緒池, 
// 透過schedule()方法來排定Runnable與Callable的運行工作, 
// 運行中的回傳結果會得到ScheduledFuture的實例

// 若是透過Executors.newScheduledThreadPool(poolSize)則可以指定建立執行緒數量來執行排定工作
// 透過Executors.newSingleThreadScheduledExecutor()則表示用單一執行緒來執行排定工作

public class Ch5_ThreadScheduledExecutorDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("請給我一組0 ~ 99的Lotto數字 !");
		ScheduledExecutorService exec = null;
		exec = Executors.newSingleThreadScheduledExecutor();
		System.out.println("停一秒後開始排程..." + new Date());
		ScheduledFuture<Integer> future = 
				exec.schedule(new Lotto(), 1000, TimeUnit.MILLISECONDS);
		System.out.println("計算中...");
		int result = future.get();
		System.out.println("您的Lotto數字是:" + result);
		exec.shutdown();
	}
}
