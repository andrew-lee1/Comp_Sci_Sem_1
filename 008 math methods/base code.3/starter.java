import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double c = Math.max (x,y);
		System.out.println(c);
		double d = Math.sqrt (y);
		System.out.println(d);
		double e = Math.pow (x,y);
		System.out.println(e);
	}
}
