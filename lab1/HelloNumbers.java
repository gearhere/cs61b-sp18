public class HelloNumbers {
	public static void main(String[] args) {
		// Exercise 1.1.2.
		int x = 1;
		int result = 0;
		while (x <= 10) {
			System.out.print(result + " ");
			result += x;
			x += 1;
		}
		System.out.print("\n" + " ");
	}
}