import java.util.Scanner;

public class LoginImplementation {

	Scanner sc = new Scanner(System.in);
	static User totalUsers[] = new User[50];
	static int index = 0;

	void register() {
		int uid;
		String firstName, lastName, email, password;
		long mobileNumber;

		System.out.println("Please provide the following details:");
		System.out.print("User ID: ");
		uid = sc.nextInt();

		System.out.print("First name: ");
		firstName = sc.next();

		System.out.print("Last name: ");
		lastName = sc.next();

		System.out.print("Mobile number: ");
		mobileNumber = sc.nextLong();

		System.out.print("Email: ");
		email = sc.next();

		System.out.print("Password: ");
		password = sc.next();

		User newUser = new User(uid, firstName, lastName, email, mobileNumber, password);
		totalUsers[index++] = newUser;

		System.out.println("User Registration complete.");
		System.out.println();
	}

	boolean verifyUser(String email, String password) {
		boolean found = false;
		if (index == 0)
			System.out.println("No Users added till now.");
		for (int i = 0; i < index; i++) {
			if (totalUsers[i].getEmail().equals(email)) {
				if (totalUsers[i].getPassword().equals(password)) {
					found = true;
					break;
				} else {
					System.out.println("Wrong password.");
					found = false;
				}
			} else
				found = false;
		}

		return found;
	}

	void changePassword(String email) {
		String pw;
		boolean found = false;
		if (index == 0)
			System.out.println("No Users available.");

		System.out.println();
		for (int i = 0; i < index; i++) {
			if (totalUsers[i].getEmail().equals(email)) {
				System.out.println("Enter your new password: ");
				pw = sc.next();
				totalUsers[i].setPassword(pw);
				System.out.println("Password changed successfully.");
				found = true;
				break;
			} else
				found = false;
		}

		if (!found)
			System.out.println("Couldn't find the email. Please register first.");

		System.out.println();
	}
}
