import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	
	// Create an empty constructor 
	public TwoDimRaggedArrayUtility()
	{
		
	}
	
	// Receive a two-dimensional array and return the average of array's items
	public static double getAverage(double[][] data)
	{
		double sum = 0;
		int count = 0;
		for (int i=0; i < data.length; i++)
		{
			for (int j=0; j < data[i].length; j++)
			{
				// number of items
				count++;
				
				// calculate sum of array's items
				sum += data[i][j];
			}
		}
		
		// return average of array
		return sum / count;
	}
	
	
	/* Receive a two-dimensional array and a column index
	   and return the sum of that column's elements 
	*/
	public static double getColumnTotal(double[][] data, int col)
	{
		
		double sum = 0;
		for (int i=0; i < data.length; i++)
		{
			// Check if this row has that specific column
			if (data[i].length > col)
			{
				// add that column's element to sum
				sum += data[i][col];
			}
		}
		
		return sum;
	}
	
	
	/* Receive a two-dimensional array 
	   and return the largest element in the array 
	*/
	public static double getHighestInArray(double[][] data)
	{
		
		double max = 0;
		for (int i=0; i < data.length; i++)
		{
			for (int j=0; j < data[i].length; j++)
			{
				/* if this specific element of array is grater than max 
				 * then replace this element in max 
				*/
				if (data[i][j] > max)
					max = data[i][j];
			}
		}
		
		return max;
	}
	
	
	// Find the largest element of specific column in array
	public static double getHighestInColumn(double[][] data, int col)
	{
		double max = 0;
		for (int i=0; i < data.length; i++)
		{
			
			/* Check if this row has that specific column
			 * and if that specific element is larger than max
			 * then store it in max
			 */
			if (data[i].length > col && data[i][col]>max)
			{
				max = data[i][col];
			}
		}
		
		return max;
	}
	
	
	
	/*
	 * Receive a two-dimensional array and a column index
	 * and return the index of the largest element in that column 
	*/
	 
	public static int getHighestInColumnIndex(double[][] data, int col) 
	{
		
		double max = 0;
		
		int index = 0;
		for (int i=0; i < data.length; i++)
		{
			
			/* If this row has that specific column and
			 * if it'd element larger than max then
			 * store that element in max and it's index in index variable
			 */
			
			if (data[i].length > col && data[i][col]>max)
			{
				max = data[i][col];
				index = i;
			}
		}
		
		return index;
	}
	
	
	// Find the largest element of specific row in array
	public static double getHighestInRow(double[][] data, int row)
	{
		
		double max = 0;
		for(int i=0; i<data[row].length; i++)
		{
			
			/* if any element in this row is larger than max
			 * then replace it in the max variable
			*/
			if (data[row][i] > max)
				max = data[row][i];
		}
		
		return max;
	}
	
	
	/*
	 * Receive a two-dimensional array and a row index
	 * and return the index of the largest element in that row 
	*/
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		
		double max = 0;
		
		int index = 0;
		for(int i=0; i<data[row].length; i++)
		{
			
			/* If this element of this specific row is larger than max then
			 * store that element in max and it's index in index variable
			 */
			if (data[row][i] > max)
			{
				max = data[row][i];
				index  =i;
			}
		}
		
		return index;
	}
	


	/* Receive a two-dimensional array of doubles and
	 * return the smallest element in the array 
	 */
	public static double getLowestInArray(double[][] data)
	{
		
		/* As an initial value of min variable, we put the largest number
		 * that a double variable can store in itself, into a min,
		 * So any other numbers are smaller than this
		 */
		double min = Double.MAX_VALUE;
		for (int i=0; i < data.length; i++)
		{
			for (int j=0; j < data[i].length; j++)
			{
				// If element of array is smaller than min then replace it in to min
				if (data[i][j] < min)
					min = data[i][j];
			}
		}
		
		return min;
	}
	
	
	
	// Find the smallest element of specific column of array
	public static double getLowestInColumn(double[][] data, int col)
	{
	
		
		/* As an initial value of min variable, we put the largest number
		 * that a double variable can store in itself, into a min,
		 * So any other numbers are smaller than this
		 */
		double min = Double.MAX_VALUE;
		boolean found = false;
		for (int i=0; i < data.length; i++)
		{
			
			/* Check if this row has that specific column
			 * and if that specific element is smaller than min
			 * then store it in min
			 */
			if (data[i].length > col && data[i][col] < min)
			{
				min = data[i][col];
				found = true;
			}
		}
		
		
		if (found)
			return min;
		else
			return 0;  //Return zero if did not find any number
	}
	
	
	
	
	/*
	 * Receive a two-dimensional array and a column index
	 * and return the index of the smallest element in that column 
	*/
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		
		
		/* As an initial value of min variable, we put the largest number
		 * that a double variable can store in itself, into a min,
		 * So any other numbers are smaller than this
		 */
		double min = Double.MAX_VALUE;
		int index = -1;
		for (int i=0; i < data.length; i++)
		{
			
			/* If this row has that specific column and
			 * if element of this specific column is smallest than min 
			 * then store that element in min and it's index in index variable
			 */
			if (data[i].length > col && data[i][col] < min)
			{
				min = data[i][col];
				index = i;
			}
		}
		
		return index;
	}
	
	
	
	// Find the smallest element of specific row of array
	public static double getLowestInRow(double[][] data, int row)
	{
		
		/* As an initial value of min variable, we put the largest number
		 * that a double variable can store in itself, into a min,
		 * So any other numbers are smaller than this
		 */
		double min = Double.MAX_VALUE;
		for(int i=0; i<data[row].length; i++)
		{
			
			/* Check if that specific element is smaller than min
			 * then store it in min
			 */
			if (data[row][i] < min)
				min = data[row][i];
		}
		
		return min;
	}
	
	
	/*
	 * Receive a two-dimensional array and a row index
	 * and return the index of the smallest element in that column 
	*/
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		
		/* As an initial value of min variable, we put the largest number
		 * that a double variable can store in itself, into a min,
		 * So any other numbers are smaller than this
		 */
		double min = Double.MAX_VALUE;
		int index = 0;
		for(int i=0; i<data[row].length; i++)
		{
			
			/* If element of this specific row is smallest than min 
			 * then store that element in min and it's index in index variable
			 */
			if (data[row][i] < min)
			{
				min = data[row][i];
				index = 0;
			}
		}
		
		return index;
	}
	
	/* Receive a two-dimensional array and a row index
	   and return the sum of that row's elements 
	*/
	public static double getRowTotal(double[][] data, int row)
	{
	
		double sum = 0;
		for(int i=0; i<data[row].length; i++)
		{
			// Add each element to sum
			sum += data[row][i];
		}
		
		return sum;
	}
	
	
	/* Receive a two-dimensional array and
	 * return the sum of array's elements 
	*/
	public static double getTotal(double[][] data)
	{
		
		double sum = 0;
		for (int i=0; i < data.length; i++)
		{
			for (int j=0; j < data[i].length; j++)
			{
				// Add each element of array in to sum
				sum += data[i][j];
			}
		}
		
		return sum;
	}
	
	
	// Read data from a file
	public static double[][] readFile(java.io.File file)
	{
		
		String[][] s = new String[10][];
		
		double[][] result = null;
		
		int line = 0;
		Scanner reader = null;
		try	
		{
			reader = new Scanner(file);
			while(reader.hasNextLine())
			{
				
				/* Read one line and separate it's text with space
				 * and store them in to array s
				 */
				s[line] = reader.nextLine().split(" ");
				
				// Add one to a number of line
				line++;
			}
			
			result = new double[line][];
			for(int i=0;i<line;i++)
			{
				
				/* Create a result array that
				 * it's size affected from s array size
				 */
				result[i] = new double[s[i].length];
				for(int j=0; j<result[i].length; j++)
				{
					
					/* Convert strings to double and
					 * store them in result array
					 */
					result[i][j] = Double.parseDouble(s[i][j]);
				}
			}
		}
		catch (IOException e)
		{
			
		}
	    finally 
	    {
	    	reader.close();
	    }
		
		return result;
	}
	
	
	// Write data in to a file
	public static void writeToFile(double[][] data, java.io.File outputFile)
	{
		FileWriter writer = null;
		try
		{
			writer = new FileWriter(outputFile);
	        
			for (int i=0; i < data.length; i++)
			{
				for (int j=0; j < data[i].length; j++)
				{
					// Write each elements of array in to a file
					writer.write(Double.toString(data[i][j]));
					
					// Separate them from each other with space
					writer.write(" ");
				}
				
				// Put newline between rows
				writer.write("\n");
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
	        try 
	        {
	            writer.close();
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
		}
	}
}