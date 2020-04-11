
public class Property {
	
	// Fields Definition
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;

	// Constructor 1 with no parameter
	public Property()
	{
		city = owner = propertyName = "";
		rentAmount = 0;
		plot = new Plot();
	}

	// Constructor 2 copy another Property in it
	public Property(Property p)
	{
		city = p.city;
		owner = p.owner;
		propertyName = p.propertyName;
		rentAmount = p.rentAmount;
		plot = new Plot(p.plot);
	}
	
	// Constructor 3, with parameters
	public Property(String propertyName, String city, 
			double rentAmount, String owner)
	{		
		// Put "this" at the beginning of fields name to recognize them from parameters
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot();
	}
	
	// Constructor 4, with parameters
	public Property(String propertyName, String city, 
			double rentAmount, String owner, int x, int y,
			int width, int depth)
	{
		// Put "this" at the beginning of fields name to recognize them from parameters
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot(x,y,width,depth);
	}

	
	// Definition of getter and setter methods
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	public Plot setPlot(int x, int y, int width, int depth){
		plot.setX(x);
		plot.setY(y);
		plot.setWidth(width);
		plot.setDepth(depth);
		
		return plot;
	}
	
	public Plot getPlot()
	{
		return plot;
	}
	
	// This method returns some features of property  

	public String toString()
	{
		// neveshte haye morede niaz, khat be khat be StringBuilder ezafe mishan
		// va dar nahayat return mishan
		StringBuilder s = new StringBuilder();
		s.append("Property Name: "); // neveshteye "Property Name:" be hamin shekl ezafe mishe
		s.append(propertyName); // meghdare dakhele variable propertyName ezafe mishe. Masalan Rockville
		s.append("\n");
		
		s.append("  Located in ");
		s.append(city);
		s.append("\n");
		
		s.append("  Belonging to: ");
		s.append(owner);
		s.append("\n");
		
		s.append("  Rent Amount: ");
		// variable az noe double nemitune mostaghim be neveshte ezafe beshe. 
		// baraye hamin bayad ba methode Double.toString tabdil be String beshe
		// va baed ezafe beshe
		s.append(Double.toString(rentAmount));
		s.append("\n");
		
		return s.toString();
	}
}
