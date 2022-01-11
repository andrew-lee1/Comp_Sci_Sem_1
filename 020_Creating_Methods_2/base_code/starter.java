import java.util.Scanner;
import java.util.Random;

class starter {

	public static int pow(int a,int b){
	Math.pow(a,b);
	return a;
		
	}
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Give 2 numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	double c = Math.pow(a,b);
	System.out.println(c);
	
		
	}
}
