# Generics Terminology

```java
class Store<T> {...}  -->  Generic Type
            ^
            T --> Type Parameter (or Formal Type Parameter)
```

```java
Store<Store> stringStore = new Store<String>()

Store<Date> dateStore = new Store<Date>()

Store<List<Date>> dateListStore = new Store<List<Date>>()

Store<Book> bookStore = new Store<>()  -->  Diamond Notation (Java 7) - Short hand Type Inference 


Store<String>  -->  Parameterized Type
        ^
      String --> Type Argument (or Actual Type Parameter)
```

## Raw Types

When we do not use the diamond operator `<>` at the object creation.

This is not the recommended at all !!

IntelliJ will warn you - do not use Generic classes this way!

```java
Store stringStore = new Store<>()  -->  Raw Type
store.set("Apple");
store.set(27);

ArrayList unknownArrayList = new ArrayList();
```

## Generic Methods

- These methods have their own type parameters
- They can be created in non-generic classes
- Both `static` and `non-static` generic methods are allowed
- Generic constructors are allowed

```java
public class Util {

    // the type parameter <T> must be before the return type
    public static <T> void displayToString(T type) {
        System.out.println(type.toString());
    }

}
```

```java
Util.displayToString(favoriteAnimal);
```

## Type Parameters Naming Conventions

Use single, upper case letters

```
E         -  Element (Collections)
K         -  Key, V - Value (Maps)
N         -  Number
T         -  Type (usually in non-Collections)
S, U, V   -  2nd, 3rd, 4th types
```