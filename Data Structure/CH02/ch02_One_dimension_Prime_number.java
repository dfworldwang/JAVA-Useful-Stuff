
// One-dimension Array: Prime number.

public class ch02_One_dimension_Prime_number {

	public static void main(String args[])
	{
		final int MAX = 300;
		// false為prime number, true為non prime number
		// 宣告後若沒有給定初值, 其預設值為false
		boolean prime[] = new boolean[MAX];
		prime[0] = true;		// 0 is not prime number.
		prime[1] = true;		// 1 is not prime number.
		int num = 2, i;
		// 將1 ~ MAX中不是質數者, 逐一過濾掉, 以此方式找到所有質數
		while (num < MAX)
		{
			if (!prime[num])
			{
				for (i = num + num; i < MAX; i += num)
				{
					if (prime[i]) continue;
					prime[i] = true;		// 設定為true, 代表此數為non prime number 
				}
			}
			num++;
		}
		// print 1 ~ MAX all prime numbers
		System.out.println("1到" + MAX + "間的所有質數: ");
		for (i = 2, num = 0; i < MAX; i++)
		{
			if (!prime[i])
			{
				System.out.print(i + "\t");
				num++;
			}
		}
		System.out.println("\n質數總數= " + num + "個");
	}
}
