package tests;

import core.JThrower;

class Person 
{
	private static final int MIN_NAME_LENGTH = 2;
	private static final int MAX_NAME_LENGTH = 30;
	
	private String name;
	private int age;
	private final boolean isMale;
	private String email;
	
	public Person(String name, int age, boolean isMale, String email)
	{
		this.setName(name);
		this.setAge(age);
		this.isMale = isMale;
		this.setEmail(email);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public boolean getIsMale()
	{
		return this.isMale;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public void setName(String newName)
	{
		JThrower.throwIf(newName, "Name")
				.isNullOrWhiteSpace()
				.has(x -> x.length() < MIN_NAME_LENGTH || x.length() > MAX_NAME_LENGTH);
		
		this.name = newName;
	}
	
	public void setEmail(String newEmail)
	{
		JThrower.throwIf(newEmail, "Email")
				.isNullOrEmpty()
				.isInvalidEmail();
		
		this.email = newEmail;
	}
	
	private void setAge(int newAge)
	{
		JThrower.throwIf(newAge, "Age")
				.isOutOfRange(0, 130);
		
		this.age = newAge;
	}
}
