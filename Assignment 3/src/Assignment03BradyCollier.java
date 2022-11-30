/*
 * Student Name: Brady Collier
 * Lab Professor: Shavit Lupo
 * Due Date: December 9, 2022
 * Description: Utilizing GitHub and maintaining a version control environment
 */
public class Assignment03BradyCollier {

	// Main method
	public static void main(String[] args) {
		
		//Variables
		int roll = 0;
		int[] diceRolls = new int[10];
		int totalRolls = 0;

		// sample the rolls
		for(int count = 0; count < 1000; count++) {
		    roll = (int)(Math.random() * 10) + 1;
		    diceRolls[roll - 1] = diceRolls[roll - 1] + 1; // adjust 1-10 value to 0-9 for index
		}	
		// run a report
		for(int index = 0; index < diceRolls.length; index++) {  // crashes
		    System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
		    totalRolls = totalRolls + diceRolls[index];
		}
		// Output total rolls and author of program
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Program by Brady Collier");
	}

}
