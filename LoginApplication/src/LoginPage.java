import java.util.Scanner;

public class LoginPage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		LoginImplementation login= new LoginImplementation();
		while (true)
		{
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Help");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			System.out.println();
			switch(choice)
			{
			case 1:	
				login.register();
				break;
			case 2:
				String email, password;
				boolean success;
				
				System.out.println("Enter your email:");
				email = sc.next();
				
				System.out.println("Enter your password:");
				password = sc.next();
				
				success = login.verifyUser(email, password);
				
				if (success)
					System.out.println("Login successful");
				else
					System.out.println("Login error.");
				System.out.println();
				break;
			case 3:
				System.out.println("Coming soon.");
				break;
			case 4:
				System.out.println("Thank you for using the application. See you next time.");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Please enter the valid choice.");
				break;
			}		
		}	
	}
}
