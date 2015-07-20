import java.util.concurrent.RecursiveTask;


// (Fork): ���Ȥ��_�V�U���Ѧ̤ܳp���, �{���N�p�⦹�̤p��쪺�޿赲�G
// (Join): �o�쵲�G��A���W�X�֭p��ܷ��Y

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
		
		if (num < 29) {		// �B�z�t�ת��e��
			// �p��29�N�����Q�γ��������j�D��
			result = new Fibonacci().fibonacci(num);
		} else {
			FibonacciTask task1 = new FibonacciTask(num - 1);
			task1.fork();			// ���� (ForkJoinPool�N�|���t�@��������Ӱ��榹����)
			FibonacciTask task2 = new FibonacciTask(num - 2);
			result = task2.compute() + task1.join();
		// task2.compute(): �յۨ��oFibonacci�ƦCnum - 2����, ���i��A�|���U����l����
		// task1.join(): ���o���e������l���Ȧ^�����G.	
		}
		return result;
	}
}
