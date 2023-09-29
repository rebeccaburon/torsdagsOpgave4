import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main (String[] args) {

		ArrayList<String> actions = new ArrayList<String>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		GameMenu gameMenu = new GameMenu (actions);
		gameMenu.displayMenu();

		String userChoice = gameMenu.getAction();
		int choice = Integer.parseInt(userChoice);
		doAction(choice);


	}
	public static void doAction(int action) {

		switch (action) {
		case 1: 
			System.out.println ("Starrting the game now");
			break;

		case 2: 
			System.out.println ("Fetching previously saved game data");
			break;

		case 3: 
			System.out.println ("Game paused");
			break;
		case 4: 
			System.out.println (" Ending game");
			break;

		default: 
			System.out.println("Invalid choice");
		}
	}
}
class GameMenu {
	private ArrayList<String> actions;

	public GameMenu (ArrayList<String> actions) {

		this.actions = actions; 
	}

	public void displayMenu () {
	System.out.println ("Menu: ");

	for (String item : actions ) {
		System.out.println (item);
	}
}

public String getAction () {

	System.out.println ("Type a number to choose an action");
	displayMenu();

	Scanner scanner = new Scanner (System.in);
	String choice = scanner.nextLine();

	return choice;


}

}