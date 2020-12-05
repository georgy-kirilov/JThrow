package tests;

import core.JThrower;

public class JThrowerTest
{
	public static void main(String[] args)
	{
		String email = "name@gmail.com";
		
		JThrower.throwIf(email.length(), "Email length")
				.isLessThan(20);
		
		JThrower.throwIf(email, "email")
				.isNullOrEmpty()
				.doesNotMatchPattern("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
	}
}
