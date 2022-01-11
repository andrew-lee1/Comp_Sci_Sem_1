import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Do you want to play(Yes/yes/y) (No/no/n)");
		String ans = sc.nextLine();
		String a = ("Yes");
		String b = ("yes");
		String c = ("y");
		String d = ("No");
		String e = ("no");
		String f = ("n");
		boolean g = (ans.equals(a));
		boolean h = (ans.equals(b));
		boolean i = (ans.equals(c));
		boolean j = (ans.equals(d));
		boolean k = (ans.equals(e));
		boolean l = (ans.equals(f));
		if(g)
		{System.out.println("You have 100 dollars. Give an amount you would like to spend");
	}
	else if(h)
		{System.out.println("You have 100 dollars. Give an amount you would like to spend");
	}
	else if(i)
		{System.out.println("You have 100 dollars. Give an amount you would like to spend");
	}
	else if (j)
	{System.out.println("You have 100 dollars. Give an amount you would like to spend");
	}
	else if (k)
	{System.out.println("You have 100 dollars. Give an amount you would like to spend");
	}
	else if (l)
	{System.out.println("You have 100 dollars. Give an amount you would like to spend");
	}
	else
		{System.out.println("Sad to see you go. Come back soon!");
	}
	int amount = sc.nextInt();
	int starting = 100;
	int rand_num1 = rand.nextInt(11);
	int rand_num2 = rand.nextInt(11);
	int rand_num3 = rand.nextInt(11);
	
	if(amount>100){
		System.out.println("Choose a smaller number");
	}
	else{
		System.out.print(rand_num1 + "   |   ");
		System.out.print(rand_num2 + "   |   ");
		System.out.println(rand_num3);
	}
	if(rand_num1 == rand_num2){
		amount*2
		starting + amount;
	}
	else if(rand_num1 == rand_num3)
	{	amount *2;
		starting + amount;
	}
	else if(rand_num2 == rand_num3)
	{	amount *2;
	starting + amount;
	}	
	else if(rand_num1 == rand_num3 == rand_num2)
	{	amount *3;
	starting + amount;
	}
	else(){
		starting - amount;
	}
	int left = starting - amount;
		while(true){
		starting - amount;
		int rand_num1 = rand.nextInt(11);
	int rand_num2 = rand.nextInt(11);
	int rand_num3 = rand.nextInt(11);
	if(left <= 0){
		System.out.println("You have no money left. Come again soon!");
		break;
	}
		}
		
		
		
		
		
		
}
}