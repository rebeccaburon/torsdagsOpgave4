import java.util.ArrayList;
import.java.util.Scanner;
class GameMenu {
	ArrayList <String> actions = new Arraylist<String>();

	public GameMenu (Arraylist<String> actions) {

		this.actions = actions; 
	}

	public void displayMenu () {
	
	for (String s : actions ) {
		System.outprintln (s);
	}
}

public String getAction () {

	System.out.println ("Type a number to choose an action");
	displayMenu ();

	Scanner scanner = new Scanner (System.in);
	String choice = scanner.nextLine();

	return choice;


}

}
