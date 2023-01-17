package OOPS;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Main {
	
	public double amount;
	public String customerType;
	public double finalBill, d;
	int n;
	
	@Test
	public void method1() {
		
		System.out.println("Enter 1. Calculate Discount 0.Exit");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		s.nextLine();
		
		
		   while(n!=0){
			
			System.out.println("Type of Customer c:classic g:gold p:platinum");
			customerType = s.nextLine();
			
			System.out.println("Enter Amount");
			amount = s.nextDouble();
			s.nextLine();
			
			if(amount>0)
			{
			if(customerType.equals("c")) {
				Customer classic = new ClassicDiscounts();
				d = classic.discount(amount);
				finalBill = amount + d;
				
			}else if(customerType.equals("g")) {
				Customer gold = new GoldDiscounts();
				d = gold.discount(amount);
				finalBill = amount + d;

			}else if(customerType.equals("p")) {
				Customer platinum = new PlatinumDiscounts();
				d = platinum.discount(amount);
				finalBill = amount + d;
			}
			}else {
				System.out.println("Please enter positive value");
			}
			
			System.out.println("Final Bill:"+finalBill);
			System.out.println("Enter 1. Calculate Discount 0.Exit");
			n = s.nextInt();
			s.nextLine();

		}

	}
}
