package tests;

import core.JThrower;

public class JThrowerTest
{
	public static void main(String[] args)
	{
		String email = "name@gmail.com";
		
		JThrower.throwIf(email)
				.isNullOrEmpty()
				.has(em -> em.length() > 30)
				.doesNotMatchPattern("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
	}
}
