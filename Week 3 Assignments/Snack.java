package vendingMachine;

public abstract class Snack extends Product implements Comparable<Snack>
{
	// Define Variables
	private String _snackType;		// Type of snack
	
	
	// Constructor
	public Snack()
	{
		
	}
	
	public Snack(String productName, String snackType, int calories) 
	{
		super(productName, calories);
		_snackType = snackType;
	}	
	
	
	// Get and Set snackType
	public String snackType()
	{ 
		return _snackType; 
	}
	
	public void setSnackType (String snackType)
	{ 
		_snackType = snackType; 
	}
	
	
	//Compare Snacks alphebetically
	public int compareTo(Snack o)
	{
		return this.snackType().compareTo(o.snackType());
	}
}
