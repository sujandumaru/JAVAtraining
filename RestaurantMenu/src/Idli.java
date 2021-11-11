
import java.util.Scanner;

public class Idli {

	Scanner sc = new Scanner(System.in);
	int rice = 5, carrot = 5, masala = 6;
	int choice, numbers, price;

	int numberofIdli() {
		int number;
		System.out.println("How many idlis do you want?");
		number = sc.nextInt();

		return number;
	}

	void idli(int idli_type, int numbers) {
		price = idli_type * numbers;
		WholeMenu.total_bill += price;
		System.out.println("Thank you for ordering " + numbers + " idlis.");
		System.out.println("Cost: $" + price);
	}

	void IdliMenu() {
		System.out.println();
		System.out.println("1. Rice Idli");
		System.out.println("2. Carrot Idli");
		System.out.println("3. Masala Idli");
		System.out.println("4. Back");

		System.out.println("Please enter your choice:");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			numbers = numberofIdli();
			idli(rice, numbers);
			WholeMenu.displayCartAmount();

			IdliMenu();
			break;
			
		case 2:
			numbers = numberofIdli();
			idli(carrot, numbers);
			WholeMenu.displayCartAmount();

			IdliMenu();
			break;

		case 3:
			numbers = numberofIdli();
			idli(masala, numbers);
			WholeMenu.displayCartAmount();

			IdliMenu();
			break;
			
		case 4:
			WholeMenu.main(null);
			break;

		default:
			System.out.println("Please enter 1-4.");
		}
	}
}

