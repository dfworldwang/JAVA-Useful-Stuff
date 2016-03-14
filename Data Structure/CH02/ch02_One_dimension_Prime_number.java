
// One-dimension Array: Prime number.

public class ch02_One_dimension_Prime_number {

	public static void main(String args[])
	{
		final int MAX = 300;
		// false��prime number, true��non prime number
		// �ŧi��Y�S�����w���, ��w�]�Ȭ�false
		boolean prime[] = new boolean[MAX];
		prime[0] = true;		// 0 is not prime number.
		prime[1] = true;		// 1 is not prime number.
		int num = 2, i;
		// �N1 ~ MAX�����O��ƪ�, �v�@�L�o��, �H���覡���Ҧ����
		while (num < MAX)
		{
			if (!prime[num])
			{
				for (i = num + num; i < MAX; i += num)
				{
					if (prime[i]) continue;
					prime[i] = true;		// �]�w��true, �N���Ƭ�non prime number 
				}
			}
			num++;
		}
		// print 1 ~ MAX all prime numbers
		System.out.println("1��" + MAX + "�����Ҧ����: ");
		for (i = 2, num = 0; i < MAX; i++)
		{
			if (!prime[i])
			{
				System.out.print(i + "\t");
				num++;
			}
		}
		System.out.println("\n����`��= " + num + "��");
	}
}
