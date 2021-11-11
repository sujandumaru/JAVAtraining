
import java.util.Scanner;

public class MaxMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ar[][] = new int[3][3];
		for (int i = 0; i < 3; i++)// rows
		{
			for (int j = 0; j < 3; j++)// columns
			{
				System.out.println("Enter The Value");
				ar[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		int max_value = ar[0][0];
		int min_value = ar[0][0];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (max_value < ar[i][j])
					max_value = ar[i][j];
				if (min_value > ar[i][j])
					min_value = ar[i][j];
			}
		}

		System.out.print("The Maximum value in the array is: " + max_value);
		System.out.println();
		System.out.print("The Minimum value in the array is: " + min_value);
		sc.close();
	}
}

