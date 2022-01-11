import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand_num1 = rand.nextInt(10);
		System.out.println(rand_num1);
		int rand_num2 = rand.nextInt(101);
		rand_num2 = rand_num2 + 1;
		System.out.println(rand_num2);
		double rand_num3 = rand.nextDouble();
		rand_num3 = rand_num3 + 2.5;
		System.out.println(rand_num3);
		double rand_num4 = rand.nextDouble();
		rand_num4 = rand_num4 * 575 + 14;
		System.out.println(rand_num4);

		
		
	}
}
java class file contains byte code or binary
compile translate
run interpret
write source code in starter.java
starter.class is binary or byte code computer understands
