package sptrint2_java;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Walmart_Restaurant {
	
	HashMap<String, Double> hp = new HashMap<String, Double>();
	Scanner s;
	

	
	public double buyDrinks(String drink, int quantity) {
		double total = 0;
		String yesorno;
		
		do {
		
		for( Entry<String, Double> k : hp.entrySet()) {
			if(k.getKey().equals(drink))
				total = total + k.getValue() * quantity;
			else if(k.getKey().equals(drink))
				total = total + k.getValue() * quantity;
			else if(k.getKey().equals(drink))
				total = total + k.getValue() * quantity;
		}
		
		System.out.println("Do you want to buy another drink (y:yes/n:No):");
		yesorno = s.next();
		}while(yesorno.equals("y"));
		
		System.out.println("Total is:");	
		return total;
		
	}
	
	public void menu() {
		System.out.println("**********Menu**********");
		hp.put("Coke", 0.99);
		hp.put("Sprite",0.79);
		hp.put("Pepsi", 0.89);
		
		
		for( Entry<String, Double> k : hp.entrySet()) {
			System.out.println(k.getKey()+"    "+k.getValue());
			
		}
	}
	
	
	
	@Test
	public void testCase1() {
		menu();
		System.out.println("Enter the drink that you want to buy:");
		s = new Scanner(System.in);
		String drink = s.next();
		
		System.out.println("Enter how many drinks you want to buy:");
		int quantity = s.nextInt();
		
		double actual = buyDrinks(drink,quantity);
		System.out.println(actual);
		
	}	
}
