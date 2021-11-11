import java.util.Scanner;

public class A2Q2 {

	public static void main(String[] args) {
		double celsius, fahrenheit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter degree in Celsius:");
		celsius = sc.nextDouble();

		fahrenheit = (9.0/5) * celsius + 32;
		System.out.println("Degree in Fahrenheit: " + fahrenheit + " Fahrenheit");
		sc.close();
	}

}
