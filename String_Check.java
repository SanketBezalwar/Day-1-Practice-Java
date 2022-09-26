import java.util.Scanner;

public class String_Check {

	public static void main(String[] args) {

		String str1, str2;
		Scanner sc = new Scanner(System.in);

		// read first string
		System.out.println("Enter the First string");
		str1 = sc.nextLine();

		// read second string
		System.out.println("Enter the Second string");
		str2 = sc.nextLine();

		if (str1.equals(str2))
			System.out.print("The two strings are equal");
		else
			System.out.print("The two strings are not equal");
	}

}
