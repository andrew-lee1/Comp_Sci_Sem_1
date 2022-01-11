import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a Wizard, Warrior, or a Rogue");
		String role = sc.nextLine();
		String a = ("Wizard");
		String b = ("Warrior");
		String c = ("Rogue");
		boolean d = (role.equals(a));
		boolean e = (role.equals(b));
		boolean f = (role.equals(c));
		if(d)
		{System.out.println(role);
	}
	else if(e)
		{System.out.println(role);
}
	else if(f)
		{System.out.println(role);
}
	else
		{System.out.println("wrong");
}
}
}