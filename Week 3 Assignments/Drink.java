package vendingMachine;

public class Drink extends Product 
{
	// Define Variables
	private String _drinkType;	// The type of beverage	
	private double _ounces;
	
	// Constructor
	public Drink()
	{
		
	}
	public Drink(String drinkType, int calories, double ounces) 
	{
		super("Drink", calories);
		_drinkType = drinkType;
		_ounces = ounces;
	}	
		
		
	// Get and Set drinkType
	public String getDrinkType()
	{ 
		return _drinkType; 
	}
	
	public void setDrinkType (String drinkType)
	{ 
		_drinkType = drinkType; 
	}

	//Get and set ounces
	public void setOunces(double ounces)
	{
		_ounces = ounces;
	}
	public double getOunces()
	{
		return _ounces;
	}
	
}
