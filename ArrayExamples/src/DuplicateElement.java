
import java.util.Scanner;

public class DuplicateElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ar[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Enter The Value");
				ar[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		int found_no = 0;
		boolean found = false;
		for (int i = 0; i < 3; i++)// rows
		{
			for (int j = 0; j < 3; j++)// columns
			{
				int current_value = ar[i][j];
				for (int k = 0; k <= i; k++) {
					int max;
					if (k < i)
						max = 3;
					else
						max = j;

					for (int l = 0; l < max; l++) {
						if (current_value == ar[k][l]) {
							System.out.println("Duplicate element " + current_value + " found.");
							ar[i][j] = 0;
							found_no++;
							found = true;
							break;
						} else
							found = false;
					}
					if (found)
						break;
				}
			}
		}

		if (found_no == 0)
			System.out.println("No Duplicate element found");
		
		sc.close();
	}
}
