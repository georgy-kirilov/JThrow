package models;

import services.MessageFactory;

public class NullableValidationObject<T>
{
	private static final String DEFAULT_PARAMETER_NAME = "Parameter";
	
	private T parameterValue;
	private String parameterName;
	
	public NullableValidationObject(T parameter)
	{
		this(parameter, DEFAULT_PARAMETER_NAME);
	}
	
	public NullableValidationObject(T parameter, String parameterName)
	{
		this.parameterValue = parameter;
		this.parameterName = parameterName;
	}
	
	protected T getParameterValue()
	{
		return this.parameterValue;
	}
	
	protected String getParameterName()
	{
		return this.parameterName;
	}
	
	public NullableValidationObject<T> isNull()
	{
		if (this.getParameterValue() == null)
		{
			throw new NullPointerException
				(MessageFactory.cannotBeNull(this.getParameterName()));
		}
		
		return this;
	}
	
	public NullableValidationObject<T> isEqualTo(T value)
	{
		if (this.getParameterValue().equals(value))
		{
			throw new IllegalArgumentException
				(MessageFactory.equalTo(this.getParameterName(), value.toString()));
		}
		
		return this;
	}
	
	public NullableValidationObject<T> has(Predicate<T> predicate)
	{
		boolean isTrue = predicate.invoke(this.getParameterValue());
		
		if (isTrue)
		{
			throw new IllegalArgumentException
				(MessageFactory.invalidParameterState(this.getParameterName()));
		}
		
		return this;
	}
}
