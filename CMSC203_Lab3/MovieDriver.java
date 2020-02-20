import java.util.Scanner; //Needed for the Scanner class

public class MovieDriver {

	public static void main(String[] args) 
	{
		
		char flag;
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner (System.in);
		
		// Create a new Movie object
		Movie newMovieObject = new Movie();
		
        do
        {
			// Prompt the user to enter the title of a movie
			System.out.print("Enter the title of a movie: \n");
			newMovieObject.setTitle( keyboard.nextLine());
			
			// Prompt the user to enter the movie's rating
			System.out.print("Enter the movie's rating: \n");
			newMovieObject.setRating(keyboard.nextLine());
			
			// Prompt the user to enter the number of tickets sold at a theater
			System.out.print("Enter the number of tickets sold at a theater: \n");
			newMovieObject.setSoldTickets(keyboard.nextInt());
			
			// Prompt movie information that user entered
			System.out.print(newMovieObject);
			
			// Prompt message and ask user for enter another movie information
			System.out.print("\nDo you want to enter another? (y or n)\n");
			flag = keyboard.next().charAt(0);
			
			System.out.println();
			keyboard.nextLine();
			
		
        } while (flag == 'y' || flag == 'Y');
		
        // Prompt Goodbye
		System.out.print("\nGoodbye\n");
	}
}	