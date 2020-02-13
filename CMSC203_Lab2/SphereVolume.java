import java.util.Scanner; // Needed for the Scanner class to receive input from user

public class SphereVolume {

	public static void main(String[] args) {
	
		// Declare three variables of double type
		double diam, radius, volume; 
		
		// Create a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		
		// Show message and Get the diameter value
		System.out.print("Enter the diameter value: ");
	    diam = keyboard.nextDouble();
	    
	    // Calculate radius value
	    radius = diam/2.0 ;
	    
	    // Calculate the volume of the sphere
	    volume = (4.0/3) * Math.PI * Math.pow(radius, 3);
	    
        // Show message and the value of the sphere's volume
	    System.out.print("The volume of sphere is: " + volume);
	    
	    
		

	}

}
