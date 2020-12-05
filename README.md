# JThrow
***JThrow is a library for exception throwing and logical validation, written in Java***

## Intro
***JThrow*** is a great tool for exception and test driven development.
The main purpose of the library is to encapsulate the inner state of your application, so-called ***Defensive Programming***

## Usage
#### Set up

```java
import core.JThrower;

```
#### Code examples
* Intuitive fluent API 

```java
String userEmail = "john.doe@yahoo.com";

JThrower.throwIf(userEmail)
    .isNullOrEmpty()
    .has(x -> x.length() < 5 || x.length() > 50)
    .isInvalidEmail();
    
```
* Descriptive error messages

```java

public static void buyBeer(int userAge) {
    JThrower.throwIf(userAge, "Age").isLessThan(18);
    System.out.println("Beer was sold");
}

public static void main(String[] args) {
    buyBeer(21);
    buyBeer(16);
}


```

```java
Beer was sold
Exception in thread "main" custom.exceptions.OutOfRangeException: Age cannot be less than 18
	at jthrow/models.ComparableValidationObject.isLessThan(ComparableValidationObject.java:29)
	at jthrow/tests.Test.buyBeer(Test.java:21)
	at jthrow/tests.Test.main(Test.java:17)
    
```

```java
Date minDate = new Date(1890, 1, 1);
Date maxDate = new Date();

Date userBirthdate = new Date(1888, 6, 6);

JThrower.throwIf(userBirthdate)
        .isNull()
        .isOutOfRange(minDate, maxDate);


```

```java
Exception in thread "main" custom.exceptions.OutOfRangeException: 
Parameter was outside the range [Mon Feb 01 00:00:00 EET 3790, Sun Dec 06 00:54:16 EET 2020]
	at jthrow/models.ComparableValidationObject.isOutOfRange(ComparableValidationObject.java:62)
	at jthrow/tests.Test.main(Test.java:18)
    
```
## License
[MIT](https://choosealicense.com/licenses/mit/)
