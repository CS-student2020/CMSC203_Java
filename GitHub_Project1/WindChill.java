import java.util.Scanner; // Needed for the Scanner class to receive input from user

//Create a WindChill Class
public class WindChill
{
	public static void main(String[] args)
	{
		// Constant for keeping Programmer's name
		final String ProgrammerName = "Mona Aghaaligol";
		
		// Constant Deceleration to hold constant numbers of Wind Chill Temperature Formula
		final double CONST1 = 35.74;
		final double CONST2 = 0.6215;
		final double CONST3 = 35.75;
		final double CONST4 = 0.4275;
		
		// Variables Definition
		double tempInFahrenheit;	// Holds Temperature in Fahrenheit
		double windSpeed; 			// Holds the wind speed
		double windChillTemp;       // Holds final Wind Chill Temperature
		
		// Create a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		
		// Print title
		System.out.println("Wind Chill Calculator\n");
		
		// Get the temperature in Fahrenheit
		System.out.print("Enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
		tempInFahrenheit = keyboard.nextDouble();
		
		// Check that temperature is between -45 and 40
		while (tempInFahrenheit < -45 || tempInFahrenheit > 40)
		{	
			System.out.println("The tempetrature should be between 45 and 40. Try again!");
			
			// Get the temperature in Fahrenheit
			System.out.print("Enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
			tempInFahrenheit = keyboard.nextDouble();
		}
		
		// Get the wind speed
		System.out.print("Enter the wind speed (must be >= 5 and <= 60): ");
		windSpeed = keyboard.nextDouble();
		
		// Check that wind speed is between 5 and 60
		while (windSpeed < 5 || windSpeed > 60)
		{	
			System.out.println("The wind speed should be between 5 and 60. Try again!");
			
			// Get the wind speed
			System.out.print("Enter the wind speed (must be >= 5 and <= 60): ");
			windSpeed = keyboard.nextDouble();
		}
		
		// Calculate the Wind Chill Temperature
		windChillTemp = CONST1 + (CONST2 * tempInFahrenheit) - (CONST3 * Math.pow( windSpeed, 0.16)) + (CONST4 * tempInFahrenheit * Math.pow( windSpeed, 0.16));
		
		
		// Display the Wind Chill Temperature
		System.out.println("\nWind chill temperature: " + windChillTemp + " degrees Fahrenheit");

		// Display Programmer's name
		System.out.println("\nProgrammer : " + ProgrammerName);
		
	}


}
