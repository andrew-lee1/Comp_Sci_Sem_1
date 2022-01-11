import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int[] arnold;
		int count;
		arnold = new int[1000];
		count = 0;
		while(count < arnold.length)
		{
		int randnum_1 = rand.nextInt();
		arnold[count] = randnum_1;
		count = count +1;
		}
		While(count==arnold.length);{
			System.out.println(arnold);
		}
}
}
