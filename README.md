# JThrow
***JThrow is a library for exception throwing and logical validation, written in Java***

## Intro
***JThrow*** is a great tool for exception and test driven development.
The main purpose of the library is to encapsulate the inner state of your application, so-called ***Defensive Programming***

## Usage
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
