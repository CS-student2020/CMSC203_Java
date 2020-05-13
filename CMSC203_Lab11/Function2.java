
public class Function2 extends Function {
	
	
	@Override
	public String answerString(double optVal, double x, double y, double z) 
	{
		return String.format("Minimum time is %f seconds, the distance the dog has to run is %f meters and swim %f meters", fnValue(optVal), getXVal(x), getYVal(y));
	}
	
	@Override
	public double fnValue(double x) 
	{
		
		return (x/3)  + 2 * Math.sqrt(Math.pow(x, 2) - 8 * x + 25);
	}
	
	@Override
	public double getXVal(double x)
	{
		return x / 3;
	}

	@Override
	public double getYVal(double y) 
	{
		return y / 0.5;
	}
	
	@Override
	public double getZVal(double x) 
	{
		return -1;
	}
	
	@Override
	public String toString() 
	{
		return "Minimize the distance a dog has to run to go from point A to point C";
	}
}
