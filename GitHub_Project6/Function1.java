
public class Function1 extends Function
{

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		return "The person must walk " + fnValue(optVal) + " and swim the rest";
	}

	@Override
	public double fnValue(double x) 
	{
		return (x / 3) + 2 * Math.sqrt(x*x-8*x+25);
	}

	@Override
	public double getXVal(double x) {
		return 0;
	}

	@Override
	public double getYVal(double x) {
		return 0;
	}

	@Override
	public double getZVal(double x) {
		return 0;
	}
}