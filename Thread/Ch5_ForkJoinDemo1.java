import java.util.Date;


public class Ch5_ForkJoinDemo1 {

	public static void main(String[] args) {
		int num = 30;
		// 遞迴求解
		long t1 = new Date().getTime();
		System.out.print(new Fibonacci().fibonacci(num) + ".");
		long t2 = new Date().getTime();
		System.out.println("花費時間:" + (t2 - t1));
	}
}
