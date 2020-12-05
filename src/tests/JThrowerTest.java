package tests;

import core.JThrower;

public class JThrowerTest
{
	public static void main(String[] args)
	{
		String email = "name@gmail.com";
		
		JThrower.throwIf(email.length(), "Email length")
				.isLessThan(10);
		
		JThrower.throwIf("Georgi")
				.has(x -> x.charAt(0) == 'G');
		
		JThrower.throwIf(email, "email")
				.isNullOrEmpty()
				.doesNotMatchPattern("^[a-zA-Z0-9_!#$%&�*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
	}
}
