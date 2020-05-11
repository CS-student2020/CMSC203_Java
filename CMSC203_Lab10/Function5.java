
public class Function5 extends Function
{
	@Override
	public double fnValue(double x) 
	{
		if (x == 0)
			return 0;
		else
			return Math.sin(1/x);
	}
	
	public String toString() {
		return "sin(1/x)";
	}

}
