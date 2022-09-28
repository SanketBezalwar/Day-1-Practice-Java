import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Year : ");
		year = sc.nextInt();

		boolean x = (year % 4) == 0;
		boolean y = (year % 100) != 0;
		boolean z = ((year % 100 == 0) && (year % 400 == 0));

		if (x && (y || z)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}
}
