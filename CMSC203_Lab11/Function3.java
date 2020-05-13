
public class Function3 extends Function {
	
	
	@Override
	public String answerString(double optVal, double x, double y, double z) 
	{
		return String.format("The minimum distance of the point %f, %f to the Parabola is %f", fnValue(optVal), getXVal(x), getYVal(y));
	}
	
	@Override
	public double fnValue(double x) 
	{
		return Math.sqrt(Math.pow(x, 4) - Math.pow(x, 2) + 1);
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
		return "Find the minimum distance between a point and a Parabola";
	}
}
