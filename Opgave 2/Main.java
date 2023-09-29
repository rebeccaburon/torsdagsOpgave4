import java.util.Scanner;

public class Main{


public static void main (String[] args) {
	
	String name;
	int age;

	Scanner scanner = new Scanner (System.in);

	System.out.println ("Please type your name");
	name = scanner.nextLine ();
	
	System.out.println ("Please type your age");
	String ageStr = scanner.nextLine ();
	int i = Integer.parseInt (ageStr);
	
	int retirementAge = 69;

	int yearsUntilRetirement = retirementAge - i;

	if (yearsUntilRetirement <= 0 ){
		System.out.println ("Wuhu " + name + " ,you are retired, have fun!");

	} else {
		System.out.println ( name + ", you will retire in " + yearsUntilRetirement + " years. It will be great ");
	}

}
}