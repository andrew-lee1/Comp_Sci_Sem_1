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
	public static void myToString(){
		System.out.println(role);
		System.out.println(Strength);
		System.out.println(Dexterity);
		System.out.println(Intelligence);
		System.out.println(Constitution);
		System.out.println(Charisma);
	}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println(myToString);

		
	}
}
}