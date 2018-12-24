package vendingMachine;

public class Candy extends Snack 
{
	// Define Variables
	private String _candyType;		// Type of Candy
			
	
	// Constructor
	public Candy()
	{
		
	}
	
	public Candy(String candyType, int calories) 
	{ 
		super("Candy", "Candy", calories); 
		_candyType = candyType;
	}
		
		
	// Get and Set snackType
	public String candyType()
	{ 
		return _candyType; 
	}
	
	public void setCandyType (String candyType)
	{ 
		_candyType = candyType; 
	}
	
	// Methods
}
