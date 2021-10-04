# Type Inference

A Java Compiler's ability to simplify Generics usage.

```java
public class Box<T> {
    private T type;

    public void set(T type) {
        this.type = type;
    }

    public T get() {
        return type;
    }

    // T is a type parameter
}
```

```java
public class Util {

    public static <T> void displayToString(T type) {
        System.out.println(type.toString());
    }

}
```

- **Type Inference - Methods**
  ```java
  Util.<Animal>displayToString(favoriteAnimal);
  ```
  Instead of adding the `<>` we can do the following:
  ```java
  Util.displayToString(favoriteAnimal);
  ```
  They are both correct but the second one is easier to use.


- **Type Inference - Instantiation of Generic Classes**
  ```java
  Box<Integer> favoriteNumber = new Box<Integer>();
  ```
  Instead of having the `<>` on the right side can do the following:
  ```java
  Box<Integer> favoriteNumber = new Box<>();
  ```


- **Type Inference - Target Types**
  ```java
  ArrayList<String> todoList = Collections.<String>emptyList();
  ```
  Instead of having the `<>` on the right side can do the following:
  ```java
  ArrayList<String> todoList = Collections.emptyList();
  ```