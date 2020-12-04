package models;

import services.MessageFactory;

public class StringValidationObject extends ComparableValidationObject<String>
{
	public StringValidationObject(String parameter) 
	{
		super(parameter);
	}

	public StringValidationObject(String parameter, String parameterName) 
	{
		super(parameter, parameterName);
	}
	
	public StringValidationObject isNull()
	{
		super.isNull();
		return this;
	}
	
	public StringValidationObject isNullOrEmpty()
	{
		this.isNull();
		boolean isEmpty = this.parameterValue.length() == 0;
		
		if (isEmpty)
		{
			throw new IllegalArgumentException
				(MessageFactory.cannotBeEmpty(this.parameterName));
		}
		
		return this;
	}
	
	public StringValidationObject isLessThan(String value)
	{
		super.isLessThan(value);
		return this;
	}
	
	public StringValidationObject isMoreThan(String value)
	{
		super.isMoreThan(value);
		return this;
	}
	
	public StringValidationObject isEqualTo(String value)
	{
		super.isEqualTo(value);
		return this;
	}
	
	public StringValidationObject isOutOfRange(String min, String max)
	{
		super.isOutOfRange(min, max);
		return this;
	}
}
