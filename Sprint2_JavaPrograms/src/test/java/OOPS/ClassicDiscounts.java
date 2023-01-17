package OOPS;

public class ClassicDiscounts implements Customer{
	
	double discount;
	double finalBill;

	@Override
	public double discount(double purchase) {
		
		if(purchase>=1 && purchase<=10000) 
			discount = purchase * 10 /100;
		else if(purchase>=10001 && purchase<=20000) 
			discount = purchase * 15 / 100;
		else
			discount = purchase * 20 /100;	
		return discount;
		
	}

}
