package models;

import services.MessageFactory;

public class NullableValidationObject<T>
{
	private static final String DEFAULT_PARAMETER_NAME = "Parameter";
	
	protected T parameterValue;
	protected String parameterName;
	
	public NullableValidationObject(T parameter)
	{
		this(parameter, DEFAULT_PARAMETER_NAME);
	}
	
	public NullableValidationObject(T parameter, String parameterName)
	{
		this.parameterValue = parameter;
		this.parameterName = parameterName;
	}
	
	public NullableValidationObject<T> isNull()
	{
		if (this.parameterValue == null)
		{
			throw new NullPointerException
				(MessageFactory.cannotBeNull(this.parameterName));
		}
		
		return this;
	}
	
	public NullableValidationObject<T> isEqualTo(T value)
	{
		if (this.parameterValue.equals(value))
		{
			throw new IllegalArgumentException
				(MessageFactory.equalTo(this.parameterName, value.toString()));
		}
		
		return this;
	}
	
	public NullableValidationObject<T> has(Predicate<T> predicate)
	{
		boolean isTrue = predicate.invoke(this.parameterValue);
		
		if (isTrue)
		{
			throw new IllegalArgumentException
				(MessageFactory.invalidParameterState(this.parameterName));
		}
		
		return this;
	}
}
