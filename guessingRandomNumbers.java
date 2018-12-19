import java.util.Scanner

public class guessingRandomNumber {
	public static void main(String[] args) {
		String name;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter your name: ");
		name = keyboard.nextLine();

		System.out.println("Hello, " + name + "!");
	}
}

