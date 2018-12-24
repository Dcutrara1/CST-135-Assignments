package vendingMachine;

public class Chips extends Snack 
{
	// Define Variables
	private String _chipsType;		// Type of Chips
			
	
	// Constructor
	public Chips()
	{
		
	}
	
	public Chips(String chipsType, int calories) 
	{ 
		super("Chips", "Chips", calories); 
		_chipsType = chipsType;
	}
		
		
	// Get and Set snackType
	public String chipsType()
	{ 
		return _chipsType; 
	}
	public void setCandyType (String chipsType)
	{ 
		_chipsType = chipsType; 
	}
	
	// Methods
}
