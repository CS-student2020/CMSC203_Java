

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	private double[][] dataSetSTUDENT = null;
	
	private File inputFile,outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
		
		inputFile = new File("D:\\dataSet1.txt");
		dataSetSTUDENT = TwoDimRaggedArrayUtility.readFile(inputFile);
	}

	@After
	public void tearDown() throws Exception {
		dataSetSTUDENT = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotal() 
	{
		assertEquals(TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT), 36, 0.1);
	}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverage() 
	{
		assertEquals(TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT), 4.5, 0.01);
	}

	/**
	 * Student Test getRowTotal method
	 * Return the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 0), 6, 0.1);
		assertEquals(TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 1), 9, 0.1);
	}


	/**
	 * Student Test getColumnTotal method
	 * Return the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 0), 11, 0.1);
		assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 1), 14, 0.1);
	}


	/**
	 * Student Test getHighestInArray method
	 * Return the largest of all the elements in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArray() {
		assertEquals(TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT), 8, 0.1);	
	}
	

	/**
	 * Test the writeToFile method
	 * write the array to the outputFile File
	 * then read it back to make sure formatted correctly to read
	 * 
	 */
	@Test
	public void testWriteToFile() {
		TwoDimRaggedArrayUtility.writeToFile(dataSetSTUDENT, outputFile);
		double[][] importedArray = TwoDimRaggedArrayUtility.readFile(outputFile);
		
		for(int i=0;i<importedArray.length; i++)
			for(int j=0;j<importedArray[i].length; j++)
				assertTrue(importedArray[i][j]==dataSetSTUDENT[i][j]);
	}

}
