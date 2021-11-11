import java.util.Scanner;

public class A2Q1 {
	
	public static void main(String[] args) {
		int principal, time;
		double rate, interest;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter principal: $");
		principal = sc.nextInt();

		System.out.print("Enter time in months: ");
		time = sc.nextInt();

		System.out.print("Enter rate in percentage: ");
		rate = sc.nextDouble();

		interest = (principal * time * rate) / 100;
		
		System.out.println("The required interest is: $" + Math.round(interest));
		sc.close();
	}
}
