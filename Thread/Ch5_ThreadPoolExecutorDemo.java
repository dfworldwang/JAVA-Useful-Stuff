import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;


// 若ThreadPoolExecutor的實體是來自Exectors.newCachedThreadPool(), 
// 表示Runnable可能將執行在新建執行緒或重複利用的執行緒中,
// 若ThreadPoolExecutor的實體是來自Exectors.newFixedThreadPool(), 
// 表示會在執行緒池中建立固定數量的執行緒, 並讓Runnable或Callable來運行.

public class Ch5_ThreadPoolExecutorDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("請給我一組0 ~ 99的Lotto數字 !");
		ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newCachedThreadPool();
		System.out.println("計算中...");
		Future<Integer> future = exec.submit(new Lotto());
		int result = future.get();
		System.out.println("您的Lotto數字是:" + result);
		exec.shutdown();
	}
}
