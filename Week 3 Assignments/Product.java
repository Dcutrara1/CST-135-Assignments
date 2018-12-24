package vendingMachine;

import java.awt.Image;

public abstract class Product 
{
	// Define Variables
	private String _productName; 			//The name of the product
	private Image _productImage; 			//Picture of product
	private String _productDescription; 	//Description of the product
	private int _productPrice; 				//Cost of the individual product
	private int _calories;					//Calorie Count
	
	
	// Constructor - No Arguments
	public Product()
	{
		
	}
	public Product(String productName, int calories) 
	{
		_productName = productName;
		_calories = calories;
	}
	
	
	//Get and Set productName
	public String productName()
	{ 
		return _productName; 
	}
	
	public void setProductName (String productName)
	{ 
		_productName = productName; 
	}
	
	//Get and Set productImage
	public Image productImage()
	{ 
		return _productImage; 
	}
	
	public void setProductImage (String productImage)
	{ 
		_productName = productImage; 
	}
	
	//Get and Set productDescription
	public String productDescription()
	{ 
		return _productDescription; 
	}
	
	public void setProductDescription (String productDescription)
	{ 
		_productName = productDescription; 
	}
	
	//Get and Set productPrice
	public int productPrice()
	{ 
		return _productPrice; 
	}
	
	public void setProductPrice (String productPrice)
	{ 
		_productName = productPrice; 
	}
	
	//Get and set Calorie
	public void setCalorie(int calories)
	{
		_calories = calories;
	}
	
	public int getCalorie()
	{
		return _calories;
	}
	
	public void setQuantityOnHand (String quantityOnHand)
	{ 
		_productName = quantityOnHand; 
	}
	
	//Methods	
	public void addProduct(String productName)
	{
		// Enter Method steps
	}
}
