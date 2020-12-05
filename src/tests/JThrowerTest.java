package tests;

import core.JChecker;
import core.JThrower;

public class JThrowerTest
{
	public static void main(String[] args)
	{
		String email = "name_19090090@gmail.com";
		
		JThrower.throwIf(email)
				.isNullOrEmpty()
				.has(em -> em.length() > 30)
				.doesNotMatchPattern("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
		
		JThrower.throwIf(email, "Email")
				.isNullOrEmpty()
				.has(x -> !JChecker.isInRange(10, x.length(), 20));
		
		JThrower.throwIf("	")
				.isNullOrWhiteSpace();
	}
}
