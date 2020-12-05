package tests;

class Program 
{
	public static void main(String[] args)
	{
		testPerson("John", 35, true, "user.name@domain..com");
		testPerson("", 35, true, "user.name@domain.com");
		testPerson("Peter", -10, true, "user.name@domain.com");
	}
	
	public static void testPerson(String name, int age, boolean isMale, String email)
	{
		try
		{
			new Person(name, age, isMale, email);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
