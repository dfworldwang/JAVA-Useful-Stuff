import java.io.IOException;


public class ch02_3_x_3_Matrix_Add {

	public static void MatrixAdd(int arrA[][], int arrB[][], int arrC[][], int dimX, int dimY)
	{
		int row, col;
		if (dimX <= 0 || dimY <= 0)
		{
			System.out.println("Matrix Dimension must greater than 0");
			return;
		}
		
		for (row = 1; row <= dimX; row++)
		{
			for (col = 1; col <= dimY; col++)
			{
				arrC[(row - 1)][(col - 1)] = arrA[(row - 1)][(col - 1)] + arrB[(row - 1)][(col - 1)];
			}
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		int i;
		int j;
		final int ROWS = 3;
		final int COLS = 3;
		int[][] A = {{11, 13, 15}, {17, 19, 21}, {23, 25, 27}};
		int[][] B = {{29, 28, 27}, {26, 25, 24}, {23, 22, 21}};
		int[][] C = new int[ROWS][COLS];
		
		System.out.println("[矩陣A的各個元素]");	// Print the contents of Matrix A
		for (i = 0; i < 3; i++)
		{
			for (j = 0; j < 3; j++)
			{
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("[矩陣B的各個元素]");	// Print the contents of Matrix B
		for (i = 0; i < 3; i++)
		{
			for (j = 0; j < 3; j++)
			{
				System.out.print(B[i][j] + "\t");
			}
			System.out.println();
		}
		
		MatrixAdd(A, B, C, 3, 3);
		System.out.println("[顯示矩陣A和矩陣B相加的結果]");	// Show the contents of A + B
		for (i = 0; i < 3; i++)
		{
			for (j = 0; j < 3; j++)
			{
				System.out.print(C[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
