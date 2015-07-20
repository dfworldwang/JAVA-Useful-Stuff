import java.util.Date;
import java.util.concurrent.ForkJoinPool;


public class Ch5_ForkJoinDemo2 {

	public static void main(String[] args) {
		int num = 40;
		// 遞迴求解
		long t1 = new Date().getTime();
		System.out.print(new Fibonacci().fibonacci(num) + ".");
		long t2 = new Date().getTime();
		System.out.println("花費時間:" + (t2 - t1));
		// ForkJoin
		long t3 = new Date().getTime();
		// 取得本機CPU核心數
		int processors = Runtime.getRuntime().availableProcessors();
		FibonacciTask task = new FibonacciTask(num);
		// 建立ForkJoinPool執行緒池實例, 並設定執行的CPU核心數量
		ForkJoinPool pool = new ForkJoinPool(processors);
		// 透過Fork/Join分派任務
		pool.invoke(task);
		// 取出最後結果
		System.out.print(task.getResult() + ".");
		long t4 = new Date().getTime();
		System.out.print("花費時間:" + (t4 - t3) + ".");
		System.out.println("Processors:" + processors);
	}
}
