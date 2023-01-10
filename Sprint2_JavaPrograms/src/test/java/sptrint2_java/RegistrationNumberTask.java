package sptrint2_java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class RegistrationNumberTask {
	
	@Test
	public void extractRegistrationAndHallticketNumbers() {
		
		String message1 = "Your application has been accepted and your registration number is 093467 and your hall ticket number is BNG32016";	
		Pattern regno = Pattern.compile("\\d+");
		Pattern hallticket = Pattern.compile("[A-Z0-9]{8}");
		Matcher m = regno.matcher(message1);
		
		System.out.println("Registration Number"+"             "+"Hallticket Number");
		System.out.println("-------------------------------------------------------");
		
		if(m.find()) {
			System.out.print(m.group()+"                          ");
		}
		Matcher m1 = hallticket.matcher(message1);
		if(m1.find()) {
			System.out.print(m1.group());
		}
		System.out.println();
		
		String message2 = "Application number 9823019348 has been accepted. 0955693 is your hall ticket number.";
		Pattern applicationNo = Pattern.compile("\\d+");
		Matcher m2 = applicationNo.matcher(message2);
		
		if(m2.find()) {
			System.out.print(m2.group()+"                        ");

		}
		
		Pattern hallticket2 = Pattern.compile("Application number 9823019348 has been accepted. +(\\d+)");
		Matcher m6 = hallticket2.matcher(message2);
		
		if(m6.find()) {
			System.out.print(m6.group(1)+"                       ");

		}		
		System.out.println();
		
		String message3 = "Hall ticket is generated with number 39458 for the application AB123XZ";

		Pattern applicationNo1 = Pattern.compile("[A-Z0-9]{7}");
		Matcher m4 = applicationNo1.matcher(message3);
		if(m4.find()) {
			System.out.print(m4.group()+"                         ");

		}
		Pattern  hallticket1 = Pattern.compile("\\d+");
		Matcher m3 = hallticket1.matcher(message3);
		if(m3.find()) {
			System.out.print(m3.group());

		}
				
		System.out.println();
		System.out.println("-------------------------------------------------------");


	}

}
