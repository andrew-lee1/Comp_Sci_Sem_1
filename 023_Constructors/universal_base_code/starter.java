import pkg.*;
import java.util.Scanner;
import java.util.Random;


class myCharacter {
	String role;
	public myCharacter(){
		role=("no role");
	}
	public myCharacter(String role){
		role = "Wizard";
	}
	public myCharacter(int Strength){
		Strength = 0;
}
	public myCharacter(int Dexterity){
		Dexterity= 0;
}
	public myCharacter(int Intelligence){
		Intelligence= 0;
}
	public myCharacter(int Constitution){
		Constitution= 0;
}	
	public myCharacter(int Charisma){
		Charisma= 0;
}
class starter {
	public void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
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
}