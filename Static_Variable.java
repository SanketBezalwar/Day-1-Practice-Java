
public class Static_Variable {
	static int a = 10;
	static int b;
	static int c;

	public static void main(String[] args) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

	static {
		System.out.println("Running static block");
		b = a + 5;
		c = b + 5;
	}

}
