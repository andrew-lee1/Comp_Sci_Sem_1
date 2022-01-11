import pkg.*;
import java.util.Scanner;
import java.util.Random;



class starter {
	public static String setrole(String a);
	String t = ("Wizard");
		String s = ("Warrior");
		String u = ("Rogue");
		boolean v = (role.equals(t));
		boolean w = (role.equals(s));
		boolean x = (role.equals(u));
		if(v)
		{System.out.println(role);
	}
	else if(w)
		{System.out.println(role);
}
	else if(x)
		{System.out.println(role);
}
	else
		{System.out.println("wrong");
}
	public static int setStrength(int b);
	public static int setDexterity(int c);
	public static int setIntelligence(int d);
	public static int setConstitution(int e);
	public static int setCharisma(int f);
	public static boolean setAll(String a, int b, int c, int d, int e, int f);
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

Scanner sc = new Scanner(System.in);
		System.out.println("Choose a Wizard, Warrior, or a Rogue");
		String role = sc.nextLine();

	}
}
