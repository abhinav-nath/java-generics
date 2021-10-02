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