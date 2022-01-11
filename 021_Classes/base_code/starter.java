import java.util.Scanner;
import java.util.Random;
Cat
class Character{
	String role = new String("Wizard");
	int Strength = 5;
	int Dexterity = 5;
	int Intelligence = 5;
	int Constitution = 5;
	int Charisma = 5;
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Character mychar = new Character();
	System.out.println("Your role is a " + mychar.role);
	System.out.println("Your Strength trait is " + mychar.Strength);
	System.out.println("Your Dexterity trait is " + mychar.Dexterity);
	System.out.println("Your Intelligence trait is " + mychar.Intelligence);
	System.out.println("Your Constitution trait is " + mychar.Constitution);
	System.out.println("Your Charisma trait is " + mychar.Charisma);
	


		
	}
}
