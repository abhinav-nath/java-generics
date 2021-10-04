# Generics - Restrictions

1. Type arguments cannot be primitive 
   ```java
    Store<int> intStore = new Store<int>();
          ----
           ^ NOT ALLOWED
   ```

2. Type parameter cannot be used in a `static` context

   ```java
   public class Device<T> {
      private static T deviceType;
              --------
                 ^ NOT ALLOWED
   }
   ```

3. Instances of Type parameters cannot be created

   ```java
   T typeObject = new T(); // not allowed
   ```

4. We cannot use Casts or `instanceof` with parameterized types

   ```java
   public static <T> void displayListToString(List<T> type) {
      // NOT ALLOWED !
      if(type instanceof ArrayList<Integer>) {
        ...
      }
   }
   ```

   You must use the `?` (wildcard) when the type is unknown
   ```java
   public static <T> void displayListToString(List<?> type) {
      // NOT ALLOWED !
      if(type instanceof ArrayList<?>) {
        ...
      }
   }
   ```

5. Cannot create Arrays of Parameterized Types

   ```java
   Box<int>[] favoriteNumbers = new Box<>[3]; // NOT ALLOWED
   ```

6. Cannot have methods overloaded where the Raw Types are the same

   These two methods are not allowed:

   ```java
   public class OverloadTest {
      public void displayToString(Box<Integer> number) { }
      public void displayToString(Box<Animal> animal) { }
   }
   ```