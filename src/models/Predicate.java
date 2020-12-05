package models;

public interface Predicate<T>
{
	boolean invoke(T parameter);
}
