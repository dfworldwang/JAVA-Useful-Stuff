import java.util.Arrays;
// ������? ����A��

public class ch02_Two_dimension_array_Random_numbers {
	
	public static void main(String[] args) {
		// variable announcement
		int intCreate = 1000000;	// ���ͶüƦ���
		int intRand;				// ���ͪ�Random number codes
		int[][] intArray = new int[2][42];	// �m��Random number array
		// Place random numbers into array
		while (intCreate-- > 0)
		{
			intRand = (int)(Math.random() * 42);
			intArray[0][intRand]++;
			intArray[1][intRand]++;
		}
		// Sorts the intArray[0] into ascending numerical order.
		Arrays.sort(intArray[0]);
		// ��X�̤j�Ƥ��ӼƦr���X
		for (int i = 41; i > (41 - 6); i--)
		{
			// �v�@�ˬd���ƬۦP��
			for (int j = 41; j >= 0; j--)
			{
				// �����ƲŦX�ɦL�X
				if (intArray[0][i] == intArray[1][j])
				{
					System.out.println("�üƸ��X" + (j + 1) + "�X�{" + intArray[0][i] + "��");
					intArray[1][j] = 0;		// �N��쪺�ƭȱN�����k�s
					break;					// ���_���j��, �~��~�j��
				}
			}
		}
	}
}