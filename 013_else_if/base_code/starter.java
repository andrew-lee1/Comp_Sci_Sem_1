import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a random number between 1 and 1000");
		int num = sc.nextInt();
		boolean a = num == 500;
		boolean b = num > 500;
		boolean c = num < 500;
		if(a)
		{System.out.println("that is the equal to the number");
	}
		else if(b)
		{System.out.println("the number is bigger");
	
	} 
		else
		{System.out.println("the number is smaller");
	}
}
}