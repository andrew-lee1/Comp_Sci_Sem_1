import java.util.Scanner;
import java.util.Random;

class starter {
	public static void String(String a, String b){
		String x = a;
		String y = b;
		String sum = a + b;
		System.out.println(x + "+" + y + "+=" + sum);
		return;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me sentence");
		String x = sc.nextLine();
		System.out.println("Give me another sentence");
		String y = sc.nextLine();
		System.out.println("This is using the methods!");
		System.out.println(x);
		System.out.print(x + " ");
		System.out.println(y);



		
	}
}
