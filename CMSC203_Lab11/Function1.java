
public class Function1 extends Function {
	
	
	@Override
	public String answerString(double optVal, double x, double y, double z) 
	{
		return String.format("Minimum cost is $ %f with height %f cm and radius %f cm",fnValue(optVal), getXVal(x), getYVal(y));
	}
	
	@Override
	public double fnValue(double r) 
	{
		return 0.8 * Math.PI * Math.pow(r, 2) + 800 / r;
	}
	
	@Override
	public double getXVal(double x)
	{
		return Math.sqrt(2000 / (Math.PI * x));
	}

	@Override
	public double getYVal(double x) 
	{
		return 2000 / (Math.PI * Math.pow(x, 2));
	}
	
	@Override
	public double getZVal(double x) 
	{
		return -1;
	}
	
	@Override
	public String toString() 
	{
		return "Minimize the cost of a can that will hold 2 liters of liquid";
	}
}
