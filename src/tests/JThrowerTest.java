package tests;

import core.JThrower;

public class JThrowerTest
{
	public static void main(String[] args)
	{
		int age = 150;
		JThrower.throwIf(age, "age")
			.isOutOfRange(0, 15);
	}
}
