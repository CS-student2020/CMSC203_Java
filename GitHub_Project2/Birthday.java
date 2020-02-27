import java.util.Scanner;        // Need for the Scanner class 
import javax.swing.JOptionPane;  // Need to Display dialog box
import java.util.Random;         // Need for Random class

public class Birthday 
{

	public static void main(String[] args) 
	{
		String childName; // Holds child's name
		String age;       // Holds child's age as a string
		int childAge;     // Holds child's age as an integer number
		String toyChoice; // Holds toy's choice
		String card;      // Holds if the user want card with his gift
		String balloon;   // Holds if the user want balloon with his gift 
		String anotherToy = ""; // Holds the value that user want to order another toy
		String cancelOrderFlag = "";  // Holds user's decision about his toy order again
		double totalCost = 0.0;  // Holds total cost of toys
		int randomNumber; // Holds a random number
		
		// Create a Random object
	    Random rand = new Random();
	    randomNumber = rand.nextInt((10000-1000)+1)+10000;
	    
		// Create a Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Creating a Toy object
		Toy toyObject = new Toy();
		
		// Display a message in dialog box
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company\n " +
											 "to choose gifts for young children");
			
	    System.out.println("BIRTHDAY GIFTS\n");	
		do {
			do{		
				cancelOrderFlag = "";
				// Get the child's name
				childName = JOptionPane.showInputDialog("Enter the name of child");
				
				// Get the child's age
				age = JOptionPane.showInputDialog("How old is the child?");
				
				// Convert the input age to an int.
				childAge = Integer.parseInt(age);
				toyObject.setAge(childAge);
				
				// Get the toy choice
				toyChoice = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
				
				// Check the toy choice validation
				toyObject.setToy(toyChoice);
				
				//Check the age appropriate for each toy
				if (!toyObject.ageOK())
				{	
				    // Display proper message
					cancelOrderFlag = JOptionPane.showInputDialog("Your toy is not appropriate for your child age\n"
							          + "Do you want cancel that toy ? (Yes OR No) :" );
					
					// Check if the user wants to order again
				    if (cancelOrderFlag.toLowerCase().equals("no"))
				    {
						
						// Get the toy choice
						toyChoice = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
						// Check the toy choice validation
					   toyObject.setToy(toyChoice);
				    }
				}  
			 
		     } while (cancelOrderFlag.toLowerCase().equals("yes"));
			
		
			// Calculate toy costs	
			toyObject.setCost(toyChoice);
		    //totalCost += toyObject.getCost();
				
			// Ask if user need a card with gift 
		    card = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No");	
		    if (card.toLowerCase().equals("yes"))
		    {	
		    	// Calculate total cost addition to card cost
		    	toyObject.addCard(card);
		    	//totalCost += toyObject.getCost();
		    }	
		    
		    
		    // Ask if user need a balloon with gift 
		    balloon = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No");
		    if (balloon.toLowerCase().equals("yes"))
		    {	
		    	// Calculate total cost addition to balloon cost
		    	toyObject.addBalloon(balloon);
		    	//totalCost += toyObject.getCost();
		    	
		    }	
		    
		    totalCost += toyObject.getCost();
		    
		    
		    // Ask if user wants to order another toy
		    anotherToy = JOptionPane.showInputDialog("Do you want another toy? Yes or No");
		  
		    System.out.println("The gift for " + childName + toyObject.toString() );
	    
		} while (anotherToy.toLowerCase().equals("yes"));
	    
	    System.out.println("The total cost of your order is "+ totalCost + " Order number is " + randomNumber); 

	    
	    //Display programmer Name
	    System.out.println("Programmer: Mona Aghaaligol");
	    
		System.exit(0);
	}
}
