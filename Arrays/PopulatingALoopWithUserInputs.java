import java.util.Scanner;

public class PopulatingALoopWithUserInputs {

	public static void main(String [] args) {
		/* Declare an instance of the Scanner class so that I can 
		get input from the command window. */
		Scanner input = new Scanner(System.in);
		/* Prompt the user */
		System.out.print("How many names do you want in the array? ");
		/* Get the size from the user */
		int size = input.nextInt(); 
		
		System.out.println("The size of the array will be " + size); 
		
		/* Sets up a String array in memory with the size that the
		user wants */
		String [] names = new String[size]; 
		/* If the user entered 5 for the size of the array, here is how
		 * the array will look in memory. N.B. null is the default value 
		 * for a String. 
		 * 
		 * 		names--> [null][null][null][null][null]
		 */		
		/* Loops through the array and populates  */
		for (int i = 0; i < names.length; i++) {
			/* Prompt */
			System.out.print("Please enter a name: ");
			/* Reads in a String from the user and stores it in 'name' */
			String name = input.next();
			/* Populates an element in the array with the name entered
			by the user */
			names[i] = name;
		}
			
		System.out.println("*** Contents of the array ***");
		/* A loop to print the contents of the String array called names*/
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
/** OUTPUT
How many names do you want in the array? 5
The size of the array will be 5
Please enter name: John
Please enter name: Mary
Please enter name: Fred
Please enter name: Pat
Please enter name: Stephen
*** Contents of the array ***
John
Mary
Fred
Pat
Stephen
*/