package vendingMachine;

import java.util.ArrayList;

public class FinalProduct 
{
	public static void main(String[] args) 
	{
		//Create an array of products. Represents items being added to machine
		Product[] inventory = new Product[7];
		inventory[0] = new Drink("Coke", 201, 16);
		inventory[1] = new Drink("Sprite", 137, 16);
		inventory[2] = new Gum(11);
		inventory[3] = new Chips("Doritos", 150);
		inventory[4] = new Candy("Snickers", 215);
		inventory[5] = new Drink("AAA", 000, 00);
		inventory[6] = new Drink("hhh", 000, 00);
		
		//Create instance of dispenser
		Dispenser machine = new Dispenser();
		
		//Add all items to inventory
		//Add all drinks to drink list
		//Add all snacks to snack list
		for(Product n : inventory)
		{
			machine.addToList(n);
			
			if(n.productName() == "Drink")
			{
				machine.addDrink((Drink) n);
			}
			
			if(n.productName() == "Gum" || n.productName() == "Chips" || n.productName() == "Candy")
			{
				machine.addSnack((Snack) n);
			}
		}
		
		//sort snacks and drinks alphebetically
		java.util.Collections.sort(machine.drinks);
		java.util.Collections.sort(machine.snacks);
		
		
		//Print out inventory alphebetically by product.
		System.out.println("Drinks:");
		for(Product n : machine.drinks)
		{
			System.out.println(n.toString());
		}
		System.out.println();
		System.out.println("Snacks:");
		for(Product n : machine.snacks)
		{
			System.out.println(n.toString());
		}
		
		
		
	}

}
