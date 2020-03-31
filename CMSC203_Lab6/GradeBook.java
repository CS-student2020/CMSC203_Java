import java.util.ArrayList;

public class GradeBook
{
   private double[] scores;
   private int scoresSize;

   /**
      Constructs a GradeBook with no scores and a given capacity.
      @capacity the maximum number of scores in this GradeBook
   */
   public GradeBook(int capacity)
   {
      scores = new double[capacity];
      scoresSize = 0;
   }

   /**
      Adds a score to this GradeBook.
      @param score the score to add
      @return true if the score was added, false if the GradeBook is full
   */
   public boolean addScore(double score)
   {
      if (scoresSize < scores.length)
      {
         scores[scoresSize] = score;
         scoresSize++;
         return true;
      }
      else
         return false;      
   }

   /**
      Computes the sum of the scores in this GradeBook.
      @return the sum of the scores
   */
   public double sum()
   {
      double total = 0;
      for (int i = 0; i < scoresSize; i++)
      {
         total = total + scores[i];
      }
      return total;
   }
      
   /**
      Gets the minimum score in this GradeBook.
      @return the minimum score, or 0 if there are no scores.
   */
   public double minimum()
   {
      if (scoresSize == 0) return 0;
      double smallest = scores[0];
      for (int i = 1; i < scoresSize; i++)
      {
         if (scores[i] < smallest)
         {
            smallest = scores[i];
         }
      }
      return smallest;
   }

   /**
      Gets the final score for this GradeBook.
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public double finalScore() 
   {
      if (scoresSize == 0)
         return 0;
      else if (scoresSize == 1)
         return scores[0];
      else
         return sum() - minimum();
   }
   
   // Task #1 - 1: getScoreSize() method which returns scoreSize
   public int getScoreSize()
   {
	   return scoresSize;
   }
   
   /* Task #1 - 2: toString() method that returns a string
   with each score in scores field of the GradeBook
   separated by a space */
   public String toString()
   {
	   String scoreList = "";
	   for(int i = 0; i < scoresSize; i++)
	   {

	        scoreList += scores[i] + " ";
	       
	    }
	    return scoreList;
	}
}
