
public class Fibonacci {

	public int fibonacci(int num) {
		if (num == 0 || num == 1) {
			// F0 = 0, F1 = 1
			return num;
		}
		else {
			// Fn = F(n-1) + F(n-2)
			return (fibonacci(num - 1) + fibonacci(num - 2));
		}
	}
}
