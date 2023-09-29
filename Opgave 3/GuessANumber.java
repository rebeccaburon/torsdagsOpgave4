import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){

		// Create a Scanner object   
        Scanner scanner = new Scanner(System.in);	 
    
        // Read user input
        if (scanner.hasNextInt()){
            int input = scanner.nextInt();

        //   Compare it with the random number
            if (input == rnd_number){
                System.out.println("You guessed correct, good for you");

            } else if (input < rnd_number){
                System.out.println ("You guessed too low."); 
                

            } else if (input > rnd_number) {
                System.out.println ("You guessed too high.");
                
            // Call the method recursively
                makeAGuess(); 
                
            } else{
                System.out.println ("Erro, this is not a number value");
                
            // Consume the invalid input
                scanner.next();
            
            // Call the method recursively
            makeAGuess();

            }

    }
 
}
}
