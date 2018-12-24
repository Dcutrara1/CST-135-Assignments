package vendingMachine;


import java.util.ArrayList;

public class Dispenser 
{
	// Define Variables
	private String productCatagory; 	// Various types of products
	private String productName;			// The name of the product
	private String productLocation;		// Location of the product in the Vending machine
	private String paymentType;			// Cash or Debit/Credit Card
	private int _chipCount;
	private int _candyCount;
	private int _gumCount;
	private int _drinkCount;
	ArrayList<Product> inventory = new ArrayList<Product>();

	
	//  Constructor - No Arguments
	Dispenser() 
	{
		
	}
	
	public void addToList(Product product)
	{
		inventory.add(product);
	}
	
	public void removeFromList(Product product)
	{
		inventory.remove(product);
	}
	
	//Get and Set productCatagory
	public String productCatagory()
	{ 
		return productCatagory; 
	}
	public void setProductCatagory (String _productCatagory)
	{ 
		productCatagory = _productCatagory; 
	}

	//Get and Set productName
	public String productName()
	{ 
		return productName; 
	}
	public void setProductName (String _productName)
	{ 
		productName = _productName; 
	}

	//Get and Set productLocation
	public String productLocation()
	{ 
		return productLocation; 
	}
	
	public void setProductLocation (String _productLocation)
	{ 
		productLocation = _productLocation; 
	}
	
	//Get and Set paymentType
	public String paymentType()
	{ 
		return paymentType; 
	}
	
	public void setPaymentType (String _paymentType)
	{
		paymentType = _paymentType; 
	}
	
	public void setCandyCount(ArrayList<Product> array)
	{
		for(int i = 0; i < array.size(); i++)
		{
			if(array.get(i).productName() == "Candy")
			{
				_candyCount++;
			}
		}
	}
	public int getCandyCount()
	{
		return _candyCount;
	}
	
	public void setChipCount(ArrayList<Product> array)
	{
		for(int i = 0; i < array.size(); i++)
		{
			if(array.get(i).productName() == "Chips")
			{
				_chipCount++;
			}
		}
	}
	public int getChipCount()
	{
		return _chipCount;
	}
	
	public void setGumCount(ArrayList<Product> array)
	{
		for(int i = 0; i < array.size(); i++)
		{
			if(array.get(i).productName() == "Gum")
			{
				_gumCount++;
			}
		}
	}
	public int getGumCount()
	{
		return _gumCount;
	}
	
	public void setDrinkCount(ArrayList<Product> array)
	{
		for(int i = 0; i < array.size(); i++)
		{
			if(array.get(i).productName() == "Drink")
			{
				_drinkCount++;
			}
		}
	}
	
	public int getDrinkCount()
	{
		return _drinkCount;
	}
	
	public String toString()
	{
		return "Drink: " + _drinkCount + "\nCandy: " + _candyCount + "\nChips: " + _chipCount + "\nGum: " + _gumCount;
	}
}
