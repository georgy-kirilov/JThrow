package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		boolean isEmpty = this.getParameterValue().length() == 0;
		
		if (isEmpty)
		{
			throw new IllegalArgumentException
				(MessageFactory.cannotBeEmpty(this.getParameterName()));
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
	
	public StringValidationObject has(Predicate<String> predicate)
	{
		super.has(predicate);
		return this;
	}
	
	public StringValidationObject doesNotMatchPattern(String regexPattern)
	{
		Matcher matcher = Pattern
					.compile(regexPattern)
					.matcher(this.getParameterValue());
		
		if (!matcher.matches())
		{
			throw new IllegalArgumentException
				(MessageFactory.doesNotMatchPattern(this.getParameterName(), regexPattern));
		}
		
		return this;
	}
}
