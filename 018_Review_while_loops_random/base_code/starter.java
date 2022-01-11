import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("Guess a random number between 1 and 1000");
	int guess = sc.nextInt();
	int secret = rand.nextInt(1001);
	
	while(guess != secret)
	{
	if(guess<secret)
	{
		System.out.println("Choose a higher number");
		System.out.println("Guess a random number between 1 and 1000");
		guess = sc.nextInt();
	break;
	}
	if(guess>secret)
	{
		System.out.println("Choose a lower number");
		System.out.println("Guess a random number between 1 and 1000");
		guess = sc.nextInt();
	break;
	}
	if(guess==secret)		
	{
		System.out.println("You got the number!");
	break;

		
	}
}
}
}