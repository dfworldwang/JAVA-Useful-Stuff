import java.util.Date;
import java.util.concurrent.ForkJoinPool;


public class Ch5_ForkJoinDemo2 {

	public static void main(String[] args) {
		int num = 40;
		// ���j�D��
		long t1 = new Date().getTime();
		System.out.print(new Fibonacci().fibonacci(num) + ".");
		long t2 = new Date().getTime();
		System.out.println("��O�ɶ�:" + (t2 - t1));
		// ForkJoin
		long t3 = new Date().getTime();
		// ���o����CPU�֤߼�
		int processors = Runtime.getRuntime().availableProcessors();
		FibonacciTask task = new FibonacciTask(num);
		// �إ�ForkJoinPool����������, �ó]�w���檺CPU�֤߼ƶq
		ForkJoinPool pool = new ForkJoinPool(processors);
		// �z�LFork/Join��������
		pool.invoke(task);
		// ���X�̫ᵲ�G
		System.out.print(task.getResult() + ".");
		long t4 = new Date().getTime();
		System.out.print("��O�ɶ�:" + (t4 - t3) + ".");
		System.out.println("Processors:" + processors);
	}
}
