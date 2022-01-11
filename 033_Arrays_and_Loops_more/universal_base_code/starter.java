import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int[] num = new int[201];
		int min = 2;
		int max = 99;
		int c =0;
		while(c < num.length)
		{
		num[c] = rand.nextInt(100)+1;
		c = c + 1;
		}
		c = 0;
		System.out.println();
		while(c < num.length)
		{
		if(num[c] < min)	
		{
		min = num[c];
		}
		c = c + 1;
		}
		System.out.println("min = " + min);
		while(c < num.length){
			if(num[c] > max){
				max = num[c];
			}
			c = c + 1;
		}
		System.out.println("max = " + max);
		int sum = 0;
		while(c<num.length){
			if(num[c] < min){
				sum=sum+num[c];
			}
			c = c + 1;
		}
	System.out.println("average = " + sum/201);


		
	}
}
