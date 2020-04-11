
public class Plot {

	// Fields Definition
	private int x;
	private int y;
	private int width;
	private int depth;
	
	
	// Constructor definition without parameter
	public Plot()
	{
		x = 0;
		y = 0;
		width = 1;
		depth =1;
	}

	// Constructor definition that copy another Plot
	public Plot(Plot p)
	{
		x = p.x;
		y = p.y;
		width = p.width;
		depth = p.depth;
	}

	// Constructor definition with four parameters
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}

	
	// getter and setter methods definition
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	/* Definition of isBetween method that recognize if number v is between 
	 * another two numbers like start and extend
	 * return true if v is between start and extend
	 * and return false if it is not
	*/
	private boolean isBetween(int v, int start, int extend)
	{
		if(v > start && v < start + extend)
			return true;
		else
			return false;
	}
	
	
	/* Definition of overlaps method that with using isBetween method recognize
	 * if two plots have overlap with each other or not
	 */
	public boolean overlaps(Plot plot)
	{
		/* in if block it recognize that is any coordinate of this plot has
		 * the same coordinate of another plot in corresponding parts
		*/
		
		if (isBetween(x, plot.x, plot.width) ||
			isBetween(y, plot.y, plot.depth) ||
			isBetween(plot.x, x, width) ||
			isBetween(plot.y, y, depth))
				return true;
		else
				return false;
	}
	
	// isBetween2 method definition that is like isBetween method but accept also equal
	private boolean isBetween2(int v, int start, int extend)
	{
		if(v >= start && v <= start + extend)
			return true;
		else
			return false;
	}
	
	/* Definition of encompasses method that with using isBetween method recognize
	 * if another plot is between this plot or not
	 */
	public boolean encompasses(Plot plot)
	{
		
		
		if (isBetween2(plot.x, x, width) &&
			isBetween2(plot.x + plot.width, x, width) &&
			isBetween2(plot.y, y, depth) &&
			isBetween2(plot.y + plot.depth, y, depth))
				return true;
		else
				return false;
	}
		
	// Definition of toString() method that return some information about one plot
	public String toString()
	{
		return "Upper Left: (" + x + "," + y +"); Width: " 
			+ width + " Depth: " + depth;
	}
}
