package tests;

import java.util.Date;

import core.JThrower;

public class Test
{
	public static void main(String[] args)
	{
		Date minDate = new Date(1890, 1, 1);
		Date maxDate = new Date();

		Date userBirthdate = new Date(1888, 6, 6);

		JThrower.throwIf(userBirthdate)
		        .isNull()
		        .isOutOfRange(minDate, maxDate);
		
		String email = "example@domain.com";
		
		JThrower.throwIf(email)
				.isNullOrEmpty()
				.has(x -> x.length() < 5 || x.length() > 50)
				.isInvalidEmail();
		
		buyBeer(21);
	    buyBeer(16);
	}
	
	public static void buyBeer(int userAge) 
	{
	    JThrower.throwIf(userAge, "Age").isLessThan(18);
	    System.out.println("\n\nBeer was sold");
	}
}

