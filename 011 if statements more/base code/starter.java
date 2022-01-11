import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("give 2 numbers");
		int num = sc.nextInt();
		int Num = sc.nextInt();
		boolean c= num != Num;
		if(c)
		{System.out.println("The 2 numbers are not equal");
			
		}
	}
}
