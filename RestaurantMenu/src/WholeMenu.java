
import java.util.Scanner;

public class WholeMenu {
	
	static int total_bill;
	
	static void displayCartAmount() {
		System.out.println("Total Cart Cost: $" + total_bill);
	}
	
	public static void main(String[] args) {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------");
		System.out.println("Welcome to the Restaurant");
		
		while (true)
		{
			System.out.println("-------------------------");
			System.out.println("1. Dosa");
			System.out.println("2. Idli");
			System.out.println("3. Upma");
			System.out.println("4. Puri");
			System.out.println("5. Bill");
			System.out.println("6. Exit");
			System.out.println("-------------------------");

			System.out.println("Enter the number you want to choose:");
			choice = sc.nextInt();
			
			switch (choice)
			{
			case 1:
				Dosa submenu_Dosa = new Dosa();
				submenu_Dosa.DosaMenu();
				break;
			
			case 2:
				Idli submenu_Idli = new Idli();
				submenu_Idli.IdliMenu();
				break;
			
			case 3:
				System.out.println("We are all out. Sorry");
				break;
				
			case 4:
				System.out.println("We are all out. Sorry");
				break;
				
			case 5:
				displayCartAmount();
				break;
				
			case 6:
				System.out.println("Thank you for using our application.");
				sc.close();
				System.exit(0);
			
			default:
				System.out.println("Please choose 1-5. Thank you.");
			
			}
		}	
	}
}

