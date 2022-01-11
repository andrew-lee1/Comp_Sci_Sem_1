import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String text = sc.nextLine();
		System.out.println("What is your age?");
		int number = sc.nextInt();
		System.out.println("What month were you born?");
		int num = sc.nextInt();
		System.out.println("What day were you born?");
		int nu = sc.nextInt();
		System.out.println("What year were you born?");
		int year = sc.nextInt();
		System.out.println("How much is a buck fifty?");
		double amount = sc.nextDouble();
		System.out.print("Your name is ");
		System.out.print(text);
		System.out.print(" and you were born on ");
		System.out.print(num);
		System.out.print("/");
		System.out.print(nu);
		System.out.print("/");
		System.out.print(year);
		System.out.println(".");
		System.out.print("You are ");
		System.out.print(number);
		System.out.println(" years old!!!");
		System.out.print("You have $");
		System.out.print(amount);
		System.out.print(" in you wallet.");
	}
}
