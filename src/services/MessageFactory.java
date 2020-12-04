package services;

public class MessageFactory 
{
	private MessageFactory() { }
	
	public static String cannotBeNull(String parameterName)
	{
		return String.format(MessageFormats.CANNOT_BE_NULL, parameterName);
	}
	
	public static String lessThan(String parameterName, String minValue)
	{
		return String.format(MessageFormats.LESS_THAN, parameterName, minValue);
	}
	
	public static String moreThan(String parameterName, String maxValue)
	{
		return String.format(MessageFormats.MORE_THAN, parameterName, maxValue);
	}
	
	public static String equalTo(String parameterName, String forbiddenValue)
	{
		return String.format(MessageFormats.EQUAL_TO, parameterName, forbiddenValue);
	}
	
	public static String outOfRange(String parameterName, String minValue, String maxValue)
	{
		return String.format(MessageFormats.OUT_OF_RANGE, parameterName, minValue, maxValue);
	}
	
	public static String cannotBeEmpty(String parameterName)
	{
		return String.format(MessageFormats.CANNOT_BE_EMPTY, parameterName);
	}
}
