
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		
		Scanner sc = new Scanner(System.in);
		
//No. 1	and 6
//		for (i = 1; i < 6; i++)
//		{
//			for (j = 1; j < 7; j++)
//				System.out.print("#");		// No. 6 = "#" ---> "A"
//			System.out.println();
//		}
		
		
//No. 2
//		for (i = 1; i < 7; i++)
//		{
//			for (j = 1; j < 6; j++)
//			{
//				if (i == 1 || i == 6)
//					System.out.print("@");
//				else
//				{
//					if (j == 1 || j == 5)
//						System.out.print("@");
//					else
//						System.out.print(" ");
//				}
//			}
//			System.out.println();	
//		}
		
		
//No. 3
//		int sum = 0;
//		for (i = 1; i < 11; i++)
//		{
//			for (j = 1; j <  6; j++)
//			{
//				sum++;
//				System.out.print(sum);
//			}
//			System.out.println();
//		}
		
		
//No. 4
//		int sum = 0;
//		for (i = 1; i < 11; i++)
//		{
//			for (j = 1; j <  6; j++)
//			{
//				sum += 2;
//				System.out.print(sum + " ");
//			}
//			System.out.println();
//		}
	
	
//No. 5
//		int sum = 1;
//		for (i = 1; i < 6; i++)
//		{
//			for (j = 1; j <  6; j++)
//			{
//				System.out.print(sum + " ");
//				sum += 2;
//			}
//			System.out.println();
//		}
		
		
//No. 7	
//		for (i = 1; i < 6; i++)
//		{
//			char ch = 65;
//			for (j = 1; j < 7; j++)
//				System.out.print(ch++);
//			System.out.println();
//		}
		

//No. 8
//		for (i = 5; i >= 1; i--)
//		{
//			for (j = i; j >= 1; j--)
//				System.out.print("*");
//			System.out.println();
//		}
	
//No. 9
//		for (i = 1; i < 6; i++)
//		{
//			for (j = 1; j <= i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
		
		
		
//No. 10 (Prime Number)
//		int num;
//		boolean prime = true;
//		
//		System.out.println("Enter a number:");
//		num = sc.nextInt();
//		
//		for (i = 2; i < num; i++)
//		{
//			if (num % i == 0)
//				prime = false;
//			else
//				prime = true;
//				
//			if (!prime)
//				break;
//		}
//		
//		if (prime)
//			System.out.println("The given number is prime number.");
//		else
//			System.out.println("The given number is not a prime number.");
		
		
//No. 11 (Even Number)
//		int num;
//		
//		System.out.println("Enter a number:");
//		num = sc.nextInt();
//		
//		if (num % 2 == 0)
//			System.out.println("The given number is even number.");
//		else
//			System.out.println("The given number is not even number.");
		
		
//No. 12 (Factorial)
//		int num;
//		
//		System.out.println("Enter a number:");
//		num = sc.nextInt();
//		
//		System.out.println("The factorial of the number is:");
//		
//		for (i = num; i >= 1; i--)
//		{
//			if (i != 1)
//				System.out.print(i + "*");
//			else
//				System.out.println(i);
//		}
		
		
//No. 13 (Fibonacci Series)
//		int num, sum = 0;
//		
//		System.out.println("How many numbers do you want in Fibonacci Series:");
//		num = sc.nextInt();
//		
//		System.out.println("Fibonacci Series of " + num + " numbers:");
//		
//		int previous_num = 0, next_num = 1;
//		
//		for (i = 1; i <= num; i++)
//		{
//			System.out.println(previous_num);
//			sum = previous_num + next_num;
//			previous_num = next_num;
//			next_num = sum;
//		}
		

		
//No. 14 (Prime numbers between 1 and 100)
//		int max_num = 100;
//		
//		System.out.println("The prime numbers between 1 to " + max_num + " are:");
//		for (i = 2; i <= max_num; i++)
//		{
//			boolean prime = true;
//			for (j = 2; j < i; j++)
//			{
//				if (i % j == 0)
//					prime = false;
//				else
//					prime = true;
//				
//				if (!prime)
//					break;
//			}
//			if (prime)
//				System.out.print(i + " ");		
//		}
		
		
		
//No. 15 (Even numbers between 1 and 100)
//		System.out.println("Even numbers between 1 and 100 excluding 0 are:");
//		
//		for (i = 1; i <= 100; i++)
//		{
//			if (i % 2 == 0)
//				System.out.print(i + " ");
//		}
		
	}	
}
