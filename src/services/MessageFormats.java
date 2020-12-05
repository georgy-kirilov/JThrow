package services;

public class MessageFormats
{
	private MessageFormats() { }
	
	public static final String CANNOT_BE_NULL = "%s cannot be null";
	
	public static final String LESS_THAN = "%s cannot be less than %s";
	
	public static final String MORE_THAN = "%s cannot be more than %s";
	
	public static final String EQUAL_TO = "%s cannot be equal to %s";
	
	public static final String OUT_OF_RANGE = "%s was outside the range [%s, %s]";
	
	public static final String CANNOT_BE_EMPTY = "%s cannot be empty";
	
	public static final String DOES_NOT_MATCH_PATTERN = "%s did not match the given pattern: %s";
	
	public static final String INVALID_PARAMETER_STATE = "%s had invalid state";
}
