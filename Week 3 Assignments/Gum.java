package vendingMachine;

public class Gum extends Snack
{
	// Define Variables
	private String _gumType;		// Type of Chips
					
		
	// Constructor
	public Gum()
	{
		
	}
	
	public Gum(int calories) 
	{ 
		super("Gum", "Gum", calories); 
	}
			
			
	// Get and Set gumType
	public String gumType()
	{ 
		return _gumType; 
	}
	
	public void setCandyType (String gumType)
	{ 
		_gumType = gumType; 
	}
	
	// Methods
}
