
public class ManagementCompany {
	
	private int MAX_PROPERTY = 5;

	// Fields Definition
	private double mgmFeePer;
	private String name;
	private Property[] properties;
	private String taxID;
	private int MGMT_WIDTH;
	private int MGMT_DEPTH;
	private Plot plot;
	
	// index of first empty element of array 
	int arrayIndex;
	
	
	
	// Constructor 1, definition with no parameter
	public ManagementCompany()
	{
		name = "";
		taxID = "";
		
		MGMT_WIDTH = 0;
		MGMT_DEPTH = 0;
		mgmFeePer = 0;
		
		plot = new Plot(0,0,10,10);
		properties = new Property[MAX_PROPERTY];
		arrayIndex = 0;
	}
	
	// Constructor 2 definition with three parameters
	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		
		MGMT_WIDTH = 0;
		MGMT_DEPTH = 0;
		mgmFeePer = mgmFee;
		
		plot = new Plot(0,0,10,10);
		properties = new Property[MAX_PROPERTY];
		arrayIndex = 0;
	}
	
	// Constructor 3 definition with parameters 
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		
		MGMT_WIDTH = 0;
		MGMT_DEPTH = 0;
		mgmFeePer = mgmFee;
		
		plot = new Plot(x,y,width,depth);
		properties = new Property[MAX_PROPERTY];
		arrayIndex = 0;
	}
	
	// Constructor 4 definition that copy another company in it  
	public ManagementCompany(ManagementCompany otherCompany)
	{
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		
		MGMT_WIDTH = otherCompany.MGMT_WIDTH;
		MGMT_DEPTH = otherCompany.MGMT_DEPTH;
		mgmFeePer = otherCompany.mgmFeePer;
		
		plot = new Plot(otherCompany.plot);
		
		MAX_PROPERTY = otherCompany.MAX_PROPERTY;
		arrayIndex = MAX_PROPERTY;
		
		// Copy another company's properties in this company  
		properties = new Property[otherCompany.properties.length];
		for(int i=0; i<otherCompany.properties.length; i++)
		{
			
			// if property not equal to null copy that else exit from for loop 
			if (otherCompany.properties[i] != null)
				properties[i] = new Property(otherCompany.properties[i]);
			else
			{
				arrayIndex = i;
				break;
			}
		}		
	}
	
	
	public Plot getPlot()
	{
		return plot;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	// Add Property to company
	public int addProperty(Property property)
	{
		// if array full return -1
		if (arrayIndex >= MAX_PROPERTY)
			return -1;

		
		if (property == null)
			return -2;

		// if the plot for the property is not encompassed by the management company plot return -3
		if (!plot.encompasses(property.getPlot()))
			return -3;

		// if the plot for the property overlaps any other property's plot return -4
		for(int i=0; i<properties.length; i++)
		{
			if (properties[i] != null && 
				properties[i].getPlot().overlaps(property.getPlot()))
			{
				return -4;
			}
		}
		
		
		// if everything is OK, add property and return it's index
		Property p = new Property(property);
		properties[arrayIndex] = p;
		
		
		return arrayIndex++;
	}
	
	public int addProperty(String name, String city, double rent, String owner)
	{
		
		if (arrayIndex >= MAX_PROPERTY)
			return -1;
		
		Property property = new Property(name, city, rent, owner);
		
		
		if (!plot.encompasses(property.getPlot()))
			return -3;
		
		for(int i=0; i<properties.length; i++)
		{
			if (properties[i] != null && 
				properties[i].getPlot().overlaps(property.getPlot()))
			{
				return -4;
			}
		}
		
		
		properties[arrayIndex] = property;
		
		return arrayIndex++;
	}
	
	public int addProperty(String name, String city, double rent, String owner,
			int x, int y, int width, int depth)
	{
		
		if (arrayIndex >= MAX_PROPERTY)
			return -1;
		
		Property property = new Property(name, city, rent, owner, x, y, width, depth);
		
		if (!plot.encompasses(property.getPlot()))
			return -3;
		
		for(int i=0; i<properties.length; i++)
		{
			if (properties[i] != null && 
				properties[i].getPlot().overlaps(property.getPlot()))
			{
				return -4;
			}
		}
		
		
		properties[arrayIndex] = property;
		
		return arrayIndex++;
	}
	
	
	
	// This method display one of the array's elements corresponding with index if it isn't null
	public String displayPropertyAtIndex(int i)
	{
		if (properties[i] == null)
			return "";
		
		return properties[i].toString();
	}

	// This method returns the value of MAX_PROPERTY 
	public int getMAX_PROPERTY()
	{
		return MAX_PROPERTY;
	}
	
	// This method returns the highest rent amount of the property within in properties array
	public String maxRentProp()
	{
		double max = 0;
		int id = 0;
		for(int i =0; i<properties.length;i++)
		{
			if(properties[i] != null)
				break;
			
		
			if (properties[i].getRentAmount() > max)
			{
				id = i;
				max = properties[i].getRentAmount();
			}
				
		}
		
	
		return properties[id].toString();
	}
	
	
	// This method returns the index of the property within the properties array that has the highest amount
	public int maxRentPropertyIndex()
	{
		double max = 0;
		int index = 0;
		for(int i =0; i<properties.length;i++)
		{
			
			if(properties[i] != null)
				break;
			
		
			if ( properties[i].getRentAmount() > max)
			{
				max = properties[i].getRentAmount();
				index = i;
			}
		}
		
		return index;
	}
	
	
	// This method returns the total rent of the properties in the properties array
	public double totalRent()
	{
		double sum = 0;
		for(int i =0; i<properties.length;i++)
		{
			
			if(properties[i] != null)
				break;
			
			sum = sum + properties[i].getRentAmount();
		}
		
		return sum;
	}
	
	
	// This method returns information of all the properties within this management company by accessing the "Properties" array
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		
		
		s.append("List of properties for " + name + ", taxID: " + taxID);
		s.append("\n");
		s.append("________________________________________\n");
		
		// Calculate total fee
		double totalMgmFee = 0;
		for(int i =0; i<properties.length;i++)
		{
			
			if(properties[i] == null)
				break;
		
			
			totalMgmFee = totalMgmFee + mgmFeePer;
			
			s.append(properties[i].toString());
		}
		
		s.append("________________________________________\n");
		s.append("total management Fee:");
		 
		// convert double to string with Double.toString 
		s.append(Double.toString(totalMgmFee));
		
		return s.toString();
	}
}
