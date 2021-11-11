<<<<<<< HEAD
import java.util.Scanner;

public class Dosa {

	int numbers, price, choice;
	Scanner sc = new Scanner(System.in);

	int mutton = 6, moong_dal = 5, paper = 4, masala = 5;

	int numberofDosa() {
		int number;
		System.out.println("How many dosas do you want?");
		number = sc.nextInt();

		return number;
	}

	void dosa(int dosa_type, int numbers) {
		price = dosa_type * numbers;
		WholeMenu.total_bill += price;
		System.out.println("Thank you for ordering " + numbers + " dosas.");
		System.out.println("Cost: $" + price);
	}

	void DosaMenu() {
		System.out.println();
		System.out.println("1. Mutton Dosa");
		System.out.println("2. Moong Dal Dosa");
		System.out.println("3. Paper Dosa");
		System.out.println("4. Masala Dosa");
		System.out.println("5. Back");

		System.out.println("What kind of dosa would you like?");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			numbers = numberofDosa();
			dosa(mutton, numbers);
			WholeMenu.displayCartAmount();
			
			DosaMenu();
			break;
		case 2:
			numbers = numberofDosa();
			dosa(moong_dal, numbers);
			WholeMenu.displayCartAmount();

			DosaMenu();
			break;
		case 3:
			numbers = numberofDosa();
			dosa(paper, numbers);
			WholeMenu.displayCartAmount();
			
			DosaMenu();
			break;
		case 4:
			numbers = numberofDosa();
			dosa(masala, numbers);
			WholeMenu.displayCartAmount();
			
			DosaMenu();
			break;
		case 5:
			WholeMenu.main(null);
			break;
		default:
			System.out.println("Please enter 1-5");
		}
	}
}
=======
import java.util.Scanner;

public class Dosa {

	int numbers, price, choice;
	Scanner sc = new Scanner(System.in);

	int mutton = 6, moong_dal = 5, paper = 4, masala = 5;

	int numberofDosa() {
		int number;
		System.out.println("How many dosas do you want?");
		number = sc.nextInt();

		return number;
	}

	void dosa(int dosa_type, int numbers) {
		price = dosa_type * numbers;
		WholeMenu.total_bill += price;
		System.out.println("Thank you for ordering " + numbers + " dosas.");
		System.out.println("Cost: $" + price);
	}

	void DosaMenu() {
		System.out.println();
		System.out.println("1. Mutton Dosa");
		System.out.println("2. Moong Dal Dosa");
		System.out.println("3. Paper Dosa");
		System.out.println("4. Masala Dosa");
		System.out.println("5. Back");

		System.out.println("What kind of dosa would you like?");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			numbers = numberofDosa();
			dosa(mutton, numbers);
			WholeMenu.displayCartAmount();
			
			DosaMenu();
			break;
		case 2:
			numbers = numberofDosa();
			dosa(moong_dal, numbers);
			WholeMenu.displayCartAmount();

			DosaMenu();
			break;
		case 3:
			numbers = numberofDosa();
			dosa(paper, numbers);
			WholeMenu.displayCartAmount();
			
			DosaMenu();
			break;
		case 4:
			numbers = numberofDosa();
			dosa(masala, numbers);
			WholeMenu.displayCartAmount();
			
			DosaMenu();
			break;
		case 5:
			WholeMenu.main(null);
			break;
		default:
			System.out.println("Please enter 1-5");
		}
	}
}
>>>>>>> df5db52678e76e4177276a6b65cd98f0ce4b31f8
