import java.util.concurrent.RecursiveTask;


// (Fork): 任務不斷向下分解至最小單位, 程式將計算此最小單位的邏輯結果
// (Join): 得到結果後再往上合併計算至源頭

public class FibonacciTask extends RecursiveTask<Integer> {
	
	private int num = 0;
	private int result = 0;
	FibonacciTask(int num) {
		this.num = num;
	}
	public int getResult() {
		return result;
	}
	@Override
	protected Integer compute() {
		
		if (num < 29) {		// 處理速度門檻值
			// 小於29就直接利用單執行緒遞迴求解
			result = new Fibonacci().fibonacci(num);
		} else {
			FibonacciTask task1 = new FibonacciTask(num - 1);
			task1.fork();			// 分解 (ForkJoinPool將會分配一條執行緒來執行此任務)
			FibonacciTask task2 = new FibonacciTask(num - 2);
			result = task2.compute() + task1.join();
		// task2.compute(): 試著取得Fibonacci數列num - 2的值, 有可能再會往下拆分子任務
		// task1.join(): 取得之前拆分的子任務回報結果.	
		}
		return result;
	}
}
