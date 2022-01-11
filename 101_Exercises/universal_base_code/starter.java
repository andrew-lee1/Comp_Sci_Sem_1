import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner();
		System.out.println("Pick a type");
		String type = sc.nextLine();
		System.out.println("Pick a name");
		String name = sc.nextLine();
		System.out.println("Pick a number");
		int num = sc.nextLine();
		Ascii Test = new Ascii();
		Ascii Testa = new Ascii(type, name);
		Ascii Testb = new Ascii(type, num);
		Ascii Testc = new Ascii(type, name, num);
		setType(Type);
		setName(name);
		setNumber(num);
		printArt();
		
		
	}
}
