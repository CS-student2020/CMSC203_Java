
public class HolidayBonus 
{	
	// Create an empty constructor
	public HolidayBonus()
	{
		
	}
	
	public static double[] calculateHolidayBonus(double[][] data, 
			double high, double low, double other)
	{
		
		// The holiday bonuses for each of the stores in the district stores in this array
		double[] bonuses = new double[data.length];
		
		for(int i=0; i < 10; i++)
		{
			
			// Find the highest amount of sales
			double highest = TwoDimRaggedArrayUtility.getHighestInColumn(data, i);
			int highestIndex = -1;
			if (highest > 0)
			{ 
				
				/* If the highest sale larger than zero then
				 * find the index of column which is index of store 
				 */
				highestIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, i);
				
				
				// Add bonus of highest sale to that specific store
				bonuses[highestIndex] += high; 
			}
			
			// Find the lowest amount of sales
			double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(data, i);
			int lowestIndex = -1;
			if (lowest > 0)
			{
				
				
				/* If the lowest sale larger than zero then
				 * find the index of column which is index of store 
				 */
				lowestIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, i);
				
				
				// Add bonus of lowest sale to that specific store
				bonuses[lowestIndex] += low; 
			}
			
			
			/* Stores which receive neither bonus of the highest sale
			 * nor bonus of the lowest sale and
			 * their sales were larger than zero
			 * then they receive an average bonus
			 */
			for(int j=0; j<bonuses.length; j++)
			{
				if (data.length > i && data[i].length > j && data[i][j]>0 &&  j!= highestIndex && j!=lowestIndex)
					bonuses[j] += other;
			}
		}
		
		
		return bonuses;
	}
	
	
	// Calculate the total amount of bonus
	public static double calculateTotalHolidayBonus(double[][] data, 
			double high, double low, double other)
	{
		
		
		/* With use of calculateHolidayBonus method
		 * calculate all bonuses and store them into array
		 */
		double[] bonuses = calculateHolidayBonus(data, high, low, other);
		double sum = 0;
		for(int i=0; i<bonuses.length; i++)
		{
			
			// Add each element of array in to sum's value
			sum += bonuses[i];
		}
		
		return sum;
	}
	

}










