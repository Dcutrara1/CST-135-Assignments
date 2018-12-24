package vendingMachine;

public class FinalProduct 
{
	public static void main(String[] args) 
	{
		Product[] inventory = new Product[5];
		inventory[0] = new Drink("Coke", 201, 16);
		inventory[1] = new Drink("Sprite", 137, 16);
		inventory[2] = new Gum(11);
		inventory[3] = new Chips("Doritos", 150);
		inventory[4] = new Candy("Snickers", 215);
		
		Dispenser machine = new Dispenser();
		
		for(Product n : inventory)
		{
			machine.addToList(n);
		}

		machine.setDrinkCount(machine.inventory);
		machine.setCandyCount(machine.inventory);
		machine.setChipCount(machine.inventory);
		machine.setGumCount(machine.inventory);
		
		System.out.println(machine.toString());
		

	}
}
