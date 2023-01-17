package OOPS;

public class GoldDiscounts implements Customer{
	
	double discount;

	@Override
	public double discount(double purchase) {
		
		if(purchase>=1 && purchase<=10000)
			discount = purchase * 20 /100;
		else if(purchase>=10001 && purchase<=20000)
			discount = purchase * 25 / 100;
		else
			discount = purchase * 30 /100;		
		
		return discount;
	}

}
