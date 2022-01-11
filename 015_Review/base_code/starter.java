import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title");
		String title = sc.nextLine();
		System.out.println("Choose a Wizard, Warrior, or a Rogue");
		String role = sc.nextLine();
		String re = ("Wizard");
		String ra = ("wizard");
		String rb = ("Warrior");
		String rw = ("warrior");
		String rz = ("rogue");
		String rd = ("Rogue");
		boolean g = (role.equals(re));
		boolean j = (role.equals(ra));
		boolean k = (role.equals(rw));
		boolean l = (role.equals(rz));
		boolean h = (role.equals(rb));
		boolean i = (role.equals(rd));
		if(g)
		{System.out.println(role);
	}
	else if(h)
		{System.out.println(role);
	}
	else if(i)
		{System.out.println(role);
	}
	else if (j)
	{System.out.println(role);
	}
	else if (k)
	{System.out.println(role);
	}
	else if (l)
	{System.out.println(role);
	}
	else
		{System.out.println("You have decided not to choose a role. Rerun program");
	}
		System.out.println("You have 25 points to spend on: Strength, Dexterity, Intelligence, Constitution, Charisma");
		System.out.println("Strength(1-10)");
		int Strength = sc.nextInt();
		boolean b = (Strength>0);
		if(b)
		{System.out.println("Choose a smaller number");
	}
		System.out.print("You have ");
		System.out.println(25 - Strength);
		System.out.println("Dexterity(1-10)");
		int Dexterity = sc.nextInt();
		boolean c = (Dexterity>0);
		if(c)	
		{System.out.println("Choose a smaller number");
	}
		System.out.print("You have ");
		System.out.println(25 - Strength - Dexterity);
		System.out.println("Intelligence(1-10)");
		int Intelligence= sc.nextInt();
		boolean d = (Intelligence>0);
		if(d)
		{System.out.println("Choose a smaller number");
	}
		System.out.print("You have ");
		System.out.println(25 - Strength - Dexterity - Intelligence);
		System.out.println("Constitution(1-10)");
		int Constitution = sc.nextInt();
		boolean e = (Constitution>0);
		if(e)
		{System.out.println("Choose a smaller number");
	}
		System.out.print("You have ");
		System.out.println(25 - Strength - Dexterity - Intelligence - Constitution);
		System.out.println("Charisma(1-10)");
		int Charisma = sc.nextInt();
		boolean f = (Charisma>0);
		if(f)
		{System.out.println("Choose a smaller number");
	}
		System.out.print("You have ");
		System.out.println(25 - Strength - Dexterity - Intelligence - Constitution - Charisma);
		int result = 25 - Strength - Dexterity - Intelligence - Constitution - Charisma;
		boolean a = (result >= 0);

		if(a)	
		{System.out.print("You are ");
		System.out.println(name);
		System.out.println(role);
		System.out.println(title);
		System.out.print("Strength = ");
		System.out.println(Strength);
		System.out.print("Dexterity = ");
		System.out.println(Dexterity);
		System.out.print("Intelligence = ");
		System.out.println(Intelligence);
		System.out.print("Constitution = ");
		System.out.println(Constitution);
		System.out.print("Charisma = ");
		System.out.println(Charisma);
	}
		else 
		{System.out.println("Keep the points under 25");
			
	}
}
}