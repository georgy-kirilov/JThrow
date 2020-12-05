package tests;

class Program 
{
	public static void main(String[] args)
	{
		try
		{
			Person invalidEmail = new Person("John", 35, true, "user.name@domain..com");
			Person emptyName = new Person("", 35, true, "user.name@domain.com");
			Person negativeAge = new Person("Peter", -10, true, "user.name@domain.com");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
