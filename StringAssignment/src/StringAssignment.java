import java.util.Scanner;

public class StringAssignment {

	// Program to remove all white spaces from a string
	void Q1(String str) {
		str = str.replace(" ", "");
		System.out.println(str);
	}

	// Program to replace lower-case characters with upper-case characters
	void Q2_1(String str) {
		str = str.toUpperCase();
		System.out.println(str);
	}

	// Program to replace upper-case characters with lower-case characters
	void Q2_2(String str) {
		str = str.toLowerCase();
		System.out.println(str);
	}

	// Program to replace the spaces of a string with a specific character
	void Q3(String str) {
		Scanner scan = new Scanner(System.in);
		char specChar;
		System.out.print("Enter a character to replace the spaces with: ");
		specChar = scan.next().charAt(0);
		str = str.replace(" ", String.valueOf(specChar));
		System.out.println(str);
		scan.close();
	}

	// Program to count the total number of characters in a string
	void Q4(String str) {
		int count = str.length();
		System.out.println("Total number of characters: " + count);
	}

	// Program to determine whether a given string is palindrome
	void Q5(String str) {
		str = str.replace(" ", "");
		char ch[] = str.toCharArray();
		boolean palindrome = false;
		int limit = str.length() / 2;
		for (int i = 0; i < limit; i++) {
			if (ch[0 + i] == ch[str.length() - 1 - i])
				palindrome = true;
			else {
				palindrome = false;
				break;
			}
		}

		if (palindrome)
			System.out.println("The given string is a palindrome.");
		else
			System.out.println("The given string is not a palindrome.");
	}

	// Program to find maximum and minimum occurring character in a string
	void Q6(String str) {
		int count[] = new int[str.length()];
		char ch[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++)
			count[i] = 1;

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (ch[i] == ch[j]) {
					count[i] = 0;
					count[j]++;
					break;
				}
			}
		}

		int max = -1;
		int min = 100;

		for (int k = 0; k < str.length(); k++) {
			if (max < count[k])
				max = count[k];
			if (min > count[k] && count[k] != 0)
				min = count[k];
		}
		System.out.println("Maximum occuring characters: ");
		for (int i = 0; i < str.length(); i++) {
			if (count[i] == max)
				System.out.println(str.charAt(i));
		}

		System.out.println("Minimum occuring characters: ");
		for (int i = 0; i < str.length(); i++) {
			if (count[i] == min)
				System.out.println(str.charAt(i));
		}
	}

	// Program to find the reverse of a string
	void Q7(String str) {
		char ch[] = new char[str.length()];
		char charinString[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			ch[i] = charinString[str.length() - 1 - i];
		}
		str = String.copyValueOf(ch);
		System.out.println(str);
	}

	// Program to find the duplicate characters in a string
	void Q8(String str) {
		char ch[] = str.toCharArray();
		char duplicateChar[] = new char[str.length()];
		int index = 0;

		for (int i = 0; i < str.length(); i++)
			duplicateChar[i] = ' ';
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < i; j++) {
				boolean found = false;
				if (ch[j] == ch[i]) {
					for (int k = 0; k < str.length(); k++) {
						if (ch[i] == duplicateChar[k]) {
							found = true;
							break;
						}
					}
					if (!found)
						duplicateChar[index++] = ch[i];
				}
			}
		}
		System.out.println("Duplicate characters: ");
		if (duplicateChar[0] == ' ')
			System.out.println("No duplicate characters.");
		else
		{
			str = String.copyValueOf(duplicateChar);
			for (int i = 0; i < str.length(); i++)
			{
				if (duplicateChar[i] != ' ')
					System.out.println(duplicateChar[i]);
			}
		}
	}

	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		StringAssignment str = new StringAssignment();

		System.out.println("Enter your string: ");
		input = sc.nextLine();

		str.Q8(input);
		sc.close();
	}

}
