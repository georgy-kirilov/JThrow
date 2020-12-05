package models;

import services.MessageFactory;
import custom.exceptions.OutOfRangeException;

public class ComparableValidationObject<T extends Comparable<T>>
	extends NullableValidationObject<T>
{
	public ComparableValidationObject(T parameter)
	{
		super(parameter);
	}
	
	public ComparableValidationObject(T parameter, String parameterName) 
	{
		super(parameter, parameterName);
	}
	
	public ComparableValidationObject<T> isNull()
	{
		super.isNull();
		return this;
	}
	
	public ComparableValidationObject<T> isLessThan(T value)
	{
		boolean lessThan = this.getParameterValue().compareTo(value) < 0;
		
		if (lessThan)
		{
			throw new OutOfRangeException
				(MessageFactory.lessThan(this.getParameterName(), value.toString()));
		}
		
		return this;
	}
	
	public ComparableValidationObject<T> isMoreThan(T value)
	{
		boolean moreThan = this.getParameterValue().compareTo(value) > 0;
		
		if (moreThan)
		{
			throw new OutOfRangeException
				(MessageFactory.moreThan(this.getParameterName(), value.toString()));
		}
		
		return this;
	}
	
	public ComparableValidationObject<T> isEqualTo(T value)
	{
		boolean areEqual = this.getParameterValue().compareTo(value) == 0;
		
		if (areEqual)
		{
			throw new IllegalArgumentException
				(MessageFactory.equalTo(this.getParameterName(), value.toString()));
		}
		
		return this;
	}
	
	public ComparableValidationObject<T> isOutOfRange(T min, T max)
	{
		try
		{
			this.isMoreThan(max);
			this.isLessThan(min);
		}
		catch (OutOfRangeException e)
		{
			throw new OutOfRangeException(MessageFactory.outOfRange
					(this.getParameterName(), min.toString(), max.toString()));
		}
		
		return this;
	}
	
	public ComparableValidationObject<T> has(Predicate<T> predicate)
	{
		super.has(predicate);
		return this;
	}
}
