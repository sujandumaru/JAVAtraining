<<<<<<< HEAD
import java.util.Scanner;

public class EvenPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ar[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Enter The Value:");
				ar[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Prime Number in the array:");
		for (int i = 0; i < 3; i++) {
			boolean found;
			
			for (int j = 0; j < 3; j++) {
				int k = 2;
				found = true;
				while (k < ar[i][j])
				{
					if (ar[i][j] % k == 0)
					{
						found = false;
						break;
					}
					else
						k++;
				}
				
				if (ar[i][j] == 0 || ar[i][j] == 1)
					found = false;
				
				if (found)
					System.out.println(ar[i][j]);
			}
		}
		
		System.out.println("Even Number in the array:");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (ar[i][j] % 2 == 0)
					System.out.println(ar[i][j]);
			}
		}
		sc.close();
	}
}
=======
import java.util.Scanner;

public class EvenPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ar[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Enter The Value:");
				ar[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Prime Number in the array:");
		for (int i = 0; i < 3; i++) {
			boolean found;
			
			for (int j = 0; j < 3; j++) {
				int k = 2;
				found = true;
				while (k < ar[i][j])
				{
					if (ar[i][j] % k == 0)
					{
						found = false;
						break;
					}
					else
						k++;
				}
				
				if (ar[i][j] == 0 || ar[i][j] == 1)
					found = false;
				
				if (found)
					System.out.println(ar[i][j]);
			}
		}
		
		System.out.println("Even Number in the array:");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (ar[i][j] % 2 == 0)
					System.out.println(ar[i][j]);
			}
		}
		sc.close();
	}
}
>>>>>>> df5db52678e76e4177276a6b65cd98f0ce4b31f8
