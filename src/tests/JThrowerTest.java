package tests;

import core.JThrower;

public class JThrowerTest
{
	public static void main(String[] args)
	{
		int age = 15;
		JThrower.throwIf(age, "age")
			.isOutOfRange(0, 10);
		
		String username = "shit";
		
		JThrower.throwIf(username, "username")
			.isNullOrEmpty()
			.isEqualTo("shit");
	}
}
