
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[] arnold;
		int count;
		arnold = new int[20];
		count = 0;
		while(count < arnold.length)
		{
		arnold[count] = rand.nextInt(10)+1;
		count ++;
		System.out.println(arnold);
		}

		
}
}
