import java.util.Scanner;

class starter {
		public static String multdiv3(int a, int b){
			int x = a;
			int y = b;
			int product = x * y;
		if(product % 3 == 0){
			return "The product is divisible by 3";
		}
		else{
			return "The product is not divisible by 3";
		}
		}
		public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give 2 integers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(multdiv3(a,b));
}
}